package composite;

public abstract class Figure {
    public abstract void dessiner();

    public void ajouter(Figure figure) {
        throw new UnsupportedOperationException();
    }

    public void supprimer(Figure figure) {
        throw new UnsupportedOperationException();
    }

    public Figure getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
