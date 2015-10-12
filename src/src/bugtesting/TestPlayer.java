package src.bugtesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Player;

public class TestPlayer {
    
    private Player player;
    
    private final String PLAYER_NAME = "Fred";
    private final Integer PLAYER_BALANCE = 100;

    @Before
    public void setUp() throws Exception {
        this.player = new Player(this.PLAYER_NAME, this.PLAYER_BALANCE);
    }



    @After
    public void tearDown() throws Exception {
        this.player = null;
    }



    @Test
    public void testPlayer() {
        fail("Not yet implemented");
    }



    @Test
    public void testGetName() {
        fail("Not yet implemented");
    }



    @Test
    public void testGetBalance() {
        assertEquals((Integer)this.PLAYER_BALANCE, (Integer)this.player.getBalance());
    }



    @Test
    public void testGetLimit() {
        fail("Not yet implemented");
    }



    @Test
    public void testSetLimit() {
        fail("Not yet implemented");
    }



    @Test
    public void testBalanceExceedsLimit() {
        fail("Not yet implemented");
    }



    @Test
    public void testBalanceExceedsLimitBy() {
        fail("Not yet implemented");
    }



    @Test
    public void testTakeBet() {
        fail("Not yet implemented");
    }



    @Test
    public void testReceiveWinnings() {
        fail("Not yet implemented");
    }



    @Test
    public void testToString() {
        fail("Not yet implemented");
    }

}
