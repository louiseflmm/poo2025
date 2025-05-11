public class ControleDrone implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Drone decolando e navegando para " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Drone ajustando velocidade para " + velocidade + " km/h";
    }
}
