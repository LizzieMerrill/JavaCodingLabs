import java.util.Scanner;

public class Asphalt {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      //Lines 9-16 gather information used to calculate the volume of asphalt necessary.
      
      System.out.print("Enter length of road in miles    : ");
      double roadLengthMiles = scnr.nextDouble();
      
      System.out.print("Enter number of lanes            : ");
      int numLanes = scnr.nextInt();
      
      System.out.print("Enter depth of asphalt in inches : ");
      int asphaltHeightInches = scnr.nextInt();
      
      //Lines 20-23 Convert the data gathered so it is fit to include in the calculation of volume in cubic feet.
      
      double roadLengthFeet = roadLengthMiles * 5280.0;
      double roadWidthFeet = numLanes * 12.0;
      double asphaltHeightFeet = asphaltHeightInches / 12.0;
      double volumeAsphaltNeeded = roadLengthFeet * roadWidthFeet * asphaltHeightFeet;
      
      
      
      double asphaltWeightNeeded = volumeAsphaltNeeded * 145.0;
      //Line 27 works off of given info that asphalt weighs 145 pounds per cubic foot.
      double truckloadsNeeded = Math.ceil(asphaltWeightNeeded / 10000);
      
      //Line 29 divides total weight needed by the amount a truckload can carry (5 tons = 10000 pounds), and I used the rounding up ceil function 
      //because it's better to have more asphalt than necessary than less than necessary, as you can't order a partial truckload in this scenario.
      
      double totalCostAsphalt = truckloadsNeeded * 150.0 * 5.0;
      //^The cost per truckload is $750^.
      
      System.out.print("Truckloads of asphalt needed is  : " + (int)truckloadsNeeded);
      System.out.printf("\nTotal cost of asphalt is         : $%.2f", totalCostAsphalt);
      System.out.println("");

      
   }
}
