
package Controlador;

public class cadcliente {
    private String nome,email,sexo,telefone;
    private int ID;
    
    public cadcliente()
    {
        nome=null;
        email=null;
        sexo=null;
        telefone=null;
        ID=0;
    }
    
    public cadcliente(String nome,String email,String sexo,String telefone, int ID)
    {
        this.nome=nome;
        this.email=email;
        this.sexo=sexo;
        this.telefone=telefone;
        this.ID=ID;
    }
    public String getNome()
   {
     return nome;  
   }
   public void setNome(String nome)
   {
      this.nome=nome;
   }       
    public String getEmail()
   {
     return email;  
   }
   public void setEmail(String email)
   {
     this.email=email;
   } 
    public String getSexo()
   {
     return sexo;  
   }
   public void setSexo(String sexo)
   {
      this.sexo=sexo;
   } 
 public String getTelefone()
   {
     return telefone;  
   }
   public void setTelefone(String telefone)
   {
     this.telefone=telefone;  
   } 
    public int getID()
   {
     return ID;  
   }
   public void setID(int ID)
   {
     this.ID=ID;  
   } 
}
