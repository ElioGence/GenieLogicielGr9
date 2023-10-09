package fr.ufrsciencestech.panier.model;

public class PanierVideException extends RuntimeException {
  public PanierVideException() {
    super("Suppression impossible car le panier est vide !");
  }
}
