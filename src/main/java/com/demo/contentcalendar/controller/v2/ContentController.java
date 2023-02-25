package com.demo.contentcalendar.controller.v2;

import com.demo.contentcalendar.model.Content;
import com.demo.contentcalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v2/content")
public class ContentController {

    private final ContentRepository repository;

    public ContentController(ContentRepository contentRepository) {
        this.repository = contentRepository;
    }

    //Make a request and find all the pieces of the content in the system
    @GetMapping
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> findContentById(@PathVariable("id") Integer id) {

        return repository.findById(id);
    }

    @GetMapping("/filter/{keyword}")
    public List<Content> findContentByTitle(@PathVariable("keyword") String keyword) {

        return repository.findContentByTitleContains(keyword);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void saveContent(@Valid @RequestBody Content content) {

        if(repository.existsById(content.id())){
            throw new ResponseStatusException(HttpStatus.METHOD_NOT_ALLOWED, "Content already exists.");
        }else{
            repository.save(content);
        }

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping()
    public void updateContent(@Valid @RequestBody Content content) {

        if (repository.existsById(content.id())) {
            repository.save(content);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found.");
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable("id") Integer id) {

        repository.deleteById(id);
    }


}
