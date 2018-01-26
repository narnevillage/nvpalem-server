package org.src.nvpalem.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.src.nvpalem.model.Content;
import org.src.nvpalem.request.RetrieveContentRequest;

import java.util.List;

@RestController
public interface IRetrieveContentApi {

    @GetMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllContentInfo();

    @PostMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createContentInfo(@RequestBody RetrieveContentRequest content);

    @GetMapping(value = "/content/{contentKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getContentInfo(@PathVariable("contentKey") String contentKey);

    @PutMapping(value = "/content/{contentKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateContentInfo(@PathVariable("contentKey") String contentKey,
                                            @RequestBody RetrieveContentRequest content);

    @DeleteMapping(value = "/content/{contentKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteContentInfo(@PathVariable("contentKey") String contentKey);

}
