package fr.ufrsciencestech.panier.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.*;

/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits; // attribut pour stocker les fruits
    private int contenanceMax; // nb maximum d'oranges que peut contenir le panier

    PropertyChangeSupport pcs = new  PropertyChangeSupport(this);
    
    public Panier(int contenanceMax) { // initialise un panier vide ayant une certaine contenance maximale (precisee en
                                       // parametre)
        this.fruits = new ArrayList<Fruit>();
        this.contenanceMax = contenanceMax;
    }

    @Override

    public String toString() { // affichage de ce qui est contenu dans le panier : liste des fruits presents
        String res = "";
        String newLine = System.getProperty("line.separator");
        for (int i = 0; i < fruits.size(); i++) {
            res += fruits.get(i).toString() + newLine;
        }
        return res;
    }

    // groupe 2
    public ArrayList<Fruit> getFruits() { // accesseur du premier attribut

        return this.fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { // modificateur du premier attribut
        this.fruits = fruits;

    }

    public int getTaillePanier() { // accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }

    public int getContenanceMax() { // accesseur du second attribut
        return this.contenanceMax;
    }

    // groupe 3
    public Fruit getFruit(int i) { // accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou
                                   // null s'il n'y a rien a cet emplacement
        return null;
    }

    // groupe 4
    public void ajout(Fruit o) throws PanierPleinException { // ajoute le fruit o a la fin du panier si celui-ci n'est
                                                             // pas plein
        if (fruits.size() < contenanceMax) {
            fruits.add(o);
            pcs.firePropertyChange("value", this.fruits.size()-1, this.fruits.size());
        } else
            throw new PanierPleinException();
    }

    public void ajout() throws PanierPleinException { 
        if (fruits.size() < contenanceMax){
            fruits.add(new Orange());
            pcs.firePropertyChange("value", this.fruits.size()-1, this.fruits.size());
        } else
            throw new PanierPleinException();
    }
    
        // groupe 5
    public void retrait() throws PanierVideException { // retire le dernier fruit du panier si celui-ci n'est pas vide
        if (!fruits.isEmpty()) {
            fruits.remove(fruits.size()-1);
            pcs.firePropertyChange("value", this.fruits.size()-1, this.fruits.size());
        } else 
            throw new PanierVideException();
    }
    
    public void setFruit(int i, Fruit f) { // modificateur du fruit contenu dans le panier a l'emplacement n°i par f
                                           // (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)

    }

    public boolean estVide() { // predicat indiquant que le panier est vide
        return false;
    }

    public boolean estPlein() { // predicat indiquant que le panier est plein
        return false;
    }

    // groupe 6
    public double getPrix() { // calcule le prix du panier par addition des prix de tous les fruits contenus
                              // dedans
        return 0;
    }

    // groupe 7
    public void boycotteOrigine(String origine) {  //supprime du panier tous les fruits provenant du pays origine
    	for(int i = fruits.size()-1; i>= 0; --i) 
    	{
    		if(fruits.get(i).getOrigine().equals(origine))
    		{
                fruits.remove(i);
        	}
        }
    }

    // groupe 8
    @Override
    public boolean equals(Object o) { /// predicat pour tester si 2 paniers sont equivalents : s'ils contiennent
                                      /// exactement les memes fruits
        if (o != null && o instanceof Panier) {
            Panier or = (Panier) o;
            if (this.getTaillePanier() == or.getTaillePanier()) {
                for (int i = 0; i < this.getTaillePanier()-1; i++) {
                    if (!this.getFruit(i).equals(or.getFruit(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
        //A MODIF CAR LE PANIER PEUX ETRE DE TAILLE 3 MAIS N'AVOIR QUE 2 FRUITS
    }

    public void addObserver(PropertyChangeListener l) {
	pcs.addPropertyChangeListener("value", l);
    }
}
