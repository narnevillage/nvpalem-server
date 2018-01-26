package org.src.nvpalem.service;

import org.springframework.stereotype.Service;
import org.src.nvpalem.model.Content;
import org.src.nvpalem.request.RetrieveContentRequest;
import org.src.nvpalem.response.RetrieveContentResponse;

import java.util.List;

@Service
public interface IRetrieveContentService {

    public List<RetrieveContentResponse> getAllContentInfo();

    public void createContentInfo(RetrieveContentRequest content);

    public RetrieveContentResponse getContentInfo(String contentKey);

    public void updateContentInfo(String contentKey, RetrieveContentRequest content);

    public void deleteContentInfo(String contentKey);
}
