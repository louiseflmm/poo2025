public class MainSistemaPagamento {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        ProcessadorPagamento cartao = new ProcessadorCartao();
        ProcessadorPagamento pix = new ProcessadorPix();
        ProcessadorPagamento boleto = new ProcessadorBoleto();

        double valor = 500;

        System.out.println("Pagamento com Cartão:");
        if (sistema.realizarPagamento(cartao, valor)) {
            System.out.println("Pagamento realizado com sucesso.");
        } else {
            System.out.println("Falha no pagamento.");
        }

        System.out.println("\nPagamento com PIX:");
        if (sistema.realizarPagamento(pix, valor)) {
            System.out.println("Pagamento realizado com sucesso.");
        }

        System.out.println("\nPagamento com Boleto:");
        if (sistema.realizarPagamento(boleto, valor)) {
            System.out.println("Pagamento realizado com sucesso.");
        }
    }
}
