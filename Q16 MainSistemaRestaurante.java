public class MainSistemaRestaurante {
    public static void main(String[] args) {
        Prato prato = new Prato("Prato Fitness");

        prato.adicionarIngrediente(new Proteina("Frango", 150));
        prato.adicionarIngrediente(new Carboidrato("Arroz integral", 100));
        prato.adicionarIngrediente(new Tempero("Sal rosa", 5));

        System.out.println(prato.listarIngredientes());

        Preparo preparo = new PratoSimples();
        System.out.println("Modo de preparo: " + preparo.preparar());
    }
}
