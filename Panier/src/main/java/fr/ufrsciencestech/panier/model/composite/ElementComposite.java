package fr.ufrsciencestech.panier.model.composite;

import java.util.ArrayList;
import fr.ufrsciencestech.panier.model.ElementPanier;
import fr.ufrsciencestech.panier.model.fruit.Fruit;

public abstract class ElementComposite implements ElementPanier {
    
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
        boolean res = true;
        if (o != null) {
            ElementComposite e = (ElementComposite) o;
            Fruit[] ef = e.getFruits();
            if (getFruits().length != ef.length) {
              res = false;
            }
            for (int i = 0; i < fruits.length; i++) {
                if (!fruits[i].equals(ef[i])) {
                  res = false;
                }
            }
        }
        return res;
    }
    
}
