import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SistemaControle extends IdiomaControle {
   //construtor
   public SistemaControle() {
      try {
         CreateTextFile application = new CreateTextFile();
         application.openFile();
         application.addRecords();
         application.closeFile();
      } 
      catch (IOException i) {
      
      } 
      catch (Exception e) {
      
      }
   
   }
}


