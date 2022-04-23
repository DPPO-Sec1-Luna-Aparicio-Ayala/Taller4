package uniandes.dpoo.taller4.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

public class interfazLightsOut  extends JFrame implements ActionListener{

	private Tablero tablero;
	private PanelTablero panelTablero;
	private PanelSuperior panelSuperior;
	private PanelInferior panelInferior;
	private PanelDerecha panelDerecha;
	private Top10 top10;
	private int tamano = 4;
	private int dificultad;
	//El tamaño por defecto del tablero es 4x4
	
	private static final int FACIL = 3;
	private static final int MEDIO = 5;
	private static final int DIFICIL = 7;
	private static final File top = new File("src/uniandes/dpoo/taller4/top.txt");
	private static final Toolkit pantalla = Toolkit.getDefaultToolkit();
	private static final Image icono = pantalla.getImage("src/uniandes/dpoo/taller4/graficos/bulb.png");
	private static final Image apagado = pantalla.getImage("src/uniandes/dpoo/taller4/graficos/bulbOff.png");
	
	public interfazLightsOut() {
		top10 = new Top10();
		top10.cargarRecords(top);
		setIconImage(icono);
		tablero = new Tablero(tamano);
		panelTablero = new PanelTablero(icono, this,tamano,apagado);
		panelSuperior = new PanelSuperior(this);
		panelInferior = new PanelInferior(this);
		panelDerecha = new PanelDerecha(this);
		
		setTitle( "LightsOut" );
		setSize( 900, 700 );
		setResizable( false );	
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.SOUTH);
		add(panelTablero, BorderLayout.CENTER);
		add(panelDerecha, BorderLayout.EAST);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				try {
					top10.salvarRecords(top);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		setVisible(true);
		
	}

	public static void main(String[] args) {
		new interfazLightsOut();
	}
		
	private void reinit() {
			tablero.reiniciar();
			panelTablero.actualizarTablero();
			panelInferior.actualizarContador(tablero.darJugadas());
	}
	
	public void actualizarJugadas() {
		panelInferior.actualizarContador(tablero.darJugadas());
	}

	public void gano() {
		if (tablero.tableroIluminado() && tablero.darJugadas()!=0) {
			JOptionPane.showMessageDialog(this,"FELICIDADES "+panelInferior.getJugador().toUpperCase()+"\nCompletaste este tablero en "+tablero.darJugadas()+" jugadas.");
			top10.agregarRegistro(panelInferior.getJugador(), tablero.calcularPuntaje());
			reinit();
		}
	}
	
	//GETTERS
	
	public Tablero darTablero() {
		return this.tablero;
	}
	
	public PanelTablero darPanelTablero() {
		return this.panelTablero;
	}
	
	public PanelSuperior darPanelSuperior() {
		return this.panelSuperior;
	}
	
	public Top10 darTop10() {
		return top10;
	}
	
	public Image darIcono() {
		return icono;
	}
	
	//SETTERS
	public void setTablero(Tablero newTab) {
		tablero = newTab;
		panelInferior.actualizarContador(tablero.darJugadas());
	}
	
	public void setTamano(int n) {
		tamano = n;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==panelDerecha.getBtnReiniciar()) {
			reinit();
		}
		
		if (e.getSource()==panelSuperior.getDificultad_facil()) {
			dificultad = FACIL;
		}
		
		if (e.getSource()==panelSuperior.getDificultad_medio()) {
			dificultad = MEDIO;
		}
		
		if (e.getSource()==panelSuperior.getDificultad_dificil()) {
			dificultad = DIFICIL;
		}
		
		if (e.getSource()==panelDerecha.getBtnNuevoJuego()) {
			reinit();
			tablero.desordenar(dificultad);
			panelTablero.actualizarTablero();
		}
		
		if (e.getSource()==panelDerecha.getBtnCambiarJugador()) {
			String jugador = JOptionPane.showInputDialog(this, "Ingresa el nombre del jugador");
			panelInferior.actualizarJugador(jugador);
		}
		
		if (e.getSource()==panelDerecha.getBtnTop10()) {
			PopUpTop10 ventanaEmergente = new PopUpTop10(this);
		}
		
	}

}
