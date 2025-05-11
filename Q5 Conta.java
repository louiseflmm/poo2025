public abstract class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String titular, double saldoInicial) throws ContaInvalidaException {
        if (saldoInicial < 0) throw new ContaInvalidaException("Saldo inicial negativo!");
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor) throws ContaInvalidaException;

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return this.getClass().getSimpleName();
    }

    public String getTitular() {
        return titular;
    }
}
