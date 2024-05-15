public abstract class Personne {

  protected String nom;
  protected String prenom;
  protected int id;

  public Personne(String prenom, String nom, int id) {
    this.prenom = prenom;
    this.nom = nom;
    this.id = id;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public abstract void afficherDetails();

}