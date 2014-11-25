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
        chrono = new Chronometre(20);
        letters = new ArrayList<Letter>();
        
        nbLettresRestantes=mot.length();
        
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
        // The main game loop
        finished = false;
        
        chrono.start();
        
        while (!finished&&letters.size()>0&&chrono.remainsTime()>=0) {
                         
            checkUserKey();
            if (collision(tux,letters.get(0))) {
                env.removeObject(letters.get(0));
                letters.remove(0);
                System.out.println("lettre remove");
            }          
        }

        chrono.stop();
        System.out.println("nombre de lettres restantes:"+letters.size());
        System.out.println("temps restant:"+chrono.remainsTime());
        System.out.println("temps:"+chrono.getHours()+":"+chrono.getMinutes()+":"+chrono.getSeconds());
        
        
        // Just a little clean up
        
    }
//    
    public void checkUserKey() {
          int e;
//        recup touche presse et appelle methode pour le faire bouger
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
   
    private boolean tuxMeetsLetter() {
        return collision(this.tux,letters.get(0));
    }
    
    private double distance(Tux tux, Letter letter) {
        // renvoie distance tux a lettre
        // calcul distance 
        double distance;
        distance = Math.sqrt(((tux.getX()-letter.getX())*(tux.getX()-letter.getX()))+((tux.getZ()-letter.getZ())*(tux.getZ()-letter.getZ())));
        return distance;
    }
    
    private boolean collision(Tux tux, Letter letter) {
        if (distance(tux,letter)==0.0) {
            return true;
        }
        else {
            return false;
        }
    }
//    
//    private int getNbLettresRestantes() {
//        
//    }
//    
//    public int getTemps() {
//        
//    }
}