/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package management;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author MaximilienD
 */
public class Partie {
    private String date;
    private String mot;
    private int niveau;
    private int trouve;
    private int temps;
    
    public Partie(String date, String mot, int level){
        this.mot= mot;
        this.niveau = level;
        this.date = date;
    }
    
    public Partie(Element domPartie){
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder p = dbFactory.newDocumentBuilder();
        
            Document doc = p.parse("../xml/profil.xml");
            
            System.out.println(doc.getElementsByTagName("game").item(0).getAttributes().item(0));
        } catch (Exception e) {
        }
   }
//    
//    public Element getDomElement(Document doc){
//        
//    }
    
    public void setTrouve(int nbLettresRestantes){
        
    }
        
    public void setTemps(int temps){
        
    }
    
    public int getNiveau(){
        
        return this.niveau;
    }
    
    @Override
    public String toString(){
        
        return "blabla";
    }
}
