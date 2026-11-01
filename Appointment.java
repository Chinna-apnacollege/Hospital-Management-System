package Java_Projects.Hospital_Management_System;

public class Appointment 
{
    int appointmentId;
    int patientId;
    int doctorId;
    String date;
    public Appointment(int appointmentId,int patientId,int doctorId, String date)
    {
        this.appointmentId=appointmentId;
        this.patientId=patientId;
        this.doctorId=doctorId;
        this.date=date;
    }
    public void display_Appointment()
    {
        System.out.println("Appointment Details:");
        System.out.println();
        System.out.println("AppointmentId:"+appointmentId);
        System.out.println("patientId"+patientId);
        System.out.println("doctorId"+doctorId);
        System.out.println("Date:"+date);
        System.out.println("---------------------");
    }
}
