
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
public class Sorts {

ArrayList<Integer>[] Stacks = new ArrayList[10];

public Sorts(){
    for (int i=0; i<10;i++){
        Stacks[i] = new ArrayList<Integer>();
    }
}


private String completNumber(String n){
    switch (n.length()){
        case 1:{
            return "000"+n;
        }
        case 2:{
            return "00"+n;
        }
        case 3:{
            return "0"+n;
        }
        case 4:{
            return n;
        }
    
    }
    return n;
}

public ArrayList<Integer> RadixSort(ArrayList<Integer> numbers){
   String currentNumber, index ="";
    for (int i =0; i<4;i++){
      for (int x=0;x<numbers.size();x++){
          currentNumber = completNumber(String.valueOf(numbers.get(x)));
          index = currentNumber.substring(3-i, 4-i);
          Stacks[Integer.parseInt(index)].add(numbers.get(x));
      }
      numbers.clear();
      for (int x =0;x<10;x++){
          for (int y=0;y<Stacks[x].size();y++){
              numbers.add(Stacks[x].get(y));
          }
          Stacks[x].clear();
      }
  
  }
    return numbers;
}

private void quicksort(int[] numbers , int leftLimit, int rightLimit){
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

public ArrayList<Integer> QuickSort(ArrayList<Integer> numbers, int leftLimit,int rightLimit){
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


private int[] bubble(int[] numbers){
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

public ArrayList<Integer> BubbleSort(ArrayList<Integer> numbers){
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
