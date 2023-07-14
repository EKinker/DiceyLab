import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    @Test
    void getTreeMap() {
        //given
        Bins bin = new Bins();
        Map expected = new TreeMap();
        //when
        Map actual = bin.getTreeMap();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSize(){
        //given
        Bins bins = new Bins();
        Map map = bins.getTreeMap();
        int actual = map.size(); // should be 0 for a new map
        Assert.assertEquals(0, actual);

    }
    @Test
    public void testSize2(){
        //given
        Bins bins = new Bins();
        Map map = bins.getTreeMap();
        map.put(1,3);
        map.put(2,5);
        map.put(2,9); //should not add a bin, should replace the value
        int actual = map.size(); // should be 0 for a new map
        Assert.assertEquals(2, actual);

    }



    @Test
    void setTreeMap() {
    }
   /* @Test
    void addToBin() {
        //given
        Bins bin = new Bins();

        //when
        bin.addToBin(2);

        //then
        Assert.assertTrue();
    }

    */


}