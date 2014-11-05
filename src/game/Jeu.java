/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import env3d.Env;

/**
 *
 * @author aouna
 */
public class Jeu {
    private Env env;
    private boolean finished;
    private Tux tux;
    
    public Jeu(){
    // Create the new environment.  Must be done in the same
    // method as the game loop
    env = new Env();
    // Instanciate a room
    Room room;
    room = new Room();
    env.setRoom(room);
    // Sets up the camera
    env.setCameraXYZ(20, 30, 75);
    env.setCameraPitch(-30);
    // Turn off the default controls
    env.setDefaultControl(false);
 
    //initialize
    finished = false;
    }
        
        
    public void jouer (){
             // The main game loop
        finished = false;
        while (!finished) {
            //1 is for escape key
            if (env.getKey() == 1) {
                finished = true;
            }
            // Update display
            env.advanceOneFrame();
        }
        // Just a little clean up
        env.exit();
    }
         
    
}
