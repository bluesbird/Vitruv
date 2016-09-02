package edu.kit.ipd.sdq.vitruvius.framework.tests.vsum;

import edu.kit.ipd.sdq.vitruvius.framework.metarepository.MetaRepositoryImpl;
import edu.kit.ipd.sdq.vitruvius.framework.tests.util.TestUtil;
import edu.kit.ipd.sdq.vitruvius.framework.vsum.VSUMImpl;

public abstract class AbstractVSUMTest extends MetaRepositoryTest {

    protected VSUMImpl createMetaRepositoryAndVSUM(final String mm1URIString, final String fileExt1,
            final String mm2URIString, final String fileExt2) {
        MetaRepositoryImpl metaRepository = testMetaRepository();
        addMapping(metaRepository, mm1URIString, fileExt1, mm2URIString, fileExt2);
        return createVSUM(metaRepository);
    }

    protected VSUMImpl createVSUM(final MetaRepositoryImpl metaRepository) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        VSUMImpl vsum = TestUtil.createVSUM(metaRepository, classLoader);
        return vsum;
    }
}