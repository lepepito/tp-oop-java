public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        
        // Initialisation et premier affichage
        p1.initialiser('A', 2.5);
        p1.affiche();
        
        // Déplacement (translation) et deuxième affichage
        p1.translate(3.0);
        p1.affiche();
        
        // Bonus : test de la deuxième méthode initialiser
        Point p2 = new Point();
        p2.initialiser(p1);
        System.out.print("Copie -> ");
        p2.affiche();
    }
}
