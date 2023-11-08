package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.fruit.Framboise;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FramboiseTest {
    @Test
    public void testPrixOrigine() {
        Framboise framboise = new Framboise(2.5, "France");
        assertEquals(2.5, framboise.getPrix(),0000.1);
        assertEquals("France", framboise.getOrigine());
    }

    @Test
    public void testPrixOrigineParDéfaut() {
        Framboise framboise = new Framboise();
        assertEquals(2.5, framboise.getPrix(),0000.1);
        assertEquals("France", framboise.getOrigine());
    }

    @Test
    public void testSetPrix() {
        Framboise framboise = new Framboise();
        framboise.setPrix(3.0);
        assertEquals(3.0, framboise.getPrix(),0000.1);
        framboise.setPrix(-1.0); // Le prix ne doit pas être négatif
        assertEquals(1.0, framboise.getPrix(),0000.1);
    }

    @Test
    public void testSetOrigine() {
        Framboise framboise = new Framboise();
        framboise.setOrigine("Espagne");
        assertEquals("Espagne", framboise.getOrigine());
        framboise.setOrigine("");
        assertEquals("France", framboise.getOrigine()); // Origine par défaut
    }

    @Test
    public void testToString() {
        Framboise framboise = new Framboise(2.5, "France");
        assertEquals("2.5€ de framboise (France)", framboise.toString());
    }

    @Test
    public void testEquals() {
        Framboise framboise1 = new Framboise(2.5, "France");
        Framboise framboise2 = new Framboise(2.5, "France");
        Framboise framboise3 = new Framboise(3.0, "Espagne");
        Framboise autreObjet = new Framboise(2.5, "France");

        assertTrue(framboise1.equals(framboise2));
        assertFalse(framboise1.equals(framboise3));
        assertTrue(framboise1.equals(autreObjet));
        assertFalse(framboise1.equals(""));
    }

    @Test
    public void testIsSeedless() {
        Framboise framboise = new Framboise();
        assertFalse(framboise.isSeedless());
    }

    @Test
    public void testName() {
        Framboise framboise = new Framboise();
        assertEquals("Framboise", framboise.getName());
    }

    @Test
    public void testSetPrixNegative() {
        Framboise framboise = new Framboise();
        framboise.setPrix(-1.0);
        assertEquals(1.0, framboise.getPrix(),0000.1);
    }

    @Test
    public void testSetOrigineEmpty() {
        Framboise framboise = new Framboise();
        framboise.setOrigine("");
        assertEquals("France", framboise.getOrigine());
    }

    @Test
    public void testSetOrigineNull() {
        Framboise framboise = new Framboise();
        framboise.setOrigine("");
        assertEquals("France", framboise.getOrigine());
    }

}
