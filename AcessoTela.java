
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.*;
import javax.swing.JOptionPane;

public abstract class AcessoTela {
   //atributos
   private Janela acesso;
   private Rotulo agenciaR, contaR, senhaR, codigoR;
   private CaixaDeTexto agenciaT, contaT, codigoT;
   private SenhaArea senhaT;
   private Botao primeroAcessoB, confirmarB;
  
   //construtor da classe
   public AcessoTela() {
      //Internacionaliza
      Util.bn = ResourceBundle.getBundle("tela1", Util.local);
      //Instancia os elementos de tela
      acesso = new Janela();
      //Configura o Titulo
      acesso.setTitle(Util.bn.getString("tela1.tela.sistemaBancario"));
      //Label
      agenciaR = new Rotulo(Util.bn.getString("tela1.label.agencia"));
      contaR = new Rotulo(Util.bn.getString("tela1.label.conta"));
      senhaR = new Rotulo(Util.bn.getString("tela1.label.senha"));
      codigoR = new Rotulo(Util.bn.getString("tela1.label.codigo"));
      //TextField
      codigoT = new CaixaDeTexto();
      agenciaT = new CaixaDeTexto();
      contaT = new CaixaDeTexto();
      senhaT = new SenhaArea();
      primeroAcessoB = new Botao(Util.bn.getString("tela1.botao.primeiro"));
      confirmarB = new Botao(Util.bn.getString("tela1.botao.segundo"));
      acesso.setSize(400, 230);
   
      primeroAcessoB.setPreferredSize(new Dimension(130, 30));
      confirmarB.setPreferredSize(new Dimension(130, 30));      
      contaT.setPreferredSize(new Dimension(190, 30));
      senhaT.setPreferredSize(new Dimension(190, 30));
      agenciaT.setPreferredSize(new Dimension(190, 30));
      codigoT.setPreferredSize(new Dimension(190, 30));
      contaR.setPreferredSize(new Dimension(100, 30));
      senhaR.setPreferredSize(new Dimension(100, 30));
      agenciaR.setPreferredSize(new Dimension(100, 30));
      codigoR.setPreferredSize(new Dimension(120, 30));      
      //Adiciona os elementos na tela
      acesso.getContentPane().add( agenciaR);
      acesso.getContentPane().add(agenciaT);
      acesso.getContentPane().add(contaR);
      acesso.getContentPane().add(contaT);
      acesso.getContentPane().add(senhaR);
      acesso.getContentPane().add(senhaT);
      acesso.getContentPane().add(codigoR);
      acesso.getContentPane().add(codigoT);
      acesso.getContentPane().add(primeroAcessoB);
      acesso.getContentPane().add(confirmarB);
      //Torna Visivel
      acesso.setVisible(true);
   }
  

   public void addFecharListener(WindowAdapter e){
      acesso.addWindowListener(e);
   }

   public void setVisivel(boolean visivel){
      acesso.setVisible(visivel);
   }


   //get Agencia
   public int getAgencia() {
      return Integer.valueOf(agenciaT.getText());
   }
   //get Código
   public int getCodigo() {
      return Integer.valueOf(codigoT.getText());
   }
   //set Agencia
   public void setAgencia(int agencia) {
      this.agenciaT.setText(String.valueOf(agencia));
   }
   //get Conta
   public String getConta() {
      return contaT.getText();
   }
   //set Conta
   public void setConta(int conta) {
      this.contaT.setText(String.valueOf(conta));
   }
   //get Senha
   public int  getSenha() {
      return Integer.valueOf(senhaT.getText()).intValue();
   }
   //set Senha
   public void setSenha(int senha) {
      this.senhaT.setText(String.valueOf(senha));
   }
   //Adiciona o Listener Primeiro Acesso
   public void addPrimeiroAcessoListener(ActionListener a) {
      primeroAcessoB.addActionListener(a);
   }
   //Adiciona o Listener Confirmar
   public void addConfirmarListener(ActionListener a) {
      confirmarB.addActionListener(a);
   }


}
