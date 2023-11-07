/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier.view;

import fr.ufrsciencestech.panier.model.Panier;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author eg425368
 */
public class VueConsole implements PropertyChangeListener {

    private String trace;

    public VueConsole() {

    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        Panier p = (Panier) evt.getSource();
        System.out.println(((Integer) p.getTaillePanier()).toString());
    }

}
