/*
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.commonalities

import tools.vitruv.dsls.commonalities.scoping.CommonalitiesGlobalScopeProvider
import tools.vitruv.dsls.commonalities.scoping.CommonalitiesLanguageScopeProvider
import tools.vitruv.dsls.commonalities.generator.CommonalitiesLanguageGenerator
import com.google.inject.Binder
import org.eclipse.xtext.generator.IGenerator2

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class CommonalitiesLanguageRuntimeModule extends AbstractCommonalitiesLanguageRuntimeModule {
	
	override bindIGlobalScopeProvider() {
		CommonalitiesGlobalScopeProvider
	}
	
	override bindIScopeProvider() {
		CommonalitiesLanguageScopeProvider
	}
	
	def Class<? extends IGenerator2> bindIGenerator2() {
		CommonalitiesLanguageGenerator
	}
	
	override configure(Binder binder) {
		binder.bind(IGenerator2).to(bindIGenerator2)
		super.configure(binder)
	}
	
}	
	
	
