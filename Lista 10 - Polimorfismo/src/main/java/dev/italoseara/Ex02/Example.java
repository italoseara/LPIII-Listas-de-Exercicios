package dev.italoseara.Ex02;

import java.util.Calendar;
import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person p1 = new Person("João", 0, new Date(2004, Calendar.OCTOBER, 13));
        people[0] = p1;

        Employee p2 = new Employee("Maria", 1, new Date(2000, Calendar.JANUARY, 1),
                new Date(2010, Calendar.JANUARY, 1), 3000);
        people[1] = p2;

        DepartmentChief p3 = new DepartmentChief("José", 2, new Date(2000, Calendar.JANUARY, 1),
                new Date(2010, Calendar.JANUARY, 1), 7000, "TI", new Date());
        people[2] = p3;

        for (Person p : people) {
            System.out.println(p);
            System.out.println("Loan: " + p.getLoan());
        }
    }
}
