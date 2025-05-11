public class MainAnimais {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(new Cachorro());
        zoo.adicionarAnimal(new Gato());

        zoo.emitirSons();
    }
}
