package src.bugtesting.bug01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Dice;
import src.Game;
import src.Player;

public class IntegrationTestGame {
    
    private Dice die1;
    private Dice die2;
    private Dice die3;
    
    private Player player;
    private final String PLAYER_NAME = "Fred";
    private final Integer PLAYER_BALANCE = 100;
    
    private Game game;

    @Before
    public void setUp() throws Exception {
        this.die1 = new Dice();
        this.die2 = new Dice();
        this.die3 = new Dice();
        
        this.player = new Player(this.PLAYER_NAME, this.PLAYER_BALANCE);
        
        this.game = new Game(this.die1, this.die2, this.die3);
    }



    @After
    public void tearDown() throws Exception {
        this.die1 = null;
        this.die2 = null;
        this.die3 = null;
        
        this.player = null;
        
        this.game = null;
    }



    @Test
    public void testGetDiceValues() {
        fail("Not yet implemented");
    }



    @Test
    public void testPlayRound() {
        fail("Not yet implemented");
    }

}
