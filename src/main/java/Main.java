import composite.Cercle;
import composite.Figure;
import composite.GroupeDeFigures;
import composite.Rectangle;
import decorator.Composant;
import decorator.ComposantConcret;
import decorator.DecoratorApres;
import decorator.DecoratorAvant;
import observer.*;
import tm.Plugin;
import tm.PluginFactory;

public class Main {
    public static void main(String[] args) {
        // Test 1 : Composite
        System.out.println("Test Composite:");
        Figure cercle = new Cercle();
        Figure rectangle = new Rectangle();
        GroupeDeFigures groupe = new GroupeDeFigures();
        groupe.ajouter(cercle);
        groupe.ajouter(rectangle);
        groupe.dessiner();

        // Test 2 : Template Method et Factory Method
        System.out.println("\nTest Template et Factory:");
        Plugin plugin = PluginFactory.creerPlugin("Plugin1");
        plugin.operationPrincipale();

        // Test 3 : Decorator
        System.out.println("\nTest Decorator:");
        Composant composant = new ComposantConcret();
        Composant decorAvant = new DecoratorAvant(composant);
        Composant decorApres = new DecoratorApres(decorAvant);
        decorApres.traitement();

        // Test 4 : Observer
        System.out.println("\nTest Observer:");
        Joueur joueur = new Joueur();
        Observateur couloir = new Couloir();
        Observateur camera = new Camera();
        Observateur gardien = new Gardien();
        joueur.ajouterObservateur(couloir);
        joueur.ajouterObservateur(camera);
        joueur.ajouterObservateur(gardien);

        joueur.setScore(10);
        joueur.setScore(20);
    }
}