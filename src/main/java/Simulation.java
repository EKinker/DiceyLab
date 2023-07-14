public class Simulation {
    int numOfDice;
    int numOfThrows;
    public Simulation(int numOfDice, int numOfThrows){
        this.numOfDice = numOfDice;
        this.numOfThrows = numOfThrows;

    }
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000);

        sim.runSimulation();
        sim.printResults();

        }

    private void runSimulation() { // run the addToBin method x times
        Bins bins = new Bins();
        for (int i = 1; i <= numOfThrows; i++){
            bins.addToBin(numOfDice);
        }

        System.out.println(bins.getTreeMap()); //test to see mapping
        System.out.println(bins.getTreeMap().size()); //test to see map size
    }

    private void printResults(){



    }


}


