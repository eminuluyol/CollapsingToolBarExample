package com.taurus.collapsingtoolbarexample.models;

/**
 * Created by Emin on 1/2/2016.
 */
public class Person {
    private String name;
    private String age;
    private int photoId;

    public Person(String name, String age, int photoId) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;

    }

    public int getPhotoId() {
        return photoId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
