public class Livre {
    String titre;
    String auteur;
    int nbPages;
    double prix;
    boolean prixFixe;

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = -1;
        this.prixFixe = false;
    }

    public Livre(String titre, String auteur, int nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.prix = prix;
        this.prixFixe = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (this.prixFixe) {
            System.out.println("Erreur : Le prix a déjà été fixé et ne peut plus être modifié.");
        } else {
            this.prix = prix;
            this.prixFixe = true;
        }
    }

    public boolean prixFixe() {
        return this.prixFixe;
    }

    public String toString() {
        if (this.prix == -1) {
            return titre + " de " + auteur + ", " + nbPages + " pages. Prix pas encore donné";
        }
        return titre + " de " + auteur + ", " + nbPages + " pages. Prix : " + prix;
    }

    public int compare(Livre autre) {
        if (this.nbPages == autre.nbPages) {
            return 0;
        } else if (this.nbPages > autre.nbPages) {
            return 1;
        } else {
            return -1;
        }
    }
}
