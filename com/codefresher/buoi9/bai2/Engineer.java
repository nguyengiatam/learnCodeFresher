package com.codefresher.buoi9.bai2;

public class Engineer extends Human {
    private String specialize;

    public Engineer(){
        super();
        this.specialize = input("Nhập chuyên môn: ", "Str");
    }

    public Engineer(String name, int age, String gender, String address, String specialize) {
        super(name, age, gender, address);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    protected String outInformation() {
        return super.outInformation() + "\nChuyên ngành: " + specialize;
    }
}
