package com.codefresher.buoi8.bai3;

public class Emloyee {
    private String name;
    private long code;
    private int age;
    private int level;

    public Emloyee(String name, long code, int age, int level){
        this.name = name;
        this.code = code;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void work(){
        System.out.println("Người này đang làm việc");
    }

    public double salary(){
        return level*21;
    }
}
