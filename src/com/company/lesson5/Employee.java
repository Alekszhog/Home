package com.company.lesson5;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;

    private float Salary;

    private int Age;

    public Employee(String fio, String position, String email, String phone, float salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        Salary = salary;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", Salary=" + Salary +
                ", Age=" + Age +
                '}';
    }
}
