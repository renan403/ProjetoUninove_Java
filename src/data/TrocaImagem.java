package data;

import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TrocaImagem implements Runnable{
    private JLabel direita,esquerda,meio;
    private final JLabel direitaOrig,esquerdaOrig,meioOrig;
    private JPanel painel;
    private int i,j;
    private boolean parar;
    
    public TrocaImagem(JLabel lblImgEsq, JLabel lblImgMeio, JLabel lblImgDir, JPanel painelJogos)
    {
        this.esquerdaOrig=lblImgEsq;
        this.meioOrig=lblImgMeio;
        this.direitaOrig=lblImgDir;
        this.painel=painelJogos;
    }
    
    public void setImagensPos(JLabel lblImgEsq, JLabel lblImgMeio, JLabel lblImgDir)
    {
        this.esquerda=lblImgEsq;
        this.meio=lblImgMeio;
        this.direita=lblImgDir;
    }
    
    public int getJ(){
        return j;
    }
    public int getI(){
        return i;
    }  
    
    public void setFinish(boolean parar)
    {
        this.parar=parar;
    }
    
    @Override
    public void run(){
        while(!parar)
        {
            for(j=0;j<3;j++)
            {
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException ex){
                    System.out.println("ERRO1");
                }
                
                    if(j==0)
                        setImagensPos(esquerdaOrig,meioOrig,direitaOrig);      
                    else if(j==1)
                        setImagensPos(direitaOrig,esquerdaOrig,meioOrig);
                    else if(j==2)
                        setImagensPos(meioOrig,direitaOrig,esquerdaOrig);
                    
                for(i=0;i<=492;i+=2)
                {
                    esquerda.setLocation(i-492, 0);
                    meio.setLocation(i, 0);
                    direita.setLocation(i+492, 0);

                    try
                    {
                        Thread.sleep(4);
                    }
                    catch(InterruptedException ex){
                        System.out.println("ERRO2");
                    }
                }
            }
        }
    }
    
}
