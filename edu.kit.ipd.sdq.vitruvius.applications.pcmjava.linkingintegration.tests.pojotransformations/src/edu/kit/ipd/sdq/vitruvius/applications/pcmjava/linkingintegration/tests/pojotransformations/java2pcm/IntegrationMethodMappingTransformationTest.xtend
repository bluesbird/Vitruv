package edu.kit.ipd.sdq.vitruvius.applications.pcmjava.linkingintegration.tests.pojotransformations.java2pcm

import edu.kit.ipd.sdq.vitruvius.applications.pcmjava.tests.util.CompilationUnitManipulatorHelper
import org.junit.Test
import edu.kit.ipd.sdq.vitruvius.applications.pcmjava.linkingintegration.tests.CodeIntegrationTestCBSNamespace

class IntegrationMethodMappingTransformationTest extends Java2PCMPackageIntegrationMappingTransformationTest{
	
	@Test
	def public void addMethodInIntegratedArea() throws Throwable{
		val String methodString = "void " + INTEGRATED_METHOD_NAME + "();";
		CompilationUnitManipulatorHelper.addMethodToCompilationUnit(CodeIntegrationTestCBSNamespace.I_DISPLAY_INTERFACE_NAME, 
			methodString, currentTestProject);
		
		assertMessage(1, "Elements in change were integrated into Vitruvius")
	}
		
}