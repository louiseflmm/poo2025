   public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public void informacoes() {
        System.out.println(marca + " " + modelo + " " + ano + " - Portas: " + numeroDePortas);
    }
}

public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public void informacoes() {
        System.out.println(marca + " " + modelo + " " + ano + " - Guidão: " + tipoDeGuidao);
    }
}
