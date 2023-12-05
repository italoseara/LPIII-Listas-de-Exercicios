package dev.italoseara.Ex05.a;

import dev.italoseara.Ex05.Course;
import dev.italoseara.Ex05.Level;

import java.util.Date;

public class PostGraduationStudent extends Student {
    private Level graduationLevel;
    private String projectTitle;
    private String advisor;


    public PostGraduationStudent(String name, int matriculationNumber, Date admissionDate, int semester, Course course, Level graduationLevel, String projectTitle, String advisor) {
        super(name, matriculationNumber, admissionDate, semester, course);
        this.graduationLevel = graduationLevel;
        this.projectTitle = projectTitle;
        this.advisor = advisor;
    }

    public Level getGraduationLevel() {
        return this.graduationLevel;
    }

    public String getProjectTitle() {
        return this.projectTitle;
    }

    public String getAdvisor() {
        return this.advisor;
    }

    @Override
    public boolean isRegular() {
        if (this.graduationLevel == Level.MASTERS) {
            return this.getSemester() <= 24;
        } else if (this.graduationLevel == Level.DOCTORATE) {
            return this.getSemester() <= 48;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", super.toString(), this.graduationLevel, this.projectTitle, this.advisor);
    }
}
