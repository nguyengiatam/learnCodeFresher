package com.codefresher.buoi9.bai2;

public class Worker extends Human {
    private int level;

    public Worker(){
        super();
        this.level = Integer.parseInt(input("Nhập cấp bậc: ", "int"));
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    protected String outInformation() {
        return super.outInformation() + "\nCấp bậc: " + level;
    }
}
