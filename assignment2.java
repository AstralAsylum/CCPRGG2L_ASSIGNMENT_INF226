import java.util.Scanner;

public class assignment2 {

    static Scanner scan = new Scanner(System.in);
    static final int targetWeight = 150;

    public static void main(String[] args) throws Exception {

        System.out.print("Enter current weight in lbs: ");
        int weight = scan.nextInt();

        if (weight > 150) {
            loseWeight(weight);
        } else {
            System.out.println("Current weight must be greater than 150 lbs!");
        }
        scan.close();
    }

    static void loseWeight(int weight) {

        System.out.println("Eating right!");
        System.out.println("Doing exercises!");
        weight = checkWeight(weight);

        int currentWeight = fixDietandExercise(weight);
        int diff = dif(currentWeight);
        if (currentWeight > 150) {                          //BASE CASE / STOP CONDITION
            fixDietandExercise(weight);      // SOLUTION TO GET THE GOAL

            loseWeight(currentWeight);                      //RECURSIVE CALL
            
        } else if(currentWeight == 150){
            System.out.println("I have reached my goal!!");
        } else {
            System.out.println();
            currentWeight = checkWeight(currentWeight);
            System.out.println( diff + " lbs. between the goal!!!");
        }
    }

    static int checkWeight(int weight) {
        System.out.println("My current weight is: " + weight + " lbs");
        return weight;
    }

    static int fixDietandExercise(int weight) {

        System.out.println("Fixing Diet and Exercise!");
        System.out.print("Enter weight lost in lbs: ");
        int weightlost = scan.nextInt();
        int currentWeight = weight - weightlost;
        return currentWeight;
    }

    static int dif (int currentWeight){

        int diff = currentWeight - 150;
        return diff;
    }
}