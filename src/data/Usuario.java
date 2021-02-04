package data;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class Usuario {
    private String apelido, email, senha, codigo;
    private long telefone;
    private int score1,score2,ponto;
    private char avatar;
    
    public Usuario() {
    }
    
    public void setApelido(String apelido){
        this.apelido=apelido;
    }
    
    public String getApelido(){
        return apelido;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha=senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setTelefone(long telefone){
        this.telefone=telefone;
    }
    
    public long getTelefone(){
        return telefone;
    }
    
    public void setScore1(int score1){
        this.score1=score1;
    }
        
    public int getScore1(){
        return score1;
    }
    
    public void setScore2(int score2){
        this.score2=score2;
    }
    
    public int getScore2(){
        return score2;
    }
    
    public void setAvatar(char avatar){
        this.avatar=avatar;
    }
    
    public char getAvatar(){
        return avatar;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setPonto(int ponto) {
        this.ponto=ponto;
    }
    
    public int getPonto() {
        return ponto;
    }
}
