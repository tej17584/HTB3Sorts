
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
 * @author JOSERAUL
 * @version 1.0
 */
public class MergeSort {
   
   /**
    * Este es un metodo de ordenamiento
    * @param n un vector n
    * @return un vector entero ordenado
    */
     public static int[] sort(int []n){ 
    int i = 1; 
    for(i = 1; i < n.length;i*=2){ 
      for(int j = 0;j < n.length; j += i){ 
        int p = i >> 1; 
        merge(n,j,j+p-1,j+p,j+p+p-1); 
      } 
    } 
    merge(n,0,i/2 - 1,i/2,n.length); 
    return n; 
  } 
     /**
      * Segundo método de ordenamiento es igual
      * @param n un vector int
      * @return un vector ordenado
      */
     public static int[] sort2(int []n){ 
    int i = 1; 
    for(i = 1; i < n.length;i*=2){ 
      for(int j = 0;j < n.length; j += i){ 
        int p = i >> 1; 
        merge(n,j,j+p-1,j+p,j+p+p-1); 
      } 
    } 
    merge(n,0,i/2 - 1,i/2,n.length); 
    return n; 
  }
     
     
   /**
    * merge
    * @param n PARAMETROS DE ENTRADA PARA LAS DIVISINES
    * @param a
    * @param b
    * @param c
    * @param d 
    */
  public static void merge(int [] n,int a,int b,int c,int d){ 
    d = Math.min(d,n.length-1);    
    int mer [] = new int[d-a + 1]; 
    int idx = 0; 
    int or = a; 
    while( idx < mer.length) 
      if((a>b ?false: (c>d? true : n[a] <= n[c]))) 
        mer[idx++] = n[a++];         
      else 
        mer[idx++] = n[c++];                
       
    for(int i = 0; i < mer.length; i++) 
      n[or + i] = mer[i];     
  } 
    
}
