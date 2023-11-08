package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.composite.Salade;
import fr.ufrsciencestech.panier.model.fruit.Fruit;
import org.junit.Test;
import static org.junit.Assert.*;

public class SaladeTest {

    @Test
    public void testEqualsWithEqualSalades() {
     
        Fruit[] fruits1 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Salade salade1 = new Salade(fruits1);

        
        Fruit[] fruits2 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Salade salade2 = new Salade(fruits2);

        assertTrue(salade1.equals(salade2));
    }
    
    @Test
    public void testEqualsWithDifferentSalades() {
        
        Fruit[] fruits1 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Salade salade1 = new Salade(fruits1);

        
        Fruit[] fruits2 = { new FruitWithPrice(2.0), new FruitWithOrigine("Espagne") };

        Salade salade2 = new Salade(fruits2);

    
        assertFalse(salade1.equals(salade2));
    }

    @Test
    public void testToString() {
    
        Fruit[] fruits = { new FruitWithPrice(2.5)};

        Salade salade = new Salade(fruits);

        assertEquals("2.5€ d'une salade de FruitWithPrice", salade.toString());
    }

    @Test
    public void testGetName() {
        
        Salade salade = new Salade();

        
        assertEquals("Salade", salade.getName());
    }

    private class FruitWithPrice implements Fruit {
        private double price;

        public FruitWithPrice(double price) {
            this.price = price;
        }

        public double getPrix() {
            return price;
        }

        @Override
        public boolean isSeedless() {
            return true;
        }

        @Override
        public String getOrigine() {
            return "Mexique";
        }

        @Override
        public String getName() {
            return "FruiWithPrice";
        }

    }

    private class FruitWithOrigine implements Fruit {
        private String origine;

        public FruitWithOrigine(String origine) {
            this.origine = origine;
        }

        public String getOrigine() {
            return origine;
        }

        @Override
        public boolean isSeedless() {
            return true;
        }

        @Override
        public double getPrix() {
            return 1000;
        }

        @Override
        public String getName() {
            return "FruiWithOrigine";
        }

    
    }
}
