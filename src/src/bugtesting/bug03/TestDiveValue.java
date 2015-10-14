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


    CROWN, ANCHOR, HEART, DIAMOND, CLUB, SPADE
    @Test
    public void testGetRandomGetCrown() {
        fail("Not yet implemented");
    }
    
    
    @Test
    public void testGetRandomGetAnchor() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetRandomGetHeart() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetRandomGetDiamond() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetRandomGetClub() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetRandomGetSpade() {
        fail("Not yet implemented");
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
