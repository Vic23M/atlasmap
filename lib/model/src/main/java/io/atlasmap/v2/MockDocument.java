package io.atlasmap.v2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("io.atlasmap.v2.MockDocument")
public class MockDocument extends Document implements Serializable {

    private static final long serialVersionUID = 1L;

}
