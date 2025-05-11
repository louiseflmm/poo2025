public class MainLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.adicionarProduto(new Computador("Dell XPS", 5000));
        loja.adicionarProduto(new Smartphone("iPhone", 7000));
        loja.adicionarProduto(new Tablet("Samsung Galaxy Tab", 2000));

        loja.listarGarantias();
    }
}
