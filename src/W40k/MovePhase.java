package W40k;

import java.util.ArrayList;
import java.util.Scanner;

public class MovePhase {

    int diceRoll;
    ArrayList<Unit> myArmy;


    public void movePhase(ArrayList<Unit> myArmy,int diceRoll){
        this.myArmy=new ArrayList<Unit>();


        System.out.println("*************************************************************************************");
        System.out.println("Which Unit would you like to move? Please enter the number of the unit: " );
        for(int n=0;n<myArmy.size();n++){
            System.out.println( n +" "+myArmy.get(n).getName());
        }
        for(Unit u:myArmy){
            Scanner userInput = new Scanner(System.in);
            int userUnitNumber = userInput.nextInt();
            Unit tempUnit = myArmy.get(userUnitNumber);
            System.out.println("Do you wish to do a normal move(enter 0) or and advance(enter 1)?");
            int userMoveIntension = userInput.nextInt();
            if (userMoveIntension==0){
                System.out.println("You can move this unit "+(tempUnit.getUnitMove())+"\"");
            }else if(userMoveIntension==1) {
                System.out.println("You can move this unit " + (diceRoll + tempUnit.getUnitMove())+"\"");
                u.setCharge(true);
            }
            else{
                System.out.println("You not entered the correct number. Please enter a 0 for move or a 1 for advance.");
                movePhase(myArmy,diceRoll);
            }
            System.out.println("*************************************************************************************");
        }


    }
}
