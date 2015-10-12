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
    public void testGetBalance() {
        assertEquals((Integer)this.PLAYER_BALANCE, (Integer)this.player.getBalance());
    }


    
    @Test
    public void testReceiveWinnings() {
        int winnings = 5;
        this.player.receiveWinnings(winnings);
        int new_balance = winnings + this.PLAYER_BALANCE;
        assertEquals((Integer)new_balance, (Integer)this.player.getBalance());
    }
}
