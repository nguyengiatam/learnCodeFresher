package com.codefresher.buoi3.baitap.bai2;

public class Check {
    private int number;
    public Check(int number){
        this.number = number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String checkEvenAndOddNumber(){
        String isNumber = "Số chẵn";
        if(number % 2 != 0){
            isNumber = "Số lẻ";
        }
        return isNumber;
    }

    public void printResult(){
        System.out.println(number + " là " + checkEvenAndOddNumber());
    }
}
