package com.codefresher.buoi7.bai_tap_mang.bai1;
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
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    var tranfer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tranfer;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
