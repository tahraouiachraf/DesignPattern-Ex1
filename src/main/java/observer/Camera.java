package observer;

public class Camera implements Observateur {
    @Override
    public void mettreAJour(int score) {
        System.out.println("Caméra notifiée : Score = " + score);
    }
}
