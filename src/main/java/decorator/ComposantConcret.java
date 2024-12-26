package decorator;

public class ComposantConcret implements Composant {
    @Override
    public void traitement() {
        System.out.println("Traitement principal");
    }
}
