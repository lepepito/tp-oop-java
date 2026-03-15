public class Personne {
    // 1. Les champs
    String cin;
    String nom;
    String prenom;
    String email;
    int age;

    // 2. La fonction pour initialiser les valeurs
    public void initialiser(String c, String n, String p, String e, int a) {
        cin = c;
        nom = n;
        prenom = p;
        email = e;
        age = a;
    }

    // 3. La fonction pour afficher les informations
    public void afficherPersonne() {
        System.out.println("--- Profil de la personne ---");
        System.out.println("CIN : " + cin);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Âge : " + age + " ans");
        System.out.println("-----------------------------");
    }
}
