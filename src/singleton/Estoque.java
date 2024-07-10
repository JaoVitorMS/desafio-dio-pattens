package singleton;

import strategy.EstrategiaDesconto;

import java.util.HashMap;

public class Estoque {
    private static Estoque estoque;
    private HashMap<String, Integer> produtos;

    private Estoque() {
        this.produtos = new HashMap<>();
    }
    public static synchronized Estoque getInstance() {
        if ( estoque == null ){
            estoque = new Estoque();
        }
        return estoque;
    }

    public void adicionaProduto(String nome, int quantidade) {
        this.produtos.put(nome, quantidade);
    }

    public void removerProduto(String nome) {
        this.produtos.remove(nome);
    }

    public int verificarQuantidade( String nome){
       return produtos.getOrDefault(nome, 0);

    }

    public void exibirListaProdutos() {
        this.produtos.forEach((nome, quantidade) -> {
            System.out.println(produtos);
        });
    }


}
