package com.company;

public class Person {
    private String name;

    public Person(String name){
        this.name =name;
    }

    public void getTreated(){
        System.out.println("My name is "+name+ " and I feel much better!");
    }
    public void payBill(double cost){
        System.out.println("Ouch! My name is "+ name +" and I just got the bill of "+cost);
    }
}
