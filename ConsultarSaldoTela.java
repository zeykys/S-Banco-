import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.sql.*;

public abstract class ConsultarSaldoTela {

   private Janela consultarSaldo;
   private Rotulo nomeClienteR, dataR, saldoR;
   private Botao voltarB, imprimirSaldoB;
   private Sistema s;
   //Construtor
   public ConsultarSaldoTela() {
      //Tela
      consultarSaldo = new Janela();
   
      Util.bn = ResourceBundle.getBundle("tela6", Util.local);
      //Instancia os elementos de tela
      consultarSaldo.setTitle(Util.bn.getString("tela6.tela.sistemaBancario"));
      nomeClienteR = new Rotulo("                                               "
             + Util.cliente.getNome());
      String DATE_FORMAT = "dd/mm/yyyy";
      SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
      Calendar c1 = Calendar.getInstance(); // today
      dataR = new Rotulo("                                        "
             + sdf.format(c1.getTime()));
      voltarB = new Botao(Util.bn.getString("tela6.botao.voltar"));
      try {
         Conta conta = new Conta();
      
         saldoR = new Rotulo(Util.bn.getString("tela6.label.saldo") + "    R$ " + conta.selectSaldo(Util.conta));
      
      } 
      catch (SQLException sql) {
      
      }
      imprimirSaldoB = new Botao(Util.bn.getString("tela6.botao.imprimir"));
   
      dataR.setPreferredSize(new Dimension(280, 30));
      nomeClienteR.setPreferredSize(new Dimension(310, 30));
      saldoR.setPreferredSize(new Dimension(280, 30));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      consultarSaldo.getContentPane().add(nomeClienteR);
      consultarSaldo.getContentPane().add(dataR);
      consultarSaldo.getContentPane().add(saldoR);
      consultarSaldo.getContentPane().add(voltarB);
      consultarSaldo.getContentPane().add(imprimirSaldoB);
      consultarSaldo.setSize(new Dimension(300, 200));
      //Deixa a tela visivel
      consultarSaldo.setVisible(true);
   }
   //Fecha Consultar Saldo
   public void fechar() {
      consultarSaldo.dispose();
   }
   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e) {
      consultarSaldo.addWindowListener(e);
   }
   //Adiciona o Listener Voltar
   public void addVoltarListener(ActionListener a) {
      voltarB.addActionListener(a);
   }
   //Adiciona o Listener Imprimir
   public void addImprimirListener(ActionListener a) {
      imprimirSaldoB.addActionListener(a);
   }

}
