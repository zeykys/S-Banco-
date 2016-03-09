import java.awt.event.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.*;

public class IdiomaControle extends IdiomaTela {
	//Construtor  
   public IdiomaControle() {
      addPortuguesListener(new PortuguesListener());
      addEnglishListener(new EnglishListener());
      addEspanolListener(new EspanolListener());
   		
   }
   //Torna Visivel
   public void setVisivel(boolean visivel){
      super.setVisivel(visivel);
   }
   //Implementa o ActionListener Portugues
   class PortuguesListener implements ActionListener {
      
      public void actionPerformed(ActionEvent e) {
         setVisivel(false);  
      
         Util.local = new Locale("pt", "BR");
      
         AcessoTelaControle acesso = new AcessoTelaControle();
      }
   }
   //Implementa o ActionListener English
   class EnglishListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         setVisivel(false);
         Util.local = Locale.US;
      
         AcessoTelaControle acesso = new AcessoTelaControle();
      }
   }
   //Implementa o ActionListener Espanol
   class EspanolListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         setVisivel(false);
         Util.local = new Locale("es", "ESP");
         AcessoTelaControle acesso = new AcessoTelaControle();
         
      }
   }
	
}
