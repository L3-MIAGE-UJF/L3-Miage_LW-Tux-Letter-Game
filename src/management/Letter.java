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
    
    public Letter(char l, double x, double y){
        setX(x);
        setY(2);
        setZ(y);
        setScale(1);
                
        if ( l == ' '){
            setModel("models/cube/cube.obj");
            this.letter = ' ';
            setTexture("models/cube/cube.png");
        }
        else {
            setModel("models/letter/cube.obj");
            this.letter=l;
            setTexture("models/letter/"+l+".png");
        }
    }    
}
