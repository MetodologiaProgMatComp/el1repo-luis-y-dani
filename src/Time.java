public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public String toString(){
        if (hour < 10 && minute < 10 && second < 10)
            return "0" + hour + ":" + "0" + minute + ":" + "0" + second;
        return hour + ":" + minute + ":" + second;
    }
    public Time nextSecond(){
        second++;
        if (second > 59){
            second = 0;
            minute++;
        }
        if (minute > 59){
            minute = 0;
            hour++;
        }
        if (hour > 23){
            hour = 0;
        }
        return this;
    }
    public Time previousSecond(){
        second = second - 1;
        if (second < 0){
            second = 59;
            minute = minute - 1;
        }
        if (minute < 0){
            minute = 59;
            hour = hour - 1;
        }
        if (hour < 0){
            hour = 23;
        }
        return this;
    }
}
