
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
public class RadixSort {
    


    
    private static String completNumber(String n){
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

public static ArrayList<Integer> RadixSort(ArrayList<Integer> numbers){
   ArrayList<Integer>[] Stacks = new ArrayList[10];
    for (int i=0; i<10;i++){
        Stacks[i] = new ArrayList<Integer>();
    }
    
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

public static ArrayList<Integer> RadixSort2(ArrayList<Integer> numbers){
    return RadixSort(numbers);
}

}

