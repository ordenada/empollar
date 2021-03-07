package com.ordenada.chickens.chicken;

import com.ordenada.chickens.clutch.Clutch;

public class Chicken {
    private Long id;
    private String name;
    private Clutch clutch;
    private String color;
    private String breed;
    private String age;

    public Chicken() {
    }

    public Chicken(Long id,
                   String name,
                   Clutch clutch,
                   String color,
                   String breed,
                   String age) {
        this.id = id;
        this.name = name;
        this.clutch = clutch;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public Chicken(String name,
                   Clutch clutch,
                   String color,
                   String breed,
                   String age) {
        this.name = name;
        this.clutch = clutch;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clutch getClutch() {
        return clutch;
    }

    public void setClutch(Clutch clutch) {
        this.clutch = clutch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clutch=" + clutch +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
