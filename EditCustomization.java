public class EditCustomization {

    public static void editCustom () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Edit Customization=====|");
        System.out.println("1. Edit Name");
        System.out.println("2. Edit Gender");
        System.out.println("3. Back");
        int input = Player.readInt("=====> ", 3);

        switch (input) {
            case 1:
                EditNameAndGender.newName();
                break;
            case 2:
                EditNameAndGender.newGender();
                break;
            case 3:
                if (CharacterStats.isconfirmStats) {
                    EditAndDisplayInput.displayAllInput();
                } else {
                    EditAndDisplayInput.displayAllInput2();
                }
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                editCustom();
        }
    }
}
