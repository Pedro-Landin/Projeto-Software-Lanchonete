
package Controlador;

import java.util.logging.Logger;

public class cadVendas {
  private String lanche,nomecliente;  
  private int codigo,quantidade;
  private float desconto,valor;
   public cadVendas()
    {
        lanche=null;
        codigo=0;
        quantidade=0;
        desconto=0;
        valor=0;
        nomecliente=null;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
 

    public String getNomecliente() {
        return nomecliente;
    }
 

    public cadVendas(String lanche, int codigo, int quantidade, float desconto, float valor) {
        this.lanche = lanche;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.valor = valor;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getLanche() {
        return lanche;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public float getValor() {
        return valor;
    }
}
