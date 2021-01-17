public class Character extends Object {
    private final String race;
    private final String gender;
    private final int maxHP;
    private int currHP;
    private int gold;

    public Character(int id, String name, String race, String gender, int maxHP, int currHP, int gold) {
        super(id, name);
        this.race = race;
        this.gender = gender;
        this.maxHP = maxHP;
        this.currHP = currHP;
        this.gold = gold;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrHP() {
        return currHP;
    }

    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
