import java.awt.Dimension;
import javax.swing.*;
//Class ScrollPane
public class RolagemDeTexto extends JScrollPane {
   public RolagemDeTexto(JTextArea a) {
      super(a);
      setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
      setPreferredSize(new Dimension(20, 200));
   
   
   }
}