package org.src.nvpalem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "content")
public class Content implements Serializable {

    private static final long serialVersionUID = -3639130125589492765L;

    @Id
    private Long id;

    @Indexed(unique = true)
    private String contentKey;

    private String contentBody;

    private String createdTimeStamp;

    private String updatedTimestamp;

    private String modifiedBy;

    private String createdBy;

    private String systemIp;

    private String origin;

    public Long getId() {
        return id;
    }

    public Content setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContentKey() {
        return contentKey;
    }

    public Content setContentKey(String contentKey) {
        this.contentKey = contentKey;
        return this;
    }

    public String getContentBody() {
        return contentBody;
    }

    public Content setContentBody(String contentBody) {
        this.contentBody = contentBody;
        return this;
    }

    public String getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    public Content setCreatedTimeStamp(String createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
        return this;
    }

    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public Content setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public Content setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Content setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getSystemIp() {
        return systemIp;
    }

    public Content setSystemIp(String systemIp) {
        this.systemIp = systemIp;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public Content setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
}
