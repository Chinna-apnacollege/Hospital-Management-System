package Java_Projects.Hospital_Management_System;

import java.util.ArrayList;

public class Hospital 
{
    ArrayList<Patient> patients=new ArrayList<>();
    ArrayList<Doctor> doctors=new ArrayList<>();
    ArrayList<Appointment> appointments=new ArrayList<>();

    // Add Patient
    public void addPatient(Patient p)
    {
        patients.add(p);
        System.out.println("Patient added Succesfully!");
    }
    // Add Doctors
    public void addDoctor(Doctor d)
    {
        doctors.add(d);
        System.out.println("Doctor added Succesfully!");
    }
    
    // Add Appointments
    public void addAppointment(Appointment a)
    {
        boolean patientExists=false;
        boolean doctorExists=false;
        // Patient Check
        for(Patient p: patients)
        {
            if(p.id==a.patientId)
            {
                patientExists=true;
                break;
            }
        }
        // Doctor Check
        for(Doctor d:doctors)
        {
            if(d.id==a.doctorId)
            {
                doctorExists=true;
                break;
            }
        }
        if(patientExists && doctorExists)
        {
            appointments.add(a);
            System.out.println("Appointment booked Succesfully");
        }
        else
        {
            System.out.println("Invalid Patient ID or Doctor ID");
        }
        
    }

    // Display Patient Details
    public void displaypatients()
    {
        if(patients.isEmpty())
        {
            System.out.println("No Patient registered.");
            return;
        }
        for(Patient p:patients)
        {
            p.display_patient();
        }
    }

    // Display Doctor Details
    public void displaydoctors()
    {
        if(doctors.isEmpty())
        {
            System.out.println("No Doctor registered.");
            return;
        }
        for(Doctor d:doctors)
        {
            d.display_Doctor();
        }
    }

    // Display Appointment Details
    public void displayAppointments()
    {
        if(appointments.isEmpty())
        {
            System.out.println("No appointment Found");
            return;
        }
        for(Appointment a:appointments)
        {
            a.display_Appointment();
        }
    }

}
