package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.src.nvpalem.model.RightMenuContent;

public interface RightMenuContentRepository  extends MongoRepository<RightMenuContent, Long> {

    RightMenuContent findFirstByContentKey(String contentKey);
}
