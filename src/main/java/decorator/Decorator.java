package decorator;

public abstract class Decorator implements Composant {
    protected Composant composant;

    public Decorator(Composant composant) {
        this.composant = composant;
    }

    @Override
    public void traitement() {
        composant.traitement();
    }
}
