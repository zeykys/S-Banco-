import java.awt.event.*;
import java.awt.*;
import java.util.*;

public abstract class CadastrarDebitoTela {
   //Atributos
   private Janela cadastrarDebito;
   private Rotulo instrucaoR, nomeClienteR, operadoraR, dataR, codConsumidorR;
   private CaixaDeTexto operadoraT, dataT, codConsumidorT;
   private Botao voltarB, cadastrarB;
   private Sistema s;
   //Construtor
   public CadastrarDebitoTela() {
   
      Util.bn = ResourceBundle.getBundle("tela4", Util.local);
      //Tela
      cadastrarDebito = new Janela();
      //Instancia os elementos de tela
      cadastrarDebito.setTitle(Util.bn.getString("tela4.tela.sistemaBancario"));
      nomeClienteR = new Rotulo("                                                    "
             + Util.cliente.getNome());
   
      instrucaoR = new Rotulo(Util.bn.getString("tela4.rotulo.preencha"));
      operadoraR = new Rotulo(Util.bn.getString("tela4.label.operadora"));
      dataR = new Rotulo(Util.bn.getString("tela4.label.debito"));
      codConsumidorR = new Rotulo(Util.bn.getString("tela4.label.consumidor"));
      operadoraT = new CaixaDeTexto();
      dataT = new CaixaDeTexto();
      codConsumidorT = new CaixaDeTexto();
      cadastrarB = new Botao(Util.bn.getString("tela4.botao.cadastrar"));
      voltarB = new Botao(Util.bn.getString("tela4.botao.voltar"));
      //Set Tamanho
      cadastrarDebito.setSize(420, 300);
   
      operadoraT.setPreferredSize(new Dimension(200, 30));
      dataT.setPreferredSize(new Dimension(200, 30));
      codConsumidorT.setPreferredSize(new Dimension(200, 30));
      operadoraR.setPreferredSize(new Dimension(180, 30));
      dataR.setPreferredSize(new Dimension(180, 30));
      codConsumidorR.setPreferredSize(new Dimension(180, 30));
      nomeClienteR.setPreferredSize(new Dimension(300, 50));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      cadastrarDebito.getContentPane().add(nomeClienteR);
      cadastrarDebito.getContentPane().add(instrucaoR);
      cadastrarDebito.getContentPane().add(operadoraR);
      cadastrarDebito.getContentPane().add(operadoraT);
      cadastrarDebito.getContentPane().add(dataR);
      cadastrarDebito.getContentPane().add(dataT);
      cadastrarDebito.getContentPane().add(codConsumidorR);
      cadastrarDebito.getContentPane().add(codConsumidorT);
      cadastrarDebito.getContentPane().add(voltarB);
      cadastrarDebito.getContentPane().add(cadastrarB);
      cadastrarDebito.setVisible(true);
   }
   //Fecha 
   public void fechar() {
      cadastrarDebito.dispose();
   }
   //get Operadora
   public int getOperadora() {
      return Integer.valueOf(operadoraT.getText());
   }

   public void addFecharListener(WindowAdapter e) {
      cadastrarDebito.addWindowListener(e);
   }
   //get Data
   public int getData() {
      return Integer.valueOf(dataT.getText());
   }
   //get Codigo Consumidor 
   public int getCodConsumidorT() {
      return Integer.valueOf(codConsumidorT.getText()).intValue();
   }
   //Adiciona o Listener Voltar
   public void addVoltarListener(ActionListener a) {
      voltarB.addActionListener(a);
   }
   //Adiciona o Listener Cadastrar
   public void addCadastrarListener(ActionListener a) {
      cadastrarB.addActionListener(a);
   }

}
