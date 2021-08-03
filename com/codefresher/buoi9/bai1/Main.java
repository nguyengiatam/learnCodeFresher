package com.codefresher.buoi9.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var hs1 = new Student(scan);
        hs1.showInfor(hs1);
    }
}
