package fr.ufrsciencestech.panier.model.composite;

import fr.ufrsciencestech.panier.model.fruit.Fruit;

public class Jus extends ElementComposite {
    
    public Jus(Fruit... fruits) {
      super(fruits);
    }
    
    @Override
    public boolean equals(Object o) {
        boolean res=true;
        if (o != null && o instanceof Jus) {
            res=super.equals(o);
        } else {
            res = false;
        }
        return res;
    }
    
    @Override
    public String toString() {
        String str = this.getPrix()+"€ d'un jus de ";
        for (Fruit f : getFruits()) {
          str += f.getName()+ ", ";
        }
        return str.substring(0, str.length() - 2);
    }

    public String getName(){
        return "Jus";
    }
}
