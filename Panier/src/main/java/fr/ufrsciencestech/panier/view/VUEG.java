/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fr.ufrsciencestech.panier.view;
import fr.ufrsciencestech.panier.controler.Controleur;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author im796713
 */
public interface VUEG extends PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt);
    //public void update(Observable m, Object o);
    public void addControleur(Controleur c);
}
