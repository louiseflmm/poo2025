public abstract class Funcionario implements ICalculavel {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) throws SalarioInvalidoException {
        if (salarioBase < 0) {
            throw new SalarioInvalidoException("Salário base não pode ser negativo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
}
