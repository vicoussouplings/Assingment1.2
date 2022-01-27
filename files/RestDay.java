/*CS 1105 - Assingment 01
Olumayowa Oluwasanmi - B00785929
Brief description: This program calculates the remaining distance
before the rest day after each stage and outputs:
1.) how many kilometers (km) left after each stage of the Tour de France
2.) The rider's average speed (in km/h) after all stages
 */

//Importing the scanner
import java.util.Scanner;

//Declaring a public class
public class RestDay {
    public static void main(String[] args) {

        //Declaring the scanner
        Scanner kb = new Scanner(System.in);

        //Distance after each stage
        int firstStage = kb.nextInt();
        int secondStage = kb.nextInt();
        int thirdStage = kb.nextInt();
        int fourthStage = kb.nextInt();
        int fifthStage = kb.nextInt();

        //Total time of all five days (hours)
        double totalTime = kb.nextDouble();

        //Average speed (in km/h) of all five stages
        System.out.println("End of first stage,  "  + (secondStage+ thirdStage + fourthStage + fifthStage) + "km" + " " + "left until rest day");
        System.out.println("End of second stage, "  +  (thirdStage + fourthStage + fifthStage) + "km" + " " + "left until rest day");
        System.out.println("End of third stage,  "  + (fourthStage + fifthStage) + "km" + " " + "left until rest day");
        System.out.println("End of fourth stage,  "  + (fifthStage) + "km" + " " + "left until rest day");
        System.out.println("--REST--");

        //Average speed after all inputted stages
        int totalDistance = firstStage + secondStage + thirdStage + fourthStage + fifthStage;
        double fiveDayAverageSpeed = totalDistance/totalTime;
        System.out.println("Average speed across the five days:" + " " + fiveDayAverageSpeed + " " + "km/h");




    }
}
