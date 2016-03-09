import java.awt.event.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.*;
//Classe que faz a troca de idioma 
public abstract class Util{
   public static ResourceBundle bn;
   public static Locale local =  new Locale("pt", "BR") ; 
   public static Conta conta = new Conta();
   public static Cliente cliente = new Cliente();
   //construtor
   public Util(){
   
   }
   
}