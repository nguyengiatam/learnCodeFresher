package com.codefresher.buoi7.bai_tap_vong_lap.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int value = scan.nextInt();
        scan.close();
        for(int i = 1; i < 21; i++){
            System.out.println(value + " * " + i + " = " + value*i);
        }
    }
}
