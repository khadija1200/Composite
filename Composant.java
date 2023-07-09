class Fichier implements Composant {
    private String nom;

    public Fichier(String nom) {
        this.nom = nom;
    }

    public void afficherArborescence(String prefix) {
        System.out.println(prefix + "|-- " + nom);
    }
}
