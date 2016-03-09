import java.awt.event.*;
import javax.swing.JOptionPane;

public class PrimeiroAcessoTelaControle extends PrimeiroAcessoTela {
	//atributos
   private boolean aindaAberto;
   //construtor
	public PrimeiroAcessoTelaControle() {
      //Adiciona as instancias
      addBotao1Listener(new Botao1Listener());
      addBotao2Listener(new Botao2Listener());
      addBotao3Listener(new Botao3Listener());
      addBotao4Listener(new Botao4Listener());
      addBotao5Listener(new Botao5Listener());
      addCadastrarListener(new CadastrarListener());
		addCorrigirListener(new CorrigirListener());
		addFecharListener(new FrameListener());
      aindaAberto = true;
	}

   
   class FrameListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
     {
         AcessoTelaControle acesso = new AcessoTelaControle(); 
     }
   }
   //get AindaAberto
   public boolean getAindaAberto(){
      return aindaAberto;
   }

      //Implementa ActionListener ao Botao1
		class Botao1Listener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   //Implementa ActionListener ao Botao2
   class Botao2Listener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   
   //Implementa ActionListener ao Botao3
   class Botao3Listener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   
   //Implementa ActionListener ao Botao4
   class Botao4Listener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   
   //Implementa ActionListener ao Botao5
   class Botao5Listener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   
   ////Implementa ActionListener ao Cadastrar
   class CadastrarListener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
   //Implementa ActionListener ao Corrigir
	class CorrigirListener implements ActionListener {
		//Responde aos eventos do botao
      public void actionPerformed(ActionEvent e) {
			
		}
	}
	
}