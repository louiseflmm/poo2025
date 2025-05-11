public class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        return estrategia.calcularDesconto(preco);
    }
}
