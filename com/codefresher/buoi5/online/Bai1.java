package com.codefresher.buoi5.online;


public class Bai1 {
    private float toan;
    private float van;
    private float anh;

    public Bai1(float toan, float van, float anh){
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public void kiemTraLuaChon(int luaChon){
        switch(luaChon){
            case 1:
                System.out.printf("Tổng 3 môn là: %.2f",tinhTong());
                break;
            case 2:
                System.out.printf("Trung bình ba môn là: %.2f",tinhTrungBinh());
                System.out.println("\n");
                break;
            case 3:
                System.out.println(xepLoai());
                break;
            default:
                System.out.println(giaiPtBacHai());
        }
    }

    public float tinhTong(){
        return toan + van + anh;
    }

    public float tinhTrungBinh(){
        return tinhTong()/3;
    }

    public String xepLoai(){
        String result = "";
        if(tinhTong() < 15){
            result = "Học sinh trung bình";
        }
        else if(tinhTong() < 18){
            result = "Học sinh khá";
        }
        else if(tinhTong() < 21){
            result = "Học sinh tiên tiến";
        }
        else{
            result = "Học sinh giỏi";
        }
        return result;
    }

    public String giaiPtBacHai(){
        String msg = "";
        double delta = van*van - 4*toan*anh;
        if(delta > 0){
            msg = "Phương trình có hai nghiệm phân biệt là: x1 = " + (-van + Math.sqrt(delta))/2*toan + " x2 = " + (-van - Math.sqrt(delta))/2*toan;
        }
        else if(delta == 0){
            msg = "Phương trình có nghệm kép là: x1 = x2 = " + -van/2*toan;
        }
        else{
            msg = "Phương trình vô nghiệm";
        }
        return msg;
    }
}
