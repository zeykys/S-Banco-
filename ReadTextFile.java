import java.io.*;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList; 
public class ReadTextFile
{
   //atributo
   private Scanner input;
   Conta[] record;

   //construtor
   public ReadTextFile(){
   
   }
   
   // enable user to open file
   public void openFile()
   {
      try
      {
         input = new Scanner( new File( "Arquivo.txt" ) );
      } // end try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Erro ao abrir o arquivo." );
         System.exit( 1 );
      } // end catch
   } // end method openFile
   // read record from file
   public boolean readRecords(int agencia, int conta, int senha, int codigo)throws IOException, ClassNotFoundException{             
      try
      {
         int i = 0;
         //instanciaRecord();
         ArrayList<Conta> lista = new ArrayList<Conta>();
         while ( input.hasNext() )
         {
            Conta r = new Conta();
            r.setAgencia( unCrypto(input.next()) );
            r.setIdConta( unCrypto(input.next()) );
            r.setSenha( unCrypto(input.next()) );
            r.setCodigo(unCrypto(input.next()));
            lista.add(r);
            ++i;
         } // end while
         record = new Conta[lista.size()];
         lista.toArray(record);
         BuscOrd.bubbleSort(record);
          
      	
         return BuscOrd.buscaBinaria(record, agencia, conta, senha, codigo);	  
           
      }   
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Arquivo deformado." );
         input.close();
         System.exit( 1 );
      }
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Erro de leitura do arquivo." );
         System.exit( 1 );
      } // end catch
      return false;
   } // end method readRecords
      
   public void closeFile(){
      if ( input != null )
         input.close(); // close file
   } // end method closeFile
   //metodo retorna int do unCrypto
   public int unCrypto(String crypted)throws IOException, ClassNotFoundException{
   
      String sMsgCifrada = crypted;
      String sMsgDecifrada = null;
      byte[] bMsgClara = null;
      byte[] bMsgCifrada = null;
      byte[] bMsgDecifrada = null;
      bMsgCifrada = sMsgCifrada.getBytes("ISO-8859-1");
   
      Crypto.cdummy.geraDecifra(bMsgCifrada, new File("chave.dummy"));
      bMsgDecifrada = Crypto.cdummy.getTextoDecifrado();
      Crypto.cdummy.geraDecifra(bMsgDecifrada, new File("chave.dummy"));
      sMsgDecifrada = (new String (bMsgDecifrada, "ISO-8859-1")); 
      return Integer.parseInt(sMsgDecifrada);
   
   
   }
}