public class Tutorial extends Story {

	public Tutorial(String name) {
		super(name);
	}

	public static void howtoplay() {
		LineSeparator.lineSeparator();
		System.out.println("Welcome to the tutorial, " + name + "."  + " Let's get started.");
		LineSeparator.lineSeparator();
		System.out.println();
		System.out.println("|===== MECHANICS =====|");
		System.out.println("You are a Survivor and each trial, you have to make a choice.");
		System.out.println("There is only one way to win. Read each question and scenario carefully.");
		System.out.println();
		System.out.println("|===== GAMEPLAY =====|");
		System.out.println("There are multiple items where you can choose your answer from\n"
				+ "each number corresponds a choice and you can only choose one answer each trial.\n"
				+ "\nFor Example 1 - To eat, 2 - To drink\n"
				+ "If you choose 1, you will eat.\n"
				+ "If you choose 2, you will drink.\n");
		System.out.println("|===== REMINDERS =====|");
		System.out.println("Read everything carefully to survive. \nChoosing the correct answers will lead to your victory.");

		Story s = new Story(name);
		PressAnyKey.pressAnyKey();
		s.intro();
	}

}
