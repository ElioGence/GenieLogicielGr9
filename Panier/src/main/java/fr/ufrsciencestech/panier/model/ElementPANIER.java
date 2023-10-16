/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier.model;

/**
 *
 * @author im796713
 */
public class ElementPANIER implements ElementPanier {
    private boolean seedless;
    private double prix;
    private double poids;
    private String origine;
    private String nom;

    public ElementPANIER(String nom, String origine, double prix) {
        this.nom = nom;
        this.prix = prix;
        this.origine = origine;
    }

    @Override
    public boolean isSeedless() {
        return seedless;
    }

    @Override
    public double getPrix() {
        return prix;
    }
    public String getNom() {
    return nom;
    }
   
    @Override
    public double getPoids() {
        return poids;
    }

    @Override
    public String getOrigine() {
        return origine;
    }
   

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementPANIER that = (ElementPANIER) o;

        if (seedless != that.seedless) return false;
        if (Double.compare(that.prix, prix) != 0) return false;
        if (Double.compare(that.poids, poids) != 0) return false;
        return origine.equals(that.origine);
    }

    @Override
    public String toString() {
        return "ElementPanierImpl{" +
                "seedless=" + seedless +
                ", prix=" + prix +
                ", poids=" + poids +
                ", origine='" + origine + '\'' +
                '}';
    }
}
