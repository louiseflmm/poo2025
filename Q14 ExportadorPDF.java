public class ExportadorPDF implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "Exportando '" + titulo + "' em formato PDF com conteúdo: " + conteudo;
    }
}

public class ExportadorCSV implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "Exportando '" + titulo + "' em formato CSV com conteúdo: " + conteudo;
    }
}

public class ExportadorXML implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "Exportando '" + titulo + "' em formato XML com conteúdo: " + conteudo;
    }
}
