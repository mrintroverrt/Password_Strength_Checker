import java.util.Scanner;

public class PasswordmainStrength {

    // function to check the strength of the password
    public static int checkPassword(String password) {
        // add code here to check the strength of the password
        // and return a value based on its strength
        return 0;
    }

    public static void main(String[] args) {

        // declare a character array to store the password
        char[] pass = new char[8];

        // create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter a password and read it from input
        System.out.print("Enter Your Password to Check Strength: ");
        String password = scanner.nextLine();
        scanner.close();

        // copy the password into the character array
        pass = password.toCharArray();

        // get the length of the password
        int len = pass.length;

        // check if the length of the password is less than 8 characters
        if (len < 8) {
            System.out.println("At least enter 8 characters.");
        }
        // check if the length of the password is exactly 8 characters
        else if (len == 8) {
            System.out.println("Updated...");
        }
        // handle the case where the length of the password is greater than 8 characters
        else {
            System.out.println("Memory out of range.");
        }

        // initialize variables to keep track of the presence of uppercase letters,
        // lowercase letters, symbols, and digits in the password
        boolean hasUpper = false, hasLower = false, hasSymbol = false, hasDigit = false;

        // loop through each character in the password
        for (int i = 0; i < len; i++) {
            // check if the current character is an uppercase letter
            if (pass[i] >= 'A' && pass[i] <= 'Z') {
                hasUpper = true;
            }
            // check if the current character is a lowercase letter
            else if (pass[i] >= 'a' && pass[i] <= 'z') {
                hasLower = true;
            }
            // check if the current character is a symbol
            else if ("!#$&'()*+,-./:;<=>?@[]^_`{|}~".indexOf(pass[i]) != -1) {
                hasSymbol = true;
            }
            // check if the current character is a digit
            else if (pass[i] >= '0' && pass[i] <= '9') {
                hasDigit = true;
            }
        }

        // check if the password meets the criteria for a strong password
        while (len > 8) {
            System.out.println("Your Password is Too Long....");
            break;
        }
        while (len < 8) {
            System.out.println("You Password is too Short .....");
            break;
        }
        while (len == 8) {
            if (hasUpper && hasSymbol && hasLower && hasDigit) {
                System.out.println("Password is strong - You can login!");
            } else {
                System.out.println("Pls Enter with special char..");
            }
            break;
        }
    }
}
