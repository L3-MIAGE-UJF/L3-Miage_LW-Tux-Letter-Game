/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package management;
import java.util.ArrayList;

/**
 *
 * @author douchetm
 */
public class Dico {
    private ArrayList<String> listLevel1;
    private ArrayList<String> listLevel2;
    private ArrayList<String> listLevel3;
    private ArrayList<String> listLevel4;
    private ArrayList<String> listLevel5;
    private String pathToDicoFile;
    
    public void Dico(String pathToDicoFile) {
        this.pathToDicoFile=pathToDicoFile;
        listLevel1 = new ArrayList<String>();
        listLevel2 = new ArrayList<String>();
        listLevel3 = new ArrayList<String>();
        listLevel4 = new ArrayList<String>();
        listLevel5 = new ArrayList<String>();
    }
    
    public String getWordFromListLevel(int level) {
        int indicerand=0;
        double random = (int) Math.random(); 
        String mot_choisi = "";
                
        switch(level) {
            case 1:
                indicerand= (int) random*listLevel1.size();
                mot_choisi=listLevel1.get(indicerand);
            break;
                
            case 2:
                indicerand= (int) random*listLevel2.size();
                mot_choisi=listLevel2.get(indicerand);
            break;
                
            case 3:
                indicerand= (int) random*listLevel3.size();
                mot_choisi=listLevel3.get(indicerand);
            break;
                
            case 4:
                indicerand= (int) random*listLevel4.size();
                mot_choisi=listLevel4.get(indicerand);
            break;
                
            case 5:
                indicerand= (int) random*listLevel5.size();
                mot_choisi=listLevel5.get(indicerand);
            break;
                
            default:
            break;
        }
        return mot_choisi;
    }
    
    public boolean addWordToDico(int level, String word) {
        boolean retour = true;
        switch(level) {
            case 1:
                listLevel1.add(word);
            break;
                
            case 2:
                listLevel2.add(word);
            break;
                
            case 3:
                listLevel3.add(word);
            break;
                
            case 4:
                listLevel4.add(word);
            break;
                
            case 5:
                listLevel5.add(word);
            break;
                
            default:
                    retour=false;
            break;
        }
        
        return retour;
    }
    
    public String getPathToDicoFile() {
        return this.pathToDicoFile;
    }
}   

/*

    ArrayList al = new ArrayList();
    al.add(12);
    al.add("Une chaîne de caractères !");
    al.add(12.20f);
    al.add('d');
                
    for(int i = 0; i < al.size(); i++)
    {
      System.out.println("donnée à l'indice " + i + " = " + al.get(i));
    }           
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
*/