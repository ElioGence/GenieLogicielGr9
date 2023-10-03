/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.controler;

import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.view.*;
import fr.ufrsciencestech.panier.model.PanierPleinException;
import fr.ufrsciencestech.panier.model.PanierVideException;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celine
 */
public class Controleur implements ActionListener {
    private VueG vg;
    private Panier p;
    
    @Override
    public void actionPerformed(ActionEvent e){   //Invoked when an action occurs
        try{
            if(((Component)e.getSource()).getName().equals("Plus")) 
                p.ajout();
            else
                p.retrait(); 
        } catch (PanierPleinException | PanierVideException ex){
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Panier getP() {
        return p;
    }

    public void setP(Panier p) {
        this.p = p;
    }
}
