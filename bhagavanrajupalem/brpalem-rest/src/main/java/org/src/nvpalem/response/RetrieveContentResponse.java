package org.src.nvpalem.response;

import java.io.Serializable;

public class RetrieveContentResponse implements Serializable {

    private static final long serialVersionUID = 4833744977466237986L;

    private String contentId;
    private String contentKey;
    private String contentBody;

    public String getContentId() {
        return contentId;
    }

    public RetrieveContentResponse setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    public String getContentKey() {
        return contentKey;
    }

    public RetrieveContentResponse setContentKey(String contentKey) {
        this.contentKey = contentKey;
        return this;
    }

    public String getContentBody() {
        return contentBody;
    }

    public RetrieveContentResponse setContentBody(String contentBody) {
        this.contentBody = contentBody;
        return this;
    }
}
