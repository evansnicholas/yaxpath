/*
 * generated by Xtext
 */
package org.xtext.example.xpath.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.xpath.ui.internal.XPathActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XPathExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XPathActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XPathActivator.getInstance().getInjector(XPathActivator.ORG_XTEXT_EXAMPLE_XPATH_XPATH);
	}
	
}