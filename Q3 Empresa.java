import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void calcularFolhaDePagamento() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            try {
                double salario = f.calcularSalario();
                System.out.println(f.nome + ": R$" + salario);
                total += salario;
            } catch (SalarioInvalidoException e) {
                System.out.println("Erro ao calcular salário de " + f.nome + ": " + e.getMessage());
            }
        }
        System.out.println("Total da folha: R$" + total);
    }
}
