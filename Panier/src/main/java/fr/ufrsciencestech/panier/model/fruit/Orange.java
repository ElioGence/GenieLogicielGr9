package fr.ufrsciencestech.panier.model.fruit;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Orange implements Fruit {
  private double prix, poids;
  private String origine;
  public Orange() {
    this(0.5, 0.1, "Espagne");
  }
  public Orange(double prix, double poids, String origine) {
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
      this.origine = "Espagne";
    else
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
