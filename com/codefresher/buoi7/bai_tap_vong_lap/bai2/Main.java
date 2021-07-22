package com.codefresher.buoi7.bai_tap_vong_lap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên lớn hơn 20: ");
        while(number < 20){
            try {
                number = scan.nextInt();
                if(number < 20){
                    System.out.println("Số vừa nhập bé hơn 20. Hãy nhập lại.");
                }
            }catch(Exception ex){
                System.out.println("Bạn nhập sai định dạng yêu cầu hoặc một số quá lớn. Hãy nhập lại.");
                scan = new Scanner(System.in);
            }
        }
        scan.close();

        String msg = number + " là số nguyên tố";

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                msg = number + " không phải số nguyên tố";
                break;
            }
        }

        System.out.println(msg);
    }
}
