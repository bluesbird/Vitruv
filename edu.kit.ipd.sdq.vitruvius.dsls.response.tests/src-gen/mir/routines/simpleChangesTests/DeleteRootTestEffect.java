package mir.routines.simpleChangesTests;

import allElementTypes.Root;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.AbstractEffectRealization;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.ResponseExecutionState;
import edu.kit.ipd.sdq.vitruvius.dsls.response.runtime.structure.CallHierarchyHaving;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.object.DeleteRootEObject;
import java.io.IOException;
import mir.routines.simpleChangesTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DeleteRootTestEffect extends AbstractEffectRealization {
  public DeleteRootTestEffect(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy, final DeleteRootEObject<Root> change) {
    super(responseExecutionState, calledBy);
    				this.change = change;
  }
  
  private DeleteRootEObject<Root> change;
  
  private EObject getElement0(final DeleteRootEObject<Root> change, final Root oldModel) {
    return oldModel;
  }
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine DeleteRootTestEffect with input:");
    getLogger().debug("   DeleteRootEObject: " + this.change);
    
    Root oldModel = getCorrespondingElement(
    	getCorrepondenceSourceOldModel(change), // correspondence source supplier
    	Root.class,
    	(Root _element) -> true, // correspondence precondition checker
    	null);
    if (oldModel == null) {
    	return;
    }
    initializeRetrieveElementState(oldModel);
    deleteObject(getElement0(change, oldModel));
    
    preprocessElementStates();
    postprocessElementStates();
  }
  
  private EObject getCorrepondenceSourceOldModel(final DeleteRootEObject<Root> change) {
    Root _oldValue = change.getOldValue();
    return _oldValue;
  }
  
  private static class EffectUserExecution extends AbstractEffectRealization.UserExecution {
    @Extension
    private RoutinesFacade effectFacade;
    
    public EffectUserExecution(final ResponseExecutionState responseExecutionState, final CallHierarchyHaving calledBy) {
      super(responseExecutionState);
      this.effectFacade = new mir.routines.simpleChangesTests.RoutinesFacade(responseExecutionState, calledBy);
    }
  }
}