import java.util.*;

public class EditAndDisplayInput extends Resources {

    static Scanner scanner = new Scanner(System.in);

    public EditAndDisplayInput (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING, int EFFECT_HIT_RATE, int BREAK_EFFECT) {
        super(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
    }

    public static void displayAllInput () {

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Gekko Nest Online Menu=====|");
        System.out.println("1. Edit Customization");
        System.out.println("2. Show Customization");
        System.out.println("3. Start Game");
        System.out.println("4. Logout");
        System.out.println("5. Exit Game");

        int input = Player.readInt("=====> ", 5);
        if (input == 1) {
            EditCustomization.editCustom();
        } else if (input == 2) {
            ShowCustomization.showCustom("");
        } else if (input == 3) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Do you want to play tutorial? Enter 1 if True.\nEnter 2 if False.");
            int i = Player.readInt("=====> ", 2);
            isTutorial(i);
        } else if (input == 4) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Logging out... Goodbye!");
            LineSeparator.lineSeparator();
            System.out.println("Thank you for playing Gekko Nest!");
            LineSeparator.lineSeparator();
            new LoginMenu();
            System.exit(0);
        } else if (input == 5) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Thank you for playing Gekko Nest!");
            LineSeparator.lineSeparator();
            System.exit(0);
        } else {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Invalid choice. Please try again.");
            LineSeparator.lineSeparator();
            displayAllInput();
        }
    }

    public static void displayAllInput2 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Gekko Nest Online Menu=====|");
        System.out.println("1. Edit Customization");
        System.out.println("2. Show Customization");
        System.out.println("3. Upgrade Character Stats");
        System.out.println("4. Story Game");
        System.out.println("5. Logout");
        System.out.println("6. Exit Game");

        int input = Player.readInt("=====> ", 6);
        if (input == 1) {
            EditCustomization.editCustom();
        } else if (input == 2) {
            ShowCustomization.showCustom("");
        } else if (input == 3) {
            Resources r = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
            r.introduce2();
        } else if (input == 4) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====Do you want to play tutorial?=====| \nEnter 1 if True. \nEnter 2 if False.");

            LineSeparator.lineSeparator();
            int i = Player.readInt("=====> ", 2);

            isTutorial(i);
        } else if (input == 5) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Logging out... Goodbye!");
            LineSeparator.lineSeparator();
            System.out.println("Thank you for playing Gekko Nest!");
            LineSeparator.lineSeparator();
            new LoginMenu();
            System.exit(0);
        } else if (input == 6) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Thank you for playing Gekko Nest!");
            LineSeparator.lineSeparator();
            System.exit(0);
        } else {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Invalid choice. Please try again.");
            LineSeparator.lineSeparator();
            displayAllInput2();
        }

    }

    static boolean isTutorial (int choices) {

        Story s = new Story(Player.name);

        if (choices == 1) {
            ShowCustomization.showCustom(Player.name, true);

            Tutorial.howtoplay();
            return true;
        } else {
            ShowCustomization.showCustom(Player.name, false);

            s.intro();
            return false;
        }

    }
}
