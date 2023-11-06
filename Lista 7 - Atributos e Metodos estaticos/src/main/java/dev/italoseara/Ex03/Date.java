package dev.italoseara.Ex03;

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
            return date.howManyDays(this);
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

    public static int howManyDaysUntilEndYear(Date d) {
        Date endYear = new Date(31, 12, d.year);
        return endYear.howManyDays(d);
    }

    public static int howManyDaysUntilNextMonth(Date d) {
        Date nextMonth = new Date(1, d.month + 1, d.year);
        return nextMonth.howManyDays(d);
    }

    public static boolean isLeapYear(Date d) {
        return d.isLeapYear(d.year);
    }

    public static String dayOfWeek(Date d) {
        // Fonte: https://en.wikipedia.org/wiki/Determination_of_the_day_of_the_week#Sakamoto.27s_methods
        // Método utilizado: Sakamoto's method

        if (d.day == 0 || d.month == 0 || d.year == 0) return "Invalid";

        int year = d.year;

        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (d.month < 3) year -= 1;
        int dayOfWeek = (year + year/4 - year/100 + year/400 + t[d.month-1] + d.day) % 7;

        return switch (dayOfWeek) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
        };
    }

    public static String dayToPrintShort(Date d) {
        return String.format("%02d/%02d/%04d", d.day, d.month, d.year);
    }

    public static String dayToPrintLong(Date d) {
        return String.format("%02d of %s %04d", d.day, monthToPrint(d.month), d.year);
    }

    private static Object monthToPrint(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
