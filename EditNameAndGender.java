import java.util.*;

public class EditNameAndGender {
    private static final Scanner scanner = new Scanner(System.in);

    public static void newName () {
        boolean newNameSet = false;
        while (!newNameSet) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====Edit Name=====|");
            LineSeparator.lineSeparator();
            System.out.println("Your current IGN is: " + Player.name);
            LineSeparator.lineSeparator();
            System.out.print("Enter new IGN: ");
            String name = scanner.next();
            LineSeparator.lineSeparator();
            System.out.println("Your new IGN is " + name + ".\nIs that correct?");
            LineSeparator.lineSeparator();
            System.out.println("1. Yes");
            System.out.println("2. No, I want to change my IGN.");
            int input = Player.readInt("=====> ", 2);
            if (input == 1) {
                System.out.println();
                LineSeparator.lineSeparator();
                System.out.println("New IGN updated successfully!");
                LineSeparator.lineSeparator();
                Player player = new Player(name);
                newNameSet = true;
            } else {
                System.out.println("New IGN change canceled. Please enter a new IGN.");
                EditNameAndGender.newName();
            }
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else
                EditAndDisplayInput.displayAllInput2();
        }
    }

    public static void newGender () {
        boolean newGenderSet = false;
        while (!newGenderSet) {
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====Edit Gender=====|");
            LineSeparator.lineSeparator();
            System.out.println("Your current gender is: " + Player.sex[0]);
            LineSeparator.lineSeparator();
            System.out.println("|=====Choose your new gender=====|");
            System.out.println("1. Male");
            System.out.println("2. Female");

            int newGender = Player.readInt("=====> ", 2);
            if (newGender == 1) {
                Player.sex[0] = "Male";
                System.out.println();
                LineSeparator.lineSeparator();
                System.out.println("Gender updated successfully!");
                LineSeparator.lineSeparator();
                if (CharacterStats.isconfirmStats) {

                    EditAndDisplayInput.displayAllInput();
                } else
                    EditAndDisplayInput.displayAllInput2();
            } else {
                Player.sex[0] = "Female";
                System.out.println();
                LineSeparator.lineSeparator();
                System.out.println("Gender updated successfully!");
                LineSeparator.lineSeparator();
                if (CharacterStats.isconfirmStats) {
                    EditAndDisplayInput.displayAllInput();
                } else {
                    EditAndDisplayInput.displayAllInput2();
                }
            }
            newGenderSet = true;
        }
    }

}
