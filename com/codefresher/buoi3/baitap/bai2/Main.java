package com.codefresher.buoi3.baitap.bai2;

public class Main {
    public static void main(String[] args) {
        var check = new Check(7);
        check.printResult();
        check.setNumber(12);
        check.printResult();
        System.out.println("Số 7 là: " + checkEvenAndOddNumber(7));
        System.out.println("Số 12 là: " + checkEvenAndOddNumber(12));
    }

    public static String checkEvenAndOddNumber(int number){
        String result = "Số chẵn";
        if(number % 2 != 0){
            result = "Số lẻ";
        }
        return result;
    }
}
