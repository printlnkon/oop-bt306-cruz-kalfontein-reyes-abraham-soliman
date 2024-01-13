import java.util.*;

public class CharacterStats extends CharacterSetAndGet implements PlayerCharStats {

    private static final Scanner scanner = new Scanner(System.in);
    int totalPoints = 20;

    CharacterStats () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Character Stats Customization=====|");
    }

    CharacterStats (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING,
                    int EFFECT_HIT_RATE, int BREAK_EFFECT, int totalPoints) {
        super(VIT, STR, AGI, INT, DEX, LUK, SPD, OUTGOING_HEALING, EFFECT_HIT_RATE, BREAK_EFFECT, totalPoints);
        this.totalPoints = totalPoints;
    }

    @Override
    public void distributePoints () {
        boolean okay = false;
        LineSeparator.lineSeparator();
        System.out.print("Do you want to upgrade your stats? (Y/N): ");
        String yesORno = scanner.next();
        LineSeparator.lineSeparator();
        while (!yesORno.equalsIgnoreCase("y") && !yesORno.equalsIgnoreCase("n")) {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
            System.out.print("Do you want to upgrade your stats? (Y/N): ");
            yesORno = scanner.next();
            LineSeparator.lineSeparator();
        }

        if (yesORno.equalsIgnoreCase("y")) {
            if (totalPoints > 0) {
                CharacterStats.isconfirmStats = false;
            }

            System.out.println();
            LineSeparator.lineSeparator();
            System.out.println("Which stat do you want to upgrade?");
            LineSeparator.lineSeparator();
            System.out.println("0. Maybe Later");
            System.out.println();
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

            do {
                if (totalPoints == 0) {
                    isconfirmStats = true;
                    okay = true;
                    break;
                } else isconfirmStats = false;
                LineSeparator.lineSeparator();
                System.out.println("|=====Choose in the selections=====|");
                int input = Player.readInt1("=====> ", 10);

                if (input == 0) {
                    if (totalPoints == 20) {

                        CharacterValue.totalPoints = 20;
                        CharacterValue.VIT = 1;
                        CharacterValue.STR = 1;
                        CharacterValue.AGI = 1;
                        CharacterValue.INT = 1;
                        CharacterValue.DEX = 1;
                        CharacterValue.LUK = 1;
                        CharacterValue.SPD = 1;
                        CharacterValue.OUTGOING_HEALING = 1;
                        CharacterValue.EFFECT_HIT_RATE = 1;
                        CharacterValue.BREAK_EFFECT = 1;
                    }
                    displayCurrentStats();
                    isconfirmStats = false;
                    okay = true;
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setVIT(getVIT() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Vitality has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
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
                            System.out.println("Insufficient point(s).");

                        } else if (totalPoints >= add) {
                            setSTR(getSTR() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Strength has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);

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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setAGI(getAGI() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Agility has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setINT(getINT() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Intelligence has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 5) {
                    System.out.println();
                    LineSeparator.lineSeparator();
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setDEX(getDEX() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Dexterity has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }

                } else if (input == 6) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Luck=====|");
                    System.out.print("Add point(s): ");
                    try {

                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");

                        } else if (totalPoints >= add) {
                            setLUK(getLUK() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Luck has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }
                } else if (input == 7) {
                    System.out.println();
                    LineSeparator.lineSeparator();
                    System.out.println("|=====Set Speed=====|");
                    System.out.print("Add point(s): ");
                    try {

                        int add = scanner.nextInt();
                        if (add < 0) {
                            System.out.println("Negative numbers is not valid");
                            continue;
                        }
                        if (totalPoints < add) {
                            okay = false;
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");

                        } else if (totalPoints >= add) {
                            setSPD(getSPD() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Speed has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setOGH(getOUTGOING_HEALING() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Outgoing Healing has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setEFFECT_HIT_RATE(getEFFECT_HIT_RATE() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Effect Hit Rate has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
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
                            System.out.println();
                            LineSeparator.lineSeparator();
                            System.out.println("Which stat do you want to upgrade?");
                            LineSeparator.lineSeparator();
                            System.out.println("0. Maybe Later");
                            System.out.println();
                            System.out.println("Remaining point(s): " + totalPoints);
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
                            System.out.println("Insufficient point(s).");
                        } else if (totalPoints >= add) {
                            setBREAK_EFFECT(getBREAK_EFFECT() + add);
                            totalPoints -= add;

                            LineSeparator.lineSeparator();
                            System.out.println("Break Effect has been added " + add + " point(s).");
                            LineSeparator.lineSeparator();

                            displayCurrentStats();
                            CharacterValue cv = new Resources(getVIT(), getSTR(), getAGI(), getINT(), getDEX(), getLUK(),
                                    getSPD(), getOUTGOING_HEALING(), getEFFECT_HIT_RATE(), getBREAK_EFFECT(),
                                    totalPoints);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid points. Please try again.");
                        scanner.nextLine();
                    }
                }

            } while (!okay || totalPoints == 0);

        } else if (yesORno.equalsIgnoreCase("n")) {
            if (totalPoints == 20) {
                CharacterValue.totalPoints = 20;
                CharacterValue.VIT = 1;
                CharacterValue.STR = 1;
                CharacterValue.AGI = 1;
                CharacterValue.INT = 1;
                CharacterValue.DEX = 1;
                CharacterValue.LUK = 1;
                CharacterValue.SPD = 1;
                CharacterValue.OUTGOING_HEALING = 1;
                CharacterValue.EFFECT_HIT_RATE = 1;
                CharacterValue.BREAK_EFFECT = 1;
            }
            isconfirmStats = false;
        }

    }

    public void displayCurrentStats () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("|=====Current Stats=====|");
        LineSeparator.lineSeparator();
        System.out.println("0. Maybe Later");
        System.out.println();
        System.out.println("Remaining point(s): " + totalPoints);
        System.out.println("1. Vitality (VIT): " + getVIT());
        System.out.println("2. Strength (STR): " + getSTR());
        System.out.println("3. Agility (AGI): " + getAGI());
        System.out.println("4. Intelligence (INT): " + getINT());
        System.out.println("5. Dexterity (DEX): " + getDEX());
        System.out.println("6. Luck (LUK): " + getLUK());
        System.out.println("7. Speed (SPD): " + getSPD());
        System.out.println("8. Outgoing Healing (OGH): " + getOUTGOING_HEALING());
        System.out.println("9. Effect Hit Rate (EHR): " + getEFFECT_HIT_RATE());
        System.out.println("10. Break Effect (BE): " + getBREAK_EFFECT());
    }

    @Override
    public void displayStarterStats () {
        LineSeparator.lineSeparator();
        System.out.println("|=====Character Starter Stats=====|");
        System.out.println("Vitality (VIT): " + getVIT());
        System.out.println("Strength (STR): " + getSTR());
        System.out.println("Agility (AGI): " + getAGI());
        System.out.println("Intelligence (INT): " + getINT());
        System.out.println("Dexterity (DEX): " + getDEX());
        System.out.println("Luck (LUK): " + getLUK());
        System.out.println("Speed (SPD): " + getSPD());
        System.out.println("Outgoing Healing (OGH): " + getOUTGOING_HEALING());
        System.out.println("Effect Hit Rate (EHR): " + getEFFECT_HIT_RATE());
        System.out.println("Break Effect (BE): " + getBREAK_EFFECT());
    }
}
