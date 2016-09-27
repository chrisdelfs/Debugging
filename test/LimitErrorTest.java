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

/**
 *
 * @author Chris
 */
public class LimitErrorTest {
    
    public LimitErrorTest() {
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
    public void testBalanceExceedsLimitBy() {
        Player sut_ = new Player("test", 5);
        assertTrue(sut_.balanceExceedsLimitBy(5));
    }
    
}
