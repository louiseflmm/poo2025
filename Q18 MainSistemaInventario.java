public class MainSistemaInventario {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Loja X");

        Produto p1 = new Eletronico("TV", 2000);
        Produto p2 = new Alimento("Arroz", 20);
        Produto p3 = new Vestuario("Camiseta", 50);

        fornecedor.adicionarProduto(p1);
        fornecedor.adicionarProduto(p2);
        fornecedor.adicionarProduto(p3);

        System.out.println(fornecedor.listarProdutosFornecidos());
    }
}
