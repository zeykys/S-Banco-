import java.io.*;
import java.util.*;
import javax.swing.*;

public class CreateTextFile {
   private Formatter output;
   //Abre arquivo
   public void openFile() {
      try {
         output = new Formatter("Arquivo.txt");
      } 
      catch (SecurityException securityException) {
         System.err.println("Voce nao tem acesso para escrever nesse arquivo");
         System.exit(1);
      } // end catch
      catch (FileNotFoundException filesNotFoundException) {
         System.err.println("Erro na criacao do arquivo");
         System.exit(1);
      } // end catch
   }
   
   // add records para o arquivo
   public void addRecords() throws IOException, Exception {
      // objeto a ser escrito para preencher
      Crypto.cdummy.geraChave(new File("chave.dummy"));
   
      try {
      
         ContaDAO c = new ContaDAO(); 
            
            
         for(Conta record : c.select()) {
            if (record.getAgencia() != 0 && record.getIdConta() != 0 && 
                    record.getSenha() != 0 && record.getCodigo() != 0) {
                    // escreve novo record
               output.format(" %s %s %s %s ", crypto(record.getAgencia()), crypto(record.getIdConta()),
                    crypto(record.getSenha()), crypto(record.getCodigo()));
            } 
            else{
               System.out.println("Agencia e/ou Conta e/ou Senha e/ou CodigodeAcesso deve(m) ser maior que 0!");
            } // end else
         }    
         
      } // end try
      catch (NumberFormatException elementException) {
         System.err.println("Entrada invalida. Por favor tente denovo.");
      } // end catch
   }
   
   // fecha arquivo
   public void closeFile() {
      if (output != null)
         output.close();
   } // end method closeFile
   
   //Retorna Criptografia
   public String crypto(int i) throws IOException, Exception {
      String sMsgClara = "" + i;
      String sMsgCifrada = null;
      String sMsgDecifrada = null;
      byte[] bMsgClara = null;
      byte[] bMsgCifrada = null;
      byte[] bMsgDecifrada = null;
      bMsgClara = sMsgClara.getBytes("ISO-8859-1");
      Crypto.cdummy.geraCifra(bMsgClara, new File("chave.dummy"));
      bMsgCifrada = Crypto.cdummy.getTextoCifrado();
      Crypto.cdummy.geraCifra(bMsgClara, new File("chave.dummy"));
      return (new String(bMsgCifrada, "ISO-8859-1"));
   }
}