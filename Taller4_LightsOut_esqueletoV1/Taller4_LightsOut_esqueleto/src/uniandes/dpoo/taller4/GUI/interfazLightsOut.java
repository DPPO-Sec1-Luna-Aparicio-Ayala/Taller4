package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import uniandes.dpoo.taller4.modelo.Tablero;

public class interfazLightsOut  extends JFrame{

	private Tablero tab;
	private PanelTablero panelTablero;
	private PanelSuperior panelSuperior;
	private PanelInferior panelInferior;
	private PanelDerecha panelDerecha;
	public int tamano;
	//el objeto casjlla contiene la imagen
    static Casilla casilla = new Casilla();   
    //filtro para las imagenes
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de Imagen","jpg","png");
    private JFileChooser fileChooser = new JFileChooser();
    private File Directorio = fileChooser.getCurrentDirectory();
    //para los datos que se extraen de Casilla.java
    DefaultListModel modelo = new DefaultListModel();
	
	public interfazLightsOut() {
		
		
		tab = new Tablero(tamano);
		panelTablero = new PanelTablero();
		panelSuperior = new PanelSuperior();
		panelInferior = new PanelInferior();
		panelDerecha = new PanelDerecha();
		
		
		panelTablero.setCasilla(casilla);
        this.repaint();
        casilla.setModel(modelo);
        jList1.setModel(modelo);
		setTitle( "LightsOut" );
		setSize( 700, 700 );
		setResizable( false );	
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.SOUTH);
		add(panelTablero, BorderLayout.CENTER);
		add(panelDerecha, BorderLayout.EAST);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new interfazLightsOut();
	}

}
