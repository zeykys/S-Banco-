import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Conta {
   //atributos
   private int idConta;
   private int agencia;
   private int senha;
   private int codigo_Acesso;
   private double saldo;
   private int Cliente_idCliente;
   private PreparedStatement st;
   Connection conn;
   DatabaseConnect db;
   //construtor
   public Conta() {
      db = new DatabaseConnect();
      conn = db.getConnection();
   
      setIdConta(0);
      setAgencia(0);
      setSenha(0);
      setCodigo(0);
      setSaldo(0.00);
   }
   //construtor com parametro
   public Conta(int id, int agencia, int senha, int codigo, double saldo) {
      setIdConta(id);
      setAgencia(agencia);
      setSenha(senha);
      setCodigo(codigo);
      setSaldo(saldo);
      db = new DatabaseConnect();
      conn = db.getConnection();
   }
   //set id Conta
   public void setIdConta(int id) {
      this.idConta = id;
   }
   //set Agencia
   public void setAgencia(int a) {
      this.agencia = a;
   }
   //set Senha
   public void setSenha(int s) {
      this.senha = s;
   }
   //set id Cliente
   public void setIdCliente(int s) {
      this.Cliente_idCliente = s;
   }
   //set Codigo
   public void setCodigo(int cod) {
      this.codigo_Acesso = cod;
   }
   //set Saldo
   public void setSaldo(double s) {
      this.saldo = s;
   }
   //get id Conta
   public int getIdConta() {
      return this.idConta;
   }
   //get Agencia
   public int getAgencia() {
      return this.agencia;
   }
   //get Senha
   public int getSenha() {
      return this.senha;
   }
   //get id Cliente
   public int getIdCliente(){
      return Cliente_idCliente;
   }
   //get Codigo
   public int getCodigo() {
      return this.codigo_Acesso;
   }
   //get Saldo
   public double getSaldo() {
      return this.saldo;
   }
     //Insert
   public boolean incluir() {
      boolean sucesso = false;
      try {
         String sql = "insert into conta (idConta, agencia, senha, codigo_Acesso, saldo) values (?, ?, ?, ?, ?)";
         st = conn.prepareStatement(sql);
         st.setInt(1, getIdConta());
         st.setInt(2, getAgencia());
         st.setInt(3, getSenha());
         st.setInt(4, getCodigo());
         st.setDouble(5, getSaldo());
         st.executeUpdate();
         sucesso = true;
         st.close();
      } 
      catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro de conexao", "Erro", 3);
         e.printStackTrace();
      }
      db.closeConnection();
      return sucesso;
   }

   //Select
   public String consultarPorCodigo() {
      String item = "Código não encontrado!";
      try {
         String sql = "select * from conta where idConta = ?";
         st = conn.prepareStatement(sql);
         st.setInt(1, getIdConta());
         ResultSet rs = st.executeQuery();
         if (rs.next()) {
            setIdConta(rs.getInt("idConta"));
            setAgencia(rs.getInt("agencia"));
            setSenha(rs.getInt("senha"));
            setCodigo(rs.getInt("codigo_Acesso"));
            setSaldo(rs.getDouble("saldo"));
            item = "idConta: " + getIdConta() + "\nAgencia: " + getAgencia()
                   + "\nSenha: " + getSenha() + "\nCodigo de Acesso: " + getCodigo() + "\nSaldo: " + getSaldo() + "\n";
            st.close();
         }
      } 
      catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro de conexao", "Erro", 3);
         e.printStackTrace();
      
      }
      return item;
   }
   //Update
   public boolean alterar() {
      boolean sucesso = false;
      try {
         String sql = "Update conta set idConta = ?, agencia = ?, senha = ?, codigo_Acesso = ?, saldo = ? where idConta = ?";
         st = conn.prepareStatement(sql);
         st.setInt(1, getIdConta());
         st.setInt(2, getAgencia());
         st.setInt(3, getSenha());
         st.setInt(4, getCodigo());
         st.setDouble(5, getSaldo());
         st.executeUpdate();
         sucesso = true;
         st.close();
      } 
      catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro de conexao", "Erro", 3);
         e.printStackTrace();
      }
      db.closeConnection();
      return sucesso;
   }
   //Delete
   public boolean deletar() {
      boolean sucesso = false;
      try {
         String sql = "delete from conta where idConta = ?";
         st = conn.prepareStatement(sql);
         st.setInt(1, getIdConta());
         st.executeUpdate();
         sucesso = true;
      
      } 
      catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Erro de conexao", "Erro", 3);
         e.printStackTrace();
      
      }
      db.closeConnection();
      return sucesso;
   
   }
   //Select id cliente
   public int selectIdCliente(Conta conta) throws SQLException {
      ContaDAO select = new ContaDAO();
    
      ArrayList<Conta> contas = select.select();
    
      for(Conta c : contas) {
      
         if(conta.getIdConta() == c.getIdConta())
            return c.getIdCliente();               
      }
      return 0;
   }
   //Update saldo
   public void  updateSaldo(String query)throws SQLException {
      ContaDAO conta = new ContaDAO();
      conta.update(query);
   }
   //Select saldo
   public double selectSaldo(Conta conta) throws SQLException {
      ContaDAO select = new ContaDAO();
    
      ArrayList<Conta> contas = select.select();
    
      for(Conta c : contas) {
      
         if(conta.getIdConta() == c.getIdConta())
            return c.getSaldo();               
      }
      return 0;
   }
   
}
