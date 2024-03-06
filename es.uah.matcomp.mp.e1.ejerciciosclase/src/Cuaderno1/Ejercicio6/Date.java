package Cuaderno1.Ejercicio6;

public class Date {
    private int day;
    private int month;
    private int year;

    public String toString(){
        return "0"+day+"/"+"0"+month+"/"+year;
    }

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public int setMonth(int month) {
        this.month=month;
        return month;

    }

    public int setDay(int day) {
        this.day = day;
        return day;

    }

    public int setYear(int year) {
        this.year=year;
        return year;
    }

    public int getMonth() {

        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int setDate(int d, int m, int y) {
        this.day=d;
        this.month=m;
        this.year=y;
        return d;
    }
}
