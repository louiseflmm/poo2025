public class MainVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat", "Uno", 2012, 4);
        Veiculo moto = new Motocicleta("Yamaha", "Fazer", 2020, "Esportivo");

        carro.informacoes();
        moto.informacoes();
    }
}
