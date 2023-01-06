import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter Email Address: ");
        String email = scan.next();

        System.out.print("\nEnter Mobile Number: ");
        String num = scan.next();

        System.out.print("\nEnter Birthdate: ");
        String bday = scan.next();

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(email);
        boolean match = matcher.matches();

        Pattern pattern2 = Pattern.compile("\\+639+\\d{9}");
        Matcher matcher2 = pattern2.matcher(num);
        boolean match2 = matcher2.matches();

        Pattern pattern3 = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
        Matcher matcher3 = pattern3.matcher(bday);
        boolean match3 = matcher3.matches();

        if (match) {

            System.out.println("\nThe email " + email + " is verified!!!\n");

        } else {
            System.out.println("\nSorry! This email isn't in our database :<\n");
            }

        if (match2) {

            System.out.println("\nThe email " + num + " is verified!!!\n");
        } else {
            System.out.println("\nSorry! This number is invalid!! :<\n");
            }
            if (match3) {

                System.out.println("\nThe birthday " + bday + " is verified!!!\n");
            } else {
                System.out.println("\nSorry! This birthday is invalid!! :<\n");
            }
    }
}
