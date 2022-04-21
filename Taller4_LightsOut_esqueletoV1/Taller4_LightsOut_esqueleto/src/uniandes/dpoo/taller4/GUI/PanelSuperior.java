package uniandes.dpoo.taller4.GUI;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.*;
import uniandes.dpoo.taller4.GUI.*;

public class PanelSuperior extends JPanel{
		private JComboBox<String> combo1;
		public PanelSuperior(interfazLightsOut interfaz){
		combo1=new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        combo1.addItem("4x4");
        combo1.addItem("5x5");
        combo1.addItem("6x6");
        combo1.addItem("7x7");
        add(combo1);
        
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
