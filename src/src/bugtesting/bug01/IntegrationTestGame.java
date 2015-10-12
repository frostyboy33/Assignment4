package src.bugtesting.bug01;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import src.Dice;
import src.DiceValue;
import src.Game;
import src.Player;

public class IntegrationTestGame {
    
    private Dice die1;
    private Dice die2;
    private Dice die3;
    
    private Dice mockDie1;
    private Dice mockDie2;
    private Dice mockDie3;
    
    private Player player;
    
    private Game game;
    private Game gameMockDice;
    
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
        
        this.mockDie1 = Mockito.mock(Dice.class);
        Mockito.when(this.mockDie1.getValue()).thenReturn(DiceValue.ANCHOR);
        
        this.mockDie2 = Mockito.mock(Dice.class);
        Mockito.when(this.mockDie2.getValue()).thenReturn(DiceValue.CROWN);
        
        this.mockDie3 = Mockito.mock(Dice.class);
        Mockito.when(this.mockDie3.getValue()).thenReturn(DiceValue.CLUB);
        
        this.gameMockDice = new Game(this.mockDie1, 
                                       this.mockDie2,
                                       this.mockDie3);
        
    }



    @After
    public void tearDown() throws Exception {
        this.die1 = null;
        this.die2 = null;
        this.die3 = null;
        
        this.player = null;
        
        this.game = null;
        
        this.mockDie1 = null;
        this.mockDie2 = null;
        this.mockDie3 = null;
        this.gameMockDice = null;
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
    
    @Test
    public void testPlayRoundCorrectBalance() {
        int winnings = this.gameMockDice.playRound(this.player, 
                                                   this.PLAYER_PICK, 
                                                   this.PLAYER_BET);
        int new_balance = this.PLAYER_BALANCE + winnings;
        assertEquals(new_balance, this.player.getBalance());
    }

}
