package com.codefresher.buoi9.bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student implements School {
    private String fullName;
    private String className;
    private int age;
    private Date dateOfBirth;

    public Student(Scanner scan) {
        inputInfor(scan);
    }

    public Student(String fullName, String className, int age, Date dateOfBirth) {
        this.fullName = fullName;
        this.className = className;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void inputInfor(Scanner scan) {
        fullName = input("Nhập họ tên: ", scan, "String");
        className = input("Nhập tên lớp học: ", scan, "String");
        age = Integer.parseInt(input("Nhập tuổi của học sinh: ", scan, "int"));
        try {
            dateOfBirth = new SimpleDateFormat("dd/MM/yyyy")
                    .parse(input("Nhập ngày sinh theo dạng dd/mm/yyyy: ", scan, "Date"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showInfor(Student student) {
        System.out.println("Họ tên: " + fullName + "\nLớp học: " + className + "\nTuổi: " + age + "\nNgày sinh: " + dateOfBirth);
    }

    private String input(String key, Scanner sc, String type) {
        System.out.println(key);
        String value = sc.nextLine();
        while (value.equals("") || !checkInput(value, type)) {
            System.out.println("Hãy nhập đúng dữ liệu như yêu cầu\n" + key);
            value = sc.nextLine();
        }
        return value;
    }

    private boolean checkInput(String value, String type) {
        try {
            switch (type) {
                case "int":
                    Integer.parseInt(value);
                    break;
                case "Date":
                    new SimpleDateFormat("dd/MM/yyyy").parse(value);
                    break;
                default:
                    break;
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
