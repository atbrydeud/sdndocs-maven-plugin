package com.inocybe.api.docs;

import java.io.File;

import javax.xml.transform.Transformer;

import com.agilejava.docbkx.maven.AbstractEclipseMojo;

public abstract class EclipseMojo extends AbstractEclipseMojo {

    @Override
    public void adjustTransformer(Transformer transformer, String sourceFilename, File targetFile) {
        GitHelper.addCommitProperties(transformer, new File(sourceFilename), 7, getLog());
        super.adjustTransformer(transformer, sourceFilename, targetFile);
    }

}