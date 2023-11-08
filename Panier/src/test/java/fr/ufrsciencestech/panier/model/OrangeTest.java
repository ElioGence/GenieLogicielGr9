package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.fruit.Orange;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OrangeTest {
    @Test
    public void testPrixOrigine() {
        Orange orange = new Orange(0.8, "France");
        double nb = 0.8;
        assertEquals(nb, orange.getPrix(),0.0001);
        assertEquals("France", orange.getOrigine());
    }

    @Test
    public void testPrixOrigineParDéfaut() {
        Orange orange = new Orange();
        double nb = 0.5;
        assertEquals(nb, orange.getPrix(),0.0001);
        assertEquals("France", orange.getOrigine());
    }

    @Test
    public void testSetPrix() {
        Orange orange = new Orange();
        orange.setPrix(0.6);
        assertEquals(0.6, orange.getPrix(),0.0001);
        orange.setPrix(-0.6); // Le prix ne doit pas être négatif
        assertEquals(0.6, orange.getPrix(),0.0001);
    }

    @Test
    public void testSetOrigine() {
        Orange orange = new Orange();
        orange.setOrigine("Espagne");
        assertEquals("Espagne", orange.getOrigine());
        orange.setOrigine("");
        assertEquals("Espagne", orange.getOrigine()); // Origine par défaut
    }

    @Test
    public void testToString() {
        Orange orange = new Orange(0.5, "France");
        assertEquals("0.5€ d'orange (France)", orange.toString());
    }

    @Test
    public void testEquals() {
        Orange orange1 = new Orange(0.5, "France");
        Orange orange2 = new Orange(0.5, "France");
        Orange orange3 = new Orange(0.6, "Espagne");
        Orange autreObjet = new Orange(0.5, "France");

        assertTrue(orange1.equals(orange2));
        assertFalse(orange1.equals(orange3));
        assertTrue(orange1.equals(autreObjet));
    }

    @Test
    public void testIsSeedless() {
        Orange orange = new Orange();
        assertFalse(orange.isSeedless());
    }

    @Test
    public void testName() {
        Orange orange = new Orange();
        assertEquals("Orange", orange.getName());
    }

    @Test
    public void testSetPrixNegative() {
        Orange orange = new Orange();
        orange.setPrix(-0.6);
        double nb = 0.6;
        assertEquals(nb, orange.getPrix(),0.0001);
    }

    @Test
    public void testSetOrigineEmpty() {
        Orange orange = new Orange();
        orange.setOrigine("");
        assertEquals("Espagne", orange.getOrigine());
    }

    @Test
    public void testSetOrigineNull() {
        Orange orange = new Orange();
        orange.setOrigine("");
        assertEquals("Espagne", orange.getOrigine());
    }

}
