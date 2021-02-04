package Jogo1;

import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import view.TelasPrincipais.TelaLogado;


public class Player{
    private int x,y,s;
    private int dx,dy;
    private Image imagem;
    private int altura, largura;
    private List <Tiro> tiros;//lista para alocar os tiros ja q n vao parar
    private boolean isVisivel;
    private static String email, senha;
    private static boolean fimJogo=false;
    private static boolean inicioJogo=true;
    
    public Player(String email, String senha){
        this.x=100;
        this.email = email;
        this.senha = senha;
        this.y=250;
        isVisivel = true;

        tiros = new ArrayList<Tiro>();
    }            
    public void load(){
        ImageIcon referencia=new ImageIcon("src\\ImagensJogos\\boneco.png");
        imagem =referencia.getImage();
        largura = imagem.getWidth(null);
        altura = imagem.getHeight(null);
}
    public void update(){   
        x+=dx;
        y+=dy;
            if(this.x>940){
                this.x-=6;
            }else if(this.x<-20){
                this.x+=6;
            }else if(this.y>635){
                this.y-=6;
            }else if(this.y<15){
                this.y+=6;
            }
    }
    
    public void tiroSimples(){
        this.tiros.add(new Tiro(x+largura, y+(altura/2)));
    }
    
    public static void fimJogo(boolean fimJogo){
        Player.fimJogo = fimJogo;
    }
    
    public static void inicioJogo(boolean inicioJogo){
        Player.inicioJogo = inicioJogo;
    }
    
    public Rectangle getBounds(){
        return new Rectangle(x,y,40,40);
    }
    
    public void keyPressed(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        if(codigo==KeyEvent.VK_UP){
            dy=-5;
        }
        if(codigo==KeyEvent.VK_DOWN){
            dy=5;
        }
        if(codigo==KeyEvent.VK_LEFT){
            dx=-5;
        }
        if(codigo==KeyEvent.VK_RIGHT){
            dx=5;
        }
    }
    
    public void keyRelease(KeyEvent tecla) {
        int codigo = tecla.getKeyCode();
        if(codigo==KeyEvent.VK_S){
            tiroSimples();
        }
        if(codigo==KeyEvent.VK_UP){
            dy=0;
        }
        if(codigo==KeyEvent.VK_DOWN){
            dy=0;
        }
        if(codigo==KeyEvent.VK_LEFT){
            dx=0;
        }
        if(codigo==KeyEvent.VK_RIGHT){
            dx=0;
        }
        if(fimJogo==false && inicioJogo==true && codigo==KeyEvent.VK_ENTER){
            //Fase fa = new Fase(email,1);
            TelaLogado.encerrarJogo1();
            TelaLogado.abrirJogo1(email,senha);
            inicioJogo=false;
        }
        
        if(fimJogo==true && inicioJogo==false && codigo==KeyEvent.VK_ENTER){
            TelaLogado.encerrarJogo1();
            TelaLogado.abrirJogo1(email,senha);
            fimJogo=false;
        }
        if((fimJogo==true && inicioJogo==false && codigo==KeyEvent.VK_ESCAPE)||(fimJogo==false && inicioJogo==true && codigo==KeyEvent.VK_ESCAPE)){
            TelaLogado.encerrarJogo1();
            TelaLogado telaLog = new TelaLogado(email,senha);
            telaLog.setVisible(true);
            inicioJogo=true;
            fimJogo=false;
        }
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagem() {
        return imagem;
    }

    public List<Tiro> getTiros() {
        return tiros;
    }

    public boolean isIsVisivel() {
        return isVisivel;
    }

    public void setIsVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }
}



