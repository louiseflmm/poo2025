import java.util.List;

public class MainGestaoDeProjetos {
    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        MembroEquipe dev = new Desenvolvedor("Alice", "Projeto X");
        MembroEquipe designer = new Designer("Bob", "Projeto X");
        MembroEquipe gerente = new GerenteDeProjetos("Carol", "Projeto Y");

        gestor.adicionarMembro(dev);
        gestor.adicionarMembro(designer);
        gestor.adicionarMembro(gerente);

        System.out.println("Relatórios Individuais:");
        System.out.println(gestor.exibirRelatorio(dev));
        System.out.println(gestor.exibirRelatorio(designer));
        System.out.println(gestor.exibirRelatorio(gerente));

        System.out.println("\nEquipe do Projeto X:");
        List<MembroEquipe> equipeX = gestor.listarEquipePorProjeto("Projeto X");
        for (MembroEquipe m : equipeX) {
            System.out.println(m.obterDetalhes());
        }
    }
}
