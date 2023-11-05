package dev.italoseara.Ex01;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if (this.hour > 23) {
            this.hour = 23;
        }

        if (this.minute > 59) {
            this.minute = 59;
        }

        if (this.second > 59) {
            this.second = 59;
        }
    }

    public Time(Time time) {
        this(time.hour, time.minute, time.second);
    }

    public void addTime(int h, int m, int s) {
        this.hour += h;
        this.minute += m;
        this.second += s;

        if (this.second >= 60) {
            this.second -= 60;
            this.minute++;
        }

        if (this.minute >= 60) {
            this.minute -= 60;
            this.hour++;
        }

        if (this.hour >= 24) {
            this.hour -= 24;
        }
    }

    public void addTime(int m, int s) {
        this.addTime(0, m, s);
    }

    public void addTime(int s) {
        this.addTime(0, 0, s);
    }

    public void addTime(Time time) {
        this.addTime(time.hour, time.minute, time.second);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
