import java.util.ArrayList;
import java.util.Date;

public class Principale {
  public static void main(String[] args) {

    ArrayList<Personne> personnes = new ArrayList<>();

    Membre noah = new Membre("Noah", "Sochand", 0, new Date(), "Super cool");
    Membre maxime = new Membre("Maxime", "Boussin", 1, new Date(), "Pas cool");

    Personne issam = new Employe("Issam", "Complexe", 2, "Arabe", 1);
    Personne krim = new Employe("Krim", "Dur", 3, "Arabe", 2);

    personnes.add(noah);
    personnes.add(maxime);
    personnes.add(issam);
    personnes.add(krim);

    System.out.println(
        "****************************************************************************************************\nTEST PARTIE 1 \n****************************************************************************************************");

    for (Personne personne : personnes) {
      personne.afficherDetails();
    }

    ArrayList<Livre> livres = new ArrayList<>();

    Livre hp1 = new Livre("Harry Potter 1", "JKR", "11", true);
    Livre hp2 = new Livre("Harry Potter 2", "JKR", "12", true);
    Livre hp3 = new Livre("Harry Potter 3", "JKR", "13", false);
    Livre hp4 = new Livre("Harry Potter 4", "JKR", "14", false);
    Livre hp5 = new Livre("Harry Potter 5", "JKR", "15", true);

    livres.add(hp1);
    livres.add(hp2);
    livres.add(hp3);
    livres.add(hp4);
    livres.add(hp5);

    System.out.println(
        "****************************************************************************************************\nTEST PARTIE 2 \n****************************************************************************************************");

    noah.emprunter(livres.get(0));
    noah.emprunter(livres.get(3));

    noah.afficherDetails();

    noah.retourner(hp1);
    noah.retourner(hp5);

  }
}
