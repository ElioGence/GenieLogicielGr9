package fr.ufrsciencestech.panier.model.composite;

import fr.ufrsciencestech.panier.model.composite.ElementComposite;
import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Jus extends ElementComposite {
  public Jus(Fruit... fruits) {
    super(fruits);
  }
  @Override
  public boolean equals(Object o) {
    if (o != null && o instanceof Jus) {
      super.equals(o);
    }
    return false;
  }
  @Override
  public String toString() {
    String str = "Jus de ";
    for (Fruit f : getFruits()) {
      str += f.toString() + ", ";
    }
    return str.substring(0, str.length() - 2);
  }
}
