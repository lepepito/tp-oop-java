public class Etagere {
    Livre[] livres;
    int capacite;
    int nbLivresActuel;

    public Etagere(int capacite) {
        this.capacite = capacite;
        this.livres = new Livre[capacite];
        this.nbLivresActuel = 0;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getNbLivres() {
        return nbLivresActuel;
    }

    public void ajouter(Livre livre) {
        if (nbLivresActuel < capacite) {
            livres[nbLivresActuel] = livre;
            nbLivresActuel++;
        } else {
            System.out.println("L'étagère est pleine.");
        }
    }

    public Livre getLivre(int position) {
        if (position >= 1 && position <= nbLivresActuel) {
            return livres[position - 1];
        }
        return null;
    }

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < nbLivresActuel; i++) {
            if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
                return i + 1;
            }
        }
        return 0;
    }

    public void supprimer(int position) {
        if (position >= 1 && position <= nbLivresActuel) {
            for (int i = position - 1; i < nbLivresActuel - 1; i++) {
                livres[i] = livres[i + 1];
            }
            livres[nbLivresActuel - 1] = null;
            nbLivresActuel--;
        }
    }
}
