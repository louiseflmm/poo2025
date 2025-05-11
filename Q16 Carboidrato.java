public class Carboidrato extends Ingrediente {
    public Carboidrato(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "Carboidrato: " + nome + ", " + quantidade + "g de carboidratos";
    }
}
