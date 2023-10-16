/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fr.ufrsciencestech.panier.view;
import fr.ufrsciencestech.panier.controler.Controleur;
import fr.ufrsciencestech.panier.model.ElementPanier;
import fr.ufrsciencestech.panier.model.ElementPANIER;
import fr.ufrsciencestech.panier.model.Panier;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author im796713
 */
public class VUEGswing extends javax.swing.JFrame implements VUEG{
private JFrame frame;
Panier panier=new Panier(100);
int a=1;
int compteurPanier = 0;
double compteurPrix = 0;


    /**
     * Creates new form VUEGswing
     */
    public VUEGswing() {
        initComponents();
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
    }
            });
        this.pack();
        this.setVisible(true);
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelHaut = new javax.swing.JPanel();
        jButtonaddPanier = new javax.swing.JButton();
        jButtonPLUS = new javax.swing.JButton();
        jComboFruit = new javax.swing.JComboBox<>();
        PanelMilieu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextInfos = new javax.swing.JTextArea();
        PanelBas = new javax.swing.JPanel();
        jButtonMinus = new javax.swing.JButton();
        jComboRetrait = new javax.swing.JComboBox<>();
        Boycott = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setLayout(new java.awt.BorderLayout(3, 0));

        PanelHaut.setLayout(new java.awt.GridLayout(1, 3));

        jButtonaddPanier.setText("+");
        jButtonaddPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddPanierActionPerformed(evt);
            }
        });
        PanelHaut.add(jButtonaddPanier);

        jButtonPLUS.setText("CREATE");
        jButtonPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPLUSActionPerformed(evt);
            }
        });
        PanelHaut.add(jButtonPLUS);

        jComboFruit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Fruit" }));
        PanelHaut.add(jComboFruit);

        PanelPrincipal.add(PanelHaut, java.awt.BorderLayout.NORTH);

        PanelMilieu.setLayout(new java.awt.BorderLayout());

        jTextInfos.setColumns(20);
        jTextInfos.setRows(5);
        jTextInfos.setTabSize(1);
        jScrollPane1.setViewportView(jTextInfos);

        PanelMilieu.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        PanelPrincipal.add(PanelMilieu, java.awt.BorderLayout.CENTER);

        PanelBas.setLayout(new java.awt.GridLayout(1, 3));

        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });
        PanelBas.add(jButtonMinus);

        jComboRetrait.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retrait Fruit" }));
        PanelBas.add(jComboRetrait);

        Boycott.setText("Boycott");
        Boycott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoycottActionPerformed(evt);
            }
        });
        PanelBas.add(Boycott);

        PanelPrincipal.add(PanelBas, java.awt.BorderLayout.SOUTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddPanierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddPanierActionPerformed
        // TODO add your handling code here:
       
        // Récupére l'élément sélectionné dans la JComboBox
    String selectedElement = (String) jComboFruit.getSelectedItem();
    // Recherche l'élément correspondant dans la liste "element" 
    ElementPANIER selectedPANIER = null;
    for (ElementPANIER element : panier.elements) {
        if (element.getNom().equals(selectedElement)) {
            selectedPANIER = element;
            break;
        }
    }
    
  
    // Vérifie si l'élément a été trouvé
    if (selectedPANIER != null) {
        // Ajoute l'élément à la jComboBox jComboRetrait
        jComboRetrait.addItem(selectedElement);
        compteurPanier ++ ;
        compteurPrix= compteurPrix + selectedPANIER.getPrix();
        // Affiche les détails de l'élément dans le jTextArea
       jTextInfos.setText( "Panier de "+ compteurPanier +" fruits :  "+  compteurPrix+" euros\n");
       String message = a + " " + selectedPANIER.getNom() + " de " + selectedPANIER.getOrigine() + " à " + selectedPANIER.getPrix() + " euros\n";
        jTextInfos.append(message);

       //2eme methode non fonctionnel car les infos fruits ne s'ajoutent pas l'une apres l'autre dans le textarea
        /*
        jTextInfos.setText( "Panier de "+ compteurPanier +" fruits :  "+  compteurPrix+" euros\n");
        //newText.append("Panier de ").append(compteurPanier).append(" fruits : ").append(compteurPrix).append(" euros\n");
        newText.append(a).append(" ").append(selectedPANIER.getNom()).append(" de ").append(selectedPANIER.getOrigine()).append(" à ").append(selectedPANIER.getPrix()).append(" euros\n");
        // Définissez le texte mis à jour dans le JTextArea
        jTextInfos.setText(newText.toString());*/
    } else {
        // Gére le cas où l'élément n'a pas été trouvé
        jTextInfos.setText("Élément non trouvé.");
    }
    }//GEN-LAST:event_jButtonaddPanierActionPerformed

    private void jButtonPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPLUSActionPerformed
        // TODO add your handling code here:
        // Création de la fenêtre
     frame = new JFrame("Nouveau Fruit");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fermer uniquement la fenêtre actuelle
    frame.setSize(300, 150);

    // Création des composants
    JLabel labelNom = new JLabel("Nom:");
    final JTextField textFieldNom = new JTextField(20);

    JLabel labelNationalite = new JLabel("Nationalité:");
    final JTextField textFieldNationalite = new JTextField(20);

    JLabel labelPrix = new JLabel("Prix:");
    final JTextField textFieldPrix = new JTextField(20);

    JButton buttonValider = new JButton("Valider");

    // Ajout des composants à la fenêtre
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2));
    panel.add(labelNom);
    panel.add(textFieldNom);
    panel.add(labelNationalite);
    panel.add(textFieldNationalite);
    panel.add(labelPrix);
    panel.add(textFieldPrix);
    panel.add(buttonValider);

    frame.add(panel);


    buttonValider.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nom = textFieldNom.getText();
            String origine = textFieldNationalite.getText();
            String valeur = textFieldPrix.getText();
            double prix = Double.parseDouble(valeur);
            ElementPANIER nouvelElement = new ElementPANIER(nom,origine,prix);
           
            panier.elements.add(nouvelElement);
           
            jComboFruit.addItem(nom);
            frame.dispose();
        }
    });


    frame.setVisible(true);
    }//GEN-LAST:event_jButtonPLUSActionPerformed

    private void BoycottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoycottActionPerformed
        // TODO add your handling code here:
  
     frame = new JFrame("Boycott");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(300, 150);
   
  
    JLabel labelNationalite = new JLabel("Nationalité:");
    final JTextField textFieldNationalite = new JTextField(20);

    JLabel labelFruit = new JLabel("Fruit:");
    final JTextField textFieldFruit = new JTextField(20);
   
    JLabel labelPrix = new JLabel("Prix:");
    final JTextField textFieldPrix = new JTextField(20);

    JButton buttonValider = new JButton("Valider");

  
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2));
    panel.add(labelNationalite);
    panel.add(textFieldNationalite);
    panel.add(labelFruit);
    panel.add(textFieldFruit);
    panel.add(labelPrix);
    panel.add(textFieldPrix);
    panel.add(buttonValider);

    frame.add(panel);

  
    buttonValider.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nationalite = textFieldNationalite.getText();
            //panier.boycotteOrigine(nationalite);
            String fruit = textFieldFruit.getText();
            String prix = textFieldPrix.getText();
           
        }
    });


    frame.setVisible(true);
    }//GEN-LAST:event_BoycottActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        // TODO add your handling code here:
        // Récupére l'élément sélectionné dans la JComboBox jComboRetrait
    String selectedElement = (String) jComboRetrait.getSelectedItem();
