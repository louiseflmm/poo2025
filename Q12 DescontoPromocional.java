public class DescontoPromocional implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double preco) {
        return preco - 20.0;
    }
}
