package data;

import java.awt.Toolkit;
import javax.swing.JFrame;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class Icone {
    
    public Icone() {
    }
    
    public void inserirIcone(JFrame frm){
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Imagens/iconeApp.png"));
    }
}
