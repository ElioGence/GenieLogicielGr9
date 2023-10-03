/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.controler.Controleur;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eg425368
 */
public class VueGraphSwingTest {
    
    public VueGraphSwingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addControleur method, of class VueGraphSwing.
     */
    @Test
    public void testAddControleur() {
        System.out.println("addControleur");
        Controleur c = null;
        VueGraphSwing instance = new VueGraphSwing();
        instance.addControleur(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of propertyChange method, of class VueGraphSwing.
     */
    @Test
    public void testPropertyChange() {
        System.out.println("propertyChange");
        PropertyChangeEvent evt = null;
        VueGraphSwing instance = new VueGraphSwing();
        instance.propertyChange(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInc method, of class VueGraphSwing.
     */
    @Test
    public void testGetInc() {
        System.out.println("getInc");
        VueGraphSwing instance = new VueGraphSwing();
        JButton expResult = null;
        JButton result = instance.getInc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInc method, of class VueGraphSwing.
     */
    @Test
    public void testSetInc() {
        System.out.println("setInc");
        JButton inc = null;
        VueGraphSwing instance = new VueGraphSwing();
        instance.setInc(inc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDec method, of class VueGraphSwing.
     */
    @Test
    public void testGetDec() {
        System.out.println("getDec");
        VueGraphSwing instance = new VueGraphSwing();
        JButton expResult = null;
        JButton result = instance.getDec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDec method, of class VueGraphSwing.
     */
    @Test
    public void testSetDec() {
        System.out.println("setDec");
        JButton dec = null;
        VueGraphSwing instance = new VueGraphSwing();
        instance.setDec(dec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAffiche method, of class VueGraphSwing.
     */
    @Test
    public void testGetAffiche() {
        System.out.println("getAffiche");
        VueGraphSwing instance = new VueGraphSwing();
        JLabel expResult = null;
        JLabel result = instance.getAffiche();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAffiche method, of class VueGraphSwing.
     */
    @Test
    public void testSetAffiche() {
        System.out.println("setAffiche");
        JLabel affiche = null;
        VueGraphSwing instance = new VueGraphSwing();
        instance.setAffiche(affiche);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
