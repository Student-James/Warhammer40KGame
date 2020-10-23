package W40k;

import java.util.Random;

public class DiceRoll {



    public int DiceRoll(){

        int diceRoll =0;
        Random random = new Random();
         diceRoll = random.nextInt(6)+1;
        System.out.println("You have rolled a " + diceRoll);
        return diceRoll;

    }


}
