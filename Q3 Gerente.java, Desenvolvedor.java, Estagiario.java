Gerente.java, Desenvolvedor.java, Estagiario.java


public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) throws SalarioInvalidoException {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

public class Desenvolvedor extends Funcionario {
    private double fatorProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double fatorProdutividade) throws SalarioInvalidoException {
        super(nome, salarioBase);
        this.fatorProdutividade = fatorProdutividade;
    }

    public double calcularSalario() {
        return salarioBase * fatorProdutividade;
    }
}

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) throws SalarioInvalidoException {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
