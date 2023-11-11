package dev.italoseara.Ex06;

import dev.italoseara.other.Contact;
import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class Example {

    public static void main(String[] args) {
        Schedule[] schedules;

        schedules = new Schedule[]{
                new Schedule(
                        new Date(1, 1, 2023),
                        new Time(12, 0, 0),
                        new Contact("John", "Doe")
                ),
                new Schedule(
                        new Date(13, 10, 2023),
                        new Time(15, 0, 0),
                        new Contact("Jane", "Doe")
                ),
                new Schedule(
                        new Date(15, 2, 2023),
                        new Time(8, 0, 0),
                        new Contact("Italo", "Seara")
                )
        };

        System.out.println("Schedules:");
        for (Schedule schedule : schedules) {
            System.out.println(schedule);
        }

        System.out.println();

        System.out.println("Schedules in order:");
        for (Schedule schedule : Schedule.sort(schedules)) {
            System.out.println(schedule);
        }
    }
}
