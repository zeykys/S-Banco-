

import java.awt.event.*;

public abstract class AdminTela {
   private Janela amin;
   private Rotulo nomeAdministrador, instrucaoR, operacoesDiaR, notasDisponiveisR;
   private Botao operacoesDiaB, notasDisponiveisB;
 
   private Sistema s;
   //Construtor
   public AdminTela() {
      //Tela
      amin = new Janela();
      //Instancia o elementos de tela
      nomeAdministrador = new Rotulo("                          Nome administrador:");
      instrucaoR = new Rotulo("Extrair Relatorios                          ");
      operacoesDiaR = new Rotulo("Operacoes do dia: ");
      notasDisponiveisR = new Rotulo("Notas disponiveis no dispenser: ");
      operacoesDiaB = new Botao("Clique");
      notasDisponiveisB = new Botao("Clique");
      
      
      //Set Tamanho
      amin.setSize(350, 200);
      
      amin.getContentPane().add(nomeAdministrador);
      amin.getContentPane().add(instrucaoR);
      amin.getContentPane().add( notasDisponiveisR);
      amin.getContentPane().add(notasDisponiveisB);
      amin.getContentPane().add(operacoesDiaR);    
      amin.getContentPane().add(operacoesDiaB);
      //Set Visible
      amin.setVisible(true);
   }


   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e){
      amin.addWindowListener(e);
   }	
   //Adiciona o Listener Notas Disponiveis
   public void addNostasDisponiveisListener(ActionListener a) {
      notasDisponiveisB.addActionListener(a);
   }
   //Adiciona o Listener Operacoes
   public void addOperacoesListener(ActionListener a) {
      operacoesDiaB.addActionListener(a);
   }

	
}
