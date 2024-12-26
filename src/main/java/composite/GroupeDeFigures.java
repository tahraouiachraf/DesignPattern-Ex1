package composite;

import java.util.ArrayList;
import java.util.List;

public class GroupeDeFigures extends Figure {
    private List<Figure> figures = new ArrayList<>();

    @Override
    public void dessiner() {
        System.out.println("Dessin d'un groupe de figures");
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }

    @Override
    public void ajouter(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void supprimer(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public Figure getChild(int index) {
        return figures.get(index);
    }
}
