package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.src.nvpalem.model.LeftMenuContent;

public interface LeftMenuContentRepository  extends MongoRepository<LeftMenuContent, Long> {

    LeftMenuContent findFirstByContentKey(String contentKey);
}
