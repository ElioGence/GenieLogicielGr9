/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier.view;
import fr.ufrsciencestech.panier.controler.Controleur;
import fr.ufrsciencestech.panier.model.Panier;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;


/**
 *
 * @author im796713
 */
public class VueGraphswing extends JFrame implements VueG {
    private javax.swing.JButton jButtonPLUS;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JTextArea jTextInfos;
    private javax.swing.JComboBox jComboFruit;
    public VueGraphswing(){
        super ("Panier Fruits");
       
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        this.pack();
        this.setVisible(true);
       
    }
   
    public void addControleur(Controleur c){
        getInc().addActionListener(c);
        getDec().addActionListener(c);
    }
   
   
    //public void update(Observable m, Object compte){     //This method is called whenever the observed object is changed
    //      getAffiche().setText(((Integer) compte).toString());
    //}
    public void propertyChange(PropertyChangeEvent evt){
        Panier p = (Panier) evt.getSource();
        getAfficheFruit().setText(((Integer)p.getTaillePanier()).toString());      
        getAfficheFruit().setText(((Integer)p.getTaillePanier()).toString());

    }

    /**
     * @return the inc
     */
    public JButton getInc() {
        return jButtonPLUS;
    }

    /**
     * @param inc the inc to set
     */
    public void setInc(JButton jButtonPLUS) {
        this.jButtonPLUS = jButtonPLUS;
    }

    /**
     * @return the dec
     */
    public JButton getDec() {
        return jButtonMinus;
    }

    /**
     * @param dec the dec to set
     */
    public void setDec(JButton jButtonMinus) {
        this.jButtonMinus = jButtonMinus;
    }

    /**
     * @return the affiche
     */
    public JTextArea getAfficheFruit() {
        return jTextInfos;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(JTextArea jTextInfos) {
        this.jTextInfos = jTextInfos;
    }
    public JComboBox getAfficheListe() {
        return jComboFruit;
    }

   
    public void setAfficheListe(JComboBox jComboFruit) {
        this.jComboFruit = jComboFruit;
    }
}
