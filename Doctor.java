package Java_Projects.Hospital_Management_System;

import java.util.ArrayList;

public class Doctor 
{
    String name;
    int id;
    String specialization;
    double salary;
    public Doctor(String name,int id,String specialization,double salary)
    {
        this.name=name;
        this.id=id;
        this.specialization=specialization;
        this.salary=salary;
    }
    public void display_Doctor()
    {
        System.out.println("Doctor Details:");
        System.out.println();
        System.out.println("Doctor Name:"+name);
        System.out.println("Doctor Id:"+id);
        System.out.println("Doctor Specialization:"+specialization);
        System.out.println("Doctor Salary:"+salary);
        System.out.println("---------------------");
    }
}
