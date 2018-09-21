/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Primrose
 */
public class Character {
//Fields (Varaiables)
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Color color;
    private int size;
    private String name;
    
    //constructor
    public Character() { //no-args
        x = 0;
        y = 0;
        dx = 0;
        dy = 0;
        color = Color.BLUE;
        size = 20;
        name = "enemy";
    } 
    
    public Character(int x, int y, Color color, int size, String name) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.name = name;
        dx = 0;
        dy = 0;
    }
    
    //Getters
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getSize() {
        return size;
    }
    
    public String getName() {
        return name;
    }
    
    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setDX(int dx) {
        this.dx = dx;
    }
    
    public void setDY(int dy) {
        this.dy = dy;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setName(String name) {
        this.name = name;;
    }
    
    //public methods
    public void draw(Graphics g) {
       g.setColor(color);
       g.fillRect(x, y, size, size);
    }
    
    public void kill(Character c) {
        c.setSize(20);
    }
    
    public void move(int dx, int dy) {
        x += dx * 5;
        y += dy * 5;
    }
    
    public void update() {
        move(dx, dy);
    }
        
    /**
     * Makes the character "bounce" and reverse direction on X axis 
     */
    public void reverseX() {
        dx = -dx;
        move(2 * dx, dy);
    }
    
    /**
     * Makes the character "bounce" and reverse direction on Y axis 
     */
    public void reverseY() {
        dy *= -1;
        move(dy, 2 * dx);
    }
    
    //private methods
    private void grow() {
        //size = (int) (Math.random()*10) - 4;
        size *= 1.05;
    }
    
}