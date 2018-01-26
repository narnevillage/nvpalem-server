package org.src.nvpalem.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.src.nvpalem.api.IRetrieveContentApi;
import org.src.nvpalem.request.RetrieveContentRequest;
import org.src.nvpalem.response.RetrieveContentResponse;
import org.src.nvpalem.service.IRetrieveContentService;

import java.util.List;

@Component
public class RetrieveContentApi implements IRetrieveContentApi {

    @Autowired
    private IRetrieveContentService retrieveContentService;

    @Override
    public ResponseEntity<?> getAllContentInfo() {
        List<RetrieveContentResponse> contentResponseList = retrieveContentService.getAllContentInfo();
        return new ResponseEntity<>(contentResponseList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity createContentInfo(RetrieveContentRequest content) {
        retrieveContentService.createContentInfo(content);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<?> getContentInfo(String contentKey) {
        RetrieveContentResponse response = retrieveContentService.getContentInfo(contentKey);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateContentInfo(String contentKey, RetrieveContentRequest content) {
        retrieveContentService.updateContentInfo(contentKey, content);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    public ResponseEntity deleteContentInfo(String contentKey) {
        retrieveContentService.deleteContentInfo(contentKey);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
