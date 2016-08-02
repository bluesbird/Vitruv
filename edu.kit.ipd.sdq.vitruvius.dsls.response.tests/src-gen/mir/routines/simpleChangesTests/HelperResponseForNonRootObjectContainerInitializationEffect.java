package mir.routines.simpleChangesTests;

import allElementTypes.NonRootObjectContainerHelper;
import allElementTypes.Root;
import allElementTypes.impl.AllElementTypesFactoryImpl;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.AbstractEffectRealization;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.ResponseExecutionState;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.structure.CallHierarchyHaving;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.feature.reference.containment.CreateNonRootEObjectSingle;
import java.io.IOException;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class HelperResponseForNonRootObjectContainerInitializationEffect extends AbstractEffectRealization {
  public HelperResponseForNonRootObjectContainerInitializationEffect(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy, final CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change) {
    super(responseExecutionState, calledBy);
    				this.change = change;
  }
  
  private CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change;
  
  private EObject getElement0(final CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change, final Root targetElement, final NonRootObjectContainerHelper newNonRootContainer) {
    return newNonRootContainer;
  }
  
  private EObject getCorrepondenceSourceTargetElement(final CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change) {
    EObject _newAffectedEObject = change.getNewAffectedEObject();
    return _newAffectedEObject;
  }
  
  private EObject getElement1(final CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change, final Root targetElement, final NonRootObjectContainerHelper newNonRootContainer) {
    NonRootObjectContainerHelper _newValue = change.getNewValue();
    return _newValue;
  }
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine HelperResponseForNonRootObjectContainerInitializationEffect with input:");
    getLogger().debug("   CreateNonRootEObjectSingle: " + this.change);
    
    Root targetElement = getCorrespondingElement(
    	getCorrepondenceSourceTargetElement(change), // correspondence source supplier
    	Root.class,
    	(Root _element) -> true, // correspondence precondition checker
    	null);
    if (targetElement == null) {
    	return;
    }
    initializeRetrieveElementState(targetElement);
    NonRootObjectContainerHelper newNonRootContainer = AllElementTypesFactoryImpl.eINSTANCE.createNonRootObjectContainerHelper();
    initializeCreateElementState(newNonRootContainer);
    
    addCorrespondenceBetween(getElement0(change, targetElement, newNonRootContainer), getElement1(change, targetElement, newNonRootContainer), "");
    preprocessElementStates();
    new mir.routines.simpleChangesTests.HelperResponseForNonRootObjectContainerInitializationEffect.EffectUserExecution(getExecutionState(), this).executeUserOperations(
    	change, targetElement, newNonRootContainer);
    postprocessElementStates();
  }
  
  private static class EffectUserExecution extends AbstractEffectRealization.UserExecution {
    @Extension
    private RoutinesFacade effectFacade;
    
    public EffectUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
      this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(responseExecutionState, calledBy);
    }
    
    private void executeUserOperations(final CreateNonRootEObjectSingle<NonRootObjectContainerHelper> change, final Root targetElement, final NonRootObjectContainerHelper newNonRootContainer) {
      NonRootObjectContainerHelper _newValue = change.getNewValue();
      String _id = _newValue.getId();
      newNonRootContainer.setId(_id);
      targetElement.setNonRootObjectContainerHelper(newNonRootContainer);
    }
  }
}