package com.codefresher.buoi4.baitapvenha.bai2;

public class PrimeNumber {
    private int number;

    public PrimeNumber(int number){
        this.number = number;
    }

    public boolean checkPrimeNumber(){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public void printResult(){
        if(checkPrimeNumber()){
            System.out.println(number + " là số nguyên tố");
        }
        else{
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
