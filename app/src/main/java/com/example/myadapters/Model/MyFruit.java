package com.example.myadapters.Model;

public class MyFruit {

    Integer photo;
    String name;
    String description;

    public MyFruit(String name, String description, Integer photo) {
        this.name = name;  this.description = description;  this.photo = photo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPhoto() {
        return photo;
    }
    public void setPhoto(Integer photo) {
        this.photo = photo;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}


