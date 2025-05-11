public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
