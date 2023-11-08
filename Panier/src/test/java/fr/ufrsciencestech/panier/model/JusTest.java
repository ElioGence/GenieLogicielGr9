package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.composite.Jus;
import fr.ufrsciencestech.panier.model.fruit.Fruit;
import org.junit.Test;
import static org.junit.Assert.*;

public class JusTest {
    
    @Test
    public void testEqualsWithEqualJus() {
        Fruit[] fruits1 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Jus jus1 = new Jus(fruits1);

        Fruit[] fruits2 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Jus jus2 = new Jus(fruits2);

        assertTrue(jus1.equals(jus2));
    }
    
    @Test
    public void testEqualsWithDifferentJus() {
        Fruit[] fruits1 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };

        Jus jus1 = new Jus(fruits1);

        Fruit[] fruits2 = { new FruitWithPrice(2.0), new FruitWithOrigine("Espagne") };

        Jus jus2 = new Jus(fruits2);
        
        assertFalse(jus1.equals(jus2));
    }

    @Test
    public void testToString() {
        Fruit[] fruits = { new FruitWithPrice(2.5) };

        Jus jus = new Jus(fruits);

        assertEquals("2.5€ d'un jus de FruitWithPrice", jus.toString());
    }

    @Test
    public void testGetName() {
        Jus jus = new Jus();

        assertEquals("Jus", jus.getName());
    }

    private class FruitWithPrice implements Fruit {
        private double price;

        public FruitWithPrice(double price) {
            this.price = price;
        }

        @Override
        public double getPrix() {
            return price;
        }

        @Override
        public boolean isSeedless() {
            return false;
        }

        @Override
        public String getOrigine() {
            return "Mexique";
        }

        @Override
        public String getName() {
            return "FruitWithPrice";
        }

    
    }

    private class FruitWithOrigine implements Fruit {
        private String origine;

        public FruitWithOrigine(String origine) {
            this.origine = origine;
        }

        @Override
        public String getOrigine() {
            return origine;
        }

        @Override
        public boolean isSeedless() {
            return false;
        }

        @Override
        public double getPrix() {
            return 1000;
        }

        @Override
        public String getName() {
            return "FruitWithOrigine";
        }

    }
}
