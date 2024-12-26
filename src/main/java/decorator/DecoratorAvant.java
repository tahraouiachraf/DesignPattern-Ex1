package decorator;

public class DecoratorAvant extends Decorator {
    public DecoratorAvant(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        System.out.println("Traitement avant");
        super.traitement();
    }
}