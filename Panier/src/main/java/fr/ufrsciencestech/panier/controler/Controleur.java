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
                vg.ajout();
            if(((Component)e.getSource()).getName().equals("Minus")) 
                vg.retrait();
            if(((Component)e.getSource()).getName().equals("SelectRetraitFruit")) 
                vg.selectRetrait();
            if(((Component)e.getSource()).getName().equals("SelectAddFruit")) 
                vg.selectAdd();
            if(((Component)e.getSource()).getName().equals("CreateFruit")) 
                vg.createFruit();
            if(((Component)e.getSource()).getName().equals("CreatePlat")) 
                vg.createPlat();
            if(((Component)e.getSource()).getName().equals("Boycott")) 
                vg.boycott();
            if(((Component)e.getSource()).getName().equals("ValiderBoycott")) 
                vg.validerBoycott();
            if(((Component)e.getSource()).getName().equals("ValiderCreateFruit")) 
                vg.validerCreateFruit();
            if(((Component)e.getSource()).getName().equals("ValiderCreatePlat")) 
                vg.validerCreatePlat();
            if(((Component)e.getSource()).getName().equals("SelectPlat")) 
                vg.selectPlat();
            if(((Component)e.getSource()).getName().equals("SelectAddPlat")) 
                vg.selectAddPlat();
            if(((Component)e.getSource()).getName().equals("SelectRetraitPlat")) 
                vg.selectRetraitPlat();
            if(((Component)e.getSource()).getName().equals("AjouterFruitPlat")) 
                vg.ajoutFruitPlat();
            if(((Component)e.getSource()).getName().equals("RetirerFruitPlat")) 
                vg.retirerFruitPlat();
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
    
    public VueG getVg() {
        return vg;
    }

    public void setVg(VueG vg) {
        this.vg = vg;
    }
}
