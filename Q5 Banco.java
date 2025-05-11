import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public void relatorioContas() {
        for (Conta c : contas) {
            System.out.println(c.getTipoConta() + " - " + c.getTitular() + ": R$" + c.getSaldo());
        }
    }
}
