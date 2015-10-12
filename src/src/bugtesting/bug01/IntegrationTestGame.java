package src.bugtesting.bug01;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.Dice;
import src.DiceValue;
import src.Game;
import src.Player;

public class IntegrationTestGame {
    
    private Dice die1;
    private Dice die2;
    private Dice die3;
    
    private Player player;
    
    private Game game;
    
    private final String PLAYER_NAME = "Fred";
    private final Integer PLAYER_BALANCE = 100;
    private final DiceValue PLAYER_PICK = DiceValue.ANCHOR;
    private final Integer PLAYER_BET = 5;
    

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
    public void testPlayRoundDiceListModified() {
        List<DiceValue> first_list = new ArrayList<DiceValue>
                                     (this.game.getDiceValues());
        this.game.playRound(this.player, this.PLAYER_PICK, this.PLAYER_BET);
        List<DiceValue> second_list = new ArrayList<DiceValue>
                                     (this.game.getDiceValues());
        assertNotEquals(first_list, second_list);   
    }

}
