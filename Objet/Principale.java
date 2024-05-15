import java.util.ArrayList;
import java.util.Date;

public class Principale {
  public static void main(String[] args) {

    ArrayList<Personne> personnes = new ArrayList<>(); 

    Personne noah = new Membre("Noah", "Sochand", 0, new Date(), "Super cool");
    Personne maxime = new Membre("Maxime", "Boussin", 1, new Date(), "Pas cool");

    Personne issam = new Employe("Issam", "Complexe", 2, "Arabe", 1);
    Personne krim = new Employe("Krim", "Dur", 3, "Arabe", 2);

    personnes.add(noah);
    personnes.add(maxime);
    personnes.add(issam);
    personnes.add(krim);

    for (Personne personne: personnes) {
      personne.afficherDetails();
    }
  }
}
