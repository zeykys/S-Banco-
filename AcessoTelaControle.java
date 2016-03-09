

import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
import java.sql.*;

public class AcessoTelaControle extends AcessoTela {
   
   //Construtor
   public AcessoTelaControle() {
   
      addPrimeiroAcessoListener(new PrimeroAcessoListener());
      addConfirmarListener(new ConfirmarListener());
      addFecharListener(new FrameListener());
   }

   class FrameListener extends WindowAdapter {
   
      public void windowClosing(WindowEvent e) {
         IdiomaControle idioma = new IdiomaControle();
      }
   }

   public void acessoVisivel(boolean visivel) {
      setVisivel(visivel);
   
   }
   //Implementa ActionListener ao PrimeiroAcesso
   class PrimeroAcessoListener implements ActionListener {
      //Responde ao evento do botao
      public void actionPerformed(ActionEvent e) {
         acessoVisivel(false);
      
         PrimeiroAcessoTelaControle primeiroAcesso = new PrimeiroAcessoTelaControle();
      
      }
   }
   //Implementa ActionListener ao Confirmar
   class ConfirmarListener implements ActionListener {
      //Responde ao evento do botao
      public void actionPerformed(ActionEvent e) {
         acessoVisivel(false);
         try {
         
            int agencia = getAgencia();
            int conta = Integer.parseInt(getConta());
            int senha = getSenha();
            int codigo = getCodigo();
            //Le o arquivo
            ReadTextFile application = new ReadTextFile();
            application.openFile();
         
            if (application.readRecords(agencia, conta, senha, codigo)) {
               JOptionPane.showMessageDialog(null, Util.bn.getString("tela1.botao.segundo.sucesso"));
               Util.conta.setAgencia(agencia);
               Util.conta.setCodigo(codigo);
               Util.conta.setIdConta(conta);
               Util.conta.setSenha(senha);
            
               Conta a = new Conta();
                
               Util.cliente.setCodigoCliente(a.selectIdCliente(Util.conta));
               
               Cliente cliente = new Cliente();
            
               Util.cliente.setNome(cliente.selectNomeCliente(Util.cliente.getCodigoCliente()));
            
               MenusControle menu = new MenusControle();
            } 
            else {
               JOptionPane.showMessageDialog(null, Util.bn.getString("tela1.botao.segundo.senhacontaerrada"), "Erro", 1);
               AcessoTelaControle acesso = new AcessoTelaControle();
            }
         
            application.closeFile();
         
         } 
         catch (NumberFormatException nb) {
            JOptionPane.showMessageDialog(null, Util.bn.getString("tela1.botao.segundo.formatoinvalido"));
            AcessoTelaControle acesso = new AcessoTelaControle();
         } 
         catch (IOException i) {
         
            JOptionPane.showMessageDialog(null, "Erro ao descriptografar os dados: ");
            AcessoTelaControle acesso = new AcessoTelaControle();
         
         } 
         catch (ClassNotFoundException a) {
         
         } 
         catch (SQLException sql) {
         
         }
      
      }
   }

}
