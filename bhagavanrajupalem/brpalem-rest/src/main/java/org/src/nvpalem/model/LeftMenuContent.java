package org.src.nvpalem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "left_menu_content")
public class LeftMenuContent extends Content implements Serializable {
    private static final long serialVersionUID = -2537428589673022752L;
}
