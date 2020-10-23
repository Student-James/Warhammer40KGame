package W40k;

public class Weapon {

    int range;
    String type;
    int strength;
    int armourPenetration;
    String damage;
    String ablities;

    public Weapon(int range,String type,int strenth,int armourPenetration,String damage, String ablities){
        this.range=range;
        this.type=type;
        this.strength=strenth;
        this.armourPenetration=armourPenetration;
        this.damage=damage;
        this.ablities=ablities;
    }

    public int getRange(){

        return this.range;
    }

    public void setRange(int Range) {

        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmourPenetration() {
        return armourPenetration;
    }

    public void setArmourPenetration(int armourPenetration) {
        this.armourPenetration = armourPenetration;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getAblities() {
        return ablities;
    }

    public void setAblities(String ablities) {
        this.ablities = ablities;
    }


}
