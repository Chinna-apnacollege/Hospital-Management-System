package Java_Projects.Hospital_Management_System;

import java.util.ArrayList;

public class Patient 
{
    String name;
    int id;
    int age;
    String disease;
    String phone;
    public Patient(String name,int id,int age,String disease,String phone)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.disease=disease;
        this.phone=phone;
    }
    public void display_patient()
    {
        System.out.println("Patient Details:");
        System.out.println();
        System.out.println("Patient Name:"+name);
        System.out.println("Patient ID:"+id);
        System.out.println("Patient age:"+age);
        System.out.println("Patient disease:"+disease);
        System.out.println("Patient Phone Number:"+phone);
        System.out.println("----------------------");
    }
}
