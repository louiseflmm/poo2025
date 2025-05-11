public class Carro extends Veiculo {
    private final double VELOCIDADE = 80.0;

    public Carro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE;
    }
}
