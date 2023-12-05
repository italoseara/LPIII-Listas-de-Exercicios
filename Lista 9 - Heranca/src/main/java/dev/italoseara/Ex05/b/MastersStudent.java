package dev.italoseara.Ex05.b;

import dev.italoseara.Ex05.Course;
import dev.italoseara.Ex05.Level;
import dev.italoseara.Ex05.a.PostGraduationStudent;

import java.util.Date;

public class MastersStudent extends PostGraduationStudent {

    public MastersStudent(String name, int matriculationNumber, Date admissionDate, int semester, Course course, String projectTitle, String advisor) {
        super(name, matriculationNumber, admissionDate, semester, course, Level.MASTERS, projectTitle, advisor);
    }

    @Override
    public boolean isRegular() {
        return this.getSemester() <= 24;
    }
}
