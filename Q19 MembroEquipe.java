import java.util.ArrayList;

public class MembroEquipe {
    private String nome;
    private Papel papel;
    private ArrayList<Tarefa> tarefas;

    public MembroEquipe(String nome, Papel papel) {
        this.nome = nome;
        this.papel = papel;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String listarTarefas() {
        StringBuilder sb = new StringBuilder("Tarefas de " + nome + " (" + papel.executarPapel() + "):\n");
        for (Tarefa t : tarefas) {
            sb.append(t.realizarTarefa()).append("\n");
        }
        return sb.toString();
    }
}
