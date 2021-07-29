package com.codefresher.buoi8.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public void test(){
        var scan = new Scanner(System.in);
        var arr = new ArrayList<Integer>();
        while(true){
            try {
                System.out.println("Nhập vào phần tử thứ " + arr.size() + " của mảng");
                int value = scan.nextInt();
                if(value == 100){
                    for(int number : arr){
                        System.out.print(number + " ");
                    }
                    break;
                }
                arr.add(value);
            } catch (Exception e) {
                System.out.println("Bạn nhập sai kiểu yêu cầu. Hãy nhập lại.");
                scan = new Scanner(System.in);
            }
        }
        scan.close();
    }
}
