package decorator;

public class DecoratorApres extends Decorator {
    public DecoratorApres(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement() {
        super.traitement();
        System.out.println("Traitement après");
    }
}
