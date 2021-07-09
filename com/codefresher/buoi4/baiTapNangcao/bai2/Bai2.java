package com.codefresher.buoi4.baiTapNangcao.bai2;

public class Bai2 {
    private int day;

    public Bai2(int day){
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String checkDay(){
        String result;
        switch(day){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                result = "Xin chào thứ " + day;
                break;
            case 8:
                result = "Xin chào chủ nhật";
                break;
            default:
                result = "Thứ ngày không đúng";
        }
        return result;
    }
}
