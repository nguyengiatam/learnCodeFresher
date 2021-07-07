package com.codefresher.buoi3.baitap.bai4;

public class Main {
    public static void main(String[] args) {
        var person1 = new Person("Tâm", "Thanh Hóa", 26);
        System.out.println("Tên: " + person1.getName() + "\nĐịa chỉ: " + person1.getAddress() + "\nTuổi: " + person1.getAge());
        System.out.println(person1.ages());
    }
}
