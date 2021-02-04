package Jogo2;

import data.Icone;
import javax.swing.JFrame;

public class ContainerJogo2 extends JFrame {
    private static Gameplay gamePlay;
    
    public ContainerJogo2(String email, String senha){
        Icone icon = new Icone();
        icon.inserirIcone(this);
        gamePlay = new Gameplay(email,senha);
        setBounds(10,10,700,600);
        setTitle("Breakout Ball");
        setResizable(false);
        this.setUndecorated(true);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(gamePlay);
    }
}