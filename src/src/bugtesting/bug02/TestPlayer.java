package src.bugtesting.bug02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Player;

public class TestPlayer {
    
    private Player player;
    
    private final String PLAYER_NAME = "Fred";
    private final Integer PLAYER_BALANCE = 5;
    private final Integer PLAYER_BET_AMOUNT = 5;

    @Before
    public void setUp() throws Exception {
        this.player = new Player(this.PLAYER_NAME, this.PLAYER_BALANCE);
    }



    @After
    public void tearDown() throws Exception {
        this.player = null;
    }



    @Test
    public void testBalanceExceedsLimitByBetEqualsBalance() {
        assertTrue(this.player.balanceExceedsLimitBy(this.PLAYER_BET_AMOUNT));
    }
    
    
    @Test
    public void testBalanceExceedsLimitBalanceEqualsLimit() {
        this.player.setLimit(this.PLAYER_BALANCE);
        assertTrue(this.player.balanceExceedsLimit());
    }

}
