import java.util.*;
public class TimeConversion{
    public static void main(String[] args){

        int timeMins;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        timeMins = input.nextInt();
        input.close();

        int timeHrs;
        int minsLeft;

        timeHrs = (timeMins - (timeMins%60))/60;
        minsLeft = timeMins%60;

        System.out.println("The time is: " + timeHrs + ":" + minsLeft);

    }
}