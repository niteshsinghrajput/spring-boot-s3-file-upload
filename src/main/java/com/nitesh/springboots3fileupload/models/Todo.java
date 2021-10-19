package com.nitesh.springboots3fileupload.models;

public class Todo {

    private Long id;
    private String title;
    private String description;
    private String imagePath;
    private String imageFileName;

    public Todo() {

    }

    public Todo(Long id, String title, String description, String imagePath, String imageFileName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
        this.imageFileName = imageFileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
