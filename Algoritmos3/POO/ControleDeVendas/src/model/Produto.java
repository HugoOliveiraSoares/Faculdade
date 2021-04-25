package model;

public class Produto {

    private String nome;
    private float preco;
    private int codigoDeBarras;
    private int quantidade; // quantidade do produto em estoque.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome ='" + nome + '\'' +
                ", preco =" + preco +
                ", codigoDeBarras =" + codigoDeBarras +
                ", quantidade =" + quantidade +
                '}';
    }
}
