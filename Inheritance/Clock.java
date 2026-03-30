class Clock
{
    String brandName;
    String displayType;
    int cost;

    Clock(){
        System.out.println("Clock constructor...");
    }

    void showTime(){
        System.out.println("Clock showing current time...");
    }

    void ringAlarm(){
        System.out.println("Clock alarm ringing...");
    }
}