package Jogo2;

import data.Usuario;
import data.UsuarioDao;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import view.TelasPrincipais.TelaLogado;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    Random number = new Random();
    private String email, senha;
    private boolean play = false;
    private boolean lost = false;
    private int score = 0;
    private int tamanhoRec;
    private int larg = 5, altu = 7;
    private int win = 0;

    private int totalBricks = larg * altu;

    private Timer timer;
    private int delay = 5;

    private int playerX = 300;

    private int ballposX = 335;
    private int ballposY = 350;

    private int ballXdir = number.nextInt(3) - 1;
    private int ballYdir = -2;

    private MapGenerator map;
    private Graphics g;
    private boolean touch=false;

    public Gameplay(String email, String senha) {
        this.email = email;
        this.senha = senha;
        while (ballXdir == 0) {
            ballXdir = number.nextInt(3) - 1;
        }
        map = new MapGenerator(larg, altu);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        if(play==false && lost==false)
        {
            ImageIcon inicio = new ImageIcon("src//ImagensJogos//breakoutball.png");
            g.drawImage(inicio.getImage(), 0, 0, null);
        }
        

        if (play == true) {
            //background
            g.setColor(new Color(30, 30, 28));
            g.fillRect(1, 1, 700, 600);

            //drawing map
            map.draw((Graphics2D) g);

            //borders
            g.setColor(new Color(221, 186, 0));
            g.fillRect(0, 0, 8, 600); //esquerda
            g.fillRect(0, 0, 692, 8); //cima
            g.fillRect(692, 0, 8, 600); //direita

            //scores
            if (play == true) {
                g.setColor(Color.white);
                g.setFont(new Font("adumu", Font.BOLD, 25));
                g.drawString("" + score, 600, 50);
            } else if (play == false && totalBricks == 0) {
                g.setColor(Color.white);
                g.setFont(new Font("adumu", Font.PLAIN, 30));
                g.drawString("" + score, 475, 300);
            } else if (play == false && ballposY > 570) {
                g.setColor(Color.white);
                g.setFont(new Font("adumu", Font.PLAIN, 30));
                g.drawString("" + score, 510, 300);
            }

            //the paddle
            if (play == true && totalBricks >= 25) {
                tamanhoRec = 100;
                g.setColor(new Color(221, 186, 0));
                g.fillRect(playerX, 535, tamanhoRec, 12); //height largura espessura
            } else if (play == true && totalBricks < 25) {
                tamanhoRec = 60;
                g.setColor(new Color(221, 186, 0));
                g.fillRect(playerX, 535, tamanhoRec, 12);
            }
            //the ball
            g.setColor(new Color(74, 45, 145));
            g.fillOval(ballposX, ballposY, 20, 20);

            if (totalBricks == 0) {
                play = false;
                ++win;

                if (win != 0) {
                    if (!play) {
                        ballposX = (int) (Math.random() * 600 + 50);
                        ballposY = 350;
                        ballXdir = number.nextInt(3) - 1;
                        while (ballXdir == 0) {
                            ballXdir = number.nextInt(3) - 1;
                        }
                        ballYdir = -2;
                        playerX = 300;
                        totalBricks = (5 + win) * (7 + win);
                        map = new MapGenerator(5 + win, 7 + win);
                        if (delay > 2) {
                            delay--;
                        }
                        timer = new Timer(delay, this);
                        timer.start();

                        repaint();
                    }
                }
            }

            //gameover
            if (ballposY > 570) {
                play = false;
                ballXdir = 0;
                ballYdir = 0;
                
                lost = true;
                win = 0;

                UsuarioDao dao = new UsuarioDao();
                Usuario user = new Usuario();

                user.setScore2(score);

                boolean stt = dao.conectar();

                if (stt) {
                    stt = dao.updateScore2(email, score, senha);
                    if (!stt) {
                        JOptionPane.showMessageDialog(null, "ERRO AO SALVAR PONTUAÇÃO.");
                    }
                    dao.desconectar();
                }
            }
            g.dispose();
        }
        if(play==false && lost==true)
        {
            ImageIcon fim = new ImageIcon("src//ImagensJogos//perdemo.png");
            g.drawImage(fim.getImage(), 0, 0, null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
                if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 535, tamanhoRec, 12))) {
                    touch=true;
                    
                    if(ballposY==520 || ballposY==516) //quina==520 superficie==516
                        ballYdir = -2;
                        if (new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 535, tamanhoRec/4-10, 12)))
                        {
                            ballXdir=-2;
                        }
                        else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 535, (tamanhoRec/4)*2-10, 12)))
                        {
                            ballXdir=-1;
                        }

                        else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 535, (tamanhoRec/4)*3-10, 12)))
                        {
                            ballXdir=1;
                        }
                        else if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 535, tamanhoRec, 12)))
                        {
                            ballXdir=2;
                        }
                        
                    touch=false;
            }

            //quebrar os blocos
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.brickWidth + 74;
                        int brickY = i * map.brickHeight + 80;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballposX, ballposY, 20, 20);
                        Rectangle brickRect = rect;

                        if (ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            if (ballposX + 19 <= brickRect.x || ballposX + 1 >= brickRect.x + brickRect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }

                            break A;
                        }
                    }
                }
            }

            ballposX += ballXdir;
            ballposY += ballYdir;
            if (ballposX < 10) {
                ballXdir = -ballXdir;
            }
            if (ballposY < 10) {
                ballYdir = -ballYdir;
            }
            if (ballposX > 670) {
                ballXdir = -ballXdir;
            }

        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX>= 580 && tamanhoRec==100)
                playerX = 580;
            else if(playerX>= 580 && tamanhoRec==60)
                playerX = 620;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX <= 30)
                playerX = 20;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX>= 580 && tamanhoRec==100)
                playerX = 580;
            else if(playerX>= 580 && tamanhoRec==60)
                playerX = 620;
            else
                moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX <= 30)
                playerX = 20;
            else
                moveLeft();
        }
        //restart
        if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_ENTER && lost == true) {
            if (!play && win == 0) {
                play = true;
                ballposX = (int) (Math.random() * 600 + 50);
                ballposY = 350;
                ballXdir = number.nextInt(3) - 1;
                while (ballXdir == 0) {
                    ballXdir = number.nextInt(3) - 1;
                }
                ballYdir = -2;
                playerX = 300;
                score = 0;
                totalBricks = 35;
                map = new MapGenerator(5, 7);
                repaint();
            }
        }

        if (!(e.getKeyCode() == KeyEvent.VK_ESCAPE) && win != 0) {
            play = true;
        }

        if ((e.getKeyCode() == KeyEvent.VK_ESCAPE && lost==true) || (e.getKeyCode() == KeyEvent.VK_ESCAPE && play==false)) {
            TelaLogado.encerrarJogo2();
            TelaLogado telaLog = new TelaLogado(email, senha);
            telaLog.setVisible(true);
            win = 0;
            lost = false;
            play = false;
        }
    }

    public void moveRight() {
        if (play == true && touch==false) {
            playerX += 30;
        }
    }

    public void moveLeft() {
        if (play == true && touch==false) {
            playerX -= 30;
        }
    }
}
