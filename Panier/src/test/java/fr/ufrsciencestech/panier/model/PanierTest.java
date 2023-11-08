package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.fruit.Fruit;
import fr.ufrsciencestech.panier.model.fruit.Orange;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PanierTest { 
    
    @Test
    public void testAjoutElement() throws PanierPleinException, PanierElementPresentException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new CustomFruit(10.0, "Origine1");
        ElementPanier element2 = new CustomFruit(15.0, "Origine2");

        panier.ajout(element1);
        assertEquals(1, panier.getTaillePanier());

        panier.ajout(element2);
        assertEquals(2, panier.getTaillePanier());
    }

    @Test
    public void testRetraitElement() throws PanierVideException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new CustomFruit(10.0, "Origine1");

        panier.ajout(element1);
        panier.retrait(0);
        assertEquals(0, panier.getTaillePanier());
    }

    @Test
    public void testBoycotteOrigine() throws PanierVideException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new CustomFruit(10.0, "Origine1");
        ElementPanier element2 = new CustomFruit(5.0, "Origine2");
        ElementPanier element3 = new CustomFruit(7.0, "Origine1");

        panier.ajout(element1);
        panier.ajout(element2);
        panier.ajout(element3);

        panier.boycotteOrigine("Origine1");

        assertEquals(1, panier.getTaillePanier());
        assertEquals("CustomFruit", panier.getelement(0).getName());
    }

    @Test
    public void testEquals() {
        Panier panier1 = new Panier(5);
        Panier panier2 = new Panier(5);

        ElementPanier element1 = new CustomFruit(10.0, "Origine1");
        ElementPanier element2 = new CustomFruit(5.0, "Origine2");

        panier1.ajout(element1);
        panier2.ajout(element1);

        assertTrue(panier1.equals(panier2));

        panier2.ajout(element2);

        assertFalse(panier1.equals(panier2));
    }
    
    private class CustomFruit implements Fruit {
        private double price;
        private String origine;

        public CustomFruit(double price, String origine) {
            this.price = price;
            this.origine = origine;
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
            return origine;
        }

        @Override
        public String getName() {
            return "CustomFruit";
        }

    
    }
}
