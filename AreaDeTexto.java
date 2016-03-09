import java.awt.Dimension;
import javax.swing.*;
//Class TextArea
public class AreaDeTexto extends JTextArea {
   AreaDeTexto(String rotulo) {
      super(rotulo);
      setPreferredSize(new Dimension(200, 200));
      setEditable(false); 
      setLineWrap(true);
       
   }
}
