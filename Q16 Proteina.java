public class Proteina extends Ingrediente {
    public Proteina(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "Proteína: " + nome + ", " + quantidade + "g de proteínas";
    }
}
