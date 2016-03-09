import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.*;

public class ConsultarSaldoControle extends ConsultarSaldoTela {

   private Sistema sistema;
   //Construtor
   public ConsultarSaldoControle() {
   
      addVoltarListener(new VoltarListener());
      addImprimirListener(new ImprimirListener());
      addFecharListener(new FrameListener());
   }

   class FrameListener extends WindowAdapter {
   
      public void windowClosing(WindowEvent e) {
         MenusControle menu = new MenusControle();
      }
   }
   //Fecha Consulta Saldo
   public void closeConsultarSaldo() {
      fechar();
   }
   //Implementa ActionListener ao Voltar
   class VoltarListener implements ActionListener {
      //Responde ao evento do botao
      public void actionPerformed(ActionEvent e) {
         closeConsultarSaldo();
         MenusControle menu = new MenusControle();
      }
   }
   //Implementa um ActionListener ao Imprimir
   class ImprimirListener implements ActionListener {
      //Responder ao evento do botao
      public void actionPerformed(ActionEvent e) {
         try{
            Conta conta = new Conta();
            JOptionPane.showMessageDialog(null, Util.bn.getString("tela6.label.saldo") + "    R$ " + conta.selectSaldo(Util.conta));
         }
         catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "Erro");            
         }
      }
   }

}
