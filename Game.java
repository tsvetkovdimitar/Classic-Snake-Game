package snakegame;

import java.awt.Dimension;

import javax.swing.JPanel;

public class Game extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 500, HEIGHT = 500;

	public Game(){
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}
}
