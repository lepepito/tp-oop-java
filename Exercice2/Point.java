public class Point {
    char nom;
    double abscisse;

    public void initialiser(char n, double a) {
        nom = n;
        abscisse = a;
    }

    public void initialiser(Point p) {
        nom = p.nom;
        abscisse = p.abscisse;
    }

    public void affiche() {
        System.out.println("Point " + nom + " (abscisse = " + abscisse + ")");
    }

    public void translate(double deplacement) {
        abscisse = abscisse + deplacement;
    }
}
