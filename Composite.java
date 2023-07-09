import java.util.List;
import java.util.ArrayList;

class Dossier implements Composant {

    private String nom;
    private List<Composant> listeComposants = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public void ajouterComposant(Composant c) {
        listeComposants.add(c);
    }

    public static final char BOTTOM_LEFT_CORNER = '\u2514';

           
    public void afficherArborescence(String prefix) {
        System.out.println(prefix + BOTTOM_LEFT_CORNER + nom + "/");
        prefix += "    ";

        if (listeComposants != null) {
            for (int i = 0; i < listeComposants.size(); i++) {
                Composant composant=listeComposants.get(i);

                if (i == listeComposants.size() - 1) {
                    composant.afficherArborescence(prefix + "    ");
                } else {
                    composant.afficherArborescence(prefix + "│   ");
                }
            }
        }
    }
}