package ConexaoMysql;
import java.sql.*;
import java.util.ArrayList;
import Controlador.cadfuncionario;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionarioBD {
public void criar(cadfuncionario p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("INSERT INTO funcionarios (nome,cpf,telefone,celular,email,data,sexo,cargo)VALUE(?,?,?,?,?,?,?,?)");
           
           stmt.setString(1, p.getNome());
           stmt.setString(2, p.getCpf());
           stmt.setString(3, p.getTel());
           stmt.setString(4, p.getCel());
           stmt.setString(5, p.getEmail());
           stmt.setString(6, p.getData());
           stmt.setString(7, p.getSexo());
           stmt.setString(8,p.getCargo());
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao salvar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   
       
       
       
   }
       
      public List<cadfuncionario> ler (){
      
          Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
          ResultSet rs = null;
      
          List<cadfuncionario> funcionarios = new ArrayList<>();
          
       try {
           stmt = con.prepareStatement("SELECT * FROM funcionarios");
           rs = stmt.executeQuery();
           
           while (rs.next()) {  
               
               cadfuncionario funcionario = new cadfuncionario();
               funcionario.setID(rs.getInt("id"));
               funcionario.setNome(rs.getString("nome"));
               funcionario.setCpf(rs.getString("cpf"));
               funcionario.setTel(rs.getString("telefone"));
               funcionario.setCel(rs.getString("celular"));
               funcionario.setEmail(rs.getString("email"));
               funcionario.setData(rs.getString("data"));
               funcionario.setSexo(rs.getString("sexo"));
               funcionario.setCargo(rs.getString("cargo"));
               funcionarios.add(funcionario);
               
           }
         
       } catch (SQLException ex) {
            Logger.getLogger(ConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
      
           ConexaoMysql.closeConnection(con, stmt, rs);
           
       }
       return funcionarios;
      
      }

      
   public void update (cadfuncionario p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("UPDATE funcionarios SET nome = ? ,cpf = ? ,telefone = ?,celular = ?,email = ? ,data =?,sexo = ?, cargo = ? WHERE id = ? ");
           stmt.setString(1, p.getNome());
           stmt.setString(2, p.getCpf());
           stmt.setString(3, p.getTel());
           stmt.setString(4, p.getCel());
           stmt.setString(5, p.getEmail());
           stmt.setString(6, p.getData());
           stmt.setString(7, p.getSexo());
           stmt.setString(8, p.getCargo());
           stmt.setInt(9, p.getID());
           
           
           stmt.executeUpdate();
       
           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
       } catch (SQLException ex) {
         
           JOptionPane.showMessageDialog(null, "Erro ao atualizar!"+ex);
          
       }finally{
         
           ConexaoMysql.closeConnection(con, stmt);
       
       }
   }
   public void delete (cadfuncionario p){
      
      Connection con = ConexaoMysql.getConnection();
       PreparedStatement stmt = null; 
       
       try {
           stmt = con.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
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
