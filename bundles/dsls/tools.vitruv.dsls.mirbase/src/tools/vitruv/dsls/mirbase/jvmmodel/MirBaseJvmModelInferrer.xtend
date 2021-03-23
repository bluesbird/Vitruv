/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package tools.vitruv.dsls.mirbase.jvmmodel

import tools.vitruv.dsls.mirbase.mirBase.MetamodelImport
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class MirBaseJvmModelInferrer extends AbstractModelInferrer {

	def dispatch void infer(MetamodelImport element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
	}
}