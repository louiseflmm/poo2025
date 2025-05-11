public class MainSistemaImagens {
    public static void main(String[] args) {
        Imagem img1 = new ImagemColorida(1920, 1080);
        Imagem img2 = new ImagemPretoBranco(800, 600);
        Imagem img3 = new ImagemTransparente(500, 500);

        System.out.println(EditorImagem.exibirInformacoes(img1));
        System.out.println(EditorImagem.exibirInformacoes(img2));
        System.out.println(EditorImagem.exibirInformacoes(img3));

        EditorImagem.ajustarImagem(img1, 1024, 768);
        System.out.println("Nova largura x altura da imagem 1: " + img1.calcularTamanho() + " pixels");
    }
}
