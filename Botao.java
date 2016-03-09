import java.awt.Dimension;
import javax.swing.JButton;
//Class Button
public class Botao extends JButton {
   public Botao(String rotulo) {
      super(rotulo);
      setPreferredSize(new Dimension(130, 30));
   }
}