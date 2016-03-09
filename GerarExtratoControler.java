import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class GerarExtratoControler extends GerarExtratoTela {
   //atributo
   private Sistema sistema;
   //Construtor
   public GerarExtratoControler() {
      //Adiciona as instancias
      addVoltarListener(new VoltarListener());
      addImprimirListener(new ImprimirListener());
      addQuinzeDiasListener(new QuinzeDiasListener());
      addSeteDiasListener(new SeteDiasListener());
      addFecharListener(new FrameListener());
   }

   class FrameListener extends WindowAdapter {
   
      public void windowClosing(WindowEvent e) {
         MenusControle menu = new MenusControle();
      }
   }
   //fecha Gerar Extrato
   public void closeGerarExtrato() {
      fechar();
   }
   //Implementa ActionListener ao Voltar
   class VoltarListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
         closeGerarExtrato();
         MenusControle menu = new MenusControle();
      }
   }
   
   
   //Implementa ActionListener ao Imprimir
   class ImprimirListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
      //Falta fazer o metodo acontecer aqui!
      
      
      }
   }
   //Implementa ActionListener ao Listener Quinze Dias
   class QuinzeDiasListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
      //Falta fazer o metodo acontecer aqui!
      
      }
   }
   //Implemta ActionListener ao Listener Sete Dias
   class SeteDiasListener implements ActionListener {
      //Responde aos eventos de botao
      public void actionPerformed(ActionEvent e) {
      //Falta fazer o metodo acontecer aqui!
      
      }
   }

}
