public class SistemaPagamento {
    public boolean realizarPagamento(ProcessadorPagamento processador, double valor) {
        if (!processador.autorizarPagamento(valor)) {
            System.out.println("Pagamento não autorizado.");
            return false;
        }
        return processador.processarPagamento(valor);
    }
}
