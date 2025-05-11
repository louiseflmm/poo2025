public class MainSistemaDeTransporte {
    public static void main(String[] args) {
        Carro carro = new Carro(5, 100);
        Aviao aviao = new Aviao(150, 800);
        Navio navio = new Navio(300, 40);

        GestorDeTransporte gestor = new GestorDeTransporte();

        System.out.println("Carro:");
        System.out.println(gestor.calcularViagem(carro, 200));

        System.out.println("Avião:");
        System.out.println(gestor.calcularViagem(aviao, 1600));

        System.out.println("Navio:");
        System.out.println(gestor.calcularViagem(navio, 400));
    }
}
