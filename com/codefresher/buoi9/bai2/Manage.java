package com.codefresher.buoi9.bai2;

import java.util.ArrayList;

public class Manage extends Input {
    private ArrayList<Human> listHuman;
    private int engineer;
    private int worker;
    private int staff;

    public Manage(){
        listHuman = new ArrayList<>();
        engineer = 0;
        worker = 0;
        staff = 0;
    }

    private void creatNewHuman() {
        String key = input("Nhập đối tượng bạn muốn thêm(worker, staff, engineer): ", "str");
        String result = "Thêm mới thành công";
        Human newHuman;
        switch (key) {
            case "worker":
                newHuman = new Worker();
                listHuman.add(newHuman);
                worker++;
                break;
            case "staff":
                newHuman = new Staff();
                listHuman.add(newHuman);
                staff++;
                break;
            case "engineer":
                newHuman = new Engineer();
                listHuman.add(newHuman);
                engineer++;
                break;
            default:
                System.out.println("Không thể tạo dạng đối tượng như bạn vừa nhập.");
                result = "Thêm mới thất bại";
                break;
        }
        System.out.println(result);
    }

    private void seachFullName(){
        System.out.print("Nhập tên muốn tìm kiếm: ");
        Boolean check = false;
        String name = sc.nextLine();
        for (Human human : listHuman) {
            if(human.name.equals(name)){
                System.out.println(human.outInformation());
                check = true;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy nhân lực có tên như bạn vùa nhập.");
        }
    }

    private void listHumanInformation(){
        System.out.println("Thông tin danh sách nhân lực: ");
        System.out.println("Tổng nhân lực: " + (worker + engineer + staff));
        System.out.println("Số lượng công nhân: " + worker);
        System.out.println("Số lượng nhân viên: " + staff);
        System.out.println("Số lượng kỹ sư: " + engineer);
    }

    public void runTheProgram(){
        int value = 0;
        while(value != 4){
            System.out.println("\nNhập các số theo lựa chọn của bạn:");
            System.out.println("1) Thêm mới nhân sự.");
            System.out.println("2) Tìm kiếm nhân sự theo tên.");
            System.out.println("3) Hiển thị thông tin danh sách nhân sự.");
            System.out.println("4) Thoát chương trình.");
            value = Integer.parseInt(input("Nhập lựa chọn: ", "int"));
            switch(value){
                case 1: 
                    creatNewHuman();
                    break;
                case 2:
                    seachFullName();
                    break;
                case 3:
                    listHumanInformation();
                    break;
                case 4:
                    System.out.println("Tạm biệt.");
                    break;
                default:
                    System.out.println("Không có lựa chọn như yêu cầu.");
            }
        }
    }
}
