public class GestorDeTransporte {

    public String calcularViagem(Veiculo veiculo, double distancia) {
        double tempo = veiculo.calcularTempo(distancia);
        String combustivel = veiculo.tipoDeCombustivel();
        return "Tempo estimado: " + tempo + " horas | Tipo de combustível: " + combustivel;
    }
}
