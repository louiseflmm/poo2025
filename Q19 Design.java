public class Design extends Tarefa {
    public Design(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Designando: " + descricao;
    }
}
