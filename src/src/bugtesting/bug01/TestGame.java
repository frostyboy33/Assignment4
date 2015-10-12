package src.bugtesting.bug01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import src.Dice;
import src.DiceValue;
import src.Game;
import src.Player;

public class TestGame {
    
    private Game game;
    
    private Dice die1;
    private Dice die2;
    private Dice die3;
    private Player player;
    
    private final DiceValue PLAYER_PICK = DiceValue.ANCHOR;
    private final Integer PLAYER_BET = 5;
    private final Integer EXPECTED_WINNINGS = 10;

    @Before
    public void setUp() throws Exception {
        
        this.die1 = Mockito.mock(Dice.class);
        Mockito.when(this.die1.getValue()).thenReturn(DiceValue.ANCHOR);
        
        this.die2 = Mockito.mock(Dice.class);
        Mockito.when(this.die2.getValue()).thenReturn(DiceValue.CROWN);
        
        this.die3 = Mockito.mock(Dice.class);
        Mockito.when(this.die3.getValue()).thenReturn(DiceValue.CLUB);
        
        this.player = Mockito.mock(Player.class);
        
        this.game = new Game(die1, die2, die3);
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
    public void testPlayRound() {
        int winings = this.game.playRound(this.player, 
                                          this.PLAYER_PICK,
                                          this.PLAYER_BET);
        assertEquals(this.EXPECTED_WINNINGS, (Integer)winings);
    }
    
    @Test
    public void testPlayRoundVerifyRoll(){
        int winings = this.game.playRound(this.player, 
                                          this.PLAYER_PICK,
                                          this.PLAYER_BET);
        Mockito.verify(this.die1).roll();
        Mockito.verify(this.die2).roll();
        Mockito.verify(this.die3).roll();      
    }

}
