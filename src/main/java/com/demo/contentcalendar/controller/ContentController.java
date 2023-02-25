package com.demo.contentcalendar.controller;

import com.demo.contentcalendar.model.Content;
import com.demo.contentcalendar.repository.ContentCollectionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

//@Deprecated(since = "24/02/2023")
@CrossOrigin
@RestController
@RequestMapping("/api/v1/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository contentCollectionRepository){
        this.repository = contentCollectionRepository;
    }

    //Make a request and find all the pieces of the content in the system
    @GetMapping
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> findContentById(@PathVariable("id") Integer id){

        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void saveContent(@RequestBody Content content){

        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping()
    public void updateContent(@RequestBody Content content){

        if(repository.existsById(content.id())){
            repository.save(content);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found.");
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable("id") Integer id){

        repository.delete(id);
    }


}
