import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ResourceBundle;

public class TransferenciaControle extends TransferenciaTela {
   //construtor
   public TransferenciaControle() {
      addVoltarListener(new VoltarListener());
      addTransferirListener(new TransferirListener());
      addFecharListener(new FrameListener());
   }

   class FrameListener extends WindowAdapter {
   
      public void windowClosing(WindowEvent e) {
         MenusControle menu = new MenusControle();
      }
   }
   //Fechar Transferencia
   public void closeTransferencia() {
      fechar();
   }
   //Implementa ActionListener no Voltar 
   class VoltarListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         closeTransferencia();
         MenusControle menu = new MenusControle();
      }
   }
   //Implementa ActionListener no Transferir
   class TransferirListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         try{
            Transferencia transfer  = new Transferencia();
            Conta conta = new Conta();
            
            if(conta.selectSaldo(Util.conta) >= getValor()){
               transfer.realizarTransferencia(Integer.parseInt(getConta()), getAgencia(), getValor(), getnomeDestinatario());
               
            }
            else{
               JOptionPane.showMessageDialog(null, Util.bn.getString("tela8.transferir.valorInvalido"));
            }
            
         }
         catch (NumberFormatException nb) {
            JOptionPane.showMessageDialog(null, Util.bn.getString("tela8.botao.transferir.dadosinvalidos"));
         }
         catch (SQLException sql){
            
         }
      }
   }
}
