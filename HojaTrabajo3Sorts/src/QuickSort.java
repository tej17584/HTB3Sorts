
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class QuickSort {
    private static void quicksort(int[] numbers , int leftLimit, int rightLimit){
    int pivote = numbers[leftLimit+(rightLimit-leftLimit)/2];
    int temp;
    int i = leftLimit; int j = rightLimit;
    while (i<= j){
        while (numbers[i]<pivote){
            i++;
        }
        while (numbers[j]>pivote){
            j--;
        }
        if (i<=j){
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;
        }
    }
    
    if (leftLimit < j){
        quicksort(numbers, leftLimit, j);
    }
    if (j+1<rightLimit){
        quicksort(numbers, i, rightLimit);
    }
}

public static ArrayList<Integer> QuickSort(ArrayList<Integer> numbers, int leftLimit,int rightLimit){
    int[] vector = new int[numbers.size()];
    for (int i =0; i<numbers.size();i++){
        vector[i] = numbers.get(i);
    }
    quicksort(vector, leftLimit, rightLimit);
    numbers.clear();
    for (int i=0;i<vector.length;i++){
        numbers.add(vector[i]);
    }
    return numbers;
}

public static ArrayList<Integer> QuickSort2(ArrayList<Integer> numbers, int leftLimit,int rightLimit){
    return QuickSort(numbers, leftLimit, rightLimit);
}

}
