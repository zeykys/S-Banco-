import java.awt.event.*;
import java.awt.*;
import java.util.*;

public abstract class GerarExtratoTela {
   //atributos
   private Janela gerarExtrato;
   private Rotulo instrucaoR, setDiasR, nomeClienteR, quinzeDiasR, periodoDesejadoR;
   private CaixaDeTexto periodoDesejadoT;
   private AreaDeTexto extratoExibidoTA;
   private BotaoDeRadio setDiasBR, quinzeDiasBR;
   private Botao voltarB, imprimirExtratoB;
   private RolagemDeTexto rolagem;
   private Sistema s;
   private ResourceBundle bn;
   //construtor
   public GerarExtratoTela() {
   
      Util.bn = ResourceBundle.getBundle("tela5", Util.local); 
       
      //Tela
      gerarExtrato = new Janela();
      //Instancia os elementos de tela
      gerarExtrato.setTitle(Util.bn.getString("tela5.tela.sistemaBancario"));
      nomeClienteR = new Rotulo("                                                    "
                                 + Util.cliente.getNome());
   
      instrucaoR = new Rotulo(Util.bn.getString("tela5.rotulo.selecione"));
      instrucaoR.setPreferredSize(new Dimension(290, 30));
      setDiasR = new Rotulo(Util.bn.getString("tela5.radio.um"));
      quinzeDiasR = new Rotulo(Util.bn.getString("tela5.radio.dois"));
      periodoDesejadoR = new Rotulo(Util.bn.getString("tela5.label.periodo"));
      periodoDesejadoT = new CaixaDeTexto();
      extratoExibidoTA  = new AreaDeTexto("");
      setDiasBR = new BotaoDeRadio();
      quinzeDiasBR = new BotaoDeRadio();
      voltarB = new Botao(Util.bn.getString("tela5.botao.voltar"));
      imprimirExtratoB = new Botao(Util.bn.getString("tela5.botao.imprimir"));
      
      gerarExtrato.setSize(300, 440);
      gerarExtrato.getContentPane().add(nomeClienteR);
      gerarExtrato.getContentPane().add( instrucaoR);
      gerarExtrato.getContentPane().add(setDiasBR);
      gerarExtrato.getContentPane().add(setDiasR);
      gerarExtrato.getContentPane().add(quinzeDiasBR);    
      gerarExtrato.getContentPane().add(quinzeDiasR);
      
      rolagem = new RolagemDeTexto(extratoExibidoTA);
      //Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
      gerarExtrato.getContentPane().add(rolagem );
      gerarExtrato.getContentPane().add(periodoDesejadoR);
      gerarExtrato.getContentPane().add(periodoDesejadoT);
      gerarExtrato.getContentPane().add(extratoExibidoTA);
      gerarExtrato.getContentPane().add(rolagem);    
      gerarExtrato.getContentPane().add(voltarB);
      gerarExtrato.getContentPane().add(imprimirExtratoB);
      gerarExtrato.setVisible(true);
   }
   //Fecha o Gerar Extrato
   public void fechar(){
      gerarExtrato.dispose();
   }
   //get Periodo Desejado
   public int getPeriodoDesejado() {
      return Integer.valueOf(periodoDesejadoT.getText());
   }	
   //Adiciona o Listener Voltar
   public void addVoltarListener(ActionListener a) {
      voltarB.addActionListener(a);
   }
   //Adiciona o Listener Imprimir
   public void addImprimirListener(ActionListener a) {
      imprimirExtratoB.addActionListener(a);
   }
   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e){
      gerarExtrato.addWindowListener(e);
   }
   //Adiciona o Listener Quinze Dias
   public void addQuinzeDiasListener(ActionListener a) {
      quinzeDiasBR.addActionListener(a);
   }
   //Adiciona o Listener Sete Dias
   public void addSeteDiasListener(ActionListener a) {
      setDiasBR.addActionListener(a);
   }
}
