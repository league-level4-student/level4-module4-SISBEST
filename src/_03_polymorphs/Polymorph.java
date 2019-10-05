package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    
    int getX() {
    	return x;
    }
    int getY() {
    	return y;
    }
    void setX(int x) {
    	this.x = x;
    }
    void setY(int y) {
    	this.y = y;
    }
}
