package fr.ufrsciencestech.panier.model.fruit;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Framboise implements Fruit {
  private double prix, poids;
  private String origine;
  public Framboise() {
    this(2.5, 0.0035, "France");
  }
  public Framboise(double prix, double poids, String origine) {
    setPrix(prix);
    setPoids(poids);
    setOrigine(origine);
  }
  public double getPrix() {
    return prix;
  }
  public void setPrix(double prix) {
    this.prix = (prix < 0) ? -prix : prix;
  }
  public double getPoids() {
    return poids;
  }
  public void setPoids(double poids) {
    this.poids = (poids < 0) ? -poids : poids;
  }
  public String getOrigine() {
    return origine;
  }
  public void setOrigine(String origine) {
    if (origine.equals(""))
      this.origine = "France";
    else
      this.origine = origine;
  }
  @Override
  public String toString() {
    return "Framboise de " + origine + " a " + prix + " euros";
  }
  @Override
  public boolean equals(Object f) {
    if (f != null && getClass() == f.getClass()) {
      Framboise fr = (Framboise) f;
      return (prix == fr.prix && origine.equals(fr.origine));
    }
    return false;
  }
  public boolean isSeedless() {
    return false;
  }
}
