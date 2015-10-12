package src.bugtesting.bug02;

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
    public void testBalanceExceedsLimitBy() {
        
    }

}
