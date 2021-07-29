package com.codefresher.buoi8.bai1;

import java.util.Scanner;

public class Bai1 {
    public void inputNumber(){
        double number1;
        double number2;
        try(var scan = new Scanner(System.in)){
            System.out.println("Nhập vào số thực 1");
            number1 = scan.nextDouble();
            System.out.println("Nhập vào số thực 2");
            number2 = scan.nextDouble();
            System.out.println("Số thực 1: " + number1 + "\nSố thực 2: " + number2);
        }catch (Exception ex) {
            System.out.println("Bạn nhập sai định dạng yêu cầu");
        }
    }

    public void division(int a, int b)throws ArithmeticException{
        System.out.println("Kết quả phép chia là: " + a/b);
    }

    public void checkDivision(int a, int b){
        Bai1 test = new Bai1();
        try{
            test.division(a, b);
        }catch(ArithmeticException ex){
            System.out.println("Phép chia không hợp lệ");
        }
    }
}
