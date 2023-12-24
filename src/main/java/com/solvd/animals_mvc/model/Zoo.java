package com.solvd.animals_mvc.model;

import java.util.List;
import java.util.Objects;

public class Zoo {
    private Long id;
    private String name;
    private int customersCapacity;
    private List<AnimalRoom> animalRoomList;
    private List<Department> departmentList;

    public Zoo() {
    }

    public Zoo(Long id, String name, int customersCapacity,
               List<AnimalRoom> animalRoomList, List<Department> departmentList) {
        this.id = id;
        this.name = name;
        this.customersCapacity = customersCapacity;
        this.animalRoomList = animalRoomList;
        this.departmentList = departmentList;
    }

    public Zoo(String name, int customersCapacity) {
        this.name = name;
        this.customersCapacity = customersCapacity;
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

    public int getCustomersCapacity() {
        return customersCapacity;
    }

    public void setCustomersCapacity(int customersCapacity) {
        this.customersCapacity = customersCapacity;
    }

    public List<AnimalRoom> getAnimalRoomList() {
        return animalRoomList;
    }

    public void setAnimalRoomList(List<AnimalRoom> animalRoomList) {
        this.animalRoomList = animalRoomList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return customersCapacity == zoo.customersCapacity &&
                Objects.equals(id, zoo.id) && Objects.equals(name, zoo.name) &&
                Objects.equals(animalRoomList, zoo.animalRoomList) &&
                Objects.equals(departmentList, zoo.departmentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customersCapacity, animalRoomList,
                departmentList);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customersCapacity=" + customersCapacity +
                ", animalRoomList=" + animalRoomList +
                ", departmentList=" + departmentList +
                '}';
    }
}
