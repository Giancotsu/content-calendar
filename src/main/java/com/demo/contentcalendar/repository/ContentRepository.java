package com.demo.contentcalendar.repository;

import com.demo.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findContentByTitleContains(String keyword);
}
