/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import env3d.EnvObject;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author aouna
 */
public class Tux extends EnvObject {
    
    
    public Tux  (double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
        setScale(1);
        setTexture("models/tux/tux.png");
        setModel("models/tux/tux.obj");
    }
    
    /**
     *
     * @param currentKey
     */
    
    
    public void move_tux(int currentKey){
        int step = 10;
        
        switch (currentKey ) {
            case Keyboard.KEY_LEFT:
                this.setRotateY(270);
                this.setX(this.getX() - step);
            break;
                
            case Keyboard.KEY_RIGHT:
                this.setRotateY(90);
                this.setX(this.getX() + step);
            break;
                
            case Keyboard.KEY_UP:
                this.setRotateY(180);
                this.setZ(this.getZ() - step);
            break;
                
            case Keyboard.KEY_DOWN:
                this.setRotateY(0);
                this.setZ(this.getZ() + step);
            break;
                
        }
    }
    
}
    
