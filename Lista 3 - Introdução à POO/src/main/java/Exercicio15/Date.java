package Exercicio15;

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

    // ** Implementação do método exigido pelo exercício **
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
    // ** ============================================== **

    public void printDate() {
        System.out.printf("%02d/%02d/%04d\n", this.day, this.month, this.year);
    }
}
