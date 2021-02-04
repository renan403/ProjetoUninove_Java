
package Jogo1;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;


public class Tiro {
    
    private Image imagem;
    private int x, y;
    private int largura, altura;
    private boolean isVisivel;//para quando o objeto atingir ou sair da tela sumir
    
    private static final int  LARGURA = 1024;
    private static int VELOCIDADE =7;
    
    public Tiro(int x, int y){//xy do jogador
        this.x=x;
        this.y=y;
        isVisivel=true;
    }
    
    public void load(){
        ImageIcon referencia = new ImageIcon("src\\ImagensJogos\\Cuspe.png");
        imagem = referencia.getImage();
        
        this.largura=imagem.getWidth(null);
        this.altura=imagem.getHeight(null);
    }
    public void update(){
        this.x+=VELOCIDADE;
            if(this.x>LARGURA){
                isVisivel= false;
            }
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,largura-10,altura-10);
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

    public static int getVELOCIDADE() {
        return VELOCIDADE;
    }

    public static void setVELOCIDADE(int VELOCIDADE) {
        Tiro.VELOCIDADE = VELOCIDADE;
    }

    public Image getImagem() {
        return imagem;
    }
    
}
