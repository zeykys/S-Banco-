public class Sistema {
   //atributos
   private int agencia;
   private int conta;
   private int senha;
   //construtor com parametro
   public Sistema(int agencia, int conta, int senha){
      setAgencia(agencia);
      setConta(conta);
      setSenha(senha);
   }
   //get Agencia
   public int getAgencia() {
      return agencia;
   }
   //set Agencia
   public void setAgencia(int agencia) {
      this.agencia = agencia;
   }
   //get Conta
   public int getConta() {
      return conta;
   }
   //set Conta
   public void setConta(int conta) {
      this.conta = conta;
   }
   //get Senha
   public int getSenha() {
      return senha;
   }
   //set Senha
   public void setSenha(int senha) {
      this.senha = senha;
   }
}