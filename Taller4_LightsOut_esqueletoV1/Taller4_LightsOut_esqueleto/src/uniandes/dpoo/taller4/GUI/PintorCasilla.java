package uniandes.dpoo.taller4.GUI;
import java.awt.*;
import javax.swing.*;

public class PintorCasilla {
	private Image foto;
    private Dimension size = new Dimension(1, 1);
    private DefaultListModel modelo;
    
    public PintorCasilla() {
    	
    }
    
    public void setFoto(Image f) {
        this.foto = f;
        this.size = new Dimension(f.getWidth(null), f.getHeight(null));
    }

    public Dimension getSize() {
        return this.size;
    }

    public void pintar_dibujo(Graphics2D g2) {
        //pinta la imagen cargada en memoria
        g2.drawImage(foto, 0, 0, null);
    }


    public void setModel(DefaultListModel m) {
        this.modelo = m;
    }
}
