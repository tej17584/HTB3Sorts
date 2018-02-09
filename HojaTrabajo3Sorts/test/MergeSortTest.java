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
public class MergeSortTest {
    
    public MergeSortTest() {
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
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] n = {2,9,8,3,1};
        int[] expResult = {1,2,3,8,9};
        int[] result = MergeSort.sort(n);
        assertArrayEquals(expResult, result);
       
    }

    /**
     * Test of sort2 method, of class MergeSort.
     */
    @Test
    public void testSort2() {
        System.out.println("sort2");
       int[] n = {2,9,8,3,1};
        int[] expResult = {1,2,3,8,9};
        int[] result = MergeSort.sort2(n);
        assertArrayEquals(expResult, result);
        
    }

   
    
}
