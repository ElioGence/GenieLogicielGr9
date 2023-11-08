/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import fr.ufrsciencestech.panier.controler.Controleur;
import fr.ufrsciencestech.panier.model.Panier;
import fr.ufrsciencestech.panier.view.VueConsole;
import fr.ufrsciencestech.panier.view.*;    

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMVC {
    
    private VueG vueG;
    private Panier panier;
    private VueConsole vueC;
    private Controleur controlSimple;
    
    public TestMVC(){
        //vueG = new VueGraphSwing() ;
        vueG = new VueGSwing();
        controlSimple = new Controleur();
        panier = new Panier(10);
        VueConsole vuec = new VueConsole();

        controlSimple.setP(panier);   
        controlSimple.setVg(vueG);
        
        panier.addObserver(vueG);        
        panier.addObserver(vuec);
        vueG.addControleur(controlSimple);
    }
    
    public VueG getVueG() { //pour java bean
        return vueG; 
    }
    
    public void setVueG(VueG vueG) { //pour java bean
        this.vueG = vueG; 
    }
    
    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier p) {
        this.panier = p;
    }

    public VueConsole getVueC() {
        return vueC;
    }

    public void setVueC(VueConsole vueC) {
        this.vueC = vueC;
    }

    public Controleur getControlSimple() {
        return controlSimple;
    }

    public void setControlSimple(Controleur controlSimple) {
        this.controlSimple = controlSimple;
    }
    
    public static void main(String[] args){
        TestMVC test = new TestMVC(); 
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestMVC test = (TestMVC)context.getBean("MVC");
        test.setControlSimple((Controleur) context.getBean("Controleur"));
        test.setVueG( (VueG) context.getBean("Vue"));
        
        Panier p= new Panier(10);
        test.setPanier(p);
        test.getControlSimple().setP(test.getPanier());
        
        test.getPanier().addObserver(test.getVueG());
        test.getVueG().addControleur(test.getControlSimple());
        
        VueConsole vuec = new VueConsole();
        test.getPanier().addObserver(vuec);
        */
    }

}
