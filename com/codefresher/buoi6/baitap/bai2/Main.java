package com.codefresher.buoi6.baitap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(var scan = new Scanner(System.in)){
            System.out.println("Nhập vào số phần tử của mảng");
            int length = scan.nextInt();
            int[] array = new int[length];
            int sum = 0;
            for(int i = 0; i< length; i++){
                System.out.println("Nhập vào phần tử thứ " + i);
                array[i] = scan.nextInt();
                if(array[i] % 3 == 0){
                    sum += array[i];
                }
            }
            System.out.println("Tổng các phần tử chia hết cho 3 trong mảng là: " + sum);
        }catch(Exception ex){
            System.out.println("Nhập sai cú pháp");
        }
    }
}
