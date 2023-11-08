import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PanierTest { 
    public void testAjoutElement() throws PanierPleinException, PanierElementPresentException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new ElementPanier("Item1", 10.0, "Origine1");
        ElementPanier element2 = new ElementPanier("Item2", 15.0, "Origine2");

        panier.ajout(element1);
        assertEquals(1, panier.getTaillePanier());

        panier.ajout(element2);
        assertEquals(2, panier.getTaillePanier());
    }

    public void testRetraitElement() throws PanierVideException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new ElementPanier("Item1", 10.0, "Origine1");

        panier.ajout(element1);
        panier.retrait(0);
        assertEquals(0, panier.getTaillePanier());
    }

    public void testBoycotteOrigine() throws PanierVideException {
        Panier panier = new Panier(5);
        ElementPanier element1 = new ElementPanier("Item1", 10.0, "Origine1");
        ElementPanier element2 = new ElementPanier("Item2", 5.0, "Origine2");
        ElementPanier element3 = new ElementPanier("Item3", 7.0, "Origine1");

        panier.ajout(element1);
        panier.ajout(element2);
        panier.ajout(element3);

        panier.boycotteOrigine("Origine1");

        assertEquals(1, panier.getTaillePanier());
        assertEquals("Item2", panier.getelement(0).getName());
    }

    public void testEquals() {
        Panier panier1 = new Panier(5);
        Panier panier2 = new Panier(5);

        ElementPanier element1 = new ElementPanier("Item1", 10.0, "Origine1");
        ElementPanier element2 = new ElementPanier("Item2", 5.0, "Origine2");

        panier1.ajout(element1);
        panier2.ajout(element1);

        assertFalse(panier1.equals(panier2));

        panier2.ajout(element2);
        panier1.ajout(element2);

        assertTrue(panier1.equals(panier2));
    }

}
