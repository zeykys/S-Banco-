import java.awt.event.*;
import java.awt.*; 
import java.util.*;

public abstract class PrimeiroAcessoTela {
   //atributos
   private Janela primeiro;
   private Rotulo codigoR;
   private Rotulo textoR;
   private CaixaDeTexto codigoT;
   private Botao botao1B, botao2B, botao3B, botao4B, botao5B;
   private Botao cadastrarB, corrigirB;
   private int[] botoes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   //construtor
   public PrimeiroAcessoTela() {
      Util.bn = ResourceBundle.getBundle("tela3", Util.local); 
      //tela
      primeiro = new Janela();
      primeiro.setTitle(Util.bn.getString("tela3.tela.sistemaBancario"));
      //instancia elementos de tela
      textoR = new Rotulo(Util.bn.getString("tela3.rotulo.codigo"));
   	
      codigoR = new Rotulo(Util.bn.getString("tela3.label.codigo"));
      codigoT = new CaixaDeTexto();
      codigoT.setEditable(false);
      
      botao1B = new Botao(setBotoes() + " ou " + setBotoes());
      
      botao2B = new Botao(setBotoes() + " ou " + setBotoes());
      
      botao3B = new Botao(setBotoes() + " ou " + setBotoes());
      
      
      botao4B = new Botao(setBotoes() + " ou " + setBotoes());
      
      botao5B = new Botao(setBotoes() + " ou " + setBotoes());
   	
      cadastrarB = new Botao(Util.bn.getString("tela3.botao.cadastrar"));
      corrigirB = new Botao(Util.bn.getString("tela3.botao.corrigir"));
   	
      botao1B.setPreferredSize(new Dimension(300, 30));
      
      botao2B.setPreferredSize(new Dimension(300, 30));
   
      botao3B.setPreferredSize(new Dimension(300, 30));
   
      botao4B.setPreferredSize(new Dimension(300, 30));
   
      botao5B.setPreferredSize(new Dimension(300, 30));
   
      textoR.setPreferredSize(new Dimension(405, 30));
      cadastrarB.setPreferredSize(new Dimension(150, 30));
      corrigirB.setPreferredSize(new Dimension(150, 30));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      primeiro.getContentPane().add(textoR);
      primeiro.getContentPane().add(codigoR);
      primeiro.getContentPane().add(codigoT);
      primeiro.getContentPane().add(botao1B);
      primeiro.getContentPane().add(botao2B);
      primeiro.getContentPane().add(botao3B);
      primeiro.getContentPane().add(botao4B);
      primeiro.getContentPane().add(botao5B);
      primeiro.getContentPane().add(cadastrarB);
      primeiro.getContentPane().add(corrigirB);
   	//set Tamanho
      primeiro.setSize(420, 320);
      //Torna visivel
      primeiro.setVisible(true);
   }
   //set Botoes na Tela
   private int setBotoes(){
      Random gerador = new Random();
      
      int count = gerador.nextInt(9);
      while(true){
         if(botoes[count] != -1){
            int a = botoes[count];
            botoes[count] = -1;
            return a;         
         }
         else if(count == botoes.length-1)
            count = 0;
         else if(botoes[count] == -1)
            count++;
      }
   }
   //get Codigo de Acesso
   public int getCodigoAcesso() {
      return Integer.valueOf(codigoT.getText());
   }
   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e){
      primeiro.addWindowListener(e);
   }
   //set Codigo de Acesso
   public void setCodigoAcesso(int codigoAcesso) {
      this.codigoT.setText(String.valueOf(codigoAcesso));
   }
   //Adiciona o Listener no Botao1
   public void addBotao1Listener(ActionListener a) {
      botao1B.addActionListener(a);
   }
   //Adiciona o Listener no Botao2
   public void addBotao2Listener(ActionListener a) {
      botao2B.addActionListener(a);
   }
   //Adiciona o Listener no Botao3
   public void addBotao3Listener(ActionListener a) {
      botao3B.addActionListener(a);
   }
   //Adiciona o Listener no Botao4
   public void addBotao4Listener(ActionListener a) {
      botao4B.addActionListener(a);
   }
   //Adiciona o Listener no Botao5
   public void addBotao5Listener(ActionListener a) {
      botao5B.addActionListener(a);
   }
   //Adiciona o Listener no Cadastrar
   public void addCadastrarListener(ActionListener a) {
      cadastrarB.addActionListener(a);
   }
   //Adiciona o Listener no Corrigir
   public void addCorrigirListener(ActionListener a) {
      corrigirB.addActionListener(a);
   }

	
}
