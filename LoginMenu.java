import java.util.*;

public class LoginMenu {
    static Scanner scanner = new Scanner(System.in);
    public LoginMenu () {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean isLoggedIn = false;
            boolean displayMenu = true;
            while (!isLoggedIn) {
                if (displayMenu) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Choose an option=====|");
                    System.out.println("A. Register Account");
                    System.out.println("B. Login");
                    System.out.println("C. Exit");
                    LineSeparator.lineSeparator();
                    System.out.print("=====> ");
                }
                String choice = scanner.nextLine();
                switch (choice.toUpperCase()) {
                    case "A":
                        UserManager.registerUser();
                        displayMenu = true;
                        break;
                    case "B":
                        if (UserManager.loginUser()) {
                            isLoggedIn = true;
                            PressAnyKey.pressAnyKey();
                            namedrop();
                            displayMenu = true;
                        }
                        break;
                    case "C":
                        System.out.println("\nExiting program..... Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nInvalid choice. Please try again.");
                        displayMenu = true;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
        }

    }

    public static void namedrop () {
        boolean nameSet = false;
        do {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====Welcome to Gekko Nest Online=====|");
            LineSeparator.lineSeparator();
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====What is your IGN?=====|");
            System.out.print("Enter IGN: ");
            String name = scanner.next();
            LineSeparator.lineSeparator();
            System.out.println("Your IGN is " + name + ".\nIs that correct?");
            LineSeparator.lineSeparator();
            System.out.println("1. Yes");
            System.out.println("2. No, I want to change my IGN.");
            int input = Player.readInt("=====> ", 2);
            if (input == 1) {
                nameSet = true;
                Player player = new Player(name);
                player.chooseSelections();
            }
        } while (!nameSet);
    }

}
