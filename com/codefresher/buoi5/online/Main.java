package com.codefresher.buoi5.online;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhập vào điểm toán");
            float toan = scan.nextFloat();
            System.out.println("Nhập vào điểm văn");
            float van = scan.nextFloat();
            System.out.println("Nhập vào điểm anh");
            float anh = scan.nextFloat();
            var test = new Bai1(toan, van, anh);
            
            while(true){
                System.out.println("Nhập vào sự lựa chọn");
                int luaChon = scan.nextInt();
                test.kiemTraLuaChon(luaChon);
                System.out.println("\nBạn có muốn tiếp tục? Nhập \"Yes\" nếu muốn");
                String value = scan.next();
                if(value.equals("Yes")){
                    continue;
                }
                scan.close();
                System.out.println("Hẹn gặp lại bạn");
                break;
            }
            
        }
        catch(Exception ex){
            System.out.println("Bạn nhập sai cú pháp");
        }
    }
}
