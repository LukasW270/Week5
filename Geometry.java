/**
 * Geometry
 * 
 * Lukas Witek
 * 3/13/24
 */

import java.util.*;
import java.text.NumberFormat;

public class Geometry {
    public static void main(String[] args){

        int m;
        int n;
        double sideOne;
        double sideTwo;
        double hypotenuse;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter m: ");
        m = input.nextInt();
        System.out.print("Enter n: ");
        n = input.nextInt();
        input.close();

        sideOne = (m*m*1.0)-(n*n*1.0);
        sideTwo = (2.0*m)*(n*1.0);
        hypotenuse = (m*m*1.0)+(n*n*1.0);

        System.out.println("Side one = " + sideOne + ".");
        System.out.println("Side two = " + sideTwo + ".");
        System.out.println("Hypotenuse = " + hypotenuse + ".");

        NumberFormat money = NumberFormat.getCurrencyInstance();

        double cost = (2.412*sideOne) + (3.767*sideTwo) + (15.758*hypotenuse);
        System.out.println("The total cost is equal to " + money.format(cost) + ".");
    }
}
