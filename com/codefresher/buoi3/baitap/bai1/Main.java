package com.codefresher.buoi3.baitap.bai1;

public class Main{
    public static void main(String[] args) {
        var tong = new Count(5, 8);
        System.out.println(tong.sumOfTwoNumber());
        System.out.println(sumOftwoNumber(4, 5));
    }

    public static int sumOftwoNumber(int number1, int number2){
        return number1 + number2;
    }
}