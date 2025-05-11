public abstract class MetodoPagamento {
    protected double taxa;

    public MetodoPagamento(double taxa) {
        this.taxa = taxa;
    }

    public abstract boolean processarPagamento(double valor);

    public double calcularTaxa(double valor) {
        return valor * taxa;
    }
}
