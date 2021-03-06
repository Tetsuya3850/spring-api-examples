package com.example.instagramserver.post;

import java.util.List;

public class FormPost {

    private Long id;

    private String imgPath;

    private String description;

    private List<String> tags;

    public FormPost() {
    }

    public FormPost(Long id, String imgPath, String description, List<String> tags) {
        this.id = id;
        this.imgPath = imgPath;
        this.description = description;
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
