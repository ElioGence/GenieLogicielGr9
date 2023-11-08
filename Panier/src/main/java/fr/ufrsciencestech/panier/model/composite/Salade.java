package fr.ufrsciencestech.panier.model.composite;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Salade extends ElementComposite {
    
    public Salade(Fruit... fruits) {
      super(fruits);
    }
    
    @Override
    public boolean equals(Object o) {
        boolean res=true;
        if (o != null && o instanceof Salade) {
            res=super.equals(o);
        } else {
            res = false;
        }
        return res;
    }
    
    @Override
    public String toString() {
        String str = this.getPrix()+"€ d'une salade de ";
        for (Fruit f : getFruits()) {
          str += f.getName()+ ", ";
        }
        return str.substring(0, str.length() - 2);
    }
    
    public String getName(){
        return "Salade";
    }
}
