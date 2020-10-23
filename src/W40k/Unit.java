package W40k;

import java.util.ArrayList;

public class Unit {

    String name;
    int power;
    int size;
    int move;
    int weaponSkill;
    int ballisticSkill;
    int strength;
    int toughness;
    int wounds;
    int attacks;
    int leadership;
    int save;
    ArrayList<Weapon> weapon;
    boolean charge;




    public  Unit(String name, int power, int size, int move, int weaponSkill, int ballisticSkill, int strength, int toughness, int wounds, int attacks, int leadership, int save, ArrayList<Weapon> weapon, boolean charge){
        this.name=name;
        this.size = size;
        this.power = power;
        this.move=move;
        this.weaponSkill=weaponSkill;
        this.ballisticSkill=ballisticSkill;
        this.strength=strength;
        this.toughness=toughness;
        this.wounds=wounds;
        this.attacks=attacks;
        this.leadership=leadership;
        this.save=save;
        this.weapon = new ArrayList<Weapon>();
        this.charge=charge;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }

    public int getUnitSize(){

        return this.size;
    }

    public void setUnitSize(int size){
        this.size = size;

    }

    public int getUnitPower(){

        return this.power;
    }

    public void setUnitPower(int power){

        this.power = power;
    }

    public int getUnitMove(){

        return this.move;
    }

    public void setMove(int move){

        this.move = move;
    }

    public int getWeaponSkill(){

        return this.weaponSkill;
    }

    public void setWeaponSkill(int weaponSkill){

        this.weaponSkill = weaponSkill;
    }

    public int getBallisticSkill(){

        return this.ballisticSkill;
    }

    public void setBallisticSkill(int ballisticSkill){

        this.ballisticSkill = ballisticSkill;
    }

    public int getStrength(){

        return this.strength;
    }

    public void setStrength(int strength){

        this.strength = strength;
    }

    public int getToughness(){

        return this.toughness;
    }

    public void setToughness(int toughness){

        this.toughness = toughness;
    }

    public int getWounds(){

        return this.wounds;
    }

    public void setWounds(int wounds){

        this.wounds = wounds;
    }

    public int getAttacks(){

        return this.attacks;
    }

    public void setAttacks(int attacks){

        this.attacks = attacks;
    }

    public int getLeadership(){

        return this.leadership;
    }

    public void setLeadership(int leadership){

        this.leadership = leadership;
    }

    public int getSave(){

        return this.save;
    }

    public void setSave(int save) {

        this.save = save;
    }

    public boolean isCharge() {
        return charge;
    }

    public void setCharge(boolean charge) {
        this.charge = charge;
    }
}
