package org.src.nvpalem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "body_content")
public class BodyContent extends Content implements Serializable {
    private static final long serialVersionUID = 6617577919811018625L;
}
