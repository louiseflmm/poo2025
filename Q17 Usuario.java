import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiaisEmprestados.add(material);
    }

    public String listarMateriaisEmprestados() {
        StringBuilder sb = new StringBuilder("Materiais emprestados por " + nome + ":\n");
        for (Material m : materiaisEmprestados) {
            sb.append(m.informarMaterial()).append("\n");
        }
        return sb.toString();
    }
}
