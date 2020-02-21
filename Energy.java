import java.util.Scanner;

/**
 * This program calculates the amount of energy that can be released from an object 
 * with a given mass.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-02-19
 */

public class Energy {
  
  /**
  * This class calculates the amount of energy that can be released from an object 
  * with a given mass.
  */
  
  public static void main(String[] args) throws Exception {
    // Create variables 
    double massEntered;
    double energyReleased;
    double kilotonReleased;
    
    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    // Ask user for input
    System.out.println("Please enter the mass of an object (in kg): ");
    try {
      // try to read user input
      massEntered = userInput.nextDouble();
      
      if (massEntered >= 0) {
        // calculate possible energy
        energyReleased = massEntered * Math.pow(2.998e8,2);
        System.out.println("A " + massEntered + " kg object would release " + energyReleased 
            + " J of energy.");
        // Calculate kiloton (4.2 TeraJoules/Kiloton 1.0e12 J = 1 TJ)
        kilotonReleased = (energyReleased / 1.0e12) / 4.2;
        // rounding https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        System.out.println("This would also be equivilent to a " + Math.round(kilotonReleased 
            * 100.0) / 100.0 + " Kiloton bomb.");
      } else {
        System.err.println("Invalid input. Please enter a positive mass.");
      }
    } catch (Exception e) {
      System.err.println("Invalid input. Please enter a positive, numerical mass.");
    }
  }
}