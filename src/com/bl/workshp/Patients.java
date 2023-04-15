package com.bl.workshp;
import java.util.Scanner;
// Create multiple Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department)
//
//-> Create an Enum for Department(Values-> ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)
//
//-> Add multiple Patients in each Hospital
//
//-> Also Maintain a MAP of Hospitals through a Map(key->HospitalName , value-> Hospital-Object)

// ->  Create 3 classes - Hospital , Patient and HospitalMain
public class Patients {

   String name;
   int age;
   int phoneNumber;
   String city;
   String state;
   String department;

   public void patientsdetails(){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Name");
      String name = sc.nextLine();

      System.out.println("Enter City");
      String city = sc.nextLine();

      System.out.println("Enter state");
      String state = sc.nextLine();

      System.out.println("Enter Department");
      String department = sc.nextLine();

      System.out.println("Enter Age");
      int age = sc.nextInt();

      System.out.println("Enter PhoneNumber");
      int phoneNumber = sc.nextInt();

      Patients obj = new Patients();
      System.out.println(name);
      System.out.println(city);
      System.out.println(state);
      System.out.println(department);
      System.out.println(age);
      System.out.println(phoneNumber);
   }
   }



