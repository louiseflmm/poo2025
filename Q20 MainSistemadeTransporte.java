public class MainSistemaDeTransporte {
    public static void main(String[] args) {
        Rota rota = new Rota("São Paulo", "Curitiba");

        Veiculo onibus = new Onibus("Ônibus Leito", 50);
        Veiculo carro = new Carro("Carro Sedan", 4);
        Veiculo moto = new Moto("Moto 600cc", 1);

        rota.adicionarVeiculo(onibus);
        rota.adicionarVeiculo(carro);
        rota.adicionarVeiculo(moto);

        System.out.println("Veículos disponíveis:");
        System.out.println(rota.listarVeiculos());

        double distancia = 400.0;
        System.out.println("Tempos estimados:");
        for (Veiculo v : rota.getVeiculosDisponiveis()) {
            System.out.println(v + ": " + v.calcularTempo(distancia) + " horas");
        }

        Reservavel sistema = new SistemaReserva();

        try {
            sistema.reservar("12/05/2025", rota);
        } catch (ReservaException e) {
            System.err.println(e.getMessage());
        }
    }
}
