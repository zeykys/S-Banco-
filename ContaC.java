import javax.swing.JOptionPane;

public class ContaC {
   //construtor
   public ContaC()
   {
   
   
   }
   //metodo insert
   public void incluir()
   {
   
      int conta = Integer.parseInt(JOptionPane.showInputDialog("Entre conta : "));
      int agencia = Integer.parseInt(JOptionPane.showInputDialog("Entre agencia : "));
      int senha = Integer.parseInt(JOptionPane.showInputDialog("Entre senha : "));
      int codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre codigo de Acesso : "));
         
      double saldo = Double.parseDouble(JOptionPane.showInputDialog("Entre saldo R$ : "));
     
      Conta item = new Conta();
      item.setIdConta(conta);
      item.setAgencia(agencia);
      item.setSenha(senha);
      item.setCodigo(codigo);
      item.setSaldo(saldo);
         
   		
      if(item.incluir() == true)
      {
         JOptionPane.showMessageDialog(null, "Item inserido com sucesso!");
      } 
   
      
   }
   //metodo select
   public void consultarPorCodigo()
   {
      try
      {
         int idConta = Integer.parseInt(JOptionPane.showInputDialog("Entre com idConta: ")); 
         Conta item = new Conta();
         item.setIdConta(idConta);
      
         JOptionPane.showMessageDialog(null,item.consultarPorCodigo());
      }
      catch(NumberFormatException e)
      {
         JOptionPane.showMessageDialog(null,"Digite somente numeros!");
      }
   
   }
   //metodo update  
   public void alterar()
   {
   	
      int idConta = Integer.parseInt(JOptionPane.showInputDialog("Entre com idConta: ")); 
   		
      int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o novo idConta : "));
      int agencia = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nova agencia : "));
      int senha = Integer.parseInt(JOptionPane.showInputDialog("Entre com a nova senha : "));
      int codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o novo codigo de acesso : "));
      double saldo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o novo Saldo : "));
  
      Conta item = new Conta();
      item.setIdConta(id);
      item.setAgencia(agencia);
      item.setSenha(senha);
      item.setCodigo(codigo);
      item.setSaldo(saldo);
   		
      if(item.alterar() == true)
      {
         JOptionPane.showMessageDialog(null, "Item alterado com sucesso!");
      } 
   
   }
   //metodo delete    
   public void deletar()
   {
      
      int idConta = Integer.parseInt(JOptionPane.showInputDialog("Entre com idConta: "));   
      Conta item = new Conta(); 
      item.setIdConta(idConta);
   	
      if(item.deletar() == true)
      {
         JOptionPane.showMessageDialog(null, "Item deletado com sucesso!");
      } 
   
   }

} 
