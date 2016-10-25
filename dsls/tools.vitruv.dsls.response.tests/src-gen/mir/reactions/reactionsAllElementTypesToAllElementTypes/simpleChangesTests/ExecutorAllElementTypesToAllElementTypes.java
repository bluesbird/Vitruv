package mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests;

import tools.vitruv.extensions.dslsruntime.response.AbstractResponseExecutor;
import tools.vitruv.framework.userinteraction.UserInteracting;

@SuppressWarnings("all")
public class ExecutorAllElementTypesToAllElementTypes extends AbstractResponseExecutor {
  public ExecutorAllElementTypesToAllElementTypes(final UserInteracting userInteracting) {
    super(userInteracting, new tools.vitruv.framework.util.datatypes.MetamodelPair(allElementTypes.impl.AllElementTypesPackageImpl.eNS_URI, allElementTypes.impl.AllElementTypesPackageImpl.eNS_URI));
  }
  
  protected void setup() {
    tools.vitruv.framework.userinteraction.UserInteracting userInteracting = getUserInteracting();
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedSingleValuedEAttributeReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedSingleValuedEAttributeReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedNonRootIdReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedNonRootIdReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.CreatedNonRootEObjectInListReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.CreatedNonRootEObjectInListReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.DeletedNonRootEObjectInListReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.DeletedNonRootEObjectInListReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedNonRootEObjectSingleResponseReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedNonRootEObjectSingleResponseReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedSingleValuedNonContainmentEReferenceReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.ReplacedSingleValuedNonContainmentEReferenceReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.InsertedEAttributeValueReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.InsertedEAttributeValueReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.RemovedEAttributeValueReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.RemovedEAttributeValueReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.InsertedNonContainmentEReferenceReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.InsertedNonContainmentEReferenceReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.RemoveedNonContainmentEReferenceReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.RemoveedNonContainmentEReferenceReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.CreateRootTestReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.CreateRootTestReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.DeleteRootTestReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.DeleteRootTestReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.HelperResponseForNonRootObjectContainerInitializationReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.HelperResponseForNonRootObjectContainerInitializationReaction(userInteracting));
    this.addResponse(mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.HelperResponseForNonRootObjectContainerContentsInitializationReaction.getExpectedChangeType(), new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesTests.HelperResponseForNonRootObjectContainerContentsInitializationReaction(userInteracting));
  }
}