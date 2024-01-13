import java.util.*;

public class Player {
    private static final Scanner scanner = new Scanner(System.in);
    static String name;
    static int VIT, STR, AGI, INT, DEX, LUK, SPD, OGH, EHR, BE;

    public Player (String name) {
        Player.name = name;
    }

    // for gender
    public static String[] sex = {""};
    public String[] gender = {"Male", "Female"};
    // for character job
    public static String[] firstjob = {""};
    public String[] job = {"Assassin", "Cleric", "Sorceress", "Warrior", "Archer"};
    // for job specialization
    public static String[] type = {""};
    public String[][] specialization = {{"Bringer", "Ripper", "Raven", "Light Fury", "Bleed Phantom"},
            {"Paladin", "Priest", "Guardian", "Crusader", "Inquisitor"},
            {"Elemental Lord", "Force User", "Saleana", "Elestra", "Smasher"},
            {"Swordmaster", "Mercenary", "Gladiator", "Moonlord", "Destroyer"},
            {"Bowmaster", "Acrobat", "Sniper", "Artillery", "Windwalker"}};
    // for weapons
    public static String[] firstWeapon = {""};
    public String[] weapon = {"Dagger", "Mace", "Staff", "Sword", "Bow"};
    // clothing category
    public static String[] clothing = {"hat", "top", "bottom", "gloves", "shoes", "color"};
    public String[] hat = {"Santa hat", "Summer hat", "Cowboy Hat", "Bonnet Hat", "Owl hat"};
    public String[] top = {"T-shirt", "Long Sleeve", "Hoodie", "Crop Top", "Off-shoulder"};
    public String[] bottomwear = {"Shorts", "Pants", "Leggings", "Skirts", "Trouser"};
    public String[] gloves = {"Leather Gloves", "Disposable gloves", "Reusable gloves", "Metal gloves",
            "Total-hand gloves"};
    public String[] shoes = {"Flip-flops", "Boots", "Derby Boots", "Running Boots", "Heels"};
    public String[] clothingcolor = {"Yellow/black", "Grey/White", "Lavender/teal", "Pink/Red", "Blue/Peach"};
    // for character appearance
    public static String[] character = {"faceform", "Earform", "facial hair", "body shape", "body design",
            "hair design", "hair color", "eye color", "eyebrow color", "lip color", "Skin color", "gestures"};
    public String[] faceform = {"Smiley", "Sad", "Angry", "Fear", "Disgust"};
    public String[] earform = {"Cauliflower Ear", "Elf Ear", "Narrow Ear", "Pointed Ear", "Big Ear"};
    public String[] facialhair = {"Goatee", "Fu Manchu", "Horseshoe", "Ned Kelly", "Zappa"};
    public String[] bodyshape = {"Oval", "Slim/Fit", "Fat", "Buffed", "Swole"};
    public String[] bodydesign = {"FullSleeve", "Whole Black", "Eye Tattoo", "Japanese Style", "Tribal Style"};
    public String[] hairdesign = {"Crew Cut", "Bob Cut", "Spiky Cut", "Pigtails", "Curly"};
    public String[] haircolor = {"Black", "Blue", "Brown", "Red", "Yellow"};
    public String[] eyecolor = {"Blue", "Brown", "Black", "Red", "Yellow"};
    public String[] eyebrowcolor = {"Gray", "White", "Brown", "Blue", "Yellow"};
    public String[] lipcolor = {"Red", "Nude", "Pink", "Violet", "White"};
    public String[] skincolor = {"Tanned", "Pale", "Naturally Brown", "Dark Black", "Light"};
    public String[] gestures = {"Laugh", "Wave", "Anger", "Agree", "Upset"};
    public static int[] height = {30, 50, 70, 100, 120};
    public static int[] heightChoose = {0};

