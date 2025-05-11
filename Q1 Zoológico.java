import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal a) {
        animais.add(a);
    }

    public void emitirSons() {
        for (Animal a : animais) {
            a.som();
        }
    }
}
