package org.src.nvpalem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.src.nvpalem.helper.ContentProcessHelper;
import org.src.nvpalem.model.Content;
import org.src.nvpalem.repository.ContentRepository;
import org.src.nvpalem.request.RetrieveContentRequest;
import org.src.nvpalem.response.RetrieveContentResponse;
import org.src.nvpalem.service.IRetrieveContentService;

import java.util.List;

@Component
public class RetrieveContentService implements IRetrieveContentService {

    @Autowired
    private ContentRepository contentRepository;

    @Autowired
    private ContentProcessHelper contentProcessHelper;

    @Override
    public List<RetrieveContentResponse> getAllContentInfo() {
        List<Content> contentList = contentRepository.findAll();
        return contentProcessHelper.processContentResponseList(contentList);
    }

    @Override
    public void createContentInfo(RetrieveContentRequest request) {
        contentRepository.save(contentProcessHelper.processCreateContentRequest(request));
    }

    @Override
    public RetrieveContentResponse getContentInfo(String contentKey) {
        return contentProcessHelper.processContentResponse(contentRepository.findFirstByContentKey(contentKey));
    }

    @Override
    public void updateContentInfo(String contentKey, RetrieveContentRequest content) {
        contentRepository.save(contentProcessHelper.processUpdateContentRequest(content));
    }

    @Override
    public void deleteContentInfo(String contentKey) {
        contentRepository.deleteFirstByContentKey(contentKey);
    }
}
