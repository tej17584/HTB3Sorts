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
 * @author Jose Tejada
 */
public class GnomeSortTest {
    
    public GnomeSortTest() {
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
     * Test of gnomeSort method, of class GnomeSort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        int[] nums = {5,8,2,10};
        int[] expResult = {2,5,8,10};
        int[] result = GnomeSort.gnomeSort(nums);
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of gnomeSort2 method, of class GnomeSort.
     */
    @Test
    public void testGnomeSort2() {
        System.out.println("gnomeSort2");
        int[] nums = {5,8,2,10};
        int[] expResult = {2,5,8,10};
        int[] result = GnomeSort.gnomeSort2(nums);
        assertArrayEquals(expResult, result);
        
    }
    
}
