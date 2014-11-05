/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/**
 *
 * @author aouna
 */
public class Room {
    private int depth;
    private int height;
    private int width;
    private String textureBottom;
    private String textureNorth;
    private String textureEast;
    private String textureWest;
    private String textureTop;
    private String textureSouth;
    
    public Room(){
        this.textureBottom ="textures/skybox/cave/bottom.png";
        this.textureNorth = "textures/skybox/cave/north.png";
        this.textureEast ="textures/skybox/cave/east.png";
        this.textureWest ="textures/skybox/cave/west.png";
        
        
        this.depth = 50;
        this.height = 50;
        this.width = 40;
        
    }
}
