public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        return valor >= 10;
    }

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
