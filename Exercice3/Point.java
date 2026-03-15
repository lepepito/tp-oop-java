public class Point {
    String nom;
    double abscisse;

    public Point(String n, double a) {
        nom = n;
        abscisse = a;
    }

    public void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    public void translate(double valeur) {
        abscisse = abscisse + valeur;
    }
}
