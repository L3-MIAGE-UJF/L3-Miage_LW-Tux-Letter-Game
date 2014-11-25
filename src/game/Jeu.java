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
    
    public Jeu(String mot, Env env, Room room) {
        lecturec = new LectureClavier();
        
        this.first=true;
                
        System.out.println("Entrez le niveau : ");
        this.level=lecturec.lireEntier();      
        
        this.dico= new Dico("lol");
        dico.addWordToDico(1, "truc");
        dico.addWordToDico(1, "pilili");
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
        devinelemot.jouer();
    }
}