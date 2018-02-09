
import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta es una clase para los cálculos de Sort 
 * @author Jose Tejada
 * @author Rodrigo Morales
 * @version 1.0
 * @author JOSERAUL
 */
public class GnomeSort {
    /**
     * Este es el metodo de ordenar gnome sort
     * @param nums es una lista int
     * @return una lista ordenada
     */
    public static int[] gnomeSort(int[] nums){ //takes unsorted array, returns sorted
        int index=1; //start of search
        int temp;
        while(index<nums.length){ //until the array is fully sorted
            if(nums[index]<nums[index-1]){ //compares nums[index] with nums[index-1]. if smaller, switch.
                temp=nums[index];
                nums[index]=nums[index-1];
                nums[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
                if(index==0){ //prevents index from going lower than 1
                    index=1;
                }
            }
            else{
                index++; //if sorted, go up
            }
        }
 
        return(nums); //reaching the end of the array- completely sorted, returns nums
    }
    
     /**
     * Este es el metodo de ordenar gnome sort
     * @param nums es una lista int
     * @return una lista ordenada
     */
    public static int[] gnomeSort2(int[] nums){ //takes unsorted array, returns sorted
        int index=1; //start of search
        int temp;
        while(index<nums.length){ //until the array is fully sorted
            if(nums[index]<nums[index-1]){ //compares nums[index] with nums[index-1]. if smaller, switch.
                temp=nums[index];
                nums[index]=nums[index-1];
                nums[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
                if(index==0){ //prevents index from going lower than 1
                    index=1;
                }
            }
            else{
                index++; //if sorted, go up
            }
        }
 
        return(nums); //reaching the end of the array- completely sorted, returns nums
    }
    /**
     * Esta es una clase estática
     * @param <T>  un objeto de tipo comprable
     */
     private static class IntComparator<T extends Comparable<T>> implements Comparator<T> {
     @Override
     public int compare(T a, T b) {
      return a.compareTo(b);
     } 
   }
    
    
}
