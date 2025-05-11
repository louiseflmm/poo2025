public class DVD extends MaterialBiblioteca {
    public DVD(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return 5.0; // taxa fixa de 5.0 independente dos dias
    }
}
