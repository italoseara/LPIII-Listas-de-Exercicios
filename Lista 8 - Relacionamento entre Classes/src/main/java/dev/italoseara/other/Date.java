package dev.italoseara.other;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        this(1, 1, 1970);
    }

    public Date(int day, int month, int year) {
        this.setDate(day, month, year);
    }

    public Date(Date data) {
        this(data.day, data.month, data.year);
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public boolean isPrevious(Date date) {
        if (this.year < date.year) return true;
        if (this.year > date.year) return false;

        if (this.month < date.month) return true;
        if (this.month > date.month) return false;

        return this.day < date.day;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

    public void addDays(int days) {
        if (days < 0) {
            this.subtractDays(-days);
            return;
        }

        while (days > 0) {
            if (this.day == this.getDaysInMonth(this.month, this.year)) {
                this.day = 1;

                if (this.month == 12) {
                    this.month = 1;
                    this.year++;
                } else {
                    this.month++;
                }
            } else {
                this.day++;
            }

            days--;
        }
    }

    public void subtractDays(int days) {
        if (days < 0) {
            this.addDays(-days);
            return;
        }

        while (days > 0) {
            if (this.day == 1) {
                if (this.month == 1) {
                    this.month = 12;
                    this.year--;
                } else {
                    this.month--;
                }

                this.day = this.getDaysInMonth(this.month, this.year);
            } else {
                this.day--;
            }

            days--;
        }
    }

    private int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 2 -> this.isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int howManyDays(int day, int month, int year) {
        return this.howManyDays(new Date(day, month, year));
    }

    public int howManyDays(Date date) {
        if (this.year == date.year && this.month == date.month && this.day == date.day) {
            return 0;
        }

        if (!this.isPrevious(date)) {
            return -date.howManyDays(this);
        }

        int days = 0;
        Date temp = new Date(this.day, this.month, this.year);

        while (temp.isPrevious(date)) {
            temp.addDays(1);
            days++;
        }

        return days;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if (this.day > 31) {
            this.day = 31;
        }

        if (this.month > 12) {
            this.month = 12;
        }

        if (this.year < 0) {
            this.year = 0;
        }
    }

    public void setDate(Date data) {
        this.setDate(data.day, data.month, data.year);
    }

    public boolean isEqual(Date date) {
        return this.day == date.day && this.month == date.month && this.year == date.year;
    }

    public boolean isGreater(Date date) {
        if (this.year > date.year) return true;
        if (this.year < date.year) return false;

        if (this.month > date.month) return true;
        if (this.month < date.month) return false;

        return this.day > date.day;
    }

    public boolean isLess(Date date) {
        return !this.isEqual(date) && !this.isGreater(date);
    }
}
