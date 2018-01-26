package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.src.nvpalem.model.HeaderContent;

public interface HeaderContentRepository  extends MongoRepository<HeaderContent, Long> {

    HeaderContent findFirstByContentKey(String contentKey);
}
