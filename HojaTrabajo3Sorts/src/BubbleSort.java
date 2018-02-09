
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class BubbleSort {
    
    private static int[] bubble(int[] numbers){
    boolean stop = false;
    int j = 0,temp=0;
    while (!stop){
        stop = true;
        j++; 
        for (int i=0; i<numbers.length-j;i++){
            if (numbers[i]>numbers[i+1]){
                temp = numbers[i];
                numbers[i]=numbers[i+1];
                numbers[i+1]=temp;
                stop = false;
            }
        }
    }
    return numbers;
}
    public static  ArrayList<Integer> BubbleSort(ArrayList<Integer> numbers){
    int[] vector = new int[numbers.size()];
    for (int i =0; i<numbers.size();i++){
        vector[i] = numbers.get(i);
    }
    vector = bubble(vector);
    numbers.clear();
     for (int i=0;i<vector.length;i++){
        numbers.add(vector[i]);
    }
    return numbers;
}
        public static  ArrayList<Integer> BubbleSort2(ArrayList<Integer> numbers){
    int[] vector = new int[numbers.size()];
    for (int i =0; i<numbers.size();i++){
        vector[i] = numbers.get(i);
    }
    vector = bubble(vector);
    numbers.clear();
     for (int i=0;i<vector.length;i++){
        numbers.add(vector[i]);
    }
    return numbers;
}
}
