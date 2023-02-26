package com.demo.contentcalendar.config;

public class HomeLink {

    private String url;
    private String description;
    private boolean deprecated;


    public HomeLink(){}
    public HomeLink(String url, String description, boolean deprecated){
        this.url = url;
        this.description = description;
        this.deprecated = deprecated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }
}
