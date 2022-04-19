package uniandes.dpoo.taller4.GUI;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

public class PanelTablero extends JPanel implements ActionListener,MouseMotionListener,MouseListener {
	/*private BufferedImage Imagen_en_memoria;
	//imagen de fondo de cuadrados
	private Image fondo = new ImageIcon(getClass().getResource("/images/default.jpg")).getImage();
	private Casilla casilla = null;
	//tamaño del contenedor
	private Dimension size = new Dimension(100,100);
	
	public PanelTablero() {
		setPreferredSize(new Dimension(500, 500));
		GridLayout gl = new GridLayout(5,5);
		setLayout(gl);
		this.setSize( size );
		this.setVisible(true);
		addMouseMotionListener(this);
		addMouseListener(this);
	}

	public void setCasilla(Casilla md){
	    this.casilla = md;
	    this.repaint();
	}


		/* constructor que toma el tamaño pasado como parametro
		public mipanel(Dimension d){
		    this.setPreferredSize( d );
		    this.setSize( d );
		    this.setVisible(true);
		    addMouseMotionListener(this);
		    addMouseListener(this);
		}
		 */
	/*public void resize(){
		this.size = this.casilla.getSize();
		this.setSize(size);
		this.setPreferredSize(size);        
		this.repaint();
	}

	/*public BufferedImage getDibujoFinal(){
		return Imagen_en_memoria.getSubimage(0, 0, casilla.getSize().width, casilla.getSize().height);
	}

		@Override
		public void paintComponent(Graphics g) {
		     Graphics2D g2 = (Graphics2D)g;
		    //se crea una imagen en memoria
		    BufferedImage imagenEnMemoria = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB); ;
		    Graphics2D g2Oculta = imagenEnMemoria.createGraphics();
		    g2Oculta.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		    //pinta imagen de fondo
		    g2Oculta.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
		    //pinta los objetos de clase midibujo
		    if( this.casilla != null)
		        this.casilla.pintar_dibujo(g2Oculta);
		    /*pinta los objetos de la clase mitexto
		    if( this.texto != null )
		        this.texto.pintar_texto(g2Oculta);
		   

		     g2.drawImage(Imagen_en_memoria, 0, 0, this);
		     this.repaint();
		 }

		public void mouseDragged(MouseEvent e) {       
		    //se envian las nuevas coordenadas
		    if( this.casilla != null)
		        if( casilla.get_texto_seleccionado()!= -1 )
		        	casilla.getTexto( casilla.get_texto_seleccionado() ).mover((int)e.getPoint().getX(),(int) e.getPoint().getY());
		    this.repaint();        
		}

		public void mouseMoved(MouseEvent e) {}

		public void mouseClicked(MouseEvent e) {}

		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}
	    public void mouseEntered(MouseEvent e) {}

	    public void mouseExited(MouseEvent e) {}

		}
		
		/*	
		lbRespuesta = new JLabel("Rta");
		txtRespuesta = new JTextField();
		txtRespuesta.setEditable(false);
		
		add(lbRespuesta, BorderLayout.WEST);
		add(txtRespuesta, BorderLayout.CENTER);
		
	}*/

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
