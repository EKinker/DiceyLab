import java.util.Random;
public class Dice {


     int numDice;
     int numSides;

     //constructor
    Dice(int numOfDice, int numOfSides){  //constructor for # of dice and # of sides
        this.numDice = numOfDice;
        this.numSides = numOfSides;
    }

    Dice (int numOfDice) {  //constructor for # of dice with default 6 sides
        this.numDice = numOfDice;
        this.numSides = 6;
    }

    public  int getRoll(){    //rolls a random number for 1 die with x sides (default 6)
        Random random = new Random();
        return (random.nextInt(this.numSides)+1);
    }

    public int tossAndSum(){  //given the number of dice, rolls and adds together the results for one roll
        int sum = 0;

        for (int i = 0; i < numDice; i++){
            sum += getRoll();

        }
        return sum;
    }


}
