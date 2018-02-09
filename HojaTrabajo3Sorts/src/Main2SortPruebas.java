
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Main2SortPruebas {
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
           ArrayList<Integer> numbers =  new ArrayList<Integer>();       
       ArrayList<Integer> results =  new ArrayList<Integer>(); 
        Sorts sorts = new Sorts();
       String direc = "C:\\Users\\Rodrigo\\Desktop\\Rodrigo\\2018\\Primer Semestre\\Estructura de datos\\Sorts\\random.txt";
       String texto = "";
       numbers.clear();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direc));
            String temporal = "";
        String bfRead;
            while((temporal = bf.readLine())!= null){
                numbers.add(Integer.parseInt(temporal));
            }
           sorts.BubbleSort(numbers);
    
        
            
         
            
        } catch (IOException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }
}
