import java.awt.event.*;
import java.awt.*;
import java.util.*;
public abstract class RealizarSaqueTela {
   //atributos
   private Janela realizarSaque;
   private Rotulo notasDisponiveisR, nomeClienteR, instrucaoR, dezR, 
            vinteR, cinquentaR, cemR, duzentosR, quinhentosR, outroValorR;
   private CaixaDeTexto outroValorT;
   private BotaoDeRadio dezBR, vinteBR, cinquentaBR, cemBR, duzentosBR, quinhentosBR;
   private Botao sacarB;

   private Sistema s;
   //construtor
   public RealizarSaqueTela() {
      //internacionalizacao
      Util.bn = ResourceBundle.getBundle("tela7", Util.local); 
      //tela
      realizarSaque = new Janela();
      realizarSaque.setTitle(Util.bn.getString("tela7.tela.sistemaBancario"));
      //instancias os elementos de tela
      nomeClienteR = new Rotulo("                                                                                                        "+
                                 Util.cliente.getNome());
      nomeClienteR.setPreferredSize(new Dimension(510, 30));
      notasDisponiveisR = new Rotulo(Util.bn.getString("tela7.label.notas"));
      instrucaoR = new Rotulo(Util.bn.getString("tela7.label.escolha"));
      dezR = new Rotulo("R$ 10,00");
      vinteR = new Rotulo("R$ 20,00");
      cinquentaR = new Rotulo("R$ 50,00");
      cemR = new Rotulo("R$ 100,00");
      duzentosR = new Rotulo("R$ 200,00");
      quinhentosR = new Rotulo("R$ 500,00");
      dezBR = new BotaoDeRadio();
      vinteBR = new BotaoDeRadio();
      cinquentaBR = new BotaoDeRadio();
      cemBR = new BotaoDeRadio();
      duzentosBR = new BotaoDeRadio();
      quinhentosBR= new BotaoDeRadio();
      outroValorR = new Rotulo(Util.bn.getString("tela7.label.valor"));
      outroValorT = new CaixaDeTexto();
      sacarB = new Botao(Util.bn.getString("tela7.botao.sacar"));
      
      realizarSaque.setSize(540, 200);
      instrucaoR.setPreferredSize(new Dimension(520, 30));
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      realizarSaque.getContentPane().add(nomeClienteR);
      realizarSaque.getContentPane().add( notasDisponiveisR);
      realizarSaque.getContentPane().add(instrucaoR);
      realizarSaque.getContentPane().add(dezBR);
      realizarSaque.getContentPane().add(dezR);    
      realizarSaque.getContentPane().add(vinteBR);
      realizarSaque.getContentPane().add(vinteR);
      realizarSaque.getContentPane().add(cinquentaBR);
      realizarSaque.getContentPane().add(cinquentaR);
      realizarSaque.getContentPane().add(cemBR);
      realizarSaque.getContentPane().add(cemR);    
      realizarSaque.getContentPane().add(duzentosBR);
      realizarSaque.getContentPane().add(duzentosR);
      realizarSaque.getContentPane().add(quinhentosBR);
      realizarSaque.getContentPane().add(quinhentosR);
      realizarSaque.getContentPane().add(outroValorR);
      realizarSaque.getContentPane().add(outroValorT);
      realizarSaque.getContentPane().add(sacarB);
      //Torna visivel
      realizarSaque.setVisible(true);
      
   }
   //Fecha Realizar Saque
   public void fechar(){
      realizarSaque.dispose();
   }   
   //get outro valor
   public int getOutroValor() {
      return Integer.valueOf(outroValorT.getText());
   }	
   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e){
      realizarSaque.addWindowListener(e);
   }
   //Adiciona o Listener Sacar
   public void addSacarListener(ActionListener a) {
      sacarB.addActionListener(a);
   }
   //Adiciona o Listener Dez
   public void addDezListener(ActionListener a) {
      dezBR.addActionListener(a);
   }
   //Adiciona o Listener Vinte
   public void addVinteListener(ActionListener a) {
      vinteBR.addActionListener(a);
   }
   //Adiciona o Listener Cinquenta
   public void addCinquentaListener(ActionListener a) {
      cinquentaBR.addActionListener(a);
   }
   //Adiciona o Listener Cem
   public void addCemListener(ActionListener a) {
      cemBR.addActionListener(a);
   }
   //Adiciona o Listener Duzentos
   public void addDuzentosListener(ActionListener a) {
      duzentosBR.addActionListener(a);
   }
   //Adiciona o Listener Quinhentos
   public void addQuinhentosListener(ActionListener a) {
      quinhentosBR.addActionListener(a);
   }
}
