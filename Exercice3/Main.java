public class Main {
    public static void main(String[] args) {
        Point p1 = new Point("A", 5.5);
        p1.affiche();
        
        p1.translate(2.0);
        p1.affiche();
    }
}
