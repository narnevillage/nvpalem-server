package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.src.nvpalem.model.Content;

@Repository
public interface ContentRepository  extends MongoRepository<Content, Long> {

    Content findFirstByContentKey(String contentKey);
    void deleteFirstByContentKey(String contentKey);
}
