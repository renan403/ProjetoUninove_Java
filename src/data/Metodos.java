package data;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class Metodos {
    
    public static void placeholderOff(JTextField txt, String campo){
        if (txt.getText().equals(campo))
        {
            txt.setText("");
            txt.setForeground(Cores.black);
            txt.setHorizontalAlignment(SwingConstants.LEFT);
        }
    }
    
    public static void placeholderOn(JTextField txt, String campo){
        txt.setText(campo);
        txt.setForeground(Cores.purple);
        txt.setHorizontalAlignment(SwingConstants.CENTER);
    }
    
    public static boolean validarSenha(JTextField txt){
        String padraoSenha="^[a-zA-Z0-9,_./!@#$%¨&*()-+]{6,20}$";
        Pattern patt=Pattern.compile(padraoSenha);
        Matcher match=patt.matcher(txt.getText());
            if(match.matches())
                return true;
            else
                return false;
    }
    
    public static boolean validarEmail(JTextField txt){
        String padraoEmail="^[a-zA-Z0-9._+-]{1,30}[@][a-zA-Z.-]{1,10}[.][a-zA-Z.]{2,6}$";
        Pattern patt=Pattern.compile(padraoEmail);
        Matcher match=patt.matcher(txt.getText());
            if(match.matches())
                return true;
            else
                return false;
    }
    
    public static boolean validarTelefone(JTextField txt){
        String padraoTelefone="^[0-9]{2}9[0-9]{8}$";
        Pattern patt=Pattern.compile(padraoTelefone);
        Matcher match=patt.matcher(txt.getText());
            if(match.matches())
                return true;
            else
                return false;
    }
    
    public static boolean validarApelido(JTextField txt){
        String padraoApelido="^[a-zA-Z0-9#@-_.&]{5,10}$";
        Pattern patt=Pattern.compile(padraoApelido);
        Matcher match=patt.matcher(txt.getText());
            if(match.matches())
                return true;
            else
                return false;
    }
    
    public static void mouseOn(JLabel lbl, Color cor){
        lbl.setForeground(cor);
        lbl.setFont(new java.awt.Font("Adumu", 0, 20));   
    }
    
    public static void mouseOff(JLabel lbl, Color cor){
        lbl.setForeground(cor);
        lbl.setFont(new java.awt.Font("Adumu", 0, 18));
    }
    
    public static void mouseOn(JButton btn, Color cor){
        btn.setForeground(cor);
        btn.setFont(new java.awt.Font("Adumu", 0, 16));  
    }
    
    public static void mouseOff(JButton btn, Color cor){
        btn.setForeground(cor);
        btn.setFont(new java.awt.Font("Adumu", 0, 14));
    }
}
