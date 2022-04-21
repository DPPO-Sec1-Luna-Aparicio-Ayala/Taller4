package uniandes.dpoo.taller4.GUI;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.*;
import uniandes.dpoo.taller4.GUI.*;

public class PanelSuperior extends JPanel{
		private JComboBox<String> combo1;
		private JLabel txt_tamanio;
		private JLabel txt_dificultad;
		private JRadioButton dificultad_facil;
		private JRadioButton dificultad_medio;
		private JRadioButton dificultad_dificil;
		public PanelSuperior(interfazLightsOut interfaz){
		combo1=new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        combo1.addItem("4x4");
        combo1.addItem("5x5");
        combo1.addItem("6x6");
        combo1.addItem("7x7");
       
        
        dificultad_facil = new JRadioButton("Fácil");
		dificultad_medio = new JRadioButton("Medio");
		dificultad_dificil = new JRadioButton("Dificíl");
		ButtonGroup grupo_botones = new ButtonGroup();
		grupo_botones.add(dificultad_dificil);
		grupo_botones.add(dificultad_medio);
		grupo_botones.add(dificultad_facil);
		txt_dificultad = new JLabel("Dificultad: ");
		txt_tamanio = new JLabel("Tamaño: ");
		
		add(txt_tamanio);
		 add(combo1);
		add(txt_dificultad);
		add(dificultad_facil);
		add(dificultad_medio);
		add(dificultad_dificil);
        
        /*Hace que el PanelTablero sea un ActionListener del ComboBox, es decir, cuando un evento suceda en combo1, esto podrá afectar al 
        PanelTablero*/
        combo1.addActionListener(interfaz.darPanelTablero());
		}
		
		 public void itemStateChanged(ItemEvent e) {
		       /*if (e.getSource()==combo1) {
		            String seleccionado=(String)combo1.getSelectedItem();
		     		        }*/
		 }
		 
		 public String obtenerTamanoTablero() {
			 return combo1.getSelectedItem().toString();
		 }
		 
	
}
