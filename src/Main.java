
import  facede.*;
import  singleton.*;
import  strategy.*;

public class Main {
    public static void main(String[] args) {
        ControleEstoque controle = new ControleEstoque();

        controle.adicionarProduto("Queijo", 10);
        controle.adicionarProduto("Bananas", 6);
        controle.adicionarProduto("Nutela", 1);
        controle.adicionarProduto("Ovos", 20);

        controle.verificarQuantidade("Ovos");
        EstrategiaDesconto descontoSazonal = new descontoSazonal();
        double aplicarValor = controle.aplicarDesconto("Nutela", descontoSazonal, 25);
        System.out.println("Desconto aplicado: " + descontoSazonal.aplicarDesconto(aplicarValor));

        controle.listaProdutos();
    }
}
