public class SistemaAcesso {
   //atributos
   private int banco;
   private int agencia;
   private int senha;
   private int codigoAcesso;
	//construtor com paramentro
   public SistemaAcesso(int b, int a, int s, int c) {
      setBanco(b);
      setAgencia(a);
      setSenha(s);
      setCodigoAcesso(c);
   }
	//set Banco
   public void setBanco(int b) {
      this.banco=b;
   }
   //set Agencia
   public void setAgencia(int a) {
      this.agencia=a;	
   }
   //set Senha
   public void setSenha(int s) {
      this.senha=s;
   }
   //set Codigo Acesso
   public void setCodigoAcesso(int c) {
      this.codigoAcesso=c;
   }
   //get Banco
   public int getBanco() {
      return this.banco;
   }
   //get Agencia
   public int getAgencia() {
      return this.agencia;
   }
   //get Senha
   public int getSenha() {
      return this.senha;
   }
   //get Codigo Acesso
   public int getCodigoAcesso() {
      return this.codigoAcesso;
   }
	//metodo validar
   public void validar() {
   
   
   }

}