package observer;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private List<Observateur> observateurs = new ArrayList<>();
    private int score;

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void supprimerObservateur(Observateur observateur) {
        observateurs.remove(observateur);
    }

    public void setScore(int score) {
        this.score = score;
        notifierObservateurs();
    }

    private void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(score);
        }
    }
}
