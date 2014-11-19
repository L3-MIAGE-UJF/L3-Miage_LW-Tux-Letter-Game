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
    
    public void move_tux(int currentKey){
        int step = 1;
        
        switch (currentKey) {
            case Keyboard.KEY_LEFT:
                this.setRotateY(270);
                if ((this.getX()-step)>0) {
                    this.setX(this.getX() - step);
                }
                else {
                    this.setX(0);
                }
            break;
                
            case Keyboard.KEY_RIGHT:
                this.setRotateY(90);
                if ((this.getX()+step)<50) {
                    this.setX(this.getX() + step);
                }
                else {
                    this.setX(50);
                }
            break;
                
            case Keyboard.KEY_UP:
                this.setRotateY(180);
                if ((this.getZ()-step)>0) {
                    this.setZ(this.getZ() - step);
                }
                else {
                    this.setZ(0);
                }
            break;
                
            case Keyboard.KEY_DOWN:
                this.setRotateY(0);
                if ((this.getZ()+step)<50) {
                    this.setZ(this.getZ() + step);
                }
                else {
                    this.setZ(50);
                }
            break;
                
        }
    }
    
}
    
