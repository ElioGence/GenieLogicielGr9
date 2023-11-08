package fr.ufrsciencestech.panier.model.fruit;

public class Orange implements Fruit {
    private double prix;
    private String origine;
    
    public Orange() {
      this(0.5, "France");
    }

    public Orange(double prix, String origine) {
      setPrix(prix);
      setOrigine(origine);
    }

    @Override
    public double getPrix() {
      return prix;
    }

    public void setPrix(double prix) {
      this.prix = (prix < 0) ? -prix : prix;
    }

    @Override
    public String getOrigine() {
      return origine;
    }
    
    public void setOrigine(String origine) {
      if (origine.equals("")||origine==null)
        this.origine = "Espagne";
      else
        this.origine = origine;
    }
    
    @Override
    public String toString() {
      return  prix + "€ d'orange (" + origine+")";
    }
    
    @Override
    public boolean equals(Object o) {
      if (o != null && getClass() == o.getClass()) {
        Orange or = (Orange) o;
        return (prix == or.prix && origine.equals(or.origine));
      }
      return false;
    }
    
    public boolean isSeedless() {
      return false;
    }
    
    public String getName(){
        return "Orange";
    }
}
