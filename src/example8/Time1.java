package example8;

public class Time1 {
    private int hour;
    private int minute;
    private int seconds;

    private static String name;


    public void Time(int hour, int minute, int seconds) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("hour, minute and/or seconds was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, seconds);

    }

    public static void goaway(){

    }


}
