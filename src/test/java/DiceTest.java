import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void getRoll() {
        Dice testDice1 = new Dice(1);
        boolean actual = false;
        int testVal = testDice1.getRoll();  //ensure the value is the same

        if (testVal > 0 && testVal< 7) {
            actual = true;
        }

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void tossAndSum() {

    }
}