import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastrarDebitoControle extends CadastrarDebitoTela {
   //Construtor
   public CadastrarDebitoControle() {
      
      addVoltarListener(new VoltarListener());
      addCadastrarListener(new CadastrarListener());		
      addFecharListener(new FrameListener());
   }

   
   class FrameListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         MenusControle menu = new MenusControle();    
      }
   }
   //Fecha Cadastrar Debito
   public void closeCadastrarDebito(){
      fechar();
   }
   //Implementa ActionListener ao Voltar
   class VoltarListener implements ActionListener {
      //Responde ao evento do botao
      public void actionPerformed(ActionEvent e) {
         closeCadastrarDebito();
         MenusControle menu = new MenusControle();
      }
   }
   //Implementa ActionListener ao Cadastrar
   class CadastrarListener implements ActionListener {
      //Responde ao evento do botao
      public void actionPerformed(ActionEvent e) {
      	
      }
   }
	
}
