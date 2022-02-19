package com.oops.ConstructorConcept;

public class Employee {

    String city;

    public Employee() {
        System.out.println("Default -- Constructor !!");
    }

    public Employee(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Bangalore");
        String cityName = emp.getCity();
        System.out.println(cityName);
    }

}
