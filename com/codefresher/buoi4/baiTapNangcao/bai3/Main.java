package com.codefresher.buoi4.baiTapNangcao.bai3;

public class Main {
    public static void main(String[] args) {
        var test1 = new Month(1);
        var test2 = new Month(2);
        var test3 = new Month(4);
        var test4 = new Month(0);
        System.out.println(test1.dayOfMonth() + "\n" + test2.dayOfMonth() + "\n" + test3.dayOfMonth() + "\n" + test4.dayOfMonth());
    }
}
