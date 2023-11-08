package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.ElementPanier;
import fr.ufrsciencestech.panier.model.FabriqueFruit;
import fr.ufrsciencestech.panier.model.fruit.Framboise;
import fr.ufrsciencestech.panier.model.fruit.Orange;
import org.junit.Test;
import static org.junit.Assert.*;

public class FabriqueFruitTest {

    @Test
    public void testCreateOrangeWithDefaultValues() {
        FabriqueFruit fabrique = new FabriqueFruit();
        Orange orange = fabrique.createOrange();

        assertEquals(0.5, orange.getPrix(), 0.001);
        assertEquals("France", orange.getOrigine());
    }

    @Test
    public void testCreateOrangeWithCustomValues() {
        FabriqueFruit fabrique = new FabriqueFruit();
        Orange orange = fabrique.createOrange(0.7, "Italie");

        
        assertEquals(0.7, orange.getPrix(), 0.001);
        assertEquals("Italie", orange.getOrigine());
    }

    @Test
    public void testCreateFramboiseWithDefaultValues() {
        FabriqueFruit fabrique = new FabriqueFruit();
        Framboise framboise = fabrique.createFramboise();

    
        assertEquals(2.5, framboise.getPrix(), 0.001);
        assertEquals("France", framboise.getOrigine());
    }

    @Test
    public void testCreateFramboiseWithCustomValues() {
        FabriqueFruit fabrique = new FabriqueFruit();
        Framboise framboise = fabrique.createFramboise(3.0, "Allemagne");

        assertEquals(3.0, framboise.getPrix(), 0.001);
        assertEquals("Allemagne", framboise.getOrigine());
    }

    @Test
    public void testCreateFruitWithValidName() {
        FabriqueFruit fabrique = new FabriqueFruit();
        ElementPanier fruit = fabrique.createFruit("orange", 0.6, "Maroc");

        assertTrue(fruit instanceof Orange);
        Orange orange = (Orange) fruit;
        assertEquals(0.6, orange.getPrix(), 0.001);
        assertEquals("Maroc", orange.getOrigine());
    }

    @Test
    public void testCreateFruitWithInvalidName() {
        FabriqueFruit fabrique = new FabriqueFruit();
        ElementPanier fruit = fabrique.createFruit("pomme", 1.0, "France");

      
        assertNull(fruit);
    }
}