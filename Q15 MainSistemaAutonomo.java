public class MainSistemaAutonomo {
    public static void main(String[] args) {
        SistemaAutonomo sistema = new SistemaAutonomo();

        ControleAutonomo carro = new ControleCarro();
        ControleAutonomo drone = new ControleDrone();
        ControleAutonomo navio = new ControleNavio();

        System.out.println(sistema.navegar(carro, "Centro", 60));
        System.out.println();
        System.out.println(sistema.navegar(drone, "Estação", 80));
        System.out.println();
        System.out.println(sistema.navegar(navio, "Porto Sul", 25));
    }
}
