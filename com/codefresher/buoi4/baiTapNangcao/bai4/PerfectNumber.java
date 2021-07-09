package com.codefresher.buoi4.baiTapNangcao.bai4;

public class PerfectNumber {
    private int number;

    public PerfectNumber(int number){
        this.number = number;
    }

    public boolean perfectNumberCheck(){
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }

    public void testResults(){
        if(perfectNumberCheck()){
            System.out.println(number + " là số hoàn hảo");
        }
        else{
            System.out.println(number + " không phải số hoàn hảo");
        }
    }
}
