package uniandes.dpoo.taller4.GUI;

import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

public class PanelTablero extends JPanel implements ActionListener,MouseMotionListener,MouseListener {
	/*private BufferedImage Imagen_en_memoria;
	private Image fondo = new ImageIcon(getClass().getResource("/images/default.jpg")).getImage();*/
	private PintorCasilla casilla = null;
	private Dimension size = new Dimension(500,500);
	private int numCasillas = 0;
	private int ladoCasillas = 0;
	private Image logo = null;
	
	public PanelTablero(int tamano, Image icono) {
		this.setSize(size);
		this.setVisible(true);
		this.numCasillas = tamano*tamano;
		this.ladoCasillas = tamano;
		this.logo = icono;
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		int alto = size.height/ladoCasillas;
		int ancho = size.width/ladoCasillas;
		int n = 0;
		int xaxis = 0;
		int yaxis = 0;
		while (n < numCasillas){
		RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(xaxis,yaxis,alto,ancho,20,20);
		g2d.draw(rectangle);
		g2d.setPaint( new GradientPaint( xaxis, yaxis, Color.YELLOW, xaxis+ancho, yaxis+alto,Color.ORANGE ) );
		g2d.fill(rectangle);
		g2d.drawImage(logo,xaxis+15,yaxis+15,ancho-30,alto-30,this);
		n++;
		xaxis += ancho;
		if (xaxis == size.width) {
			yaxis += alto;
			xaxis = 0;
		}
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
