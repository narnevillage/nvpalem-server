package org.src.nvpalem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "footer_content")
public class FooterContent extends Content implements Serializable {
    private static final long serialVersionUID = 6219083690917452875L;
}