// Obtient le texte complet du JTextArea
    String text = jTextInfos.getText();
    // Supprime l'élément sélectionné de la jComboBox jComboRetrait
    jComboRetrait.removeItem(selectedElement);

    
    ElementPANIER selectedPANIER = null;
    for (ElementPANIER element : panier.elements) {
        if (element.getNom().equals(selectedElement)) {
            selectedPANIER = element;
            break;
        }
    }

  
    if (selectedPANIER != null) {
        // Décrémente le compteurPanier et déduit le montant du compteurPrix
        compteurPanier--;
        compteurPrix -= selectedPANIER.getPrix();

        // Met à jour le texte du compteur
        jTextInfos.setText("Panier de " + compteurPanier + " fruits : " + compteurPrix + " euros\n");
    }
    else {
     
        jTextInfos.setText("Élément non trouvé.");
    }
    }//GEN-LAST:event_jButtonMinusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VUEGswing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUEGswing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUEGswing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUEGswing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUEGswing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boycott;
    private javax.swing.JPanel PanelBas;
    private javax.swing.JPanel PanelHaut;
    private javax.swing.JPanel PanelMilieu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonPLUS;
    private javax.swing.JButton jButtonaddPanier;
    private javax.swing.JComboBox<String> jComboFruit;
    private javax.swing.JComboBox<String> jComboRetrait;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextInfos;
    // End of variables declaration//GEN-END:variables
public JButton getInc() {
        return jButtonPLUS;
    }
   
    /**
     * @return the dec
     */
    public JButton getDec() {
        return jButtonMinus;
    }
    /**
     * @param inc the inc to set
     */
    public void setInc(JButton inc) {
        this.jButtonPLUS = inc;
    }

    /**
     * @param dec the dec to set
     */
    public void setDec(JButton dec) {
        this.jButtonMinus = dec;
    }
    /**
     * @return the affiche
     */
    public JTextArea getAffiche() {
        return jTextInfos;
    }

    /**
     * @param affiche the affiche to set
     */
    public void setAffiche(JTextArea affiche) {
        this.jTextInfos = affiche;
    }
   
    public JComboBox getAfficheListe() {
        return jComboFruit;
    }
    public void setAfficheListe(JComboBox listes) {
        this.jComboFruit = listes;
    }
   
    public JComboBox getAfficheListeRetrait() {
        return jComboRetrait;
    }
    public void setAfficheListeRetrait(JComboBox listesretrait) {
        this.jComboRetrait = listesretrait;
    }
   
   
    public void propertyChange(PropertyChangeEvent evt){
        Panier p = (Panier) evt.getSource();
        getAffiche().setText(((Integer)p.getTaillePanier()).toString());
    }

    public void addControleur(Controleur c) {
        getInc().addActionListener(c);
        getDec().addActionListener(c);
    }
}
