package org.src.nvpalem.helper;

import org.src.nvpalem.constants.AppConstants;
import org.src.nvpalem.model.Content;
import org.src.nvpalem.request.RetrieveContentRequest;
import org.src.nvpalem.response.RetrieveContentResponse;

import java.text.SimpleDateFormat;
import java.util.*;

public class ContentProcessHelper implements AppConstants {

    public List<RetrieveContentResponse> processContentResponseList(List<Content> contentList){
        List<RetrieveContentResponse> contentResponseList = new ArrayList<>();
        contentList.forEach(
                content -> {
                    RetrieveContentResponse response = this.processContentResponse(content);
                    contentResponseList.add(response);
                }
        );
        return contentResponseList;
    }

    public RetrieveContentResponse processContentResponse(Content content) {
        RetrieveContentResponse response = new RetrieveContentResponse();
        response.setContentId(String.valueOf(content.getId()));
        response.setContentKey(content.getContentKey());
        response.setContentBody(content.getContentBody());
        return response;
    }

    public Content processUpdateContentRequest(RetrieveContentRequest request) {
        Content content = this.createDefaultContent(request);
        content.setUpdatedTimestamp(this.getCurrentDate());
        content.setModifiedBy("");
        return content;
    }

    public Content processCreateContentRequest(RetrieveContentRequest request){
        Content content = this.createDefaultContent(request);
        content.setCreatedBy("");
        content.setCreatedTimeStamp(this.getCurrentDate());
        content.setOrigin("");
        content.setSystemIp("");
        return content;
    }

    private Content createDefaultContent(RetrieveContentRequest request){
        Content content = new Content();
        content.setId(this.generateRandomId());
        content.setContentBody(request.getContentBody());
        content.setContentKey(request.getContentKey());
        content.setOrigin("");
        content.setSystemIp("");
        return content;
    }

    private Long generateRandomId(){
        return Long.valueOf(String.valueOf(UUID.randomUUID()));
    }

    private String getCurrentDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        dateFormat.setTimeZone(TimeZone.getTimeZone(tmZoneStr));
        return dateFormat.format(new Date());
    }
}
