public class SistemaPagamento {
    public boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        boolean sucesso = metodo.processarPagamento(valor);
        if (sucesso) {
            System.out.println("Taxa aplicada: R$ " + metodo.calcularTaxa(valor));
        }
        return sucesso;
    }
}
