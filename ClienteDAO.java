import java.sql.*;
import javax.swing.JOptionPane;
import java.util.*;
 
public class ClienteDAO {

   Statement stms;
   String select;
   ResultSet rs;
   //Construtor
   public ClienteDAO() throws SQLException {
   
      MysqlConnect a = new MysqlConnect();
   
      stms = (Statement) a.getConnection().createStatement();
   
   }
   //ArrayList select Cliente
   public ArrayList<Cliente> select() throws SQLException {
      // nosso SQL SELECT query. 
      
      String query = "SELECT * FROM cliente";
   
      MysqlConnect m = new MysqlConnect();
   
      // cria o java statement
      stms = m.getConnection().createStatement();
   
      // executa a query, e get um java resultset
      ResultSet rs = stms.executeQuery(query);
   
      ArrayList<Cliente> a = new ArrayList<Cliente>();
   
      Cliente aux = new Cliente();
      while (rs.next()) {
         aux.setCodigoCliente(Integer.parseInt(rs.getString("idcliente")));
         aux.setNome(rs.getString("nome"));
         a.add(aux);
         aux = new Cliente();
      }
   
      m.closeConnection();
      return a;
   }
}


