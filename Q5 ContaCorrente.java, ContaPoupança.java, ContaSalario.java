public class ContaCorrente extends Conta {
    private double taxaOperacao = 2.50;

    public ContaCorrente(String titular, double saldoInicial) throws ContaInvalidaException {
        super(titular, saldoInicial);
    }

    public void sacar(double valor) throws ContaInvalidaException {
        double total = valor + taxaOperacao;
        if (saldo < total) throw new ContaInvalidaException("Saldo insuficiente.");
        saldo -= total;
    }
}

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldoInicial) throws ContaInvalidaException {
        super(titular, saldoInicial);
    }

    public void sacar(double valor) throws ContaInvalidaException {
        if (saldo < valor) throw new ContaInvalidaException("Saldo insuficiente.");
        saldo -= valor;
    }

    public void adicionarRendimento(double percentual) {
        saldo += saldo * percentual;
    }
}

public class ContaSalario extends Conta {
    private int saquesRestantes = 2;

    public ContaSalario(String titular, double saldoInicial) throws ContaInvalidaException {
        super(titular, saldoInicial);
    }

    public void sacar(double valor) throws ContaInvalidaException {
        if (saquesRestantes <= 0) throw new ContaInvalidaException("Limite de saques atingido.");
        if (saldo < valor) throw new ContaInvalidaException("Saldo insuficiente.");
        saldo -= valor;
        saquesRestantes--;
    }
}
