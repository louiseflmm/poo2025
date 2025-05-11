public class CartaoCredito extends MetodoPagamento {
    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (taxa < 0.02) {
            System.out.println("Pagamento com Cartão de Crédito aprovado.");
            return true;
        }
        System.out.println("Pagamento com Cartão de Crédito recusado. Taxa muito alta.");
        return false;
    }
}
