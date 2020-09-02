
package ConexaoMysql;

import java.sql.*;
import java.util.ArrayList;
import Controlador.cadcliente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteBD {
    public void criar(cadcliente cc){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("INSERT INTO cad_cliente (nome,telefone,email,sexo)VALUE(?,?,?,?)");
           
           stmt.setString(1, cc.getNome()); 
           stmt.setString(2, cc.getTelefone());
           stmt.setString(3, cc.getEmail());
           stmt.setString(4, cc.getSexo());
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   
       
       
       
   }
       
      public List<cadcliente> ler (){
      
          Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
          ResultSet rs = null;
      
          List<cadcliente> cc = new ArrayList<>();
          
       try {
           stmt = con.prepareStatement("SELECT * FROM cad_cliente");
           rs = stmt.executeQuery();
           
           while (rs.next()) {  
               
               cadcliente ccc = new cadcliente();
             
               ccc.setNome(rs.getString("nome"));
          
               ccc.setTelefone(rs.getString("telefone"));
           
               ccc.setEmail(rs.getString("email"));
            
               ccc.setSexo(rs.getString("sexo"));
              
           ccc.setID(rs.getInt("id"));
               cc.add(ccc);
               
           }
         
       } catch (SQLException ex) {
            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
      
           ConexaoMysql.closeConnection(con, stmt, rs);
           
       }
       return cc;
      
      }

      
   public void update (cadcliente cc){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("UPDATE cad_cliente SET nome = ?,telefone = ?,email = ?,sexo = ? WHERE id = ? ");
          stmt.setString(1, cc.getNome()); 
           stmt.setString(2, cc.getTelefone());
           stmt.setString(3, cc.getEmail());
           stmt.setString(4, cc.getSexo());
           stmt.setInt(5, cc.getID());
           stmt.executeUpdate();
           
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
   public void delete (cadcliente cc){
      
    Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("DELETE FROM cad_cliente WHERE id = ?");
          stmt.setInt(1, cc.getID());
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Excluindo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
      
}