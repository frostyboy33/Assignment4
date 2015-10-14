package src.bugtesting.bug03;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.DiceValue;

public class TestDiveValue {

    private final Integer NUMBER_OF_TESTS = 10000;
    
    @Before
    public void setUp() throws Exception {
    }



    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetRandomGetCrown() {
        assertTrue(this.canProduceValue(DiceValue.CROWN));
    }
       
    @Test
    public void testGetRandomGetAnchor() {
        assertTrue(this.canProduceValue(DiceValue.ANCHOR));
    }
    
    @Test
    public void testGetRandomGetHeart() {
        assertTrue(this.canProduceValue(DiceValue.HEART));
    }
    
    @Test
    public void testGetRandomGetDiamond() {
        assertTrue(this.canProduceValue(DiceValue.DIAMOND));
    }
    
    @Test
    public void testGetRandomGetClub() {
        assertTrue(this.canProduceValue(DiceValue.CLUB));
    }
    
    @Test
    public void testGetRandomGetSpade() {
        assertTrue(this.canProduceValue(DiceValue.SPADE));
    }
    
    private boolean canProduceValue(DiceValue value) {
        boolean found = false;
        for (int i = 0; i < this.NUMBER_OF_TESTS; i++) {
            DiceValue randomValue = DiceValue.getRandom();
            if(randomValue == value) {
                found = true;
                i = this.NUMBER_OF_TESTS;
            }
        }
        return found;
    }

}
