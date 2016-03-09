import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MenusControle extends MenusTela {
	
	//construtor
   public MenusControle() {
      //Adiciona as instancias
      addTransferenciaListener(new TransferenciaListener());
      addSaldoListener(new SaldoListener());
      addExtratoListener(new ExtratoListener());
      addDebitoListener(new DebitoListener());
      addSacarListener(new SacarListener());
      addFecharListener(new FrameListener());
   }

   
   class FrameListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
      {
         AcessoTelaControle acesso = new AcessoTelaControle(); 
      }
   }
   //Fecha o menu
   public void closeMenu(){
      fechar();
   }
   //Implementa ActionListener na Tranferencia
   class TransferenciaListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         TransferenciaControle transferencia = new TransferenciaControle();
         closeMenu();
      }
   }
   //Implementa ActionListener no Saldo
   class SaldoListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         ConsultarSaldoControle saldo = new ConsultarSaldoControle();
         closeMenu();
      }
   }
   //Implementa ActionListener no Extrato
   class ExtratoListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         GerarExtratoControler extrato = new GerarExtratoControler();
         closeMenu();
      }
   }
   //Implementa ActionListener no Debito
   class DebitoListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         CadastrarDebitoControle debito = new CadastrarDebitoControle();
         closeMenu();
      }
   }
   //Implementa ActionListener no Sacar
   class SacarListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         RealizarSaqueTelaControle saque = new RealizarSaqueTelaControle();
         closeMenu();
      
      }
   }
	
}


