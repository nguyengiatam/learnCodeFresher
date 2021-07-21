package com.codefresher.buoi7.bai_tap_mang.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Nhập vào số độ dài của mảng: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            System.out.println("Nhập phần tử " + i);
            arr[i] = scan.nextInt();
        }
        scan.close();
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
