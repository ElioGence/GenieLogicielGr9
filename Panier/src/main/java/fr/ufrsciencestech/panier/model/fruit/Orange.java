package fr.ufrsciencestech.panier.model.fruit;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Orange implements Fruit {
  private double prix;
  private String origine;
  public Orange() {
    this.prix = 0.5;
    this.origine = "Espagne";
  }
  public Orange(double prix, String origine) {
    if (prix < 0)
      this.prix = -prix;
    else
      this.prix = prix;
    if (origine.equals(""))
      this.origine = "Espagne";
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
    return "Orange de " + origine + " a " + prix + " euros";
  }
  @Override
  public boolean equals(Object o) {
    if (o != null && getClass() == o.getClass()) {
      Orange or = (Orange) o;
      return (prix == or.prix && origine.equals(or.origine));
    }
    return false;
  }
  public boolean isSeedless() {
    return false;
  }
}
