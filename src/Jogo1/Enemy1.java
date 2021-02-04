package Jogo1;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Enemy1 {
    
    private Image imagem;
    private int x, y;
    //public static int v=2;
    private int largura, altura;
    private boolean isVisivel;//para quando o objeto atingir ou sair da tela sumir
    
    //private static final int  LARGURA = 938;
    public static double VELOCIDADE = 3;
    
    public Enemy1(int x, int y){//xy do inimigo
        this.x=x;
        this.y=y;
        isVisivel=true;
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("src\\ImagensJogos\\Foe.png");
        imagem = referencia.getImage();
        this.largura=imagem.getWidth(null);
        this.altura=imagem.getHeight(null);
    }
    public void update(){
        this.x -=VELOCIDADE;
            //if(this.x > LARGURA){
                //isVisivel= false;
            //}
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,40,40);
    }
    
    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public boolean isIsVisivel() {
        return isVisivel;
    }

    public void setIsVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }

    public static double getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(double VELOCIDADE) {
        Enemy1.VELOCIDADE = VELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }
    
}
