/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package management;


import env3d.EnvObject;
import org.lwjgl.input.Keyboard;

/**
 *
 * @author aouna
 */
public class Letter extends EnvObject {
    private char letter;
    
    Letter(char l, double x, double y){
        setX(x);
        setY(y);
        setScale(1);
        setModel("models/cube/cube.obj");
        if ( l == ' '){
            this.letter = ' ';
            setTexture("models/cube/cube.png");
        
        }
    }
    
}
