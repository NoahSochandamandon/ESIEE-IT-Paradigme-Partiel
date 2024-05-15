public class Livre implements Empruntable {
  protected String titre;
  protected String auteur;
  protected String isbn;
  protected boolean disponible;

  public Livre(String titre, String auteur, String isbn, boolean disponible) {
    this.titre = titre;
    this.auteur = auteur;
    this.isbn = isbn;
    this.disponible = disponible;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public String getAuteur() {
    return auteur;
  }

  public void setAuteur(String auteur) {
    this.auteur = auteur;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public boolean getDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public void afficherDetails() {
    System.out.println("----------------");
    System.out.println("Auteur : " + this.auteur);
    System.out.println("Titre : " + this.titre);
    System.out.println("isbn : " + this.isbn);
    if (disponible) {
      System.out.println("Disponibilité : Disponible");
    } else {
      System.out.println("Disponibilité : non disponible");
    }
    System.out.println("----------------");

  }

  @Override
  public void emprunter() {
    if (disponible) {
      setDisponible(false);
      System.out.println("Vous emprunter le livre");
    } else {
      System.out.println("Vous ne pouvez pas emprunter ce livre car il est déjà emprunté");
    }
  }

  @Override
  public void retourner() {
    setDisponible(true);
  }
}
