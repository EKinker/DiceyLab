import java.util.Random;
public class Dice {

    public static void main(String[] args){

        Dice dice = new Dice(10, 20); //test cases
        System.out.println(dice.tossAndSum());
    }
     int numDice;
     int numSides;

    Dice(int numOfDice, int numOfSides){
        this.numDice = numOfDice;
        this.numSides = numOfSides;
    }

    Dice (int numOfDice) {
        this.numDice = numOfDice;
        this.numSides = 6;
    }

    public  int getRoll(){
        Random random = new Random();
        return (random.nextInt(this.numSides)+1);
    }

    public int tossAndSum(){
        int sum = 0;

        for (int i = 0; i < this.numDice; i++){
            sum += getRoll();

        }
        return sum;
    }


}
