import java.util.Date;
import java.util.ArrayList;

public class Membre extends Personne {
  
  protected Date dateAdhesion;
  protected String statut;
  protected ArrayList<Livre> emprunts = new ArrayList<>();

  public Membre(String prenom, String nom, int id, Date dateAdhesion, String statut) {
    super(prenom, nom, id);
    this.dateAdhesion = dateAdhesion;
    this.statut = statut;
  }

  public void emprunter(Livre livre) {
    if (livre.getDisponible()) {
      livre.emprunter();
      emprunts.add(livre);
      System.out.println("Vous empruntez le livre");
    } else {
      System.out.println("Livre indisponible");
    }
  }

  public void retourner(Livre livre) {
    if (emprunts.contains(livre)) {
      livre.retourner();
      emprunts.remove(livre);
      System.out.println("Vous rendez le livre");
    } else {
      System.out.println("vous n'avez pas emprunter ce livre");
    }
  }

  public void afficherDetails() {
    System.out.println("----------------");
    System.out.println("Prenom : "+ this.prenom);
    System.out.println("Nom : "+ this.nom);
    System.out.println("ID : "+ this.id);
    System.out.println("Date adhesion : "+ this.dateAdhesion.toString());
    System.out.println("Statut : "+ this.statut);
    System.out.println("Liste des livres emprunter : ");
    for (Livre emprunt: emprunts) {
      emprunt.afficherDetails();
    }
    System.out.println("----------------");
  }
}
