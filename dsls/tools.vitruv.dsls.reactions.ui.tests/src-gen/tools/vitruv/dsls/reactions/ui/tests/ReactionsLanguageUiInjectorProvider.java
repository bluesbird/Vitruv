/*
 * generated by Xtext 2.10.0
 */
package tools.vitruv.dsls.reactions.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import tools.vitruv.dsls.reactions.ui.internal.ReactionsActivator;

public class ReactionsLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ReactionsActivator.getInstance().getInjector("tools.vitruv.dsls.reactions.ReactionsLanguage");
	}

}