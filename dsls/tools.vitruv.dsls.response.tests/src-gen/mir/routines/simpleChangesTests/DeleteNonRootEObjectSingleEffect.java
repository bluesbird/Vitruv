package mir.routines.simpleChangesTests;

import allElementTypes.NonRoot;
import java.io.IOException;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.dsls.response.tests.simpleChangesTests.SimpleChangesTestsExecutionMonitor;
import tools.vitruv.extensions.dslsruntime.response.AbstractEffectRealization;
import tools.vitruv.extensions.dslsruntime.response.ResponseExecutionState;
import tools.vitruv.extensions.dslsruntime.response.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteNonRootEObjectSingleEffect extends AbstractEffectRealization {
  public DeleteNonRootEObjectSingleEffect(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy, final NonRoot containedObject) {
    super(responseExecutionState, calledBy);
    				this.containedObject = containedObject;
  }
  
  private NonRoot containedObject;
  
  private EObject getElement0(final NonRoot containedObject, final NonRoot targetElement) {
    return targetElement;
  }
  
  private EObject getCorrepondenceSourceTargetElement(final NonRoot containedObject) {
    return containedObject;
  }
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine DeleteNonRootEObjectSingleEffect with input:");
    getLogger().debug("   NonRoot: " + this.containedObject);
    
    NonRoot targetElement = getCorrespondingElement(
    	getCorrepondenceSourceTargetElement(containedObject), // correspondence source supplier
    	NonRoot.class,
    	(NonRoot _element) -> true, // correspondence precondition checker
    	null);
    if (targetElement == null) {
    	return;
    }
    initializeRetrieveElementState(targetElement);
    deleteObject(getElement0(containedObject, targetElement));
    
    preprocessElementStates();
    new mir.routines.simpleChangesTests.DeleteNonRootEObjectSingleEffect.EffectUserExecution(getExecutionState(), this).executeUserOperations(
    	containedObject, targetElement);
    postprocessElementStates();
  }
  
  private static class EffectUserExecution extends AbstractEffectRealization.UserExecution {
    @Extension
    private RoutinesFacade effectFacade;
    
    public EffectUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
      this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(responseExecutionState, calledBy);
    }
    
    private void executeUserOperations(final NonRoot containedObject, final NonRoot targetElement) {
      SimpleChangesTestsExecutionMonitor _instance = SimpleChangesTestsExecutionMonitor.getInstance();
      _instance.set(SimpleChangesTestsExecutionMonitor.ChangeType.DeleteNonRootEObjectSingle);
    }
  }
}