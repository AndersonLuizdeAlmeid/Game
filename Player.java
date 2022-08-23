package game.modelo;

import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.event.KeyEvent;

public class Player {
	
	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		this.x = 100;
		this.y = 100;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\PlayerGame.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dy = 3;
		}
		if(codigo == KeyEvent.VK_LEFT) {
			dy = -3;
		}
		if(codigo == KeyEvent.VK_UP) {
			dx = -3;
		}
		if(codigo == KeyEvent.VK_DOWN) {
			dx = 3;
		}		
	}
	
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dy = 0;
		}
		if(codigo == KeyEvent.VK_LEFT) {
			dy = 0;
		}
		if(codigo == KeyEvent.VK_UP) {
			dx = 0;
		}
		if(codigo == KeyEvent.VK_DOWN) {
			dx = 0 ;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	
}
