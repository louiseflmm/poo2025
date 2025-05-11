import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private ArrayList<Produto> produtosFornecidos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtosFornecidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        StringBuilder sb = new StringBuilder("Produtos fornecidos por " + nome + ":\n");
        for (Produto p : produtosFornecidos) {
            sb.append(p.getNome()).append(" - R$").append(p.getPreco()).append(" - Com desconto: R$")
              .append(String.format("%.2f", p.calcularDesconto())).append("\n");
        }
        return sb.toString();
    }
}
