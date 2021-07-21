package com.codefresher.buoi7.bai_tap_mang.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhập vào số độ dài của mảng: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int sum = 0;
        for(int i = 0; i < length; i++){
            System.out.println("Nhập phần tử " + i);
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        scan.close();
        System.out.println("Tôngr mảng là: " + sum);
    }
}
