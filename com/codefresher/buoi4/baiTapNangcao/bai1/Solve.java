package com.codefresher.buoi4.baiTapNangcao.bai1;

public class Solve {
    private int a;
    private int b;
    private int c;
    private int delta;

    public Solve(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        delta = b*b - 4*a*c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String solve(){
        String msg = "";
        if(delta > 0){
            msg = "Phương trình có hai nghiệm phân biệt là: x1 = " + (-b + Math.sqrt(delta))/2*a + " x2 = " + (-b - Math.sqrt(delta))/2*a;
        }
        else if(delta == 0){
            msg = "Phương trình có nghệm kép là: x1 = x2 = " + -b/2*a;
        }
        else{
            msg = "Phương trình vô nghiệm";
        }
        return msg;
    }
}
