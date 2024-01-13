public class CharacterSetAndGet {
    public CharacterSetAndGet () {
        System.out.println();
        LineSeparator.lineSeparator();
    }

    private int VIT = 1, STR = 1, AGI = 1;
    private int INT = 1;
    private int DEX = 1;
    private int LUK = 1;
    private int SPD = 1;
    private int OUTGOING_HEALING = 1;
    private int EFFECT_HIT_RATE = 1;
    private int BREAK_EFFECT = 1;

    static boolean isconfirmStats = false;

    public CharacterSetAndGet (int VIT, int STR, int AGI, int INT, int DEX, int LUK, int SPD, int OUTGOING_HEALING, int EFFECT_HIT_RATE, int BREAK_EFFECT, int totalPoints) {
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
    }

    public void setVIT (int VIT) {
        this.VIT = VIT;
    }

    public void setSTR (int STR) {
        this.STR = STR;
    }

    public void setAGI (int AGI) {
        this.AGI = AGI;
    }

    public void setINT (int INT) {
        this.INT = INT;
    }

    public void setDEX (int DEX) {
        this.DEX = DEX;
    }

    public void setLUK (int LUK) {
        this.LUK = LUK;
    }

    public void setSPD (int SPD) {
        this.SPD = SPD;
    }

    public void setOGH (int OUTGOING_HEALING) {
        this.OUTGOING_HEALING = OUTGOING_HEALING;
    }

    public void setEFFECT_HIT_RATE (int EFFECT_HIT_RATE) {
        this.EFFECT_HIT_RATE = EFFECT_HIT_RATE;
    }

    public void setBREAK_EFFECT (int BREAK_EFFECT) {
        this.BREAK_EFFECT = BREAK_EFFECT;
    }

    public int getVIT () {
        return VIT;
    }

    public int getSTR () {
        return STR;
    }

    public int getAGI () {
        return AGI;
    }

    public int getINT () {
        return INT;
    }

    public int getDEX () {
        return DEX;
    }

    public int getLUK () {
        return LUK;
    }

    public int getSPD () {
        return SPD;
    }

    public int getOUTGOING_HEALING () {
        return OUTGOING_HEALING;
    }

    public int getEFFECT_HIT_RATE () {
        return EFFECT_HIT_RATE;
    }

    public int getBREAK_EFFECT () {
        return BREAK_EFFECT;
    }
}
