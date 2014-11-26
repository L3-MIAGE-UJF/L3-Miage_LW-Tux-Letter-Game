/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package management;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Partie {
    private String date;
    private String mot;
    private int niveau;
    private int trouve;
    private int temps;
    
    public Partie(String date, String mot, int level){
        this.mot=mot;
        this.niveau=level;
        this.date=date;
        this.trouve=0;
        this.temps=0;
    }
    
    public Partie(Element domPartie){
        try {
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder p = dbFactory.newDocumentBuilder();
//        
//            Document doc = p.parse("../xml/game.xml");
            
            this.date=domPartie.getAttributes().getNamedItem("date").getTextContent();
            this.niveau=Integer.parseInt(domPartie.getAttributes().getNamedItem("date").getTextContent());
            
            //this.niveau=Integer.parseInt(domPartie.getAttribute("date").getTextContent());
            
            this.mot=domPartie.getElementsByTagName("word").item(0).getAttributes().getNamedItem("date").getTextContent();
            
            //System.out.println(doc.getElementsByTagName("game").item(0).getAttributes().item(0));
            
        } catch (Exception e) {
        }
   }
    /*

    Il y a 2 constructeurs. Celui à trois paramètres permet de construire une nouvelle partie et initialise donc tous les attributs comme il se doit. L'autre constructeur, lui, est utilisé pour permettre la construction et la réinitialisation d'une Partie déjà faites et issue du XML. Ce dernier devra donc à l'aide du doc en paramètre et d'un parsing DOM retrouver les bonnes valeurs et les réinitialiser dans les attributs.
    getDomElement(doc:Document):Element. Cette méthode crée le bloc XML représentant une partie à partir du paramètre doc(pour créer les éléments du XML) et renvoie ce bloc en tant que Element.
    les méthodes setTemps(temps:int):void, getNiveau():int et toString():String qui permettent la gestion des parties.
    setTrouve(nbrLettreRestantes):int qui permet de renvoyer un pourcentage en fonction du nombre de lettres trouvées.

    */
    
    
    public Element getDomElement(Document doc){
        Element retour=null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder p = dbFactory.newDocumentBuilder();
        
            doc = p.parse("../xml/game.xml");
            
            retour=(Element) doc.getElementsByTagName("game").item(0);

        } catch (Exception e) {
            
        }
        return retour;
    }
    
    public void setTrouve(int nbLettresRestantes){
        // Calcul pourcentage de lettre trouvees
        this.trouve=((this.mot.length()-nbLettresRestantes)*100)/this.mot.length();
    }
        
    public void setTemps(int temps){
        this.temps=temps;
    }
    
    public int getNiveau(){
        return this.niveau;
    }
    
    public String toString(){
        return "A la date : "+date+" le mot "+mot+" dans le niveau "+niveau+" possede "+trouve+" % de lettres trouvees au bout de "+temps;
    }
    
    /// Takes a date in XML format (i.e. ????-??-??) and returns a date
    /// in profile format: dd/mm/yyyy
    public static String xmlDateToProfileDate(String xmlDate) {
        String date;
        // récupérer le jour
        date = xmlDate.substring(xmlDate.lastIndexOf("-") + 1, xmlDate.length());
        date += "/";
        // récupérer le mois
        date += xmlDate.substring(xmlDate.indexOf("-") + 1, xmlDate.lastIndexOf("-"));
        date += "/";
        // récupérer l'année
        date += xmlDate.substring(0, xmlDate.indexOf("-"));

        return date;
    }

    public static String profileDateToXmlDate(String profileDate) {
        String date;
        // Récupérer l'année
        date = profileDate.substring(profileDate.lastIndexOf("/") + 1, profileDate.length());
        date += "-";
        // Récupérer  le mois
        date += profileDate.substring(profileDate.indexOf("/") + 1, profileDate.lastIndexOf("/"));
        date += "-";
        // Récupérer le jour
        date += profileDate.substring(0, profileDate.indexOf("/"));

        return date;
    }
}
