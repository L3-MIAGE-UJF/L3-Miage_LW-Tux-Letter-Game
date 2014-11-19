/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package management;

import env3d.Env;
import game.Room;
import game.Tux;
import java.util.ArrayList;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author douchetm
 */
public class DevineLeMot {
    private Env env;
    private Tux tux;
    private ArrayList<Letter> letters;
    private int nbLettresRestantes;
    private int temps;
    private Chronometre chrono;
    private boolean finished;
    
    public DevineLeMot(String mot, Env env, Room room) {

        int randomx, randomz;
        Letter letter_courant;
        
        this.tux = new Tux(20,2,25);
        this.env = env;
        chrono = new Chronometre(10);
        letters = new ArrayList<Letter>();
        
        nbLettresRestantes=mot.length();
        
        //Coupez et collez les paramètres caméra et contrôleur par défaut que nous avions déjà fait dans un précédent Tp, et les insérer à la fin du constructeur.

        // Instanciate a room
        env.setRoom(room);
        // Sets up the camera
        env.setCameraXYZ(20, 30, 75);
        env.setCameraPitch(-30);
        // Turn off the default controls
        env.setDefaultControl(false);
        env.addObject(tux);
        
        for (int i = 0; i<mot.length();i++) {
            randomx=(int)(Math.random()*40+1);
            randomz=(int)(Math.random()*50+1);
            letter_courant = new Letter(mot.charAt(i),randomx,randomz);
            letters.add(letter_courant);
            env.addObject(letter_courant);
        }

    }
    
    public void jouer(){
        int e;
        // The main game loop
        finished = false;
        
        while (!finished) {
                         
            // a debuguer et completer pour les autres mouvements
            e=this.env.getKey();
            // Update display
            this.env.advanceOneFrame();
            this.tux.move_tux(e);
            
            //q is for escape key
            if (e == Keyboard.KEY_Q) {
                finished = true;
                System.out.println("INSERT COIN - Partie terminée !");
            }
        }
        // Just a little clean up
        env.exit();
    }
//    
//    public void checkUserKey() {
//        
//    }
//    
//    private Letter tuxMeetsLetter() {
//        
//    }
//    
//    private double distance(Tux tux, Letter letter) {
//        
//    }
//    
//    private boolean collision(Tux tux, Letter letter) {
//        
//    }
//    
//    private int getNbLettresRestantes() {
//        
//    }
//    
//    public int getTemps() {
//        
//    }
}