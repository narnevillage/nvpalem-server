package org.src.nvpalem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.src.nvpalem.model.FooterContent;

public interface FooterContentRepository  extends MongoRepository<FooterContent, Long> {

    FooterContent findFirstByContentKey(String contentKey);
}
