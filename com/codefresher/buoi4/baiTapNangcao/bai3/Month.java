package com.codefresher.buoi4.baiTapNangcao.bai3;

public class Month {
    private int isMonth;

    public Month(int isMonth){
        this.isMonth = isMonth;
    }

    public String dayOfMonth(){
        String result = "Tháng " + isMonth;
        switch(isMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result += " có 31 ngày";
                break;
            case 2:
                result += " có 28 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result += " có 30 ngày";
                break;
            default:
                result = "Tháng không chính xác";
        }
        return result;
    }
}
