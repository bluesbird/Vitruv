package tools.vitruv.variability.vave;

import java.util.Collection;

import tools.vitruv.framework.change.description.VitruviusChange;
import tools.vitruv.framework.vsum.internal.InternalVirtualModel;
import tools.vitruv.variability.vave.model.vave.Configuration;

public interface VirtualProductModel extends InternalVirtualModel {

	public Configuration getConfiguration();

	public Collection<VitruviusChange> getDeltas();

	public void clearDeltas();

}
