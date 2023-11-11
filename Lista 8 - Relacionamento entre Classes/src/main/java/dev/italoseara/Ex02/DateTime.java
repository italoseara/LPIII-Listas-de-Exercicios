package dev.italoseara.Ex02;

import dev.italoseara.other.Date;
import dev.italoseara.other.Time;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
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
