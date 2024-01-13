import java.util.*;

public class Resources extends CharacterValue {
    private static final Scanner scanner = new Scanner(System.in);

    public Resources (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING, int EFFECT_HIT_RATE, int BREAK_EFFECT, int totalPoints) {
        super(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
    }

    @Override
    public void introduce () {
        if (totalPoints == 0) {
            CharacterStats.isconfirmStats = true;
        }
        if (totalPoints > 0) {
            CharacterStats.isconfirmStats = false;
        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Character Stats=====|");
        LineSeparator.lineSeparator();
        System.out.println("Remaining point(s)    : " + totalPoints);
        System.out.println("1. Vitality           : " + VIT);
        System.out.println("2. Strength           : " + STR);
        System.out.println("3. Agility            : " + AGI);
        System.out.println("4. Intelligence       : " + INT);
        System.out.println("5. Dexterity          : " + DEX);
        System.out.println("6. Luck               : " + LUK);
        System.out.println("7. Speed              : " + SPD);
        System.out.println("8. Outgoing Healing   : " + OUTGOING_HEALING);
        System.out.println("9. Effect Hit Rate    : " + EFFECT_HIT_RATE);
        System.out.println("10. Break Effect      : " + BREAK_EFFECT);
        LineSeparator.lineSeparator();

        System.out.println("0. Back");
        int choices1 = Player.readInt1("=====> ", 0);
        if (choices1 == 0) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }
    }

    @Override
    public void introduce2 () {
        if (totalPoints > 0) {
            CharacterStats.isconfirmStats = false;

        }
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Character Stats=====|");
        LineSeparator.lineSeparator();
        System.out.println("Remaining point(s) : " + totalPoints);
        System.out.println("Vitality           : " + VIT);
        System.out.println("Strength           : " + STR);
        System.out.println("Agility            : " + AGI);
        System.out.println("Intelligence       : " + INT);
        System.out.println("Dexterity          : " + DEX);
        System.out.println("Luck               : " + LUK);
        System.out.println("Speed              : " + SPD);
        System.out.println("Outgoing Healing   : " + OUTGOING_HEALING);
        System.out.println("Effect Hit Rate    : " + EFFECT_HIT_RATE);
        System.out.println("Break Effect       : " + BREAK_EFFECT);
        boolean okay = false;
        LineSeparator.lineSeparator();
        System.out.print("Do you want to upgrade your stats? (Y/N): ");
        String yesORno = scanner.next();
        while (!yesORno.equalsIgnoreCase("y") && !yesORno.equalsIgnoreCase("n")) {
            System.out.println("\nInvalid input. Please enter 'Y' or 'N'.\n");
            LineSeparator.lineSeparator();
            System.out.print("Do you want to upgrade your stats? (Y/N): ");
            yesORno = scanner.next();
        }

        if (yesORno.equalsIgnoreCase("y")) {

            if (totalPoints > 0) {
                CharacterStats.isconfirmStats = false;
            }
            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Which stat do you want to upgrade?");
            LineSeparator.lineSeparator();
            System.out.println("Remaining point(s): " + totalPoints);
            System.out.println("1. Vitality (VIT)");
            System.out.println("2. Strength (STR)");
            System.out.println("3. Agility (AGI)");
            System.out.println("4. Intelligence (INT)");
            System.out.println("5. Dexterity (DEX)");
            System.out.println("6. Luck (LUK)");
            System.out.println("7. Speed (SPD)");
            System.out.println("8. Outgoing Healing (OGH)");
            System.out.println("9. Effect Hit Rate (EHR)");
            System.out.println("10. Break Effect (BE)");
            LineSeparator.lineSeparator();

            do {
                if (totalPoints == 0) {
                    okay = true;
                    CharacterStats.isconfirmStats = true;
                    EditAndDisplayInput.displayAllInput();
                }

                System.out.println("|=====Choose in the selections=====|");
                System.out.println("Enter zero (0) to go back.");
                int input = Player.readInt1("=====> ", 10);

                if (input == 0) {
                    CharacterStats.isconfirmStats = false;
                    okay = true;
                    EditAndDisplayInput.displayAllInput2();

                    if (totalPoints > 0) {
                        okay = true;
                        CharacterStats.isconfirmStats = true;
                        EditAndDisplayInput.displayAllInput();
                    }
                    break;

                } else if (input == 1) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Vitality=====|");
                    System.out.print("Add point(s): ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intelligence (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            VIT += add;
                            totalPoints -= add;
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Vitality has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }
                } else if (input == 2) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Strength=====|");
                    System.out.print("Add point(s): ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intelligence (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {

                            STR += add;
                            totalPoints -= add;
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Strength has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 3) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Agility=====|");
                    System.out.print("Add point(s): ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intelligence (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            AGI += add;
                            totalPoints -= add;

                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Agility has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 4) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Intelligence=====|");
                    System.out.print("Add point(s): ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            INT += add;
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Intelligence has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 5) {
                    System.out.println("|=====Set Dexterity=====|");
                    System.out.print("Add point(s): ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            DEX += add;
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("DEXTERITY has been add " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);

                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 6) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Luck=====|");
                    System.out.print("Add point(s):  ");
                    try {
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();

                        } else if (totalPoints >= add) {
                            LUK += add;
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Luck has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 7) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Speed=====|");
                    try {

                        System.out.print("Add point(s): ");
                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            SPD += add;
                            totalPoints -= add;
                            LineSeparator.lineSeparator();
                            System.out.println("Speed has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();
                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 8) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Outgoing Healing=====|");
                    System.out.print("Add point(s): ");
                    try {

                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            OUTGOING_HEALING += add;
                            totalPoints -= add;
                            LineSeparator.lineSeparator();
                            System.out.println("OGH has been add " + add + " Points");
                            LineSeparator.lineSeparator();
                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }
                } else if (input == 9) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Effect Hit Rate=====|");
                    System.out.print("Add point(s): ");
                    try {


                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            EFFECT_HIT_RATE += add;
                            totalPoints -= add;
                            LineSeparator.lineSeparator();
                            System.out.println("Effect Hit Rate has been added " + add + " points(s).");
                            LineSeparator.lineSeparator();
                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }
                } else if (input == 10) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Break Effect=====|");
                    System.out.print("Add point(s): ");
                    try {


                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Go back");
                            System.out.println();
                            System.out.println("1. Vitality (VIT)");
                            System.out.println("2. Strength (STR)");
                            System.out.println("3. Agility (AGI)");
                            System.out.println("4. Intellect (INT)");
                            System.out.println("5. Dexterity (DEX)");
                            System.out.println("6. Luck (LUK)");
                            System.out.println("7. Speed (SPD)");
                            System.out.println("8. Outgoing Healing (OGH)");
                            System.out.println("9. Effect Hit Rate (EHR)");
                            System.out.println("10. Break Effect (BE)");
                            LineSeparator.lineSeparator();
                            System.out.println("Remaining point(s): " + totalPoints);
                            System.out.println("Insufficient point(s).");
                            LineSeparator.lineSeparator();
                            System.out.println();
                        } else if (totalPoints >= add) {
                            BREAK_EFFECT += add;
                            totalPoints -= add;
                            LineSeparator.lineSeparator();
                            System.out.println("Break Effect has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();
                            introduce();
                            CharacterValue cv = new Resources(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                    if (input == 0) {
                        CharacterStats.isconfirmStats = true;
                        okay = true;
                        EditAndDisplayInput.displayAllInput2();
                        break;
                    }
                } else okay = false;
            } while (!okay || totalPoints <= 1);

        } else if (yesORno.equalsIgnoreCase("n")) {
            CharacterStats.isconfirmStats = false;
            EditAndDisplayInput.displayAllInput2();
        }
    }
}
