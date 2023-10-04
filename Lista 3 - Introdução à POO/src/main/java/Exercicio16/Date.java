package Exercicio16;

public class Date {
    private int day;
    private int month;
    private int year;

    public void initializeDate(int day, int month, int year) {
        if (this.isValid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
            return;
        }

        this.day = 0;
        this.month = 0;
        this.year = 0;
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

    // ** Implementação do método exigido pelo exercício **
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
    // ** ============================================== **

    public void printDate() {
        System.out.printf("%02d/%02d/%04d, %s\n", this.day, this.month, this.year, this.getDayOfWeek());
    }
}
