public class MainEstrategiaDescontos {
    public static void main(String[] args) {
        GestorDeDescontos gestor = new GestorDeDescontos();
        double precoOriginal = 200.0;

        EstrategiaDesconto fidelidade = new DescontoFidelidade();
        EstrategiaDesconto sazonal = new DescontoSazonal();
        EstrategiaDesconto promocional = new DescontoPromocional();

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto fidelidade: R$" + gestor.aplicarDesconto(fidelidade, precoOriginal));
        System.out.println("Desconto sazonal: R$" + gestor.aplicarDesconto(sazonal, precoOriginal));
        System.out.println("Desconto promocional: R$" + gestor.aplicarDesconto(promocional, precoOriginal));
    }
}
