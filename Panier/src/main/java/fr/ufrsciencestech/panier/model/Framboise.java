package fr.ufrsciencestech.panier.model;

/**
 *
 * @author ElioGence
 */
public class Framboise implements Fruit {
    private double prix;
    private String origine;
	
    public Framboise() 
    {
        this.prix = 2.5;  //prix en euros
        this.origine="France";
    }
    
    public Framboise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "France";  //France par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Framboise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object f){  //predicat pour tester si 2 oranges sont equivalentes
        if(f != null && getClass() == f.getClass()){
            Framboise fr = (Framboise) f;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }
}
