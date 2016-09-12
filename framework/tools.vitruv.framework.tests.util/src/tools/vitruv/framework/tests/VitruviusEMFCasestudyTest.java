package tools.vitruv.framework.tests;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.runner.Description;

import tools.vitruv.framework.change.description.CompositeContainerChange;
import tools.vitruv.framework.change.description.ConcreteChange;
import tools.vitruv.framework.change.description.TransactionalChange;
import tools.vitruv.framework.change.description.VitruviusChangeFactory;
import tools.vitruv.framework.change.description.VitruviusChangeFactory.FileChangeKind;
import tools.vitruv.framework.change.processing.Change2CommandTransformingProviding;
import tools.vitruv.framework.change.recording.AtomicEMFChangeRecorder;
import tools.vitruv.framework.correspondence.CorrespondenceModel;
import tools.vitruv.framework.metamodel.Mapping;
import tools.vitruv.framework.metamodel.Metamodel;
import tools.vitruv.framework.metarepository.MetaRepositoryImpl;
import tools.vitruv.framework.modelsynchronization.ChangeSynchronizerImpl;
import tools.vitruv.framework.modelsynchronization.SynchronisationListener;
import tools.vitruv.framework.modelsynchronization.TransformationAbortCause;
import tools.vitruv.framework.tests.util.TestUtil;
import tools.vitruv.framework.userinteraction.UserInteracting;
import tools.vitruv.framework.util.datatypes.VURI;
import tools.vitruv.framework.vsum.VSUMImpl;

/**
 * Base class for all Vitruvius EMF case study tests
 *
 * @author langhamm
 *
 */

public abstract class VitruviusEMFCasestudyTest extends VitruviusCasestudyTest implements SynchronisationListener {

	protected VSUMImpl vsum;
	protected ChangeSynchronizerImpl changeSynchronizer;
	protected MetaRepositoryImpl metaRepository;
	protected AtomicEMFChangeRecorder changeRecorder;
	protected CorrespondenceModel correspondenceModel;
	protected Change2CommandTransformingProviding transformingProviding;

	/**
	 * Set up SyncMangaer and metaRepository facility. Creates a fresh VSUM,
	 * Metarepository etc. before each test
	 *
	 * @throws Throwable
	 */
	@Override
	public void beforeTest(final Description description) throws Throwable {
		super.beforeTest(description);

		this.metaRepository = this.createMetaRepository();
		this.vsum = TestUtil.createVSUM(this.metaRepository);
		this.transformingProviding = createChange2CommandTransformingProviding();
		this.changeSynchronizer = new ChangeSynchronizerImpl(this.vsum, this.transformingProviding, this.vsum, this);
		this.testUserInteractor = new TestUserInteractor();
		this.setUserInteractor(this.testUserInteractor, this.transformingProviding);
		this.resourceSet = new ResourceSetImpl();
		this.changeRecorder = new AtomicEMFChangeRecorder();
	}

	protected void setUserInteractor(UserInteracting newUserInteracting) throws Throwable {
		setUserInteractor(newUserInteracting, transformingProviding);
	}

	protected abstract MetaRepositoryImpl createMetaRepository();

	@Override
	protected void afterTest(final org.junit.runner.Description description) {
		this.correspondenceModel = null;
	}

	@Override
	protected CorrespondenceModel getCorrespondenceModel() throws Throwable {
		final Metamodel firstMM = this.metaRepository.getAllMetamodels()[0];
		final Mapping mapping = this.metaRepository.getAllMappings(firstMM).iterator().next();
		final VURI mm1VURI = mapping.getMetamodelA().getURI();
		final VURI mm2VURI = mapping.getMetamodelB().getURI();
		return this.vsum.getCorrespondenceModel(mm1VURI, mm2VURI);
	}

	protected void triggerSynchronization(final VURI vuri) {
		final List<TransactionalChange> changes = this.changeRecorder.endRecording();
		CompositeContainerChange compositeChange = VitruviusChangeFactory.getInstance().createCompositeChange(changes);
		this.changeSynchronizer.synchronizeChange(compositeChange);
		this.changeRecorder.beginRecording(vuri, Collections.emptyList());
	}

	protected void triggerSynchronization(final EObject eObject) {
		final VURI vuri = VURI.getInstance(eObject.eResource());
		this.triggerSynchronization(vuri);
	}

	protected void synchronizeFileChange(final FileChangeKind fileChangeKind, final VURI vuri) {
		Resource modelResource = this.vsum.getAndLoadModelInstanceOriginal(vuri).getResource();
		final ConcreteChange fileChange = VitruviusChangeFactory.getInstance().createFileChange(fileChangeKind,
				modelResource);
		this.changeSynchronizer.synchronizeChange(fileChange);
	}

	@Override
	public void syncStarted() {

	}

	@Override
	public void syncFinished() {

	}

	@Override
	public void syncAborted(final TransformationAbortCause cause) {

	}

}