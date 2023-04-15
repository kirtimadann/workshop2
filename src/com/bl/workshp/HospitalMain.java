package com.bl.workshp;

public class HospitalMain {

    public static void main(String[] args) {

        Patients obj = new Patients();

        obj.patientsdetails();


        Hospital obj2 = new Hospital("sanjvini","jalna",3,24);
        System.out.println(obj2.getHospitalname());
        System.out.println(obj2.getHospitaladdress());
        System.out.println(obj2.getHospitalrank());
        System.out.println(obj2.getHospitalid());


    }
}
