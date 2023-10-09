package fr.ufrsciencestech.panier.model.composite;

import java.util.ArrayList;
import fr.ufrsciencestech.panier.model.ElementPanier;
import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class ElementComposite implements ElementPanier {
  private Fruit[] fruits;
  public ElementComposite(Fruit... fruits) {
    this.fruits = fruits;
  }
  public boolean isSeedless() {
    for (Fruit f : fruits) {
      if (!f.isSeedless()) {
        return false;
      }
    }
    return true;
  }
  public double getPrix() {
    double prix = 0;
    for (Fruit f : fruits) {
      prix += f.getPrix();
    }
    return prix;
  }
  public double getPoids() {
    double poids = 0;
    for (Fruit f : fruits) {
      poids += f.getPoids();
    }
    return poids;
  }
  public Fruit[] getFruits() {
    return fruits;
  }
  public String getOrigine() {
    ArrayList<String> origines = new ArrayList<String>();
    for (Fruit f : fruits) {
      if (!origines.contains(f.getOrigine())) {
        origines.add(f.getOrigine());
      }
    }
    return origines.toString();
  }
  @Override
  public boolean equals(Object o) {
    if (o != null && o instanceof ElementComposite) {
      ElementComposite e = (ElementComposite) o;
      Fruit[] ef = e.getFruits();
      if (getFruits().length != ef.length) {
        return false;
      }
      for (int i = 0; i < fruits.length; i++) {
        if (!fruits[i].equals(ef[i])) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  @Override
  public String toString() {
    String str = "Mélange de ";
    for (Fruit f : getFruits()) {
      str += f.toString() + ", ";
    }
    return str.substring(0, str.length() - 2);
  }
}
