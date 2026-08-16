package Final_Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class PatientNotFoundException extends Exception {
    public PatientNotFoundException(String msg) {
        super(msg);
    }
}

class DoctorNotFoundException extends Exception {
    public DoctorNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

abstract class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) throws InvalidAgeException {
        if (age <= 0 || age > 120) {
            throw new InvalidAgeException("Invalid age");
        }

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age <= 0 || age > 120) {
            throw new InvalidAgeException("Invalid age");
        }

        this.age = age;
    }

    public abstract void displayDetails();
}

class Patient extends Person {
    private String disease;
    private String blood;

    public Patient(int id, String name, int age, String disease, String blood)
            throws InvalidAgeException {
        super(id, name, age);
        this.disease = disease;
        this.blood = blood;
    }

    public String getDisease() {
        return disease;
    }

    public String getBlood() {
        return blood;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public void displayDetails() {
        System.out.println("Patient ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Disease: " + disease);
        System.out.println("Blood Group: " + blood);
    }
}

class Doctor extends Person {
    private String spec;
    private int exp;
    private double fee;

    public Doctor(int id, String name, int age, String spec, int exp, double fee)
            throws InvalidAgeException {
        super(id, name, age);
        this.spec = spec;
        this.exp = exp;
        this.fee = fee;
    }

    public String getSpec() {
        return spec;
    }

    public int getExp() {
        return exp;
    }

    public double getFee() {
        return fee;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void displayDetails() {
        System.out.println("Doctor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Speciality: " + spec);
        System.out.println("Experience: " + exp + " years");
        System.out.println("Fee: Rs." + fee);
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Department ID: " + id);
        System.out.println("Department Name: " + name);
    }
}

class Appointment {
    private int id;
    private Patient p;
    private Doctor d;
    private String date;
    private String time;
    private String status;

    public Appointment(int id, Patient p, Doctor d, String date, String time) {
        this.id = id;
        this.p = p;
        this.d = d;
        this.date = date;
        this.time = time;
        this.status = "Booked";
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return p;
    }

    public Doctor getDoctor() {
        return d;
    }

    public String getStatus() {
        return status;
    }

    public void cancel() {
        status = "Cancelled";
    }

    public void displayDetails() {
        System.out.println("Appointment ID: " + id);
        System.out.println("Patient: " + p.getName());
        System.out.println("Doctor: " + d.getName());
        System.out.println("Speciality: " + d.getSpec());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Status: " + status);
    }
}

class Hospital {
    private ArrayList<Patient> ps;
    private ArrayList<Doctor> ds;
    private ArrayList<Department> deps;
    private LinkedList<Appointment> apps;

    public Hospital() {
        ps = new ArrayList<>();
        ds = new ArrayList<>();
        deps = new ArrayList<>();
        apps = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        ps.add(p);
        System.out.println("Patient added");
    }

    public void addDoctor(Doctor d) {
        ds.add(d);
        System.out.println("Doctor added");
    }

    public void addDepartment(Department d) {
        deps.add(d);
        System.out.println("Department added");
    }

    public Patient searchPatient(int id) throws PatientNotFoundException {
        for (Patient p : ps) {
            if (p.getId() == id) {
                return p;
            }
        }

        throw new PatientNotFoundException("Patient not found");
    }

    public Doctor searchDoctor(int id) throws DoctorNotFoundException {
        for (Doctor d : ds) {
            if (d.getId() == id) {
                return d;
            }
        }

        throw new DoctorNotFoundException("Doctor not found");
    }

    public void removePatient(int id) throws PatientNotFoundException {
        Patient p = searchPatient(id);
        ps.remove(p);
        System.out.println("Patient removed");
    }

    public void removeDoctor(int id) throws DoctorNotFoundException {
        Doctor d = searchDoctor(id);
        ds.remove(d);
        System.out.println("Doctor removed");
    }

    public void showPatients() {
        if (ps.isEmpty()) {
            System.out.println("No patients");
            return;
        }

        for (Patient p : ps) {
            p.displayDetails();
            System.out.println();
        }
    }

    public void showDoctors() {
        if (ds.isEmpty()) {
            System.out.println("No doctors");
            return;
        }

        for (Doctor d : ds) {
            d.displayDetails();
            System.out.println();
        }
    }

    public void showDepartments() {
        if (deps.isEmpty()) {
            System.out.println("No departments");
            return;
        }

        for (Department d : deps) {
            d.displayDetails();
            System.out.println();
        }
    }

    public void book(int id, int pid, int did, String date, String time)
            throws PatientNotFoundException, DoctorNotFoundException {

        Patient p = searchPatient(pid);
        Doctor d = searchDoctor(did);

        Appointment a = new Appointment(id, p, d, date, time);
        apps.add(a);

        System.out.println("Appointment booked");
    }

