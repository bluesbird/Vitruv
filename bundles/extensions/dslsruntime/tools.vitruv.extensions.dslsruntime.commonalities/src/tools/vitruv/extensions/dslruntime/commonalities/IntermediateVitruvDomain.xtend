package tools.vitruv.extensions.dslruntime.commonalities

import tools.vitruv.framework.domains.AbstractVitruvDomain
import org.eclipse.emf.ecore.EPackage
import java.util.Set
import tools.vitruv.framework.tuid.TuidCalculatorAndResolver

abstract class IntermediateVitruvDomain extends AbstractVitruvDomain {

	new(String name, EPackage metamodelRootPackage, Set<EPackage> furtherRootPackages,
		TuidCalculatorAndResolver tuidCalculator, String... fileExtensions) {
		super(name, metamodelRootPackage, furtherRootPackages, tuidCalculator, fileExtensions)
	}

	new(String name, EPackage metamodelRootPackage, TuidCalculatorAndResolver tuidCalculator,
		String... fileExtensions) {
		super(name, metamodelRootPackage, tuidCalculator, fileExtensions)
	}
	
	override shouldTransitivelyPropagateChanges() {
		true
	}
	
	override isUserVisible() {
		false
	}
}