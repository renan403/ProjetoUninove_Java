package Jogo1;

import data.Usuario;
import data.UsuarioDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener {
    private Image fundo;
    private Player player;
    private static Timer timer;
    private static String email;
    private static List<Enemy1> enemy1;
    private int Win,f,Sit;
    private static int emJogo=0;
    JLabel lblPonto;
    protected boolean gameOver=false;
    private static Enemy1 inimigoLonge;
    private static int quantiaInimigos;
    private String senha;
    
    public Fase(String email, int emJogo, String senha) {
        this.email = email;
        this.senha = senha;
        setFocusable(true);
        setDoubleBuffered(true);
        addKeyListener(new TecladoAdapter());
        player = new Player(email,senha);
        player.load();//carregar imagen do player
        timer = new Timer(5,this);
        timer.start();
        inicializaInimigo();
        this.emJogo = emJogo;            
        Sit = 2;
        f = 0;       
    }
    
    
    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        
        if (emJogo == 0) 
        {
            timer.stop();
            quantiaInimigos=50;
            inicializaInimigo();
            Enemy1.VELOCIDADE=3;
            ImageIcon inicio = new ImageIcon("src//ImagensJogos//BIRD3.png");
            graficos.drawImage(inicio.getImage(), 0, 0, null);
        }
        else if (emJogo == 1) 
        {
            ImageIcon referencia = new ImageIcon("src\\ImagensJogos\\cenario.png");
            fundo = referencia.getImage();
            
            graficos.drawImage(fundo, 0, 0, null);
            graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
            
            graficos.setColor(Color.yellow);
            graficos.setFont(new Font("adumu", Font.PLAIN, 30));
            graficos.drawString(""+f, 950,30);
            
            List<Tiro> tiros = player.getTiros();
            for (int i = 0; i < tiros.size(); i++) {
                Tiro m = tiros.get(i);
                
                m.load();
                graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
            }
            for (int o = 0; o < enemy1.size(); o++) {
                Enemy1 in = enemy1.get(o);
                in.load();
                graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);
            }
        }   
        else if (emJogo==2 || emJogo==3) {
            timer.stop();
            quantiaInimigos=50;
            inicializaInimigo(); 
            Enemy1.VELOCIDADE=3;
            Player.fimJogo(true);
            
            if(emJogo==2)
            {
                ImageIcon fimJogo = new ImageIcon("src//ImagensJogos//Over.png");
                graficos.drawImage(fimJogo.getImage(), 0, 0, null);
            }
            else if(emJogo==3)
            {
                ImageIcon vence = new ImageIcon("src//ImagensJogos//win.png");
                graficos.drawImage(vence.getImage(), 0, 0, null);
            }
            
            Sit = 1;
            
            UsuarioDao dao = new UsuarioDao();
            Usuario user = new Usuario();
               
            user.setScore1(f);
            
            boolean stt=dao.conectar();

                if(stt)
                {
                    stt=dao.updateScore1(email,f,senha);
                       if(!stt)
                           JOptionPane.showMessageDialog(null,"ERRO AO SALVAR PONTUAÇÃO.");
                    dao.desconectar();
                }
        }
        g.dispose();
    }
    
    public static void inicializaInimigo() {
        int Cordenadas[] = new int[quantiaInimigos];//numero de inimigos
        enemy1 = new ArrayList<Enemy1>();
        int x;
        int y;
        
        for (int i = 0; i < quantiaInimigos-1; i++) {
            x = (int) (Math.random() * 5000 + 1024);//variavel x com escolha randomica sempre que aparecer um inimigo dentro dos valores   
            y = (int) (Math.random() * 630 + 10);
            enemy1.add(new Enemy1(x, y));
        }
        enemy1.add(inimigoLonge = new Enemy1(6024, ((int) (Math.random() * 630 + 10))));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (emJogo == 1) {
            player.update();
            
            List<Tiro> tiros = player.getTiros();
            for (int i = 0; i < tiros.size(); i++) {
                Tiro m = tiros.get(i);
                if (m.isIsVisivel()) {
                    m.update();
                } else {
                    tiros.remove(i);
                }
            }
            
            for (int o = 0; o < enemy1.size(); o++) {
                Enemy1 in = enemy1.get(o);
                if (in.isIsVisivel()) {
                    in.update();
                } else {
                    enemy1.remove(o);
                }
            }
            
            if(inimigoLonge.getX()<=0)
            {
                if(quantiaInimigos<100)
                {
                    quantiaInimigos+=5;
                    Enemy1.VELOCIDADE += 0.1;
                }  
                inicializaInimigo();
            }    
            
            if (Sit == 2) {
                checarColisoes();
                repaint();
            }
        }
    }
    
    public void checarColisoes() {
        Rectangle formaNave = player.getBounds();
        Rectangle formaEnemy1;
        Rectangle formaTiro;
        
            for (int i = 0; i < enemy1.size(); i++) {
            Enemy1 tempEnemy1 = enemy1.get(i);//um inimigo temporario
            formaEnemy1 = tempEnemy1.getBounds();
            if (formaNave.intersects(formaEnemy1)) {
                player.setIsVisivel(false);
                tempEnemy1.setIsVisivel(false);
                emJogo = 2;
            }
        }
        
        List<Tiro> tiros = player.getTiros();
        for (int j = 0; j < tiros.size(); j++) {
            Tiro tempTiro = tiros.get(j);
            formaTiro = tempTiro.getBounds();
            for (int o = 0; o < enemy1.size(); o++) {
                Enemy1 tempEnemy1 = enemy1.get(o);
                formaEnemy1 = tempEnemy1.getBounds();
                if (formaTiro.intersects((formaEnemy1)) && formaTiro.getX()<=1024) {
                    tempEnemy1.setIsVisivel(false);
                    tempTiro.setIsVisivel(false);
                    Enemy1.VELOCIDADE += 0.005;
                    
                    f = f + 1;
                    
                }
            }
            
        }
    }
    
    
    private class TecladoAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            player.keyRelease(e);
        }
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
    
}
