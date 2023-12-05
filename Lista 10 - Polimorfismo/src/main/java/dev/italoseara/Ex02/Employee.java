package dev.italoseara.Ex02;

import java.util.Date;

public class Employee extends Person {
    protected Date admissionDate;
    protected double salary;

    public Employee(String name, long id, Date birthDate, Date admissionDate, double salary) {
        super(name, id, birthDate);
        this.admissionDate = admissionDate;
        this.salary = salary;
    }

    public Date getAdmissionDate() {
        return this.admissionDate;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getLoan() {
        return Math.max(1000.0, this.salary * 0.75);
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%s, id=%d, birthDate=%s, admissionDate=%s, salary=%f]",
                this.name, this.id, this.birthDate, this.admissionDate, this.salary);
    }
}
