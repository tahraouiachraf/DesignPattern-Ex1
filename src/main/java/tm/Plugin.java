package tm;

public abstract class Plugin {
    public final void operationPrincipale() {
        partie1();
        System.out.println("Partie fixe de l'algorithme");
        partie2();
    }

    protected abstract void partie1();
    protected abstract void partie2();
}
