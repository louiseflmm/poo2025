public class ControleNavio implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Navio iniciando navegação para " + destino;
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Navio ajustando velocidade para " + velocidade + " nós";
    }
}
