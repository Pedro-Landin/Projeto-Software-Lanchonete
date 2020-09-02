package ConexaoMysql;
import java.sql.*;
import java.util.ArrayList;
import Controlador.cadproduto;
import ConexaoMysql.ConexaoMysql;
import Controlador.cadfuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Controlador.cadproduto;

/**
 *
 * @author henri
 */
public class ProdutoBD {

   
    
   public void create(cadproduto p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("INSERT INTO cad_produto (descricao,quantidade,preco)VALUE(?,?,?)");
           
           stmt.setString(1, p.getDescricao());
           stmt.setInt(2, p.getQtd());
           stmt.setFloat(3,  p.getPreco());
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   
       
       
       
   }
       
      public List<cadproduto> read (){
      
          Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
          ResultSet rs = null;
      
          List<cadproduto> Produtos = new ArrayList<>();
          
       try {
           stmt = con.prepareStatement("SELECT * FROM cad_produto");
           rs = stmt.executeQuery();
           
           while (rs.next()) {  
               
               cadproduto produto = new cadproduto();
               produto.setID(rs.getInt("id"));
               produto.setDescricao(rs.getString("descricao"));
               produto.setQtd(rs.getInt("quantidade"));
               produto.setPreco(rs.getFloat("preco"));
               Produtos.add(produto);
               
           }
         
       } catch (SQLException ex) {
            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
      
           ConexaoMysql.closeConnection(con, stmt, rs);
           
       }
       return Produtos;
      
      }

      
   public void update (cadproduto p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("UPDATE cad_produto SET descricao = ? ,quantidade = ? ,preco = ? WHERE id = ? ");
           stmt.setString(1, p.getDescricao());
           stmt.setInt(2, p.getQtd());
           stmt.setFloat(3, p.getPreco());
           stmt.setInt(4, p.getID());
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
   public void delete (cadproduto p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("DELETE FROM cad_produto WHERE id = ?");
          stmt.setInt(1, p.getID());
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Excluindo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao excluir!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }

}