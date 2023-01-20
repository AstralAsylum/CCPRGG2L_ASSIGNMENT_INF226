import java.util.Scanner;

public class exercise2 {
        
            static Scanner scan = new Scanner(System.in);
        
            public static void main(String[] args) throws Exception {
        
                drive("driver");
                scan.close();
            }
        
            static void drive(String driver) {
        
                System.out.println("Driving!");
                test(driver);
        
                String feedback = getFeedBack(driver);
        
                 // Define the base case / stopping condition
                 if (feedback.equals("no")) {
        
                // Do something to reach the goal
                     improveSkills(driver);
        
                     // Recursive call
                    drive(driver);
                 } else if (feedback.equals("yes")) {
                     passed(driver);
                 }
            }
        
            static void test(String driver) {
                System.out.println("Driving Test");
            }
        
            static String getFeedBack(String driver) {
                System.out.println("Is the " + driver + " ready to drive? (Enter \"yes\" or \"no\")");
        
                String feedback = scan.next();
        
                return feedback;
            }
        
            static void improveSkills(String driver) {
                System.out.print("What to improve? : ");
                String skills = scan.next();
                System.out.println("Practicing " + skills);
            }
        
            static void passed(String driver) {
                System.out.println("You passed the driving test! You can now claim your driver's license");
            }
        
        }