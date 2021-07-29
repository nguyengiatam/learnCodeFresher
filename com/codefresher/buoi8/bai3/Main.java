package com.codefresher.buoi8.bai3;

public class Main {
    public static void main(String[] args) {
        var test1 = new Emloyee("Nguyễn Văn A", 1234321, 21, 1);
        var test2 = new Emloyee("Nguyễn Thị B", 1234543, 25, 3);

        test1.work();
        System.out.println("Lương của " + test1.getName() + " là " + test1.salary());
        test2.work();
        System.out.println("Lương của " + test2.getName() + " là " + test2.salary());
    }
}