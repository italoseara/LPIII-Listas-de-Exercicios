package dev.italoseara.Ex02;

public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * @param day the day of the month
     * @param month the month of the year
     * @param year the year
     */
    public Date(int day, int month, int year) {
        if (this.isValid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
            return;
        }

        throw new IllegalArgumentException("Invalid date");
    }

    /**
     * @param date the date to compare
     * @return true if this date is previous to the given date
     */
    public boolean isPrevious(Date date) {
        if (this.year < date.year) return true;
        if (this.year > date.year) return false;

        if (this.month < date.month) return true;
        if (this.month > date.month) return false;

        return this.day < date.day;
    }

    /**
     * @param date the date to compare
     * @return the number of days until the given date
     */
    public int howManyDays(Date date) {
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

    /**
     * @return the day of the week of this date
     */
    public String getDayOfWeek() {
        // Fonte: https://en.wikipedia.org/wiki/Determination_of_the_day_of_the_week#Sakamoto.27s_methods
        // Método utilizado: Sakamoto's method

        if (this.day == 0 || this.month == 0 || this.year == 0) return "Invalid";

        int year = this.year;

        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (this.month < 3) year -= 1;
        int dayOfWeek = (year + year/4 - year/100 + year/400 + t[this.month-1] + this.day) % 7;

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

    private boolean isValid(int day, int month, int year) {
        if (day < 1 || day > 31) return false;
        if (month < 1 || month > 12) return false;
        if (year < 0) return false;

        return day <= this.getDaysInMonth(month, year);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 2 -> this.isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    /**
     * @return the name of the month of this date
     */
    public String getMonthName() {
        return switch (this.month) {
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
            default -> "Invalid";
        };
    }

    /**
     * @return the day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * @return the month of the year
     */
    public int getMonth() {
        return month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param day the day of the month
     */
    public void setDay(int day) {
        if (this.isValid(day, this.month, this.year)) {
            this.day = day;
        }
    }

    /**
     * @param month the month of the year
     */
    public void setMonth(int month) {
        if (this.isValid(this.day, month, this.year)) {
            this.month = month;
        }
    }

    /**
     * @param year the year
     */
    public void setYear(int year) {
        if (this.isValid(this.day, this.month, year)) {
            this.year = year;
        }
    }

    /**
     * @param days the number of days to add
     */
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

    /**
     * @param days the number of days to subtract
     */
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

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d, %s", this.day, this.month, this.year, this.getDayOfWeek());
    }

    /**
     * Prints the date in the format: "1st of January 2024, Monday"
     */
    public void printDate() {
        if (this.day == 1) {
            System.out.printf("%dst", this.day);
        } else if (this.day == 2) {
            System.out.printf("%dnd", this.day);
        } else if (this.day == 3) {
            System.out.printf("%drd", this.day);
        } else {
            System.out.printf("%dth", this.day);
        }

        System.out.printf(" of %s %04d, %s\n", this.getMonthName(), this.year, this.getDayOfWeek());
    }
}
