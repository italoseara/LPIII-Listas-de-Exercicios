package dev.italoseara.Ex05;

import dev.italoseara.Ex05.a.Student;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Student s1 = new Student(
                "Italo Seara",
                202220031,
                new Date(2022, 7, 1),
                3,
                Course.COMPUTER_SCIENCE
        );

        Student s2 = new Student(
                "John Doe",
                202220032,
                new Date(2022, 8, 1),
                5,
                Course.ENGINEERING
        );

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.getMonthlyPayment());
        System.out.println(s2.getMonthlyPayment());

        System.out.println(s1.isRegular());
        System.out.println(s2.isRegular());
    }
}
