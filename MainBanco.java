public class MainBanco {
    public static void main(String[] args) {
        try {
            Banco banco = new Banco();

            ContaCorrente cc = new ContaCorrente("Ana", 1000);
            cc.sacar(100);

            ContaPoupanca cp = new ContaPoupanca("Bruno", 2000);
            cp.adicionarRendimento(0.05);

            ContaSalario cs = new ContaSalario("Carlos", 1500);
            cs.sacar(200);
            cs.sacar(200); // 2 saques permitidos

            banco.adicionarConta(cc);
            banco.adicionarConta(cp);
            banco.adicionarConta(cs);

            banco.relatorioContas();

        } catch (ContaInvalidaException e) {
            System.out.println("Erro bancário: " + e.getMessage());
        }
    }
}
