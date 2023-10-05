package dev.italoseara.Ex01;

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

    // Métodos auxiliares
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

    public String getMonthName() {
        return switch (this.month) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês inválido";
        };
    }

    // Métodos getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Métodos setters
    public void setDay(int day) {
        if (this.isValid(day, this.month, this.year)) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (this.isValid(this.day, month, this.year)) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (this.isValid(this.day, this.month, year)) {
            this.year = year;
        }
    }

    // Método chamado por padrão pelo Java quando o objeto é convertido para String
    public String toString() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

    // Imprime a data no formato DD/MM/YYYY
    public void printDate() {
        System.out.println(this);
    }

    // Imprime a data por extenso, no formato DD de Mês de YYYY
    public void printDateInFull() {
        System.out.printf("%02d de %s de %04d.\n", this.day, this.getMonthName(), this.year);
    }
}
