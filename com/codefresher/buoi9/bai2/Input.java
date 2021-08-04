package com.codefresher.buoi9.bai2;

import java.util.Scanner;

public class Input {
    protected Scanner sc;

    public Input(){
        sc = new Scanner(System.in);
    }

    protected String input(String key, String type) {
        System.out.print(key);
        String value = sc.nextLine();
        while (value.equals("") || !checkInput(value, type)) {
            System.out.println("Hãy nhập đúng dữ liệu như yêu cầu\n" + key);
            value = sc.nextLine();
        }
        return value;
    }

    private boolean checkInput(String value, String type) {
        try {
            if (type.equals("int")) {
                Integer.parseInt(value);
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
