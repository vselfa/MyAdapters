package com.example.myadapters;

public class MyWriter {

    String name;
    Integer photo;

    public MyWriter(String name, Integer photo) {
        this.name = name;  this.photo = photo;
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
}

