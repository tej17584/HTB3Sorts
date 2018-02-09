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
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class MainSorting {
    
    public static void main(String[] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\Jose Tejada\\Desktop\\2018\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja No.3\\HTB3Sorts\\random.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         int tamaño=3000;
         int[] lista1 = new int[tamaño];
        int[] lista2 = new int[tamaño];
        ArrayList<Integer> lista3 = new  ArrayList<>();
         ArrayList<Integer> lista4 = new  ArrayList<>();
          ArrayList<Integer> lista5 = new  ArrayList<>();
         String linea;
          for (int i = 0; i < tamaño; i++) {
              lista1[i]=Integer.parseInt(br.readLine());   
          }
          
          lista2=lista1;
          
         int[] listaO1= GnomeSort.gnomeSort(lista1);
         GnomeSort.gnomeSort2(listaO1);
         int[] listaO2= MergeSort.sort(lista2);
         MergeSort.sort2(listaO2);
         
          for (int i = 0; i < tamaño; i++) {
              lista3.add(lista1[i]);
          }
          lista4=lista3;
          lista5=lista3;
        
          ArrayList<Integer> lista3O =BubbleSort.BubbleSort(lista3);
          BubbleSort.BubbleSort2(lista3O);
         
         
       
    
      }
      catch(IOException e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (IOException e2){ 
         }
      }
        
        
    }
}
