public class Onibus extends Veiculo {
    private final double VELOCIDADE_FIXA = 60.0;

    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_FIXA;
    }
}
