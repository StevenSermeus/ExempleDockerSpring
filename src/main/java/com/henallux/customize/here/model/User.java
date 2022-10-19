package com.henallux.customize.here.model;

public class User
{
    //name : de type String
    //age : de type Integer
    //male : de type Boolean
    //hobby : de type String
    private String name;
    private Integer age;
    private Boolean male;
    private String hobby;

    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
