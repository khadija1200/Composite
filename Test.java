import java.util.List;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        // Création des fichiers
        Composant fichier1 = new Fichier("fichier1.txt");
        Composant fichier2 = new Fichier("fichier2.txt");
        Composant fichier3 = new Fichier("fichier3.txt");

        // Création des dossiers
        Composant sousDossier1 = new Dossier("Sous-dossier 1");
        Composant sousDossier2 = new Dossier("Sous-dossier 2");
        Composant sousDossier3 = new Dossier("Sous-dossier3");

        // Ajout des fichiers aux dossiers
        ((Dossier) sousDossier1).ajouterComposant(fichier1);
        ((Dossier) sousDossier1).ajouterComposant(fichier2);
        ((Dossier) sousDossier2).ajouterComposant(fichier3);
        ((Dossier) sousDossier3).ajouterComposant(fichier1);
        ((Dossier) sousDossier1).ajouterComposant(sousDossier3);



        // Création du dossier principal
        Composant dossierPrincipal = new Dossier("Dossier principal");
        ((Dossier) dossierPrincipal).ajouterComposant(sousDossier1);
        ((Dossier) dossierPrincipal).ajouterComposant(sousDossier2);

        // Affichage de l'arborescence
        dossierPrincipal.afficherArborescence("");
    }
}