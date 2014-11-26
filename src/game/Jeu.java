/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package game;

import env3d.Env;
import management.*;
import java.util.ArrayList;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author douchetm
 */
public class Jeu {
    private Env env;
    private boolean finished;
    private boolean first;
    private DevineLeMot devinelemot;
    private int level;
    private Dico dico;
    private LectureClavier lecturec;
    
    private Profile profil;
    
    public Jeu(String mot, Env env, Room room) {
        profil = new Profile("Jack", "11/06/1984");
        
        lecturec = new LectureClavier();
        
        // A modifier ? lire last niveau dans profil 
        
        System.out.println("Entrez le niveau : ");
        this.level=lecturec.lireEntier();
        this.dico= new Dico("../xml/dico.xml");
        this.first=true;
        
        dico.addWordToDico(1, "chose");
        dico.addWordToDico(1, "poid");
        dico.addWordToDico(2, "maison");
        
        mot=dico.getWordFromListLevel(level);
        
        init_env(mot, env, room);
        devinelemot = new DevineLeMot(mot, this.env, room);
    }
    
    public void init_env(String mot, Env env, Room room){
        if (first == true){
            first=false;
            this.env = env;

            //Coupez et collez les paramètres caméra et contrôleur par défaut que nous avions déjà fait dans un précédent Tp, et les insérer à la fin du constructeur.

            // Instanciate a room
            this.env.setRoom(room);
            // Sets up the camera
            this.env.setCameraXYZ(20, 30, 75);
            this.env.setCameraPitch(-30);
            // Turn off the default controls
            this.env.setDefaultControl(false);

        }
        else{
            this.env.restart();
        }
        
    }
    
    public void jouer(){
            // reinitialiser l'interface graphique 
            devinelemot.jouer();
            
    }
}