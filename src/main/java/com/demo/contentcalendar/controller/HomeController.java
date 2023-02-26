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


        //get

        HomeLink genLink = new HomeLink("GET","/api/v2/content/generate", "Generate hardcoded contents", false);

        HomeLink get0 = new HomeLink("GET","/actuator", "Show application details", false);

        HomeLink get1 = new HomeLink("GET","/api/v2/content", "Show all contents", false);
        HomeLink get2 = new HomeLink("GET","/api/v2/content/{id}", "Show content by id", false);
        HomeLink get3 = new HomeLink("GET","/api/v2/content/filter/{title}", "Show content by title", false);
        HomeLink get4 = new HomeLink("GET","/api/v2/content", "Show all contents", false);

        HomeLink get5 = new HomeLink("GET","/api/v1/content", "Show all contents", true);
        HomeLink get6 = new HomeLink("GET","/api/v1/content/1", "Show content by id", true);

        //post
        HomeLink post1 = new HomeLink("POST","/api/v2/content", "Create new content", false);

        HomeLink post2 = new HomeLink("POST","/api/v1/content", "Create new content", true);

        //put
        HomeLink put1 = new HomeLink("PUT","/api/v2/content", "Update existing Content", false);

        HomeLink put2 = new HomeLink("PUT","/api/v1/content", "Update existing Content", true);

        //delete
        HomeLink del0 = new HomeLink("DELETE","/api/v2/content", "Delete all contents", false);
        HomeLink del1 = new HomeLink("DELETE","/api/v2/content{id}", "Delete content by id", false);

        HomeLink del2 = new HomeLink("DELETE","/api/v1/content{id}", "Delete content by id", true);

        //add get links
        links.add(genLink);

        links.add(get0);

        links.add(get1);
        links.add(get2);
        links.add(get3);
        links.add(get4);

        links.add(get5);
        links.add(get6);

        //add post links
        links.add(post1);
        links.add(post2);

        //add put links
        links.add(put1);
        links.add(put2);

        //add delete links
        links.add(del0);
        links.add(del1);
        links.add(del2);



        return links;
    }
}
