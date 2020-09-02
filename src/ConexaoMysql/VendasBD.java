
package ConexaoMysql;

import Controlador.cadVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VendasBD {
     public void criar(cadVendas cv){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("INSERT INTO lanche (codigo,lanche,quantidade,desconto,valor)VALUE(?,?,?,?,?)");
           stmt.setInt(1, cv.getCodigo()); 
           
          
           stmt.setString(2, cv.getLanche());
           stmt.setInt(3, cv.getQuantidade());
           stmt.setFloat(4, cv.getDesconto());
           stmt.setFloat(5, cv.getValor());
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   
       
       
       
   }
       
      public List<cadVendas> ler (){
      
          Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
          ResultSet rs = null;
      
          List<cadVendas> cc = new ArrayList<>();
          
       try {
           stmt = con.prepareStatement("SELECT * FROM lanche");
           rs = stmt.executeQuery();
           
           while (rs.next()) {  
               
               cadVendas cv = new cadVendas();
               cv.setCodigo(rs.getInt("codigo"));
                        
               cv.setLanche(rs.getString("lanche"));          
               cv.setQuantidade(rs.getInt("quantidade"));            
               cv.setDesconto(rs.getFloat("desconto"));
               cv.setValor(rs.getFloat("valor"));
              
           
               cc.add(cv);
               
           }
         
       } catch (SQLException ex) {
            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
      
           ConexaoMysql.closeConnection(con, stmt, rs);
           
       }
       return cc;
      
      }

      
   public void update (cadVendas cv){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("UPDATE lanche SET lanche=?,quantidade=?,desconto=?,valor=? WHERE codigo = ? ");
         
           stmt.setString(1, cv.getLanche());       
           stmt.setInt(2, cv.getQuantidade());
           stmt.setDouble(3, cv.getDesconto());
           stmt.setFloat(4, cv.getValor());
           stmt.setInt(5, cv.getCodigo());
           stmt.executeUpdate();
           
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
   public void delete (cadVendas cv){
      
    Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("DELETE FROM lanche WHERE codigo = ?");
          stmt.setInt(1, cv.getCodigo());
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Excluindo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
}
