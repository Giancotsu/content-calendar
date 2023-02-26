package com.demo.contentcalendar.controller;

import com.demo.contentcalendar.config.HomeLink;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public List<HomeLink> getLinks(){
        List<HomeLink> links = new ArrayList<>();

        HomeLink link1 = new HomeLink("/api/v2/content", "Show all contents", false);
        HomeLink link2 = new HomeLink("/api/v2/content/1", "Show content by id", false);
        HomeLink link3 = new HomeLink("/api/v2/content/filter/activity", "Show content by title", false);
        HomeLink link4 = new HomeLink("/api/v2/content", "Show all contents", false);

        HomeLink link5 = new HomeLink("/api/v1/content", "Show all contents", true);
        HomeLink link6 = new HomeLink("/api/v1/content/1", "Show content by id", true);

        links.add(link1);
        links.add(link2);
        links.add(link3);
        links.add(link4);

        links.add(link5);
        links.add(link6);

        return links;
    }
}
