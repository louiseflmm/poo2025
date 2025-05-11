public class Pix extends MetodoPagamento {
    public Pix() {
        super(0); 
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix realizado instantaneamente.");
        return true;
    }
}
