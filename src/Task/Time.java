package Task;

public class Time {
    // given hours, minutes, seconds, and pm or am, print out the time
    public static void main(String[] args) {
        int hours = 54;
        int minutes = 63;
        int seconds = 96;
        String amOrPm = "am";
        int amPm = hours/12;
        int pmAm = amPm%2;
        int min = minutes%60;
        int numMin = minutes/60;
        int sec = seconds%60;
        int numSec = seconds/60;

        if (seconds > 59){
            seconds = sec;
            if (numSec > 0){
                minutes = minutes + numSec;
            }
        }
        if (minutes > 59){
            minutes = min;
            if (numMin > 0){
                hours = hours + numMin;
            }
        }
        if (hours > 12){
            hours = hours % 12;
            if (hours == 0){
                hours = 12;
            }
        }
        if (pmAm == 0){
            if (amOrPm.equals("am")){
                amOrPm = "pm";
            } else if (amOrPm.equals("pm")){
                amOrPm = "am";
            }
        }
        if (minutes < 10 && seconds < 10){
            System.out.println(hours + ":0" + minutes + ":0" + seconds + " " + amOrPm);
        }
        if (minutes < 10){
            System.out.println(hours + ":0" + minutes + ":" + seconds + " " + amOrPm);
        }
        if (seconds < 10){
            System.out.println(hours + ":" + minutes + ":0" + seconds + " " + amOrPm);
        }
        if (minutes > 10 && seconds > 10){
            System.out.println(hours + ":" + minutes + ":" + seconds + " " + amOrPm);
        }
    }
}
