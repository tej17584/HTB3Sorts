
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Tejada
 */
public class GeneradorNumeros {
    public static void main(String[] arg) {
        int MaxH=1000;
        int MinH=0;
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\Jose Tejada\\Desktop\\2018\\Algoritmos y Estructura de Datos\\Hojas de Trabajo\\Hoja No.3\\HTB3Sorts\\random.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 3000; i++) {
          int Rnumero = (int) (Math.random() *(MaxH-MinH)+MinH);
            pw.println(Rnumero);
        }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        
        
    }
    
}
