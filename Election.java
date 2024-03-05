// import java.lang.Math;
import java.util.*;
import java.text.NumberFormat;
public class Election {
    public static void main(String[] args){
        
        String candidate1;
        String candidate2;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first candidate: ");
        candidate1 = input.next();
        System.out.print("Enter second candidate: ");
        candidate2 = input.next();
        
        int newYork1;
        int newYork2;
        
        System.out.print("Enter New York votes for " + candidate1 + ": ");
        newYork1 = input.nextInt();
        System.out.print("Enter New York votes for " + candidate2 + ": ");
        newYork2 = input.nextInt();

        int newJersey1;
        int newJersey2;

        System.out.print("Enter New Jersey votes for " + candidate1 + ": ");
        newJersey1 = input.nextInt();
        System.out.print("Enter New Jersey votes for " + candidate2 + ": ");
        newJersey2 = input.nextInt();

        int connecticut1;
        int connecticut2;

        System.out.print("Enter Connecticut votes for " + candidate1 + ": ");
        connecticut1 = input.nextInt();
        System.out.print("Enter Connecticut votes for " + candidate2 + ": ");
        connecticut2 = input.nextInt();

        input.close();

        int candidate1Total = newYork1 + newJersey1 + connecticut1;
        int candidate2Total = newYork2 + newJersey2 + connecticut2;
        int totalVotes = candidate1Total + candidate2Total;
        double percentageCandidate1 = candidate1Total * 1.0 / totalVotes;
        double percentageCandidate2 = candidate2Total * 1.0 / totalVotes;

        NumberFormat percent = NumberFormat.getPercentInstance();
        // NumberFormat number = NumberFormat.getIntegerInstance();

        
        System.out.println("Candidate\tVotes\tPercentage");
        System.out.println(candidate1 + "\t\t" + candidate1Total + "\t" + percent.format(percentageCandidate1));
        System.out.println(candidate2 + "\t\t" + candidate2Total + "\t" + percent.format(percentageCandidate2));

        // System.out.println(candidate1 + "\t\t" + candidate1Total + "\t" + Math.round(percentageCandidate1) + "%");
        // System.out.println(candidate2 + "\t\t" + candidate2Total + "\t" + Math.round(percentageCandidate2) + "%");

    }
}
