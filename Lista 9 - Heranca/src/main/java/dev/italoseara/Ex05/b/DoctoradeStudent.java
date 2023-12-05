package dev.italoseara.Ex05.b;

import dev.italoseara.Ex05.Course;
import dev.italoseara.Ex05.Level;
import dev.italoseara.Ex05.a.PostGraduationStudent;

import java.util.Date;

public class DoctoradeStudent extends PostGraduationStudent {
    public DoctoradeStudent(String name, int matriculationNumber, Date admissionDate, int semester, Course course, String projectTitle, String advisor) {
        super(name, matriculationNumber, admissionDate, semester, course, Level.DOCTORATE, projectTitle, advisor);
    }

    @Override
    public boolean isRegular() {
        return this.getSemester() <= 48;
    }
}
