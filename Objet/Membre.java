import java.util.Date;

public class Membre extends Personne {
  
  protected Date dateAdhesion;
  protected String statut;

  public Membre(String prenom, String nom, int id, Date dateAdhesion, String statut) {
    super(prenom, nom, id);
    this.dateAdhesion = dateAdhesion;
    this.statut = statut;
  }

  public void afficherDetails() {
    System.out.println("----------------");
    System.out.println("Prenom : "+ this.prenom);
    System.out.println("Nom : "+ this.nom);
    System.out.println("ID : "+ this.id);
    System.out.println("Date adhesion : "+ this.dateAdhesion);
    System.out.println("Statut : "+ this.statut);
    System.out.println("----------------");
  }
}
