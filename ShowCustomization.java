public class ShowCustomization extends Resources {

    static Player p;

    public ShowCustomization (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING, int EFFECT_HIT_RATE, int BREAK_EFFECT) {
        super(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
    }

    public static void showCustom (String name) {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Your Customization=====|");
        System.out.println("|=====Details=====|");
        System.out.printf("| %-15s : %-15s |\n", "Name", p.name);
        System.out.printf("| %-15s : %-15s |\n", "Gender", Player.sex[0]);
        System.out.printf("| %-15s : %-15s |\n", "First Job", Player.firstjob[0]);
        System.out.printf("| %-15s : %-15s |\n", "Specialization", Player.type[0]);

        System.out.println();

        System.out.println("|=====Weapon=====|");
        System.out.printf("| %-15s : %-15s |\n", "First Weapon", Player.firstWeapon[0]);

        System.out.println();

        System.out.println("|=====Clothing====|");
        System.out.printf("| %-15s : %-15s |\n", "Headwear", Player.clothing[0]);
        System.out.printf("| %-15s : %-15s |\n", "Topwear", Player.clothing[1]);
        System.out.printf("| %-15s : %-15s |\n", "Bottomwear", Player.clothing[2]);
        System.out.printf("| %-15s : %-15s |\n", "Handwear", Player.clothing[3]);
        System.out.printf("| %-15s : %-15s |\n", "Footwear", Player.clothing[4]);
        System.out.printf("| %-15s : %-15s |\n", "Clothing Color", Player.clothing[5]);

        System.out.println();

        System.out.println("|=====Appearance====|");
        System.out.printf("| %-15s : %-15s |\n", "Height", Player.heightChoose[0] + "%");
        System.out.printf("| %-15s : %-15s |\n", "Face Type", Player.character[0]);
        System.out.printf("| %-15s : %-15s |\n", "Facial Hair", Player.character[2]);
        System.out.printf("| %-15s : %-15s |\n", "Lip Color", Player.character[9]);
        System.out.printf("| %-15s : %-15s |\n", "Ear Form", Player.character[1]);
        System.out.printf("| %-15s : %-15s |\n", "Body Type", Player.character[3]);
        System.out.printf("| %-15s : %-15s |\n", "Body Design", Player.character[4]);
        System.out.printf("| %-15s : %-15s |\n", "Skin Color", Player.character[10]);
        System.out.printf("| %-15s : %-15s |\n", "Eye Color", Player.character[7]);
        System.out.printf("| %-15s : %-15s |\n", "Eyebrow Color", Player.character[8]);
        System.out.printf("| %-15s : %-15s |\n", "Hair Design", Player.character[5]);
        System.out.printf("| %-15s : %-15s |\n", "Hair Color", Player.character[6]);

        System.out.println();

        System.out.println("|=====Gestures====|");
        System.out.println("| Gesture         : " + Player.character[11]);

        LineSeparator.lineSeparator();

        System.out.println("1. Show Character Stats");
        System.out.println("2. Back");
        int choices = Player.readInt("=====> ", 2);
        if (choices == 1) {
            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
            cv.introduce();

        } else if (choices == 2) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            }
        } else {
            System.out.println("Invalid choice. Please try again.");
            showCustom(name);
        }

    }

    public static void showCustom (String name, boolean isTutorial) {
        System.out.println();
        LineSeparator.lineSeparator();

        System.out.println("|=====Details=====|");
        System.out.printf("| %-15s : %-15s |\n", "Name", p.name);
        System.out.printf("| %-15s : %-15s |\n", "Gender", Player.sex[0]);
        System.out.printf("| %-15s : %-15s |\n", "First Job", Player.firstjob[0]);
        System.out.printf("| %-15s : %-15s |\n", "Specialization", Player.type[0]);
        System.out.printf("| %-15s : %-15s |\n", "Tutorial", isTutorial);

        System.out.println();

        System.out.println("|=====Weapon=====|");
        System.out.printf("| %-15s : %-15s |\n", "First Weapon", Player.firstWeapon[0]);

        System.out.println();

        System.out.println("|=====Clothing====|");
        System.out.printf("| %-15s : %-15s |\n", "Headwear", Player.clothing[0]);
        System.out.printf("| %-15s : %-15s |\n", "Topwear", Player.clothing[1]);
        System.out.printf("| %-15s : %-15s |\n", "Bottomwear", Player.clothing[2]);
        System.out.printf("| %-15s : %-15s |\n", "Handwear", Player.clothing[3]);
        System.out.printf("| %-15s : %-15s |\n", "Footwear", Player.clothing[4]);
        System.out.printf("| %-15s : %-15s |\n", "Clothing Color", Player.clothing[5]);

        System.out.println();

        System.out.println("|=====Appearance====|");
        System.out.printf("| %-15s : %-15s |\n", "Height", Player.heightChoose[0] + "%");
        System.out.printf("| %-15s : %-15s |\n", "Face Type", Player.character[0]);
        System.out.printf("| %-15s : %-15s |\n", "Facial Hair", Player.character[2]);
        System.out.printf("| %-15s : %-15s |\n", "Lip Color", Player.character[9]);
        System.out.printf("| %-15s : %-15s |\n", "Ear Form", Player.character[1]);
        System.out.printf("| %-15s : %-15s |\n", "Body Type", Player.character[3]);
        System.out.printf("| %-15s : %-15s |\n", "Body Design", Player.character[4]);
        System.out.printf("| %-15s : %-15s |\n", "Skin Color", Player.character[10]);
        System.out.printf("| %-15s : %-15s |\n", "Eye Color", Player.character[7]);
        System.out.printf("| %-15s : %-15s |\n", "Eyebrow Color", Player.character[8]);
        System.out.printf("| %-15s : %-15s |\n", "Hair Design", Player.character[5]);
        System.out.printf("| %-15s : %-15s |\n", "Hair Color", Player.character[6]);

        System.out.println();

        System.out.println("|=====Gestures====|");
        System.out.println("| Gesture         : " + Player.character[11]);

        System.out.println();

        System.out.println("|=====Character Stats=====|");
        System.out.printf("| %-15s : %-8s |\n", "Vitality         (VIT)", VIT);
        System.out.printf("| %-15s : %-8s |\n", "Strength         (STR)", STR);
        System.out.printf("| %-15s : %-8s |\n", "Agility          (AGI)", AGI);
        System.out.printf("| %-15s : %-8s |\n", "Intellect        (INT)", INT);
        System.out.printf("| %-15s : %-8s |\n", "Dexterity        (DEX)", DEX);
        System.out.printf("| %-15s : %-8s |\n", "Luck             (LUK)", LUK);
        System.out.printf("| %-15s : %-8s |\n", "Speed            (SPD)", SPD);
        System.out.printf("| %-15s : %-8s |\n", "Outgoing_Healing (OGH)", OUTGOING_HEALING);
        System.out.printf("| %-15s : %-8s |\n", "Effect Hit Rate  (EHR)", EFFECT_HIT_RATE);
        System.out.printf("| %-15s  : %-8s |\n", "Break Effect     (BE)", BREAK_EFFECT);
        LineSeparator.lineSeparator();
        System.out.println();
    }

}
