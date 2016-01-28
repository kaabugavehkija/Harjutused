package teema1;

/**
 * Created by Mario on 1/16/2016.
 */
public class Time {int hour, minute; double sec;

   public Time(){
        this.hour = 0;
        this.minute = 0;
        this.sec = 0.0;
}
    public Time (int hour, int minute, double sec){
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }
    // first way
    public static void main(String[] args) {

        Time t = new Time(11, 5, 3.14);
        System.out.println(t.hour+":"+t.minute+":"+t.sec);

    }
}