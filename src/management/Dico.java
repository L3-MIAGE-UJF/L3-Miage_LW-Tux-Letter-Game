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
    private ArrayList listLevel1 = new ArrayList();
    private ArrayList listLevel2 = new ArrayList();
    private ArrayList listLevel3 = new ArrayList();
    private ArrayList listLevel4 = new ArrayList();
    private ArrayList listLevel5 = new ArrayList();
    private String pathToDicoFile;
    
    public void Dico(String pathToDicoFile) {
        
    }
    
    public String getWordFromListLevel(int level) {
        
    }
    
    public boolean addWordToDico(int level, String word) {
        
    }
    
    public void getPathToDicoFile() {
        
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