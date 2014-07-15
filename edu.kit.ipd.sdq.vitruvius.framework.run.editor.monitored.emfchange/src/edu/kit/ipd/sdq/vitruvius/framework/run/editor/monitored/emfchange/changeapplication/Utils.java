package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.changeapplication;

import java.util.NoSuchElementException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * {@link Utils} contains various utility methods.
 */
final class Utils {

    private Utils() {
    }

    /**
     * Retrieves the target model's containment feature of a source model's object.
     * 
     * @param targetContainer
     *            The target model object having a feature corresponding to <code>srcObject</code>'s
     *            containment feature.
     * @param srcObject
     *            An object contained in the source model.
     * @return The corresponding containment feature in the target model.
     * 
     * @throws NoSuchElementException
     *             No such feature could be found in the target model containment object.
     */
    public static EStructuralFeature getStructuralFeatureInTargetContainer(EObject targetContainer, EObject srcObject) {
        String sourceFeatureName = srcObject.eContainingFeature().getName();
        EStructuralFeature targetFeature = targetContainer.eClass().getEStructuralFeature(sourceFeatureName);
        if (targetFeature == null) {
            throw new NoSuchElementException();
        }
        return targetFeature;
    }
}
