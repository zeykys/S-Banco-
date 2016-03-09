public class BuscOrd{
   //Ordena pelo bubbleSort
   public static void bubbleSort( Conta vet [ ] ) {
      Conta aux; // variavel auxiliar para trocas
      //faz um loop ate o ultimo elemento
      for ( int i = 0; i < vet.length - 1; i++ ){
         for ( int j = 0; j < vet.length-1 - i; j++ ){
         // troca j com j+1
            if (vet[ j ].getIdConta() > vet[ j+1].getIdConta()) {
               aux = vet [ j ];
               vet [ j ] = vet [ j+1];
               vet [ j+1] = aux;
            }
         }
      }
   }
   //Faz a busca
   public static boolean buscaBinaria(Conta vet[],int agencia, int conta, int senha, int codigo) {
      final int n = vet.length;
      int inicio=0,fim=n-1,meio;
      while (inicio<=fim){
         meio=(inicio+fim)/2;
         if (agencia == vet[meio].getAgencia() && conta == vet[meio].getIdConta()
            && senha == vet[meio].getSenha() && codigo == vet[meio].getCodigo())
            return true;
         else
            if (vet[meio].getAgencia() < agencia)
               inicio = meio+1;
            else
               fim = meio-1;
      }
      return false;
   }
}