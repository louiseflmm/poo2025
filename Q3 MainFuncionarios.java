public class MainFuncionarios {
    public static void main(String[] args) {
        try {
            Empresa empresa = new Empresa();
            empresa.adicionarFuncionario(new Gerente("Ana", 5000, 1000));
            empresa.adicionarFuncionario(new Desenvolvedor("Carlos", 3000, 1.2));
            empresa.adicionarFuncionario(new Estagiario("Lucas", 1500));

            empresa.calcularFolhaDePagamento();
        } catch (SalarioInvalidoException e) {
            System.out.println("Erro ao criar funcionário: " + e.getMessage());
        }
    }
}
