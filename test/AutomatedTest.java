/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author Chris
 */
public class AutomatedTest {
    
    public AutomatedTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of balanceExceedsLimitBy method, of class Player.
     */
    @Test
    public void testLimitNotReachedError() {
        Player sut_ = new Player("test", 5);
        assertTrue(sut_.balanceExceedsLimitBy(5));
    }
    
    @Test
    public void testIncorrectPayoutError() {
        Player player = new Player("fred", 100);
        // Mocks are used here to consitenly get the same dice roll result
        Dice dice1 = mock(Dice.class);
        when(dice1.getValue()).thenReturn(DiceValue.CROWN);
        Dice dice2 = mock(Dice.class);
        when(dice2.getValue()).thenReturn(DiceValue.CROWN);
        Dice dice3 = mock(Dice.class);
        when(dice3.getValue()).thenReturn(DiceValue.CROWN);
        Game sut_ = new Game(dice1, dice2, dice3);
        sut_.playRound(player, DiceValue.CROWN, 5);
        assertTrue(player.getBalance() == 115);
    }
    
}
