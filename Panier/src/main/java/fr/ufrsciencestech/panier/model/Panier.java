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
      String newLine = System.getProperty("line.separator");
      String res = "Panier de "+this.getelements().size()+" élément(s) : "+this.getPrix()+" euros"+newLine;
      for (int i = 0; i < elements.size(); i++) {
        res += "    "+elements.get(i).toString() + newLine;
      }
      return res;
    }
    
    public ArrayList<ElementPanier> getelements() {
      return this.elements;
    }
    
    public void setelements(ArrayList<ElementPanier> elements) {
        ArrayList<ElementPanier>  oldElement = this.elements;
        this.elements = elements;
        pcs.firePropertyChange("Elements", oldElement, elements);
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
    
    public void ajout(ElementPanier o) throws PanierPleinException, PanierElementPresentException {
        
        ArrayList<ElementPanier>  oldElement = this.elements;
        
        if (elements.size() < contenanceMax) {
            if (!elements.contains(o)) {
                elements.add(o);
            } else {
                throw new PanierElementPresentException();
            }
        } else {
            throw new PanierPleinException();
        }

        pcs.firePropertyChange("Value", oldElement, elements);
    }
    public void retrait(int num){
        if (!this.elements.isEmpty()) {
            ArrayList<ElementPanier>  oldElement = this.elements;
            this.elements.remove(num);
            pcs.firePropertyChange("Value", oldElement, elements);
        }
    }
    
    public void setelement(int i, ElementPanier f) {
        if (i < elements.size()){
            ArrayList<ElementPanier>  oldElement = this.elements;
            elements.set(i, f);
            pcs.firePropertyChange("Value", oldElement, elements);
        }
      
    }
    
    public boolean estVide() {
        return elements.size() == 0;
    }
    
    public boolean estPlein() {
        return elements.size() == contenanceMax;
    }
    
    public void retrait() throws PanierVideException {
        if (elements.size() > 0){
            ArrayList<ElementPanier>  oldElement = this.elements;
            elements.remove(elements.size() - 1);
            pcs.firePropertyChange("Value", oldElement, elements);
        }else
            throw new PanierVideException();
    }
    
    public double getPrix() {
        double prix = 0;
        
        for (int i = 0; i < elements.size(); i++) {
          prix += elements.get(i).getPrix();
        }
        
        return prix;
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
    
    public void boycotteOrigine(String origine) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getOrigine().matches(origine)) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycottePrix(double prix) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getPrix()<=prix) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycotteName(String name) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getName().matches(name)) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycottePrixOrigine(double prix,String origine) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getPrix()<=prix&&elements.get(i).getOrigine().matches(origine)) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycotteNamePrix(String name,double prix) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getName().matches(name)&&elements.get(i).getPrix()<=prix) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycotteNameOrigine(String name, String origine) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getName().matches(name)&&elements.get(i).getOrigine().matches(origine)) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
    
    public void boycotteNamePrixOrigine(String name, double prix, String origine) { // on suppose que l'on spécifie une seule origine
        for (int i = elements.size() - 1; i >= 0; --i) {
            if (elements.get(i).getName().matches(name)&&elements.get(i).getPrix()<=prix&&elements.get(i).getOrigine().matches(origine)) {
                ArrayList<ElementPanier>  oldElement = this.elements;
                elements.remove(i);
                pcs.firePropertyChange("Value", oldElement, elements);
            }
        }
    }
}
