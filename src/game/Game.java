/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

import env3d.Env;
import management.*;

/**
 *
 * @author aouna
 */
public class Game {
    static private Env env = new Env();
    static private Room room = new Room();
    static private String mot_a_deviner= "po";
    
    public static void main(String args[]) {
        boolean rejouer;
        LectureClavier lecturec;
         lecturec = new LectureClavier();
        //Instanciate a new Jeu
        do{
            Jeu jeu = new Jeu(mot_a_deviner, env, room);
            //Play the game
            jeu.jouer();
           System.out.println("voulez vous rejouer ? (o/n)");
           rejouer=lecturec.lireOuiNon();
        }while(rejouer);
        env.exit();
    }
       
}
