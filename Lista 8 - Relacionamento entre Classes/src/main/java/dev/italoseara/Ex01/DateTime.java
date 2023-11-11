package dev.italoseara.Ex01;

import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        this.date = new Date(day, month, year);
        this.time = new Time(hour, minute, second);
    }

    public String toString() {
        return String.format("%s %s", this.date, this.time);
    }
    public boolean isEqual(DateTime dateTime) {
        return this.date.isEqual(dateTime.date) && this.time.isEqual(dateTime.time);
    }

    public boolean isGreater(DateTime dateTime) {
        if (this.date.isGreater(dateTime.date)) return true;
        if (this.date.isLess(dateTime.date)) return false;

        return this.time.isGreater(dateTime.time);
    }

    public boolean isLess(DateTime dateTime) {
        return !this.isEqual(dateTime) && !this.isGreater(dateTime);
    }
}
