package uniandes.dpoo.taller4.GUI;

import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

//Para que pueda cambiar dependiendo de un evento, debe ser un ActionListener
public class PanelTablero extends JPanel implements ActionListener,MouseMotionListener,MouseListener {
	private PintorCasilla casilla = null;
	private Dimension size = new Dimension(500,500);
	private int ladoCasillas = 0;
	private Image logo = null;
	private interfazLightsOut interfaz = null;
	
	public PanelTablero(Image icono, interfazLightsOut interf, int tamano) {
		this.setSize(size);
		this.setVisible(true);
		this.ladoCasillas = tamano;
		this.logo = icono;
		this.interfaz = interf;
		//addMouseMotionListener(this);
		//addMouseListener(this);
	}
	
	public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			
			int alto = size.height/ladoCasillas;
			int ancho = size.width/ladoCasillas;
			int fila = 1;
			int columna = 1;
			int xaxis = 0;
			int yaxis = 0;
			while (columna <= ladoCasillas && fila <= ladoCasillas){
				RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(xaxis,yaxis,alto,ancho,20,20);
				g2d.draw(rectangle);
				g2d.setPaint( new GradientPaint( xaxis, yaxis, Color.YELLOW, xaxis+ancho, yaxis+alto,Color.ORANGE ) );
				g2d.fill(rectangle);
				g2d.drawImage(logo,xaxis+15,yaxis+15,ancho-30,alto-30,this);
				xaxis += ancho;
				if (columna == ladoCasillas) {
					yaxis += alto;
					xaxis = 0;
					columna = 1;
					fila ++;
				}
				else {columna++;}
			}
		}
	
	//Actualiza el número de casillas y re pinta el tablero
	public void actualizarTamanoTablero(int n) {
		this.ladoCasillas = n;
		repaint();
		
	}

	//Cuando reciba o "escuche" un evento (en este caso, proviene de la caja del panel superior) va a hacer lo que diga dentro del método
	@Override
	public void actionPerformed(ActionEvent e) {
		/*El evento que recibe es que hubo un cambio en la caja de tamaños (no sabe cuál cambio fue)
		así que se mete a la interfaz, de ahí al panel superior, y ahí le pregunta a la caja cuál es la opción que
		actualmente está seleccionada*/
		String tamanio = interfaz.darPanelSuperior().obtenerTamanoTablero();
		if (tamanio.equals("4x4")) {
			actualizarTamanoTablero(4);			
		}
		if (tamanio.equals("5x5")) {
			actualizarTamanoTablero(5);			
		}
		if (tamanio.equals("6x6")) {
			actualizarTamanoTablero(6);			
		}
		if (tamanio.equals("7x7")) {
			actualizarTamanoTablero(7);			
		}
		
		
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
