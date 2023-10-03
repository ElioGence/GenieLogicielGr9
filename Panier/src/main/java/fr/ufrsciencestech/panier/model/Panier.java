package fr.ufrsciencestech.panier.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;


public class Panier {
    private ArrayList<ElementPanier> elements;
    private int contenanceMax;

    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Panier(int contenanceMax) {
        this.elements = new ArrayList<ElementPanier>();
        this.contenanceMax = contenanceMax;
    }

    @Override

    public String toString() {
        String res = "";
        String newLine = System.getProperty("line.separator");
        for (int i = 0; i < elements.size(); i++) {
            res += elements.get(i).toString() + newLine;
        }
        return res;
    }

    public ArrayList<ElementPanier> getelements() {
        return this.elements;
    }

    public void setelements(ArrayList<ElementPanier> elements) {
        this.elements = elements;
    }

    public int getTaillePanier() {
        return this.elements.size();
    }

    public int getContenanceMax() {
        return this.contenanceMax;
    }

    public ElementPanier getelement(int i) {
        if (i < elements.size())
            return elements.get(i);
        else
            return null;
    }

    public void ajout(ElementPanier o) throws PanierPleinException {
        if (elements.size() < contenanceMax)
            elements.add(o);
        else
            throw new PanierPleinException();

    }

    public void setelement(int i, ElementPanier f) {
        if (i < elements.size())
            elements.set(i, f);
    }

    public boolean estVide() {
        return elements.size() == 0;
    }

    public boolean estPlein() {
        return elements.size() == contenanceMax;
    }

    public void retrait() throws PanierVideException {
        if (elements.size() > 0)
            elements.remove(elements.size() - 1);
        else
            throw new PanierVideException();
    }

    public double getPrix() {

        double prix = 0;
        for (int i = 0; i < elements.size(); i++) {
            prix += elements.get(i).getPrix();
        }
        return prix;
    }

    public void boycotteOrigine(String origine) {
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getOrigine().equals(origine)) {
                elements.remove(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Panier) {
            Panier or = (Panier) o;
            if (getTaillePanier() == or.getTaillePanier()) {
                for (int i = 0; i < getTaillePanier(); i++) {
                    if (!getelement(i).equals(or.getelement(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void addObserver(PropertyChangeListener l) {
        pcs.addPropertyChangeListener("value", l);
    }
}
