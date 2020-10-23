package W40k;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {





    public static void main (String[]args){



    Weapon boltPistol=new Weapon(12,"Pistol 1",4,0,"1",null);
    Weapon marksmanBoltCarbine =new Weapon(24,"Rapid fire 1",4,0,"1","\nEach unmodified hit roll of 6 made for this weapon's attacks automatically hits and results in a wound \n(do not make a wound roll for the attack");
    Weapon fragGrenade = new Weapon(6,"Grenade D6",3,0,"1","null");
    Weapon krakGrenade = new Weapon(6,"Grenade 1",6,-1,"D3","Null");

    ArrayList<Weapon> infiltratorSquadWeapons = new ArrayList<Weapon>();
    infiltratorSquadWeapons.add(boltPistol);
    infiltratorSquadWeapons.add(marksmanBoltCarbine);
    infiltratorSquadWeapons.add(fragGrenade);
    infiltratorSquadWeapons.add(krakGrenade);

    Unit infiltratorSquad = new Unit("Infiltrator Squad",5,5,6,3,2,7,4,2,2,7,3,infiltratorSquadWeapons,false);

    ArrayList<Unit> myArmy = new ArrayList<Unit>();
    myArmy.add(infiltratorSquad);

    Scanner userInput = new Scanner(System.in);
    System.out.println("*************************************************************************************");
    System.out.println("We shall start our game. Have all of the command phase requirements been met?\n If so please enter and we can start the game: ");
     String beginGame = userInput.nextLine();

    DiceRoll diceRoll = new DiceRoll();
    int movePhaseDice = diceRoll.DiceRoll();
    MovePhase movePhase =new MovePhase();
    movePhase.movePhase(myArmy,movePhaseDice);



    }


}
