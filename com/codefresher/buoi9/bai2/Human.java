package com.codefresher.buoi9.bai2;

public class Human extends Input {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;

    protected Human(){
        name = input("Nhập vào tên: ", "Str");
        age = Integer.parseInt(input("Nhập vào tuổi: ", "int"));
        gender = input("Nhập vào giới tính: ", "Str");
        address = input("Nhập vào địa chỉ: ", "Str");
    }

    protected Human(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected String outInformation(){
        return "Thông tin: \nHọ tên: " + name + "\nTuổi: " + age + "\nGiới tính: " + gender + "\nĐịa chỉ: " + address;
    }
}
