public class Moto extends Veiculo {
    private final double VELOCIDADE = 100.0;

    public Moto(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE;
    }
}
