import java.sql.*;
import java.util.*;

public class Cliente {
   //atributos
   private int codigoCliente;
   private String nome;
	//construtor
   public Cliente(){
            
   }
   //construtor com parametro
   public Cliente(int c, String n) {
      setCodigoCliente(c);
      setNome(n);
   }
	//set Codigo Cliente
   public void setCodigoCliente(int c) {
      this.codigoCliente=c;
   }
   //set Nome
   public void setNome(String n) {
      this.nome=n;
   }
   //get Codigo Cliente
   public int getCodigoCliente() {
      return this.codigoCliente;
   }
   //get Nome
   public String getNome() {
      return this.nome;
   }
   //Select pelo Nome do Cliente
   public String selectNomeCliente(int id) throws SQLException {
      ClienteDAO select = new ClienteDAO();
      
      ArrayList<Cliente> clientes = select.select();
      //for-each
      for(Cliente c : clientes) {
        
         if(id == c.getCodigoCliente())
            return c.getNome();               
      }
      return "";
   
   }

}