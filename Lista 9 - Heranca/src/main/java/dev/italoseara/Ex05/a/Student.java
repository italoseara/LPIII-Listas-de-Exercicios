package dev.italoseara.Ex05.a;

import dev.italoseara.Ex05.Course;

import java.util.Date;

public class Student {
    private String name;
    private int matriculationNumber;
    private Date admissionDate;
    private int semester;
    private Course course;

    private static final float baseMonthlyPayment = 700.0f;

    public Student(String name, int matriculationNumber, Date admissionDate, int semester, Course course) {
        this.name = name;
        this.matriculationNumber = matriculationNumber;
        this.admissionDate = admissionDate;
        this.semester = semester;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public int getMatriculationNumber() {
        return this.matriculationNumber;
    }

    public Date getAdmissionDate() {
        return this.admissionDate;
    }

    public int getSemester() {
        return this.semester;
    }

    public Course getCourse() {
        return this.course;
    }

    public boolean isRegular() {
        Date currentDate = new Date();
        System.out.println(admissionDate);
        int monthsSinceAdmission = (currentDate.getYear() - this.admissionDate.getYear()) * 12 + (currentDate.getMonth() - this.admissionDate.getMonth());
        int semestersSinceAdmission = monthsSinceAdmission / 6;
        System.out.println(monthsSinceAdmission);
        return semestersSinceAdmission >= this.semester;
    }

    public float getMonthlyPayment() {
        float monthlyPayment = baseMonthlyPayment;

        if (this.course == Course.ENGINEERING) {
            monthlyPayment += monthlyPayment * 0.2f;
        } else if (this.course == Course.COMPUTER_SCIENCE) {
            monthlyPayment += monthlyPayment * 0.1f;
        } else if (this.course == Course.LETTERS) {
            monthlyPayment += monthlyPayment * 0.05f;
        }

        if (!this.isRegular()) {
            monthlyPayment += monthlyPayment * 0.2f;
        }

        return monthlyPayment;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %s, %d, %s", this.name, this.matriculationNumber, this.admissionDate, this.semester, this.course);
    }
}
