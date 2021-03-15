package tools.vitruv.framework.vsum

import java.nio.file.Path
import java.util.Collection
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import tools.vitruv.framework.change.description.PropagatedChange
import tools.vitruv.framework.change.description.VitruviusChange
import tools.vitruv.framework.uuid.UuidResolver
import tools.vitruv.framework.vsum.views.ViewSelector
import tools.vitruv.framework.vsum.views.ViewType
import tools.vitruv.framework.vsum.views.ViewTypeRepository

interface VirtualModel {
	def Path getFolder();

	def List<PropagatedChange> propagateChange(VitruviusChange change);

	/**
	 * Propagates delta-based changes as long as the location and the name of the resource was not changed.
	 * Should be used when there are no change sequences available and consistency needs to be preserved based on the changes between the previous and new state
	 * of a model.
	 * @param newState is the resource of the new state.
	 */
	def List<PropagatedChange> propagateChangedState(Resource newState);

	/**
	 * Propagates delta-based changes. Allows to change the location and the name of the resource.
	 * Should be used when there are no change sequences available and consistency needs to be preserved based on the changes between the previous and new state
	 * of a model.
	 * @param newState is the resource of the new state.
	 * @param oldLocation specifies the previous location of the resource to avoid problems with renaming or moving elements.
	 */
	def List<PropagatedChange> propagateChangedState(Resource newState, URI oldLocation);

	def void reverseChanges(List<PropagatedChange> changes);

	def ModelInstance getModelInstance(URI modelUri);

	def UuidResolver getUuidResolver();

	def ViewTypeRepository getViewTypeRepository()

    def boolean isCompatible(ViewType viewType) {
        viewTypes.contains(viewType) // TODO TS What do we understand as a ViewType being compatible with a VSUM?
    }

    def Collection<ViewType> getViewTypes() { // TODO TS These two methods are specified by the design, but are only convenience methods.
        return viewTypeRepository.viewTypes
    }

    def ViewSelector getViewCreator(ViewType viewType) {
        return viewType.createSelector
    }
}
