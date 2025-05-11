public class MainSistemaDeBiblioteca {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");

        Material livro = new Livro("O Senhor dos Anéis");
        Material revista = new Revista("National Geographic");
        Material dvd = new DVD("Matrix");

        usuario.adicionarMaterial(livro);
        usuario.adicionarMaterial(revista);
        usuario.adicionarMaterial(dvd);

        System.out.println(usuario.listarMateriaisEmprestados());
    }
}
