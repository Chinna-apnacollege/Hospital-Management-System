package Java_Projects.Hospital_Management_System;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Hospital hospital=new Hospital();
        int choice;
        do
        {
            System.out.println("==== Welcome To Hospital management System ====");
            System.out.println("Menu Pick between(1-7):");
            System.out.println("1.Add Patient");
            System.out.println("2.Add Doctor");
            System.out.println("3.Add Appointment");
            System.out.println("4.Display patient");
            System.out.println("5.Display Doctors");
            System.out.println("6.Display All Appointment");
            System.out.println("7.Exit");
            System.out.print("Enter Your Choice: ");
            choice=sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Enter Patient Details:");
                    System.out.print("Enter Patient ID:");
                    int patient_ID=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name:");
                    String patient_name=sc.nextLine();
                    System.out.print("Enter Patient Age:");
                    int patient_age=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Diesease:");
                    String patient_disease=sc.nextLine();
                    System.out.print("Enter Patient Phone Number:");
                    String patient_Number=sc.nextLine();
                    Patient p=new Patient(patient_name,patient_ID,patient_age,patient_disease,patient_Number);
                    hospital.addPatient(p);
                    break;
                case 2:
                    System.out.println("Enter Doctor Details:");
                    System.out.print("Enter Doctor ID:");
                    int doctor_ID=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Doctor Name:");
                    String doctor_name=sc.nextLine();
                    System.out.print("Enter Doctor Salary:");
                    double doctor_salary=sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Doctor Specialization:");
                    String doctor_specialization=sc.nextLine();
                    
                    Doctor d=new Doctor(doctor_name,doctor_ID,doctor_specialization,doctor_salary);
                    hospital.addDoctor(d);
                    break;
                case 3:
                    System.out.println("Appointment Details:");
                    System.out.print("Enter Appointment ID:");
                    int aid=sc.nextInt();
                    System.out.print("Enter Patient ID:");
                    int apid=sc.nextInt();
                    System.out.print("Enter Doctor ID:");
                    int adid=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Appointment Date:");
                    String Date=sc.nextLine();
                    Appointment a=new Appointment(aid, apid, adid, Date);
                    hospital.addAppointment(a);
                    break;
                case 4:
                    System.out.println("====== Patient Details ======");
                    hospital.displaypatients();
                    break;
                case 5:
                    System.out.println("====== Doctor Details ======");
                    hospital.displaydoctors();
                    break;
                case 6:
                    System.out.println("====== Appointment Details ======");
                    hospital.displayAppointments();
                    break;
                case 7:
                    System.out.println("Exit.Thank You For using Our Hospital Management System.");
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again");
                    break;
            }
        }while(choice!=7);

        sc.close();

    }
    
}
