import java.util.ArrayList;
import java.util.List;

public class Rota {
    private String origem;
    private String destino;
    private List<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public List<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public String listarVeiculos() {
        StringBuilder sb = new StringBuilder();
        for (Veiculo v : veiculosDisponiveis) {
            sb.append(v.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}