    public void cancel(int id) {
        for (Appointment a : apps) {
            if (a.getId() == id) {
                if (a.getStatus().equals("Cancelled")) {
                    System.out.println("Appointment already cancelled");
                } else {
                    a.cancel();
                    System.out.println("Appointment cancelled");
                }
                return;
            }
        }

        System.out.println("Appointment not found");
    }

    public void showAppointments() {
        if (apps.isEmpty()) {
            System.out.println("No appointments");
            return;
        }

        for (Appointment a : apps) {
            a.displayDetails();
            System.out.println();
        }
    }

    public void searchSpec(String spec) {
        boolean found = false;

        for (Doctor d : ds) {
            if (d.getSpec().equalsIgnoreCase(spec)) {
                d.displayDetails();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Doctor not found");
        }
    }
}

public class Hospital_Management_System {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Hospital h = new Hospital();
        int ch;

        do {
            System.out.println();
            System.out.println("Multi Speciality Hospital System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Department");
            System.out.println("4. Search Patient");
            System.out.println("5. Search Doctor");
            System.out.println("6. Remove Patient");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Display Patients");
            System.out.println("9. Display Doctors");
            System.out.println("10. Display Departments");
            System.out.println("11. Book Appointment");
            System.out.println("12. Cancel Appointment");
            System.out.println("13. Display Appointments");
            System.out.println("14. Search Doctor by Speciality");
            System.out.println("15. Invalid Input");
            System.out.println("16. Exception Handling");
            System.out.println("0. Exit");

            ch = readInt("Enter choice: ");

            try {
                switch (ch) {
                    case 1:
                        addPatient(h);
                        break;

                    case 2:
                        addDoctor(h);
                        break;

                    case 3:
                        addDepartment(h);
                        break;

                    case 4:
                        findPatient(h);
                        break;

                    case 5:
                        findDoctor(h);
                        break;

                    case 6:
                        deletePatient(h);
                        break;

                    case 7:
                        deleteDoctor(h);
                        break;

                    case 8:
                        h.showPatients();
                        break;

                    case 9:
                        h.showDoctors();
                        break;

                    case 10:
                        h.showDepartments();
                        break;

                    case 11:
                        book(h);
                        break;

                    case 12:
                        cancel(h);
                        break;

                    case 13:
                        h.showAppointments();
                        break;

                    case 14:
                        searchSpec(h);
                        break;

                    case 15:
                        System.out.println("Invalid input");
                        break;

                    case 16:
                        System.out.println("Custom exceptions are handled");
                        break;

                    case 0:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Enter a valid choice");
                }

            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (PatientNotFoundException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (DoctorNotFoundException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (ch != 0);

        sc.close();
    }

    static void addPatient(Hospital h) throws InvalidAgeException {
        int id = readInt("Patient ID: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        int age = readInt("Age: ");

        System.out.print("Disease: ");
        String disease = sc.nextLine();

        System.out.print("Blood Group: ");
        String blood = sc.nextLine();

        Patient p = new Patient(id, name, age, disease, blood);
        h.addPatient(p);
    }

    static void addDoctor(Hospital h) throws InvalidAgeException {
        int id = readInt("Doctor ID: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        int age = readInt("Age: ");

        System.out.print("Speciality: ");
        String spec = sc.nextLine();

        int exp = readInt("Experience: ");
        double fee = readDouble("Fee: ");

        Doctor d = new Doctor(id, name, age, spec, exp, fee);
        h.addDoctor(d);
    }

    static void addDepartment(Hospital h) {
        int id = readInt("Department ID: ");

        System.out.print("Department Name: ");
        String name = sc.nextLine();

        Department d = new Department(id, name);
        h.addDepartment(d);
    }

    static void findPatient(Hospital h)
            throws PatientNotFoundException {

        int id = readInt("Patient ID: ");
        Patient p = h.searchPatient(id);
        p.displayDetails();
    }

    static void findDoctor(Hospital h)
            throws DoctorNotFoundException {

        int id = readInt("Doctor ID: ");
        Doctor d = h.searchDoctor(id);
        d.displayDetails();
    }

    static void deletePatient(Hospital h)
            throws PatientNotFoundException {

        int id = readInt("Patient ID: ");
        h.removePatient(id);
    }

    static void deleteDoctor(Hospital h)
            throws DoctorNotFoundException {

        int id = readInt("Doctor ID: ");
        h.removeDoctor(id);
    }

    static void book(Hospital h)
            throws PatientNotFoundException, DoctorNotFoundException {

        int id = readInt("Appointment ID: ");
        int pid = readInt("Patient ID: ");
        int did = readInt("Doctor ID: ");

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Time: ");
        String time = sc.nextLine();

        h.book(id, pid, did, date, time);
    }

    static void cancel(Hospital h) {
        int id = readInt("Appointment ID: ");
        h.cancel(id);
    }

    static void searchSpec(Hospital h) {
        System.out.print("Speciality: ");
        String spec = sc.nextLine();

        h.searchSpec(spec);
    }

    static int readInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a number");
            }
        }
    }

    static double readDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a number");
            }
        }
    }
}
