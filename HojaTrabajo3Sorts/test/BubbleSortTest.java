/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
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
     * Test of BubbleSort method, of class BubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        int[] nums={7,4,9,5,2};
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =0; i<5;i++){
            numbers.add(nums[i]);
        }
        result = BubbleSort.BubbleSort(numbers);
        int[] numsSorted = new int[5];
        int[] expresult = {2,4,5,7,9};
        for (int i=0;i<result.size();i++){
            
            numsSorted[i] = result.get(i);
            assertEquals(expresult[i],numsSorted[i]);
        }
    }

    /**
     * Test of BubbleSort2 method, of class BubbleSort.
     */
    
}
