package mir.routines.simpleChangesTests;

import allElementTypes.NonRoot;
import allElementTypes.NonRootObjectContainerHelper;
import allElementTypes.impl.AllElementTypesFactoryImpl;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.AbstractEffectRealization;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.ResponseExecutionState;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.structure.CallHierarchyHaving;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.feature.reference.containment.CreateNonRootEObjectInList;
import java.io.IOException;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class HelperResponseForNonRootObjectContainerContentsInitializationEffect extends AbstractEffectRealization {
  public HelperResponseForNonRootObjectContainerContentsInitializationEffect(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy, final CreateNonRootEObjectInList<NonRoot> change) {
    super(responseExecutionState, calledBy);
    				this.change = change;
  }
  
  private CreateNonRootEObjectInList<NonRoot> change;
  
  private EObject getElement0(final CreateNonRootEObjectInList<NonRoot> change, final NonRootObjectContainerHelper nonRootContainer, final NonRoot newNonRoot) {
    return newNonRoot;
  }
  
  private EObject getElement1(final CreateNonRootEObjectInList<NonRoot> change, final NonRootObjectContainerHelper nonRootContainer, final NonRoot newNonRoot) {
    NonRoot _newValue = change.getNewValue();
    return _newValue;
  }
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine HelperResponseForNonRootObjectContainerContentsInitializationEffect with input:");
    getLogger().debug("   CreateNonRootEObjectInList: " + this.change);
    
    NonRootObjectContainerHelper nonRootContainer = getCorrespondingElement(
    	getCorrepondenceSourceNonRootContainer(change), // correspondence source supplier
    	NonRootObjectContainerHelper.class,
    	(NonRootObjectContainerHelper _element) -> true, // correspondence precondition checker
    	null);
    if (nonRootContainer == null) {
    	return;
    }
    initializeRetrieveElementState(nonRootContainer);
    NonRoot newNonRoot = AllElementTypesFactoryImpl.eINSTANCE.createNonRoot();
    initializeCreateElementState(newNonRoot);
    
    addCorrespondenceBetween(getElement0(change, nonRootContainer, newNonRoot), getElement1(change, nonRootContainer, newNonRoot), "");
    preprocessElementStates();
    new mir.routines.simpleChangesTests.HelperResponseForNonRootObjectContainerContentsInitializationEffect.EffectUserExecution(getExecutionState(), this).executeUserOperations(
    	change, nonRootContainer, newNonRoot);
    postprocessElementStates();
  }
  
  private EObject getCorrepondenceSourceNonRootContainer(final CreateNonRootEObjectInList<NonRoot> change) {
    EObject _newAffectedEObject = change.getNewAffectedEObject();
    return _newAffectedEObject;
  }
  
  private static class EffectUserExecution extends AbstractEffectRealization.UserExecution {
    @Extension
    private RoutinesFacade effectFacade;
    
    public EffectUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
      this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(responseExecutionState, calledBy);
    }
    
    private void executeUserOperations(final CreateNonRootEObjectInList<NonRoot> change, final NonRootObjectContainerHelper nonRootContainer, final NonRoot newNonRoot) {
      NonRoot _newValue = change.getNewValue();
      String _id = _newValue.getId();
      newNonRoot.setId(_id);
      EList<NonRoot> _nonRootObjectsContainment = nonRootContainer.getNonRootObjectsContainment();
      _nonRootObjectsContainment.add(newNonRoot);
    }
  }
}