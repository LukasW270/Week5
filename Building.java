/**
 * Building
 * 
 * Lukas Witek
 * 3/13/24
 */

import java.lang.Math;
import java.util.*;
import java.text.NumberFormat;

public class Building {
    public static void main(String[] args){
        
        int numPoles;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of poles: ");
        numPoles = input.nextInt();

        input.close();

        int diameter = 3;
        int height = 5;

        double cylinderVolume = (Math.PI)*((diameter/2.0)*(diameter/2.0))*(height*1.0);

        double totalVolumeFeet = cylinderVolume*numPoles;

        double totalVolumeYards = totalVolumeFeet/27;

        double totalCost = totalVolumeYards * 12.98;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("The total cost of the concrete is " + money.format(totalCost) + ".");
    }
}
