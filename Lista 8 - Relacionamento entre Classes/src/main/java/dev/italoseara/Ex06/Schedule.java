package dev.italoseara.Ex06;

import dev.italoseara.other.Contact;
import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class Schedule {
    Date date;
    Time time;
    Contact contact;

    Schedule(Date date, Time time, Contact contact) {
        this.date = date;
        this.time = time;
        this.contact = contact;
    }

    public static Schedule[] sort(Schedule[] schedules) {
        Schedule[] sortedSchedules = new Schedule[schedules.length];
        int sortedSchedulesIndex = 0;

        for (Schedule schedule : schedules) {
            if (sortedSchedulesIndex == 0) {
                sortedSchedules[sortedSchedulesIndex] = schedule;
                sortedSchedulesIndex++;
            } else {
                for (int i = 0; i < sortedSchedulesIndex; i++) {
                    if (schedule.isBefore(sortedSchedules[i])) {
                        for (int j = sortedSchedulesIndex; j > i; j--) {
                            sortedSchedules[j] = sortedSchedules[j - 1];
                        }
                        sortedSchedules[i] = schedule;
                        sortedSchedulesIndex++;
                        break;
                    } else if (i == sortedSchedulesIndex - 1) {
                        sortedSchedules[sortedSchedulesIndex] = schedule;
                        sortedSchedulesIndex++;
                        break;
                    }
                }
            }
        }

        return sortedSchedules;
    }

    public String toString() {
        return this.date + " " + this.time + " " + this.contact;
    }

    public boolean isBefore(Schedule schedule) {
        return this.date.isLess(schedule.date) || this.date.isEqual(schedule.date) && this.time.isLess(schedule.time);
    }

    public boolean isAfter(Schedule schedule) {
        return this.date.isGreater(schedule.date) || this.date.isEqual(schedule.date) && this.time.isGreater(schedule.time);
    }

    public boolean isEqual(Schedule schedule) {
        return this.date.isEqual(schedule.date) && this.time.isEqual(schedule.time);
    }

    public boolean isConflict(Schedule schedule) {
        return this.isBefore(schedule) && this.isAfter(schedule) || this.isEqual(schedule);
    }
}
