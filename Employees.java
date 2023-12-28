package org.example;

public class Employees {
    private String name;
    private int id;
    private int age;
    private String adress;
    private int salary;

    public Employees(int id, String name, int age, String adress, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", salary=" + salary +
                '}';
    }
}
