package W40k;

import java.util.ArrayList;
import java.util.Scanner;

public class MovePhase {

    int diceRoll;
    ArrayList<Unit> myArmy;


    public void movePhase(ArrayList<Unit> myArmy,int diceRoll){
        this.myArmy=new ArrayList<Unit>();



        System.out.println("which Unit would you like to move? Please enter the number of the unit: " );
        for(int n=0;n<myArmy.size();n++){
            System.out.println( n +" "+myArmy.get(n).getName());
        }
        for(Unit u:myArmy){
            Scanner userInput = new Scanner(System.in);
            int userUnitNumber = userInput.nextInt();
            Unit tempUnit = myArmy.get(userUnitNumber);
            System.out.println("You can move this unit "+(diceRoll+tempUnit.getUnitMove()));
        }


    }
}
