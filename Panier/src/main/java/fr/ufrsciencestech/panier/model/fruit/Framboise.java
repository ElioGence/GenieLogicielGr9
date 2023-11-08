package fr.ufrsciencestech.panier.model.fruit;

public class Framboise implements Fruit {
    private double prix;
    private String origine;

    public Framboise() {
      this(2.5,  "France");
    }
    
    public Framboise(double prix, String origine) {
      setPrix(prix);
      setOrigine(origine);
    }
    
    public double getPrix() {
      return prix;
    }
    
    public void setPrix(double prix) {
      this.prix = (prix < 0) ? -prix : prix;
    }

    public String getOrigine() {
      return origine;
    }
    
    public void setOrigine(String origine) {
      if (origine.equals(""))
        this.origine = "France";
      else
        this.origine = origine;
    }
    
    @Override
    public String toString() {
      return prix + "€ de framboise (" + origine+")";
    }
    
    @Override
    public boolean equals(Object f) {
      if (f != null && getClass() == f.getClass()) {
        Framboise fr = (Framboise) f;
        return (prix == fr.prix && origine.equals(fr.origine));
      }
      return false;
    }
    
    public boolean isSeedless() {
      return false;
    }
    
    public String getName(){
        return "Framboise";
    }
}
