MainSistemaDePagamento.java

public class MainSistemaDePagamento {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        MetodoPagamento cartao = new CartaoCredito(0.015);
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        System.out.println("\n--- Pagamento com Cartão de Crédito ---");
        sistema.efetuarPagamento(cartao, 1000);

        System.out.println("\n--- Pagamento com Pix ---");
        sistema.efetuarPagamento(pix, 1000);

        System.out.println("\n--- Pagamento com Boleto ---");
        sistema.efetuarPagamento(boleto, 1000);
    }
}
