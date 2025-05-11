public class MainRelatorio {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();

        ExportadorRelatorio pdf = new ExportadorPDF();
        ExportadorRelatorio csv = new ExportadorCSV();
        ExportadorRelatorio xml = new ExportadorXML();

        System.out.println(sistema.exportarRelatorio(pdf, "Relatório Vendas", "Conteúdo detalhado de vendas"));
        System.out.println(sistema.exportarRelatorio(csv, "Relatório Produtos", "Lista de produtos e preços"));
        System.out.println(sistema.exportarRelatorio(xml, "Relatório Clientes", "Informações dos clientes"));
    }
}
