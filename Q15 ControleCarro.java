public class ControleCarro implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Carro iniciando rota para " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Carro ajustando velocidade para " + velocidade + " km/h";
    }
}
