package tools.vitruv.applications.pcmjava.gplimplementation.tests.pojotransformations.pcm2java.repository

import tools.vitruv.applications.pcmjava.tests.pojotransformations.pcm2java.repository.InnerDeclarationMappingTransformationTest

class InnerDeclarationMappingGplTransformationTest extends InnerDeclarationMappingTransformationTest {
	override protected createChangePropagationSpecifications() {
		ChangePropagationSpecificationFactory.createPcm2JavaGplImplementationChangePropagationSpecification();
	}
}