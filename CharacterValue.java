public class CharacterValue {
    public static int VIT;
    public static int STR;
    public static int AGI;
    public static int INT;
    public static int DEX;
    public static int LUK;
    public static int SPD;
    public static int OUTGOING_HEALING;
    public static int EFFECT_HIT_RATE;
    public static int BREAK_EFFECT;
    public static int totalPoints;

    public CharacterValue (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING,
                    int EFFECT_HIT_RATE, int BREAK_EFFECT, int totalPoints) {
        this.VIT = VIT;
        this.STR = STR;
        this.AGI = AGI;
        this.INT = INT;
        this.DEX = DEX;
        this.LUK = LUK;
        this.SPD = SPD;
        this.OUTGOING_HEALING = OUTGOING_HEALING;
        this.EFFECT_HIT_RATE = EFFECT_HIT_RATE;
        this.BREAK_EFFECT = BREAK_EFFECT;
        this.totalPoints = totalPoints;
    }

    public void introduce () {
        System.out.println("This is for character stats.");
    }

    public void introduce2 () {
        System.out.println("This is also for character stats.");
    }
}
