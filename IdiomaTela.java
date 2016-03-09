import java.awt.event.*;
import javax.swing.*;
public abstract class IdiomaTela {
   //atributos
   private Janela idioma;
   private Rotulo selecioneR, selectR, seleccionarR;
	
   private Botao portuguesB, englishB, espanholB;
	
   
   //Construtor
   public IdiomaTela() {
      //tela
      idioma = new Janela();
      //instancia elementos de tela
      selecioneR = new Rotulo("Selecione um idioma");
      selectR = new Rotulo("Select a language");
      seleccionarR = new Rotulo("Seleccionar un idioma");
   	
      portuguesB = new Botao("Portugues");
      englishB = new Botao("English");
      espanholB = new Botao("Espanol");
   	//Adiciona elementos na Tela
      //getContentPane pega o container que é o painel
   	
      idioma.getContentPane().add(selecioneR);
      idioma.getContentPane().add(selectR);
      idioma.getContentPane().add(seleccionarR);
      idioma.getContentPane().add(portuguesB);
      idioma.getContentPane().add(englishB);
      idioma.getContentPane().add(espanholB);
   	//Set Tamanho
      idioma.setSize(200, 300);
      //Torna Visivel
      idioma.setVisible(true);
      //Fecha a operacao quando clicado no close
      idioma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   //Torna Visivel
   public void setVisivel(boolean visivel){
      idioma.setVisible(visivel);
   }

   //Adiciona o Listener Fechar
   public void addFecharListener(WindowAdapter e){
      idioma.addWindowListener(e);
   }
   //Adiciona o Listener Portugues
   public void addPortuguesListener(ActionListener a) {
      portuguesB.addActionListener(a);
   }
   //Adiciona o Listener English
   public void addEnglishListener(ActionListener a) {
      englishB.addActionListener(a);
   }
   //Adiciona o Listener Espanol
   public void addEspanolListener(ActionListener a) {
      espanholB.addActionListener(a);
   }

	
}