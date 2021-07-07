package com.codefresher.buoi3.baitap.bai4;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String ages(){
        String msg = "";
        if(age > 20 && age < 35){
            msg = name + " là thanh niên";
        }
        else if(age >= 35 && age < 55){
            msg = name + " là trung niên";
        }
        else if(age >= 55){
            msg = name + " là người cao tuổi";
        }
        return msg;
    }
}
