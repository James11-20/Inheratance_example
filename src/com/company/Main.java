package com.company;

public class Main {

    public static void main(String[] args) {
	    Person sickPerson1 = new Person("Stu Dent");      //Object Person
        Person sickPerson2 = new Person("Any Body");
        var govprog = new Govprogram();
        Doctor dr = new Doctor(300,"Expensive U");
        var secondDR = new Surgeon("Children's Hospital");
        dr.treatPatient(sickPerson1);
        dr.billPatient(sickPerson1);  //method overloading
        dr.treatPatient(sickPerson2);
        dr.billPatient(false, govprog); //method overloading - billPatient already used, but now we get different method because of Parameters
        secondDR.treatPatient(sickPerson1);
        secondDR.billPatient(sickPerson1);          //usesDoctor class to use method
    }                                              //Method Overriding - you have a method and child variable
}
