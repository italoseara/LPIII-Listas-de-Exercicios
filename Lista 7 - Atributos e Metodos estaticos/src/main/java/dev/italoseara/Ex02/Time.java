package dev.italoseara.Ex02;

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

    public static Time diffTime(Time t1, Time t2) {
        int h = t1.hour - t2.hour;
        int m = t1.minute - t2.minute;
        int s = t1.second - t2.second;

        if (s < 0) {
            s += 60;
            m--;
        }

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) {
            h += 24;
        }

        return new Time(h, m, s);
    }

    public static Time diffTime(Time t2) {
        long millis = System.currentTimeMillis() - (3 * 60 * 60 * 1000); // (UTC-3)
        int h = (int) ((millis / (1000 * 60 * 60)) % 24);
        int m = (int) ((millis / (1000 * 60)) % 60);
        int s = (int) (millis / 1000) % 60;

        Time t1 = new Time(h, m, s);
        return diffTime(t1, t2);
    }

    public static boolean isAm(Time time) {
        return time.hour < 12;
    }

    public static boolean isPm(Time time) {
        return time.hour > 12;
    }
}
