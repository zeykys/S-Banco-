/*
 Essa classe realiza consultas e updates na tablea conta no banco de dados
*/


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaDAO {

   Statement stms;
   String select;

   //construtor da classe
   public ContaDAO() throws SQLException {
      //objeto utilizado para abrir a conexão ao banco de dados
      MysqlConnect a = new MysqlConnect();
      //iniciamos a conexão ao banco e criamos a declaração java
      stms = (Statement) a.getConnection().createStatement();
   
   }

  //esse método realiza a consulta a nossa tabela conta no banco 
  //e retorna um array com todos campos da tabela
   public ArrayList<Conta> select() throws SQLException {
      //string que armazena a query select
      String query = "SELECT * FROM conta";
      
      //objeto utilizado para abrir a conexão ao banco de dados        
      MysqlConnect m = new MysqlConnect();
   
      //cria a declaração java
      stms = m.getConnection().createStatement();
   
      //Executa a query e armazena os resultados
      ResultSet rs = stms.executeQuery(query);
   
      //declaramos um arraylist para armazenar todos os campos da tabela
      ArrayList<Conta> a = new ArrayList<Conta>();
      
      //objeto utilizado para armazenar cada uma das linhas da tabela durante a execução do loop
      Conta aux = new Conta();
      //percorremos todas as linhas da tabela
      while (rs.next()) {
         //armazenamos todas as colunas de cada linha no objeto aux
         aux.setAgencia(Integer.parseInt(rs.getString("agencia")));
         aux.setCodigo(Integer.parseInt(rs.getString("codigo_acesso")));
         aux.setIdConta(Integer.parseInt(rs.getString("idconta")));
         aux.setSaldo(Integer.parseInt(rs.getString("saldo")));
         aux.setSenha(Integer.parseInt(rs.getString("senha")));
         aux.setIdCliente(Integer.parseInt(rs.getString("Cliente_IdCliente")));
         //adicionamos a linha atual ao array list
         a.add(aux);
         aux = new Conta();
      }
      
      //encerramos a conexão com o banco
      m.closeConnection();
      //retornamos o arraylist com todas as linhas e suas respectivas colunas
      return a;
   }

  //realiza um update na tabela conta conforme a query passada como parametro
   public void update(String query)throws SQLException{
      //objeto utilizado para abrir a conexão ao banco de dados
      MysqlConnect m = new MysqlConnect();
      //abre a conexão com o banco
      Connection myConn = m.getConnection();
      //cria a declaração JAVA
      Statement myst = myConn.createStatement(); 
      //Executa o update
      myst.executeUpdate(query);   
      //fecha a conexão
      m.closeConnection();
   }
  

}
