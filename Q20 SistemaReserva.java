public class SistemaReserva implements Reservavel {
    @Override
    public boolean reservar(String data, Rota rota) throws ReservaException {
        if (rota.getVeiculosDisponiveis().isEmpty()) {
            throw new ReservaException("Erro: Nenhum veículo disponível para a rota!");
        }

        System.out.println("Reserva realizada para a data " + data);
        return true;
    }
}
