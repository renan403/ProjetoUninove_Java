package data;

import java.util.Random;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class Codigo {

    private String cod;
    private char letra[];
    private final String letras="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public Codigo() {
    }
    
    public String gerarCod(){
        Random number = new Random();
        letra = new char[6];
        
            for(int i=0;i<6;i++)
            {
                int j = number.nextInt(35);
                letra[i]=letras.charAt(j);
            }
        
            cod=(String.valueOf(letra[0])+String.valueOf(letra[1])+String.valueOf(letra[2])+String.valueOf(letra[3])+String.valueOf(letra[4])+String.valueOf(letra[5]));
        return ("OTC"+cod);
    }
    
  
}
