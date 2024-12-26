package observer;

public class Couloir implements Observateur {
    @Override
    public void mettreAJour(int score) {
        System.out.println("Couloir notifié : Score = " + score);
    }
}
