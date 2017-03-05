package tools.vitruv.framework.tests.echange;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tools.vitruv.framework.tests.echange.eobject.CreateEObjectTest;
import tools.vitruv.framework.tests.echange.eobject.DeleteEObjectTest;
import tools.vitruv.framework.tests.echange.eobject.EObjectExistenceEChangeTest;
import tools.vitruv.framework.tests.echange.feature.FeatureEChangeTest;
import tools.vitruv.framework.tests.echange.feature.attribute.InsertEAttributeValueTest;
import tools.vitruv.framework.tests.echange.feature.attribute.RemoveEAttributeValueTest;
import tools.vitruv.framework.tests.echange.feature.attribute.ReplaceSingleValuedEAttributeTest;
import tools.vitruv.framework.tests.echange.feature.reference.InsertEReferenceTest;
import tools.vitruv.framework.tests.echange.feature.reference.RemoveEReferenceTest;
import tools.vitruv.framework.tests.echange.feature.reference.ReplaceSingleValuedEReferenceTest;
import tools.vitruv.framework.tests.echange.root.InsertRootEObjectTest;
import tools.vitruv.framework.tests.echange.root.RemoveRootEObjectTest;

@RunWith(Suite.class)

@SuiteClasses({FeatureEChangeTest.class, 
	InsertEAttributeValueTest.class,
	RemoveEAttributeValueTest.class, 
	ReplaceSingleValuedEAttributeTest.class,
	InsertEReferenceTest.class, 
	RemoveEReferenceTest.class,
	ReplaceSingleValuedEReferenceTest.class, 
	InsertRootEObjectTest.class,
	RemoveRootEObjectTest.class, 
	EObjectExistenceEChangeTest.class,
	CreateEObjectTest.class,
	DeleteEObjectTest.class})

public class EChangeTestSuite {

}
