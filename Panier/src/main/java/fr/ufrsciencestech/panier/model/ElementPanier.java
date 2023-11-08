package fr.ufrsciencestech.panier.model;

public interface ElementPanier {
    public boolean isSeedless();
    public double getPrix();
    public String getOrigine();
    @Override
    public boolean equals(Object o);
    @Override
    public String toString();

    public String getName();
}
