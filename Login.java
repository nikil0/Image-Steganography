import java.util.Scanner;
import ImageSteganography.Encryption;

public class Login {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String username = "admin";
            String password = "12345";
            boolean loggedIn = false;
            while (!loggedIn) {
                System.out.println("Please enter your username: ");

                // String inputUsername = scanner.nextLine() is a line of code in Java that
                // reads a line of text from the user's input through the console and assigns it
                // to a String variable called inputUsername.scanner.nextLine() is a method that
                // belongs to the Scanner class and reads the entire line of text that the user
                // inputs and returns it as a String. This method waits for the user to press
                // the Enter key after typing their input. The entered text is then assigned to
                // the inputUsername variable.

                String inputUsername = scanner.nextLine();

                System.out.println("Please enter your password: ");
                String inputPassword = scanner.nextLine();

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    System.out.println("Login successful!");
                    loggedIn = true;

                    // Process the Encryption.java file
                    Encryption encryption = new Encryption();
                    encryption.encrypt(inputPassword);
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }
        }
    }
}
