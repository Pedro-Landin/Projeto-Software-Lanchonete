
package Controlador;

public class cadproduto {
  private int ID;
    private String descricao;
    private int qtd;
    private float preco;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
 }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}