package org.src.nvpalem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "right_menu_content")
public class RightMenuContent extends Content implements Serializable {
    private static final long serialVersionUID = -3052335739151592611L;
}
