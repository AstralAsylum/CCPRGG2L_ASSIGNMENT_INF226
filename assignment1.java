import java.util.regex.*;

public class assignment1 {
    public static void main(String[] args) throws Exception{
        
        //PATTERNS--------------------------------------------------------
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph"); 
        Pattern pattern2 = Pattern.compile("\\+639+\\d{9}");
        Pattern pattern3 = Pattern.compile("\\d{4}/\\d{2}/\\d{2}");
        //----------------------------------------------------------------

        //MATCHERS -------------------------------------------------------
        Matcher matcher = pattern.matcher("elizerponiojr@students.national-u.edu.ph");
        Matcher matcher2 = pattern2.matcher("+639123456789");
        Matcher matcher3 = pattern3.matcher("2004/05/14");
        //----------------------------------------------------------------

        //TRUE OR FALSE --------------------------------------------------
        boolean match = matcher.matches();
        boolean match2 = matcher2.matches();
        boolean match3 = matcher3.matches();
        //----------------------------------------------------------------

        //OUTPUTS---------------------------------------------------------
        if (match){
                System.out.println("\nVerified Email!!!\n");
        } else {
                System.out.println("\nInvalid Information!!\n");
        }

        if (match2) {
                System.out.println("Verified Mobile Number!!!\n");
        } else {
                System.out.println("Invalid Mobile Number!!\n");
        }

        if (match3) {
                System.out.println("Verified Birthdate!!!\n");
        } else {
            System.out.println("Invalid Biirthdate!!\n");
        }
        //----------------------------------------------------------------
    }
}
