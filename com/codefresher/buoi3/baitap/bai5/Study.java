package com.codefresher.buoi3.baitap.bai5;

public class Study {
    private int math;
    private int english;
    private int literature;
    private String academic;

    public Study(int math, int english, int literature){
        this.math = math;
        this.english = english;
        this.literature = literature;
    }

    public void setAcademic() {
        int sum = math + english + literature;
        if(sum < 15){
            academic = "Học sinh trung bình";
        }
        else if(sum < 16){
            academic = "Học sinh khá";
        }
        else if(sum < 21){
            academic = "Học sinh tiên tiến";
        }
        else{
            academic = "Học sinh giỏi";
        }
    }

    public String getAcademic() {
        return academic;
    }
}
