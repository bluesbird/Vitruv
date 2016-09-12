package tools.vitruv.extensions.dslsruntime.response.effects

import org.eclipse.emf.ecore.EObject
import tools.vitruv.framework.correspondence.CorrespondenceModel
import tools.vitruv.framework.tuid.TUID

class RetrieveResponseElementState extends AbstractResponseElementState {
	private final TUID oldTUID;
		
	new(EObject element, CorrespondenceModel correspondenceModel) {
		super(element, correspondenceModel);
		this.oldTUID = correspondenceModel.calculateTUIDFromEObject(element);
	}
	
	public override void updateTUID() {
		oldTUID.updateTuid(element);
	}
	
}