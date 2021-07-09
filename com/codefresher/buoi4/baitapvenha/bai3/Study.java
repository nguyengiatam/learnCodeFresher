package com.codefresher.buoi4.baitapvenha.bai3;

import java.util.Scanner;

public class Study {
    private float point;
    private Scanner scan;

    public Study(){
        scan = new Scanner(System.in);
        System.out.print("Nhập vào điểm trung bình của sinh viên: ");
        point = scan.nextFloat();
        scan.close();
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String academicAbility(){
        String result = "";
        if(point < 5){
            result = "Học sinh trung bình";
        }else if(point < 7){
            result = "Học sinh khá";
        }else{
            result = "Học sinh giỏi";
        }
        return result;
    }
}
