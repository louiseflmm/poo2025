public class Boleto extends MetodoPagamento {
    public Boleto() {
        super(0.05); 
    }

    @Override
    public boolean processarPagamento(double valor) {
        double valorComTaxa = calcularTaxa(valor);
        System.out.println("Pagamento via Boleto realizado. Taxa aplicada: R$ " + valorComTaxa);
        return true;
    }
}
