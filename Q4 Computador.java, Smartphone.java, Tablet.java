public class Computador extends Produto {
    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    public int calcularGarantia() {
        return 3;
    }
}

public class Smartphone extends Produto {
    public Smartphone(String nome, double preco) {
        super(nome, preco);
    }

    public int calcularGarantia() {
        return 2;
    }
}

public class Tablet extends Produto {
    public Tablet(String nome, double preco) {
        super(nome, preco);
    }

    public int calcularGarantia() {
        return 1;
    }
}
