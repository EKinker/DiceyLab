import java.util.Map;
import java.util.TreeMap;

public class Bins {


    private Map<Integer, Integer> treeMap;  //declare new treemap
    public Bins(Map<Integer,Integer> map){
        this.treeMap = map;
    }

    public Map<Integer, Integer> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(Map<Integer, Integer> treeMap) {  //do I need a setter?
        this.treeMap = treeMap;
    }

    public Bins(){
        this(new TreeMap<>());
    }

    public void addToBin(int numDice){
        Dice dice = new Dice(numDice);
        int key = dice.tossAndSum();

        int count;

        if (treeMap.containsKey(key)){
            count = treeMap.get(key);
            treeMap.put(key, count+1);
            } else {
            treeMap.put(key, 1);
        }
        //System.out.println(treeMap);  //for testing.  remove
    }




}
    /*  Probably just delete this.  I decided on a treemap
    Bins(int lower, int higher){

    }

    public static void main(String[] args) {
        Dice dice = new Dice(10, 20); //test cases
        System.out.println(dice.tossAndSum());


    }

}
     */
