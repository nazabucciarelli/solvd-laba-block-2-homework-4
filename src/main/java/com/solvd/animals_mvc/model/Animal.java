package com.solvd.animals_mvc.model;

import java.util.Objects;

public class Animal {
    private Long id;
    private String name;
    private double weight;
    private Gender gender;
    private Habitat habitat;
    private Feeding feeding;

    public Animal() {
    }

    public Animal(Long id, String name, double weight, Gender gender,
                  Habitat habitat, Feeding feeding) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.habitat = habitat;
        this.feeding = feeding;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(weight, animal.weight) == 0 && Objects.equals(id,
                animal.id) && Objects.equals(name, animal.name) &&
                Objects.equals(gender, animal.gender) &&
                Objects.equals(habitat, animal.habitat) &&
                Objects.equals(feeding, animal.feeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight, gender, habitat, feeding);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gender=" + gender +
                ", habitat=" + habitat +
                ", feeding=" + feeding +
                '}';
    }
}
