package observer;

public class Gardien implements Observateur {
    @Override
    public void mettreAJour(int score) {
        System.out.println("Gardien notifié : Score = " + score);
    }
}
