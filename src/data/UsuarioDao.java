package data;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class UsuarioDao {
    Connection con;
    PreparedStatement st;
    ResultSet rs;
    
    public UsuarioDao(){
    }
    
    public boolean conectar(){
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            //con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/plataforma_otc","superadmin_otc","0nTh3C0d3@Adm");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto","root","");
            return true;
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            return false;
        }
    }
    
    public int salvar(Usuario usuario){
        try 
        {
            int status;
            st = con.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,0,0,'-','-',0)");
            st.setString(1, usuario.getApelido());
            st.setString(2, usuario.getEmail());
            st.setString(3, usuario.getSenha());
            st.setLong(4, usuario.getTelefone());
            
            status = st.executeUpdate();
            return status;
        } 
        catch (SQLException ex) 
        {
            return ex.getErrorCode();
        }
    }
    
    public Usuario recuperarSenha(String email, long telefone){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT * FROM usuario WHERE email = ? AND telefone = ?");
            st.setString(1, email);
            st.setLong(2, telefone);
            rs = st.executeQuery();
            
            if(rs.next()){
                usuario.setApelido(rs.getString("apelido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getLong("telefone"));
                return usuario;
            }
            else
                return null;
        } 
        catch (SQLException ex) 
        {
            return null;
        }
    }
    
    public Usuario entrar(String email, String senha){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            st.setString(1,email);
            st.setString(2,senha);
            rs = st.executeQuery();
                if (rs.next())
                {
                    usuario.setApelido(rs.getString("apelido"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setScore1(rs.getInt("score1"));
                    usuario.setScore2(rs.getInt("score2"));
                    usuario.setAvatar(rs.getString("avatar").charAt(0));
                    return usuario;
                }
                else
                    return null;
        } 
        catch (SQLException ex) 
        {
            return null;
        }
    }
    
    public boolean trocarSenhaCod(Usuario usuario){
        try 
        {
            st = con.prepareStatement("UPDATE usuario SET senha = ? WHERE email = ? AND codigo = ?");
            st.setString(1,usuario.getSenha());
            st.setString(2,usuario.getEmail());
            st.setString(3,usuario.getCodigo());
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public boolean trocarSenha(Usuario usuario){
        try 
        {
            st = con.prepareStatement("UPDATE usuario SET senha = ? WHERE email = ?");
            st.setString(1,usuario.getSenha());
            st.setString(2,usuario.getEmail());
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public void trocarAvatar(Usuario usuario){
        try {
            st = con.prepareStatement("UPDATE usuario SET avatar = ? WHERE email = ? AND senha = ?");
            st.setString(1, String.valueOf(usuario.getAvatar()));
            st.setString(2, usuario.getEmail());
            st.setString(3, usuario.getSenha());
            st.executeUpdate();
        } catch (SQLException ex) {
            
        }
    }
    
    public void desconectar(){
        try 
        {
            con.close();
        } 
        catch (SQLException ex) 
        {
           
        }
    }
    
    public Usuario verificarSenha(String email){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT email,senha FROM usuario WHERE email = ?");
            st.setString(1,email);
            rs = st.executeQuery();
                if(rs.next())
                {
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setEmail(rs.getString("email"));
                    return usuario;
                }
                else
                    return null;
        } 
        catch (SQLException ex){
            return null;
        }
    }
    
    public boolean enviarCodigo(Usuario usuario){
        try 
        {
            st = con.prepareStatement("UPDATE usuario SET codigo = ? WHERE email = ?");
            st.setString(1,usuario.getCodigo());
            st.setString(2,usuario.getEmail());
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public Usuario verificarCodigo(String email){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT codigo FROM usuario WHERE email = ?");
            st.setString(1, email);
            rs = st.executeQuery();
            if(rs.next())
            {
                usuario.setCodigo(rs.getString("codigo"));
                return usuario;
            }
            else
                return null;
        } 
        catch (SQLException ex) 
        {
            return null;
        } 
    }
    
    public boolean updateScore1(String email, int score1, String senha){
        try 
        {
            st = con.prepareStatement("UPDATE usuario SET score1 = ? WHERE email = ? AND ? > score1 AND senha = ?");
            st.setInt(1, score1);
            st.setString(2, email);
            st.setInt(3, score1);
            st.setString(4, senha);
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public boolean updateScore2(String email, int score2, String senha){
        try 
        {
            st = con.prepareStatement("UPDATE usuario SET score2 = ? WHERE email = ? AND ? > score2 AND senha = ?");
            st.setInt(1, score2);
            st.setString(2, email);
            st.setInt(3, score2);
            st.setString(4, senha);
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public Usuario Info(String email, String senha){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            st.setString(1, email);
            st.setString(2, senha);
            rs = st.executeQuery();
            
            if(rs.next()){
                usuario.setApelido(rs.getString("apelido"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setScore1(rs.getInt("score1"));
                usuario.setScore2(rs.getInt("score2"));
                usuario.setAvatar(rs.getString("avatar").charAt(0));
                return usuario;
            }
            else
                return null;
        } 
        catch (SQLException ex) 
        {
            return null;
        }
    }
    
    public boolean comprarPontos(int ponto, String email, String senha){
        try 
        {
            st=con.prepareStatement("UPDATE usuario SET ponto = ponto+? WHERE email=? AND senha=?");
            st.setInt(1,ponto);
            st.setString(2,email);
            st.setString(3,senha);
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
            return false;
        }
    }
    
    public Usuario consultPonto(String email, String senha){
        try 
        {
            Usuario usuario = new Usuario();
            st = con.prepareStatement("SELECT ponto FROM usuario WHERE email = ? AND senha = ?");
            st.setString(1,email);
            st.setString(2,senha);
            rs = st.executeQuery();
                if (rs.next())
                {
                    usuario.setPonto(rs.getInt("ponto"));

                    return usuario;
                }
                else
                    return null;
        } 
        catch (SQLException ex) 
        {
            return null;
        }
    }
    
    public boolean comprarJg(int ponto ,String email, String senha){
        try 
        {
            st=con.prepareStatement("UPDATE usuario SET ponto=ponto-? WHERE email=? AND senha=?");
            st.setInt(1,ponto);
            st.setString(2,email);
            st.setString(3,senha);    
            st.executeUpdate();
            return true;
        } 
        catch (SQLException ex) 
        {
           return false;        
        }
    }
}