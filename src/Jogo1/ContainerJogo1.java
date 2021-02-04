package Jogo1;

import data.Icone;
import javax.swing.JFrame;

public class ContainerJogo1 extends JFrame{
    
    public ContainerJogo1(String email, int emJogo, String senha)
    {
        Icone icon = new Icone();
        icon.inserirIcone(this);
        add(new Fase(email,emJogo,senha));
        setTitle("BIRD");
        setSize(1024, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setVisible(true);
    }
}
