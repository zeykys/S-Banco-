import java.awt.event.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;
import java.sql.*;

public class RealizarSaqueTelaControle extends RealizarSaqueTela {
	private Sistema sistema;
   
	public RealizarSaqueTelaControle() {
      
      addSacarListener(new SacarListener());
      addDezListener(new DezListener());
      addVinteListener(new VinteListener());
      addCinquentaListener(new VinteListener());
      addCemListener(new CemListener());
      addDuzentosListener(new DuzentosListener());
      addQuinhentosListener(new QuinhentosListener());
      
      addFecharListener(new FrameListener());
	}

   
   class FrameListener extends WindowAdapter
   {
      public void windowClosing(WindowEvent e)
     {
         MenusControle menu = new MenusControle();    
     }
   }
   //Saca qualquer valor que o usuario digite que esteja dentro do valor estimado de seu saldo
	class SacarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
      /*Falta fazer o metodo acontecer aqui!
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
            
         }
		*/	
		}
	}

	class DezListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!	
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
		*/
      }
	}
   
   class VinteListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!	
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
		*/
      }
	}
   class CinquentaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!	
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
		*/
      }
	}
   class CemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
      */	
		}
	}
   class DuzentosListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
      */	
		}
	}
   class QuinhentosListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		/*Falta fazer o metodo acontecer aqui!
       try{
            Conta conta = new Conta();
         }
         catch(SQLException sql){
         }
      */	
		}
	}
   
   
   
  	
}
