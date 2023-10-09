package fr.ufrsciencestech.panier.model.composite;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Salade extends ElementComposite {
  public Salade(Fruit... fruits) {
    super(fruits);
  }
  @Override
  public boolean equals(Object o) {
    if (o != null && o instanceof Salade) {
      super.equals(o);
    }
    return false;
  }
  @Override
  public String toString() {
    String str = "Salade de ";
    for (Fruit f : getFruits()) {
      str += f.toString() + ", ";
    }
    return str.substring(0, str.length() - 2);
  }
}
