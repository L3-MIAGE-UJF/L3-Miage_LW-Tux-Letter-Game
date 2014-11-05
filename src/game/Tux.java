/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import env3d.EnvObject;

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
        setTexture("models/tux.png");
        setModel("models/tux/tux.obj");
    }
    
}
