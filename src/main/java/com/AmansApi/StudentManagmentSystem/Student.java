package com.AmansApi.StudentManagmentSystem;

public class Student {

    private String name;
    private int age;
    private int admitNo;
    private String state;

    public Student(String name, int age, int admitNo, String state) {
        this.name = name;
        this.age = age;
        this.admitNo = admitNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmitNo() {
        return admitNo;
    }

    public void setAdmitNo(int admitNo) {
        this.admitNo = admitNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
