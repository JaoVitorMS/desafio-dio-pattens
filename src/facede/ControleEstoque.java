package facede;

import singleton.Estoque;
import strategy.*;

public class ControleEstoque {
    private Estoque estoque;

    public ControleEstoque() {
        this.estoque = Estoque.getInstance();
    }

    public void adicionarProduto(String produto, int quantidade) {
        estoque.adicionaProduto(produto, quantidade);
    }
    public void removerProduto(String produto) {
        estoque.removerProduto(produto);
    }

    public int verificarQuantidade(String produto) {
        return estoque.verificarQuantidade(produto);
    }

     public double aplicarDesconto(String produto, EstrategiaDesconto desconto, double preco) {
        return desconto.aplicarDesconto(preco);
    }

    public void listaProdutos() {
        estoque.exibirListaProdutos();
    }
}