    public static int readInt (String prompt, int userChoices) {
        int input = 0;
        do {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.next());
                if (input < 1 || input > userChoices) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("Invalid choice. Choose only 1 to " + userChoices + ".");
                    LineSeparator.lineSeparator();
                }
            } catch (NumberFormatException e) {
                System.out.println();
                LineSeparator.lineSeparator();
                input = -1;
                System.out.println("Invalid choice. Please try again.\n");
                LineSeparator.lineSeparator();
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    public static int readInt1 (String prompt, int userChoices) {
        int input = 0;
        do {
            System.out.print(prompt);
            try {
                input = Integer.parseInt(scanner.next());
                if (input < 0 || input > userChoices) {
                    System.out.println("Invalid choice. Choose only " + userChoices + ".");
                }
            } catch (NumberFormatException e) {
                input = -1;
                System.out.println("Invalid choice. Please try again.\n");
            }
        } while (input < 0 || input > userChoices);
        return input;
    }

    public void chooseSelections () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your gender=====|");
        System.out.println("1. " + gender[0]);
        System.out.println("2. " + gender[1]);
        int input = readInt("=====> ", 2);
        if (input == 1) {
            System.out.println();
            LineSeparator.lineSeparator();
            sex[0] = "Male";
            System.out.println("|=====Character Name and Gender=====|");
            System.out.println("Name: " + name);
            System.out.println("Gender: " + sex[0]);
            LineSeparator.lineSeparator();
        } else {
            System.out.println();
            LineSeparator.lineSeparator();
            sex[0] = "Female";
            System.out.println("|=====Character Name and Gender=====|");
            System.out.println("Name: " + name);
            System.out.println("Gender: " + sex[0]);
            LineSeparator.lineSeparator();
        }

        PressAnyKey.pressAnyKey();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Job====|");
        System.out.println("1. " + job[0]);
        System.out.println("2. " + job[1]);
        System.out.println("3. " + job[2]);
        System.out.println("4. " + job[3]);
        System.out.println("5. " + job[4]);
        int input1 = readInt("=====> ", 5);

        String selectedJob = "";
        if (input1 >= 1 && input1 <= job.length) {
            selectedJob = job[input1 - 1];
            firstjob[0] = selectedJob; // set the first job based on the user's choice

            System.out.println("\n|=====Choose your Specialization for " + selectedJob + "=====|");
            for (int i = 0; i < specialization[input1 - 1].length; i++) {
                System.out.println((i + 1) + ". " + specialization[input1 - 1][i]);
            }

            int input2 = readInt("=====> ", specialization[input1 - 1].length);

            String selectedSpecialization = "";
            if (input2 >= 1 && input2 <= specialization[input1 - 1].length) {
                selectedSpecialization = specialization[input1 - 1][input2 - 1];
                type[0] = selectedSpecialization; // Set the type based on the user's specialization
            }
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("|=====Job and Specialization=====|");
            System.out.println(firstjob[0] + " Job selected.");
            System.out.println(type[0] + " Specialization selected.");
            LineSeparator.lineSeparator();
        } else {
            System.out.println("Invalid job choice.");
        }

        PressAnyKey.pressAnyKey();

        // invoke PlayerStats class
        CharacterStats cv = new CharacterStats();
        cv.displayStarterStats();
        cv.distributePoints();

        PressAnyKey.pressAnyKey();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Height=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Height=====|");
        System.out.println("1. " + height[0] + "% ");
        System.out.println("2. " + height[1] + "% ");
        System.out.println("3. " + height[2] + "% ");
        System.out.println("4. " + height[3] + "% ");
        System.out.println("5. " + height[4] + "% ");

        int input23 = readInt("=====> ", 5);
        if (input23 == 1) {
            heightChoose[0] = 30;
        } else if (input23 == 2) {
            heightChoose[0] = 50;
        } else if (input23 == 3) {
            heightChoose[0] = 70;
        } else if (input23 == 4) {
            heightChoose[0] = 100;
        } else if (input23 == 5) {
            heightChoose[0] = 120;
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(heightChoose[0] + "%" + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Weapon=====|");
        System.out.println("1. " + weapon[0]);
        System.out.println("2. " + weapon[1]);
        System.out.println("3. " + weapon[2]);
        System.out.println("4. " + weapon[3]);
        System.out.println("5. " + weapon[4]);

        int input3 = readInt("=====> ", 5);
        if (input3 == 1) {
            firstWeapon[0] = "Dagger";
        } else if (input3 == 2) {
            firstWeapon[0] = "Mace";
        } else if (input3 == 3) {
            firstWeapon[0] = "Staff";
        } else if (input3 == 4) {
            firstWeapon[0] = "Sword";
        } else if (input3 == 5) {
            firstWeapon[0] = "Bow";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(firstWeapon[0] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Clothing Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Headwear=====|");
        System.out.println("1. " + hat[0]);
        System.out.println("2. " + hat[1]);
        System.out.println("3. " + hat[2]);
        System.out.println("4. " + hat[3]);
        System.out.println("5. " + hat[4]);

        int input4 = readInt("=====> ", 5);
        if (input4 == 1) {
            clothing[0] = "Santa Hat";
        } else if (input4 == 2) {
            clothing[0] = "Summer Hat";
        } else if (input4 == 3) {
            clothing[0] = "Cowboy Hat";
        } else if (input4 == 4) {
            clothing[0] = "Bonnet Hat";
        } else if (input4 == 5) {
            clothing[0] = "Owl Hat";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[0] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Topwear=====|");
        System.out.println("1. " + top[0]);
        System.out.println("2. " + top[1]);
        System.out.println("3. " + top[2]);
        System.out.println("4. " + top[3]);
        System.out.println("5. " + top[4]);

        int input5 = readInt("=====> ", 5);
        if (input5 == 1) {
            clothing[1] = "T-Shirt";
        } else if (input5 == 2) {
            clothing[1] = "Long Sleeve";
        } else if (input5 == 3) {
            clothing[1] = "Hoodie";
        } else if (input5 == 4) {
            clothing[1] = "Crop Top";
        } else if (input5 == 5) {
            clothing[1] = "Off - Shoulder";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[1] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Bottomwear=====|");
        System.out.println("1. " + bottomwear[0]);
        System.out.println("2. " + bottomwear[1]);
        System.out.println("3. " + bottomwear[2]);
        System.out.println("4. " + bottomwear[3]);
        System.out.println("5. " + bottomwear[4]);

        int input6 = readInt("=====> ", 5);
        if (input6 == 1) {
            clothing[2] = "Shorts";
        } else if (input6 == 2) {
            clothing[2] = "Pants";
        } else if (input6 == 3) {
            clothing[2] = "Leggings";
        } else if (input6 == 4) {
            clothing[2] = "Skirts";
        } else if (input6 == 5) {
            clothing[2] = "Trousers";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[2] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Handwear=====|");
        System.out.println("1. " + gloves[0]);
        System.out.println("2. " + gloves[1]);
        System.out.println("3. " + gloves[2]);
        System.out.println("4. " + gloves[3]);
        System.out.println("5. " + gloves[4]);

        int input7 = readInt("=====> ", 5);
        if (input7 == 1) {
            clothing[3] = "Leather Gloves";
        } else if (input7 == 2) {
            clothing[3] = "Disposable Gloves";
        } else if (input7 == 3) {
            clothing[3] = "Reusable Gloves";
        } else if (input7 == 4) {
            clothing[3] = "Metal Gloves";
        } else if (input7 == 5) {
            clothing[3] = "Total - hand Gloves";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[3] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Footwear=====|");
        System.out.println("1. " + shoes[0]);
        System.out.println("2. " + shoes[1]);
        System.out.println("3. " + shoes[2]);
        System.out.println("4. " + shoes[3]);
        System.out.println("5. " + shoes[4]);

        int input8 = readInt("=====> ", 5);
        if (input8 == 1) {
            clothing[4] = "Flip-Flop";
        } else if (input8 == 2) {
            clothing[4] = "Boots";
        } else if (input8 == 3) {
            clothing[4] = "Derby Boots";
        } else if (input8 == 4) {
            clothing[4] = "Running Shoes";
        } else if (input8 == 5) {
            clothing[4] = "Heels";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[4] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Clothing Colors=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Colors=====|");
        System.out.println("1. " + clothingcolor[0]);
        System.out.println("2. " + clothingcolor[1]);
        System.out.println("3. " + clothingcolor[2]);
        System.out.println("4. " + clothingcolor[3]);
        System.out.println("5. " + clothingcolor[4]);

        int input9 = readInt("=====> ", 5);
        if (input9 == 1) {
            clothing[5] = "Yellow/Black";
        } else if (input9 == 2) {
            clothing[5] = "Grey/White";
        } else if (input9 == 3) {
            clothing[5] = "Lavender/Teal";
        } else if (input9 == 4) {
            clothing[5] = "Pink/Red";
        } else if (input9 == 5) {
            clothing[5] = "Blue/Peach";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(clothing[5] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Face Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Face Form=====|");
        System.out.println("1. " + faceform[0]);
        System.out.println("2. " + faceform[1]);
        System.out.println("3. " + faceform[2]);
        System.out.println("4. " + faceform[3]);
        System.out.println("5. " + faceform[4]);

        int input10 = readInt("=====> ", 5);
        if (input10 == 1) {
            character[0] = "Smiley";
        } else if (input10 == 2) {
            character[0] = "Sad";
        } else if (input10 == 3) {
            character[0] = "Angry";
        } else if (input10 == 4) {
            character[0] = "Fear";
        } else if (input10 == 5) {
            character[0] = "Disgust";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[0] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Ear Form=====|");
        System.out.println("1. " + earform[0]);
        System.out.println("2. " + earform[1]);
        System.out.println("3. " + earform[2]);
        System.out.println("4. " + earform[3]);
        System.out.println("5. " + earform[4]);

        int input11 = readInt("=====> ", 5);
        if (input11 == 1) {
            character[1] = "Cauliflower Ear";
        } else if (input11 == 2) {
            character[1] = "Elf Ear";
        } else if (input11 == 3) {
            character[1] = "Narrow Ear";
        } else if (input11 == 4) {
            character[1] = "Pointed";
        } else if (input11 == 5) {
            character[1] = "Big Ear";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[1] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Facial Hair=====|");
        System.out.println("1. " + facialhair[0]);
        System.out.println("2. " + facialhair[1]);
        System.out.println("3. " + facialhair[2]);
        System.out.println("4. " + facialhair[3]);
        System.out.println("5. " + facialhair[4]);

        int input12 = readInt("=====> ", 5);
        if (input12 == 1) {
            character[2] = "Goatee";
        } else if (input12 == 2) {
            character[2] = "Fu Manchu";
        } else if (input12 == 3) {
            character[2] = "Horseshoe";
        } else if (input12 == 4) {
            character[2] = "Ned Kelly";
        } else if (input12 == 5) {
            character[2] = "Zappa";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[2] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Body Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Body Shape=====|");
        System.out.println("1. " + bodyshape[0]);
        System.out.println("2. " + bodyshape[1]);
        System.out.println("3. " + bodyshape[2]);
        System.out.println("4. " + bodyshape[3]);
        System.out.println("5. " + bodyshape[4]);

        int input13 = readInt("=====> ", 5);
        if (input13 == 1) {
            character[3] = "Oval";
        } else if (input13 == 2) {
            character[3] = "Slim";
        } else if (input13 == 3) {
            character[3] = "Fat";
        } else if (input13 == 4) {
            character[3] = "Buffed";
        } else if (input13 == 5) {
            character[3] = "Swole";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[3] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Tattoos=====|");
        System.out.println("1. " + bodydesign[0]);
        System.out.println("2. " + bodydesign[1]);
        System.out.println("3. " + bodydesign[2]);
        System.out.println("4. " + bodydesign[3]);
        System.out.println("5. " + bodydesign[4]);

        int input14 = readInt("=====> ", 5);
        if (input14 == 1) {
            character[4] = "Fullsleeve";
        } else if (input14 == 2) {
            character[4] = "Whole Back";
        } else if (input14 == 3) {
            character[4] = "Eye Tattoo";
        } else if (input14 == 4) {
            character[4] = "Japanese Style";
        } else if (input14 == 5) {
            character[4] = "Tribal Style";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[4] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Hair Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Hair Style=====|");
        System.out.println("1. " + hairdesign[0]);
        System.out.println("2. " + hairdesign[1]);
        System.out.println("3. " + hairdesign[2]);
        System.out.println("4. " + hairdesign[3]);
        System.out.println("5. " + hairdesign[4]);

        int input15 = readInt("=====> ", 5);
        if (input15 == 1) {
            character[5] = "Crew Cut";
        } else if (input15 == 2) {
            character[5] = "Bob Cut";
        } else if (input15 == 3) {
            character[5] = "Spiky Cut";
        } else if (input15 == 4) {
            character[5] = "Pigtails";
        } else if (input15 == 5) {
            character[5] = "Curly";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[5] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Hair Color=====|");
        System.out.println("1. " + haircolor[0]);
        System.out.println("2. " + haircolor[1]);
        System.out.println("3. " + haircolor[2]);
        System.out.println("4. " + haircolor[3]);
        System.out.println("5. " + haircolor[4]);

        int input17 = readInt("=====> ", 5);
        if (input17 == 1) {
            character[6] = "Black";
        } else if (input17 == 2) {
            character[6] = "Blue";
        } else if (input17 == 3) {
            character[6] = "Brown";

        } else if (input17 == 4) {
            character[6] = "Red";
        } else if (input17 == 5) {
            character[6] = "Yellow";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[6] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Eye Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Eye Color=====|");
        System.out.println("1. " + eyecolor[0]);
        System.out.println("2. " + eyecolor[1]);
        System.out.println("3. " + eyecolor[2]);
        System.out.println("4. " + eyecolor[3]);
        System.out.println("5. " + eyecolor[4]);

        int input18 = readInt("=====> ", 5);
        if (input18 == 1) {
            character[7] = "Blue";
        } else if (input18 == 2) {
            character[7] = "Brown";
        } else if (input18 == 3) {
            character[7] = "Black";
        } else if (input18 == 4) {
            character[7] = "Red";
        } else if (input18 == 5) {
            character[7] = "White";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[7] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        System.out.println("|=====Eyebrow Color=====|");
        System.out.println("1. " + eyebrowcolor[0]);
        System.out.println("2. " + eyebrowcolor[1]);
        System.out.println("3. " + eyebrowcolor[2]);
        System.out.println("4. " + eyebrowcolor[3]);
        System.out.println("5. " + eyebrowcolor[4]);

        int input19 = readInt("=====> ", 5);
        if (input19 == 1) {
            character[8] = "Gray";
        } else if (input19 == 2) {
            character[8] = "White";
        } else if (input19 == 3) {
            character[8] = "Brown";
        } else if (input19 == 4) {
            character[8] = "Blue";
        } else if (input19 == 5) {
            character[8] = "Yellow";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[8] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Lip Design=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Lip Color=====|");
        System.out.println("1. " + lipcolor[0]);
        System.out.println("2. " + lipcolor[1]);
        System.out.println("3. " + lipcolor[2]);
        System.out.println("4. " + lipcolor[3]);
        System.out.println("5. " + lipcolor[4]);

        int input20 = readInt("=====> ", 5);
        if (input20 == 1) {
            character[9] = "Red";
        } else if (input20 == 2) {
            character[9] = "Nude";
        } else if (input20 == 3) {
            character[9] = "Pink";
        } else if (input20 == 4) {
            character[9] = "Violet";
        } else if (input20 == 5) {
            character[9] = "White";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[9] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Skin Type=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Skin Color=====|");
        System.out.println("1. " + skincolor[0]);
        System.out.println("2. " + skincolor[1]);
        System.out.println("3. " + skincolor[2]);
        System.out.println("4. " + skincolor[3]);
        System.out.println("5. " + skincolor[4]);

        int input21 = readInt("=====> ", 5);
        if (input21 == 1) {
            character[10] = "Tanned";
        } else if (input21 == 2) {
            character[10] = "Pale";
        } else if (input21 == 3) {
            character[10] = "Naturally Brown";
        } else if (input21 == 4) {
            character[10] = "Dark Black";
        } else if (input21 == 5) {
            character[10] = "Light";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[10] + " selected.");
        LineSeparator.lineSeparator();

        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Choose your Gesture=====|");
        LineSeparator.lineSeparator();
        System.out.println("|=====Gestures=====|");
        System.out.println("1. " + gestures[0]);
        System.out.println("2. " + gestures[1]);
        System.out.println("3. " + gestures[2]);
        System.out.println("4. " + gestures[3]);
        System.out.println("5. " + gestures[4]);

        int input22 = readInt("=====> ", 5);
        if (input22 == 1) {
            character[11] = "Laugh";
        } else if (input22 == 2) {
            character[11] = "Wave";
        } else if (input22 == 3) {
            character[11] = "Anger";
        } else if (input22 == 4) {
            character[11] = "Agree";
        } else if (input22 == 5) {
            character[11] = "Upset";
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println(character[11] + " selected.");
        LineSeparator.lineSeparator();

        if (CharacterStats.isconfirmStats) {
            EditAndDisplayInput.displayAllInput();
        } else {
            EditAndDisplayInput.displayAllInput2();
        }

    }

}