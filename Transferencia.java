import java.sql.*;
import javax.swing.JOptionPane;

public class Transferencia{
   //atributos
   private int agenciaDestino;
   private int contaDestino;
   //construtor
   Transferencia(){
   }
   //construtor com parametro
   Transferencia(int contaDest, int agenciaDest){
      setContaDestino(contaDest);
      setAgenciaDestino(agenciaDest);
   }
   //set Agencia Destino
   public void setAgenciaDestino(int agencia){
      this.agenciaDestino = agencia;
   }
   //set Conta Destino
   public void setContaDestino(int conta){
      this.contaDestino = conta;
   }
   //get Agencia Destino
   public int getAgenciaDestino(){
      return agenciaDestino;
   }
   //retorna int conta destino
   public int setContaDestino(){
      return contaDestino;
   }
   //metodo que realizar transferencia
   public void realizarTransferencia(int conta, int agencia, double valor, String nome) throws SQLException {
        
      String query = ""; 
   
        // create the java statement
        //stms = m.getConnection().createStatement();
      Cliente cliente = new Cliente();
      Conta cont = new Conta();
      cont.setIdConta(conta);
      cont.setAgencia(agencia);
        
      String nomeDB = cliente.selectNomeCliente(cont.selectIdCliente(cont));
   
      if (nomeDB.toUpperCase().equals(nome.toUpperCase())) {
         query = "UPDATE CONTA SET SALDO = SALDO + " + valor + " WHERE idconta = " + conta + " and agencia = " + agencia;
         cont.updateSaldo(query);
         query = "UPDATE CONTA SET SALDO = SALDO - " + valor + " WHERE idconta = " + Util.conta.getIdConta() + " and agencia = " + Util.conta.getAgencia();
         cont.updateSaldo(query);
         JOptionPane.showMessageDialog(null, Util.bn.getString("tela8.trasferir.confirmado"));
      } 
      else {
         JOptionPane.showMessageDialog(null, Util.bn.getString("tela8.transferir.erro"));
      }
   }
}