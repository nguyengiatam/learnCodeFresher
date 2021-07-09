package com.codefresher.buoi4.baitapvenha.bai1;

public class SortMaxValue {
    private int number1;
    private int number2;
    private int number3;

    public SortMaxValue(int number1, int number2, int number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int maxValue(){
        int x = number1;
        if(x < number2){
            x = number2;
        }
        if(x < number3){
            x = number3;
        }
        return x;
    }
}
