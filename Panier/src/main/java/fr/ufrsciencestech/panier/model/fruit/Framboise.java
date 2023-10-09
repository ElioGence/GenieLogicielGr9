package fr.ufrsciencestech.panier.model.fruit;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Framboise implements Fruit {
  private double prix;
  private String origine;
  public Framboise() {
    this.prix = 2.5;
    this.origine = "France";
  }
  public Framboise(double prix, String origine) {
    if (prix < 0)
      this.prix = -prix;
    else
      this.prix = prix;
    if (origine.equals(""))
      this.origine = "France";
    else
      this.origine = origine;
  }
  public double getPrix() {
    return prix;
  }
  public void setPrix(double prix) {
    this.prix = prix;
  }
  public String getOrigine() {
    return origine;
  }
  public void setOrigine(String origine) {
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
