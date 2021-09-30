package com.company;

public class Doctor {
    protected String AlmaMaster;     //Instance variables
    private double fee;

    public Doctor(double cost,String medSchool){
        fee =cost;
        AlmaMaster = medSchool;
    }

    public void treatPatient(Person patient){
        System.out.println("Take two of these and call the office in the morning");
        patient.getTreated();
    }
    public double billPatient(Person patient){
        patient.payBill(fee);
        return fee;
    }
    public double billPatient(boolean isMedicare, Govprogram goprogram){
        var billCost =0.0;
        if(isMedicare)
            billCost = fee/2;
        else
            billCost = fee;
        goprogram.payBill(billCost);
        return billCost;
    }
}
