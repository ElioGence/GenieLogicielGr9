/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier.model;

import fr.ufrsciencestech.panier.model.composite.Jus;
import fr.ufrsciencestech.panier.model.composite.Salade;
import fr.ufrsciencestech.panier.model.fruit.Framboise;
import fr.ufrsciencestech.panier.model.fruit.Fruit;
import fr.ufrsciencestech.panier.model.fruit.Orange;
import java.util.ArrayList;

/**
 *
 * @author Rauhnos
 */
public class FabriqueFruit {

    public FabriqueFruit() {
    }
    
    public Orange createOrange(){
        Orange res = new Orange();
        return res;
    }
    
    public Orange createOrange(double prix, String origine){
        if (origine.equals("")) origine="France";
        Orange res = new Orange(prix,origine);
        return res;
    }
    
    public Framboise createFramboise(){
        Framboise res = new Framboise();
        return res;
    }
    
    public Framboise createFramboise(double prix, String origine){
        if (origine.equals("")) origine="France";
        Framboise res = new Framboise(prix,origine);
        return res;
    }
    
    public ElementPanier createFruit(String nom, double prix, String origine){
        ElementPanier res;
        
        switch(nom.toLowerCase()){
            case "orange":
                res=createOrange(prix,origine);
                break;
            case "framboise":
                res=createFramboise(prix,origine);
                break;
            default:
                res=null;
                break;
        }
        
        return res;
    }

    public ElementPanier createPlat(String nomPlat, ArrayList<ElementPanier> listeFruitPlat) {
        ElementPanier res;
        
        switch(nomPlat.toLowerCase()){
            case "jus":
                res=createJus(listeFruitPlat);
                break;
            case "salade":
                res=createSalade(listeFruitPlat);
                break;
            default:
                res=null;
                break;
        }
        
        return res;
    }

    private Jus createJus(ArrayList<ElementPanier> listeFruitPlat) {
        Fruit[] fruit = (Fruit[]) listeFruitPlat.toArray(new Fruit[0]);
        Jus res = new Jus(fruit);
        return res;
    }

    private Salade createSalade(ArrayList<ElementPanier> listeFruitPlat) {
        Fruit[] fruit = (Fruit[]) listeFruitPlat.toArray(new Fruit[0]);
        Salade res = new Salade(fruit);
        return res;
    }
}
