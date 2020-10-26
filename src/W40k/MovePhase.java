package W40k;

import java.util.ArrayList;
import java.util.Scanner;

public class MovePhase {

    int diceRoll;
    ArrayList<Unit> myArmy =new ArrayList<Unit>();




    public void movePhase(ArrayList<Unit> myArmy){


        DiceRoll diceRoll = new DiceRoll();
        int movePhaseDice = diceRoll.DiceRoll();
        Scanner userInput = new Scanner(System.in);


        System.out.println("*************************************************************************************");
        System.out.println("Which Unit would you like to move? Please enter the number of the unit: " );
        for(int n=0;n<myArmy.size();n++){
            System.out.println( n +" "+myArmy.get(n).getName()); //Print the name of the army.
        }
        for(Unit u:myArmy){

            int userUnitNumber = userInput.nextInt(); //User input to decide which unit they wish to move.
            if (userUnitNumber>myArmy.size()||userUnitNumber<0){
                System.out.println("The number you have entered is not a number of your unit. Please select a correct unit number. ");
                movePhase(myArmy);// capturing a error if the user does not enter the the correct number.
            }
            Unit tempUnit = myArmy.get(userUnitNumber);
            System.out.println("Do you wish to do a normal move(enter 0) or and advance(enter 1)?");
            int userMoveIntension = userInput.nextInt();//ask the user if they want to commit a move or a advance.
            if (userMoveIntension==0){
                System.out.println("You can move this unit "+(tempUnit.getUnitMove())+"\"");// user has decided to move the unit, the code will tell them how far they can move their unit.
            }else if(userMoveIntension==1) {
                System.out.println("You can move this unit " + (movePhaseDice + tempUnit.getUnitMove())+"\"");// user has decided that they will advance their units and have set charge to true so that they wont be able to attack when we reach the attack phase.
                u.setCharge(true);
            }
            else{
                System.out.println("You not entered the correct number. Please enter a 0 for move or a 1 for advance.");
                movePhase(myArmy);// capturing a error if the user does not enter the the correct number.
            }
            System.out.println("*************************************************************************************");
        }


    }
}
