import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public abstract class MenusTela {
   //atributos
   private Janela menus;
   private Rotulo transferenciaR, saldoR, extratoR, debitoR, sacarR, nomeR, opcaoR;

   private Botao transferenciaB, saldoB, extratoB, debitoB, sacarB;
   private ResourceBundle bn = null;
   //construtor
   public MenusTela() {
   
      Util.bn = ResourceBundle.getBundle("tela2", Util.local);
      //tela
      menus = new Janela();
      menus.setTitle(Util.bn.getString("tela2.tela.sistemaBancario"));
      //instancia elementos de tela
      nomeR = new Rotulo("                                       "
             + Util.cliente.getNome());
      opcaoR = new Rotulo(Util.bn.getString("tela2.rotulo.opcao"));
      transferenciaR = new Rotulo(Util.bn.getString("tela2.label.transferencia"));
      transferenciaB = new Botao("OK");
      saldoR = new Rotulo(Util.bn.getString("tela2.label.saldo"));
      saldoB = new Botao("OK");
      extratoR = new Rotulo(Util.bn.getString("tela2.label.extrato"));
      extratoB = new Botao("OK");
      debitoR = new Rotulo(Util.bn.getString("tela2.label.debito"));
      debitoB = new Botao("OK");
      sacarR = new Rotulo(Util.bn.getString("tela2.label.sacar"));
      sacarB = new Botao("OK");
   
      transferenciaB.setPreferredSize(new Dimension(80, 25));
      saldoB.setPreferredSize(new Dimension(80, 25));
      extratoB.setPreferredSize(new Dimension(80, 25));
      debitoB.setPreferredSize(new Dimension(80, 25));
      sacarB.setPreferredSize(new Dimension(80, 25));
      opcaoR.setPreferredSize(new Dimension(200, 50));
      nomeR.setPreferredSize(new Dimension(300, 50));
      transferenciaR.setPreferredSize(new Dimension(200, 50));
      saldoR.setPreferredSize(new Dimension(200, 50));
      extratoR.setPreferredSize(new Dimension(200, 50));
      debitoR.setPreferredSize(new Dimension(200, 50));
      sacarR.setPreferredSize(new Dimension(200, 50));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      menus.getContentPane().add(nomeR);
      menus.getContentPane().add(opcaoR);
      menus.getContentPane().add(transferenciaR);
      menus.getContentPane().add(transferenciaB);
      menus.getContentPane().add(saldoR);
      menus.getContentPane().add(saldoB);
      menus.getContentPane().add(extratoR);
      menus.getContentPane().add(extratoB);
      menus.getContentPane().add(debitoR);
      menus.getContentPane().add(debitoB);
      menus.getContentPane().add(sacarR);
      menus.getContentPane().add(sacarB);
      //Torna Visivel
      menus.setVisible(true);
      //Set Tamanho
      menus.setSize(400, 425);
   
   }
   //Fecha menus
   public void fechar() {
      menus.dispose();
   }
   //Adiciona o Listener Fechar 
   public void addFecharListener(WindowAdapter e) {
      menus.addWindowListener(e);
   }
   //Adiciona o Listener Transferencia
   public void addTransferenciaListener(ActionListener a) {
      transferenciaB.addActionListener(a);
   
   }
   //Adiciona o Listener Saldo
   public void addSaldoListener(ActionListener a) {
      saldoB.addActionListener(a);
   }
   //Adiciona o Listener Extrato
   public void addExtratoListener(ActionListener a) {
      extratoB.addActionListener(a);
   }
   //Adiciona o Listener Debito
   public void addDebitoListener(ActionListener a) {
      debitoB.addActionListener(a);
   }
   //Adiciona o Listener Sacar
   public void addSacarListener(ActionListener a) {
      sacarB.addActionListener(a);
   }

}
