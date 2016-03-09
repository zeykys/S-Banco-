import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public abstract class TransferenciaTela {
   //atributos
   private Janela transferencia;
   private Rotulo nomeR, textoIniR, agenciaR, contaR, nomeDestinatarioR, valorR;
   private CaixaDeTexto agenciaT, contaT, nomeDestinatarioT, valorT;
   private Botao voltarB, transferirB;
   //construtor
   public TransferenciaTela() {
      //internacionaliza
      Util.bn = ResourceBundle.getBundle("tela8", Util.local);
      //tela
      transferencia = new Janela();
      transferencia.setTitle(Util.bn.getString("tela8.tela.sistemaBancario"));
      //instancia os elementos de tela 
      nomeR = new Rotulo("                                                          "
             + Util.cliente.getNome());
      nomeR.setPreferredSize(new Dimension(380, 30));
   
      textoIniR = new Rotulo(Util.bn.getString("tela8.rotulo.preencha"));
      textoIniR.setPreferredSize(new Dimension(380, 30));
   
      agenciaR = new Rotulo(Util.bn.getString("tela8.label.agencia"));
      agenciaR.setPreferredSize(new Dimension(200, 30));
      contaR = new Rotulo(Util.bn.getString("tela8.label.conta"));
      contaR.setPreferredSize(new Dimension(200, 30));
      nomeDestinatarioR = new Rotulo(Util.bn.getString("tela8.label.nome"));
      nomeDestinatarioR.setPreferredSize(new Dimension(200, 30));
      valorR = new Rotulo(Util.bn.getString("tela8.label.valor"));
      valorR.setPreferredSize(new Dimension(200, 30));
   
      agenciaT = new CaixaDeTexto();
      agenciaT.setPreferredSize(new Dimension(150, 30));
      contaT = new CaixaDeTexto();
      contaT.setPreferredSize(new Dimension(150, 30));
      nomeDestinatarioT = new CaixaDeTexto();
      nomeDestinatarioT.setPreferredSize(new Dimension(150, 30));
      valorT = new CaixaDeTexto();
      valorT.setPreferredSize(new Dimension(150, 30));
   
      voltarB = new Botao(Util.bn.getString("tela8.botao.voltar"));
      transferirB = new Botao(Util.bn.getString("tela8.botao.transferir"));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      transferencia.getContentPane().add(nomeR);
      transferencia.getContentPane().add(textoIniR);
      transferencia.getContentPane().add(contaR);
      transferencia.getContentPane().add(contaT);
      transferencia.getContentPane().add(agenciaR);
      transferencia.getContentPane().add(agenciaT);
      transferencia.getContentPane().add(nomeDestinatarioR);
      transferencia.getContentPane().add(nomeDestinatarioT);
      transferencia.getContentPane().add(valorR);
      transferencia.getContentPane().add(valorT);
      transferencia.getContentPane().add(voltarB);
      transferencia.getContentPane().add(transferirB);
      //set Tamanho
      transferencia.setSize(400, 400);
      //Torna visivel a tela
      transferencia.setVisible(true);
   }
   //Fecha a transferencia
   public void fechar() {
      transferencia.dispose();
   }
   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e) {
      transferencia.addWindowListener(e);
   }
   //get agencia
   public int getAgencia() {
      return Integer.valueOf(agenciaT.getText());
   }
   //set agencia
   public void setAgencia(int agencia) {
      this.agenciaT.setText(String.valueOf(agencia));
   }
   //get conta
   public String getConta() {
      return contaT.getText();
   }
   //get valor
   public double getValor() {
      return Double.parseDouble(valorT.getText());
   }
   //get nome destinatario
   public String getnomeDestinatario(){
      return nomeDestinatarioT.getText();
   }
   //set conta
   public void setConta(int conta) {
      this.contaT.setText(String.valueOf(conta));
   }
   //Adiciona o Listener Voltar
   public void addVoltarListener(ActionListener a) {
      voltarB.addActionListener(a);
   }
   //Adiciona o Listener Transferir
   public void addTransferirListener(ActionListener a) {
      transferirB.addActionListener(a);
   }

}
