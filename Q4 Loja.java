import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listarGarantias() {
        for (Produto p : produtos) {
            System.out.println(p.nome + " - Garantia: " + p.calcularGarantia() + " anos");
        }
    }
}
