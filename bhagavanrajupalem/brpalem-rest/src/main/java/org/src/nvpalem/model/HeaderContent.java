package org.src.nvpalem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "header_content")
public class HeaderContent extends Content implements Serializable {
    private static final long serialVersionUID = 8931878469838921574L;
}
