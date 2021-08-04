package com.codefresher.buoi9.bai2;

public class Staff extends Human {
    private String work;

    public Staff(){
        super();
        work = input("Nhập công việc: ", "Str");
    }

    public Staff(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    protected String outInformation() {
        return super.outInformation() + "\nCông việc: " + work;
    }
}
