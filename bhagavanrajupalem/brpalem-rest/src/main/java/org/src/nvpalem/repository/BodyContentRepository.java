package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.src.nvpalem.model.BodyContent;

public interface BodyContentRepository extends MongoRepository<BodyContent, Long> {

    BodyContent findFirstByContentKey(String contentKey);
}
