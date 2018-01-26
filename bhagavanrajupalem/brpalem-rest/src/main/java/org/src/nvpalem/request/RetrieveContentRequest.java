package org.src.nvpalem.request;

import java.io.Serializable;

public class RetrieveContentRequest implements Serializable {

    private static final long serialVersionUID = -6369604397350324053L;

    private String contentKey;
    private String contentBody;

    public String getContentKey() {
        return contentKey;
    }

    public RetrieveContentRequest setContentKey(String contentKey) {
        this.contentKey = contentKey;
        return this;
    }

    public String getContentBody() {
        return contentBody;
    }

    public RetrieveContentRequest setContentBody(String contentBody) {
        this.contentBody = contentBody;
        return this;
    }
}
