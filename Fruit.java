package snakegame;

import java.awt.Color;
import java.awt.Graphics;

public class Fruit {
	
	private int x, y, width, height;

	public Fruit(int x, int y, int tileSize){
		
		this.x = x;
		this.y = y;
		width = tileSize;
		height = tileSize;
		
	}
	
	public void tick(){
		
			
	}
	
	public void draw(Graphics g){
		
		g.setColor(Color.RED);
		g.fillRect(x * width, y * height, width, height);
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
