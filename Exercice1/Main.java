public class Main {
    
    public static void main(String[] args) {
        
        Personne etudiant = new Personne();
        
        etudiant.initialiser("AB123456", "Ahmed", "Haloubi", "haloubihmed@email.com", 20);
        
        etudiant.afficherPersonne();
    }
}
