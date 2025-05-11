public class MainSistemaDeGestao {
    public static void main(String[] args) {
        Papel devPapel = () -> "Desenvolvedor";
        Papel designPapel = () -> "Designer";

        MembroEquipe membro1 = new MembroEquipe("Ana", devPapel);
        MembroEquipe membro2 = new MembroEquipe("Carlos", designPapel);

        membro1.adicionarTarefa(new Desenvolvimento("Implementar login"));
        membro2.adicionarTarefa(new Design("Criar layout da tela"));

        System.out.println(membro1.listarTarefas());
        System.out.println(membro2.listarTarefas());
    }
}
