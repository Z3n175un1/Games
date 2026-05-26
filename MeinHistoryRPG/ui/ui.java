import java.awt.*;        
import java.awt.event.*;    

public class GUI extends Frame {
   private Button Nueva_historia;   
   private Button Cargar_historia;     
   private Button Opciones;     
   private Button Salir;     

   public GUI () {
   }

   // The entry main() method
   public static void main(String[] args) {
      GUI app = new GUI();
   }

   private class BtnCountListener implements ActionListener {
      public void actionPerformed(ActionEvent evt) {
      }
   }
}