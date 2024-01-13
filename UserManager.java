import java.io.*;
import java.util.*;

public class UserManager {
    private static Scanner scanner = new Scanner(System.in); // scanner object for all input
    private static final String FILE_PATH = "user_data.txt"; // file path for storing user data

    // Method for user registration
    public static void registerUser() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH, true))) {
            LineSeparator.lineSeparator();
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            if (isUsernameRegistered(username)) {
                System.out.println("\nUsername already exists. Please choose a different username.");
                return;
            }

            LineSeparator.lineSeparator();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            LineSeparator.lineSeparator();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            LineSeparator.lineSeparator();
            if (isEmailRegistered(email)) {
                System.out.println("\nEmail already exists. Please choose a different email.");
                return;
            }

            new RegisteredUser(username, password, email);

            // Save user information to .txt file
            writer.println(username + "," + password + "," + email);
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Registered successfully!");
            LineSeparator.lineSeparator();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if the username is already registered
    private static boolean isUsernameRegistered(String username) {
        try (Scanner fileScanner = new Scanner(new File(FILE_PATH))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equals(username)) {
                    return true; // Username is already registered
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false; // Username is not registered
    }

    private static boolean isEmailRegistered(String email) {
        try (Scanner fileScanner = new Scanner(new File(FILE_PATH))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[2].equals(email)) {
                    return true; // Email is already registered
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false; // Username is not registered
    }

    // Method for user login
    public static boolean loginUser() {
        LineSeparator.lineSeparator();
        System.out.print("Enter username or email: ");
        String usernameOrEmail = scanner.nextLine();
        LineSeparator.lineSeparator();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        LineSeparator.lineSeparator();
        // Check if the entered credentials are valid
        if (authenticateUser(usernameOrEmail, password)) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Logged In successfully!");
            LineSeparator.lineSeparator();
            return true;
        } else {
            System.out.println("\nInvalid username or password. Please register first.");
            return false;
        }

    }

    // Method to authenticate user
    private static boolean authenticateUser(String usernameOrEmail, String password) {
        try (Scanner scanner = new Scanner(new File(FILE_PATH))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    RegisteredUser user = new RegisteredUser(parts[0], parts[1], parts[2]);

                    // Check if the entered credentials match either username or email
                    if (user.getUsername().equals(usernameOrEmail) || user.getEmail().equals(usernameOrEmail)) {
                        return user.authenticate(usernameOrEmail, password);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

}

