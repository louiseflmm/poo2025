public class MainSistemasdeBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 15);
        Revista revista = new Revista("National Geographic", 7);
        DVD dvd = new DVD("Matrix", 5);

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println("Multa por 4 dias de atraso: R$ " + sistema.calcularMulta(livro, 4));

        System.out.println(sistema.registrarEmprestimo(revista));
        System.out.println("Multa por 3 dias de atraso: R$ " + sistema.calcularMulta(revista, 3));

        System.out.println(sistema.registrarEmprestimo(dvd));
        System.out.println("Multa por qualquer atraso: R$ " + sistema.calcularMulta(dvd, 10));
    }
}
