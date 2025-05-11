public class EditorImagem {
    public static String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.largura + ", Altura: " + imagem.altura + 
               ", Descrição: " + imagem.processar();
    }

    public static void ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        imagem.largura = novaLargura;
        imagem.altura = novaAltura;
    }
}
