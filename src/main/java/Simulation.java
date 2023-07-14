import java.util.Map;

public class Simulation {
    int numOfDice;
    int numOfThrows;
    Bins bins = new Bins();
    public Simulation(int numOfDice, int numOfThrows){
        this.numOfDice = numOfDice;
        this.numOfThrows = numOfThrows;

    }
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();
        sim.printResults();

        }

    private void runSimulation() { // run the addToBin method x times
        for (int i = 1; i <= numOfThrows; i++){
            bins.addToBin(numOfDice);
        }

        // System.out.println(bins.getTreeMap()); //test to see mapping
        // System.out.println(bins.getTreeMap().size()); //test to see map size
    }

    private void printResults(){

        System.out.println("********\n Simulation of "+numOfDice+ " dice thrown "+numOfThrows+" times.\n********\n");

        for (Map.Entry<Integer, Integer> entry : (bins.getTreeMap()).entrySet()) {  //for each loop for each entry in map
            double rate = (double) entry.getValue()/numOfThrows;
            int value = entry.getValue();

            System.out.printf("%3d: %8d: %.2f ", entry.getKey(), value, rate);  //format line for clean spacing
            System.out.println(getStars(value,numOfThrows));
        }

    }

    public String getStars(int value, int numOfThrows){
        String stars ="";
        int starNum = (value*100) / numOfThrows;
        for(int i = 1; i <= starNum; i++){
            stars +="*";
        }
        return stars;
    }



}


