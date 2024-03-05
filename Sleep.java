import java.util.*;
import java.text.NumberFormat;
public class Sleep {
    public static void main(String[] args){

        int birthYear;
        int birthMonth;
        int birthDay;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birthdate:\nYear: ");
        birthYear = input.nextInt();
        System.out.print("Month: ");
        birthMonth = input.nextInt();
        System.out.print("Day: ");
        birthDay = input.nextInt();

        int currentYear;
        int currentMonth;
        int currentDay;

        System.out.print("Enter today's date:\nYear: ");
        currentYear = input.nextInt();
        System.out.print("Month: ");
        currentMonth = input.nextInt();
        System.out.print("Day: ");
        currentDay = input.nextInt();

        input.close();

        int yearsAlive;
        int monthsAlive;
        int daysAlive;

        yearsAlive = currentYear - birthYear;
        monthsAlive = currentMonth - birthMonth;
        daysAlive = currentDay - birthDay;

        int totalDays;

        totalDays = (yearsAlive*365) + (monthsAlive*30) + daysAlive;

        int sleepingHours;

        sleepingHours = (totalDays/3)*24;

        NumberFormat number = NumberFormat.getIntegerInstance();

        System.out.println("You have been alive for " + number.format(totalDays) + " days.");
        System.out.println("You have slept for " + number.format(sleepingHours) + " hours.");

    }
}
