import fr.ufrsciencestech.panier.model.composite.ElementComposite;
import fr.ufrsciencestech.panier.model.fruit.Fruit;
import org.junit.Test;
import static org.junit.Assert.*;


public class ElementCompositeTest {

    @Test
    public void testIsSeedlessWithSeedlessFruits() {
        Fruit[] seedlessFruits = { new SeedlessFruit(), new SeedlessFruit() };
        ElementComposite composite = new ElementCompositeImpl(seedlessFruits);
        assertTrue(composite.isSeedless());
    }

    @Test
    public void testIsSeedlessWithNonSeedlessFruits() {
        Fruit[] nonSeedlessFruits = { new NonSeedlessFruit(), new NonSeedlessFruit() };
        ElementComposite composite = new ElementCompositeImpl(nonSeedlessFruits);
        assertFalse(composite.isSeedless());
    }

    @Test
    public void testIsSeedlessWithMixedFruits() {
        Fruit[] mixedFruits = { new SeedlessFruit(), new NonSeedlessFruit() };
        ElementComposite composite = new ElementCompositeImpl(mixedFruits);
        assertFalse(composite.isSeedless());
    }

    @Test
    public void testGetPrix() {
        Fruit[] fruits = { new FruitWithPrice(1.0), new FruitWithPrice(2.0) };
        ElementComposite composite = new ElementCompositeImpl(fruits);
        assertEquals(3.0, composite.getPrix(), 0.001);
    }

    @Test
    public void testGetOrigine() {
        Fruit[] fruits = { new FruitWithOrigine("France"), new FruitWithOrigine("Espagne"), new FruitWithOrigine("France") };
        ElementComposite composite = new ElementCompositeImpl(fruits);
        assertEquals("[France, Espagne]", composite.getOrigine());
    }

    @Test
    public void testEquals() {
        Fruit[] fruits1 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };
        ElementComposite composite1 = new ElementCompositeImpl(fruits1);

        Fruit[] fruits2 = { new FruitWithPrice(1.0), new FruitWithOrigine("France") };
        ElementComposite composite2 = new ElementCompositeImpl(fruits2);

        assertTrue(composite1.equals(composite2));

        Fruit[] fruits3 = { new FruitWithPrice(2.0), new FruitWithOrigine("Espagne") };
        ElementComposite composite3 = new ElementCompositeImpl(fruits3);

        assertFalse(composite1.equals(composite3));
    }

    private class SeedlessFruit implements Fruit {
        
        public boolean isSeedless() {
            return true;
        }

        @Override
        public double getPrix() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getOrigine() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

       
    }

    
    private class NonSeedlessFruit implements Fruit {
        public boolean isSeedless() {
            return false;
        }

        @Override
        public double getPrix() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getOrigine() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

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
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getOrigine() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public double getPrix() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        
    }

    private class ElementCompositeImpl extends ElementComposite {
        public ElementCompositeImpl(Fruit... fruits) {
            super(fruits);
        }

        @Override
        public String getName() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
