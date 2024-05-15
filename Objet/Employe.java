public class Employe extends Personne {

  protected String poste;
  protected double salaire;

  public Employe(String prenom, String nom, int id, String poste, double salaire) {
    super(prenom, nom, id);
    this.poste = poste;
    this.salaire = salaire;
  }

  public String getPoste() {
    return poste;
  }

  public void setPoste(String poste) {
    this.poste = poste;
  }

  public double getSalaire() {
    return salaire;
  }

  public void setSalaire(double salaire) {
    this.salaire = salaire;
  }

  public void afficherDetails() {
    System.out.println("----------------");
    System.out.println("Prenom : " + this.prenom);
    System.out.println("Nom : " + this.nom);
    System.out.println("ID : " + this.id);
    System.out.println("Poste : " + this.poste);
    System.out.println("Salaire : " + this.salaire);
    System.out.println("----------------");
  }
  
}
