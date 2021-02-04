package view.TelasSecundarias;

import data.Icone;
import data.Usuario;
import data.UsuarioDao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.TelasPrincipais.TelaLogado;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaComprarCP extends javax.swing.JFrame {

    private final String email;
    private final String senha;
    private String apelido;
    private String entrada;
    private int valor=0;
   
    public TelaComprarCP(String email, String senha, String entrada) {
        initComponents();
        this.email=email;
        this.senha=senha;
        this.entrada=entrada;
        
        Usuario user =new Usuario();
        UsuarioDao dao = new UsuarioDao();

        user.setEmail(email);
        user.setSenha(senha);
        
        boolean stt=dao.conectar();
        
        if(!stt)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar e obter CP.");
        else 
        {
            user=dao.consultPonto(email,senha);
            dao.desconectar();
            lblCodePoints.setText(String.valueOf(user.getPonto()));
        }
        
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }
    
    public TelaComprarCP(String apelido, String email, String senha, String entrada) {
        initComponents();
        this.email=email;
        this.senha=senha;
        this.entrada=entrada;
        this.apelido=apelido;
        
        Usuario user =new Usuario();
        UsuarioDao dao = new UsuarioDao();

        user.setEmail(email);
        user.setSenha(senha);
        
        boolean stt=dao.conectar();
        
        if(!stt)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar e obter CP.");
        else 
        {
            user=dao.consultPonto(email,senha);
            dao.desconectar();
            lblCodePoints.setText(String.valueOf(user.getPonto()));
        }
        
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar2 = new javax.swing.JButton();
        lblCodePoints = new javax.swing.JLabel();
        lblCode25 = new javax.swing.JLabel();
        lblCode60 = new javax.swing.JLabel();
        lblCode100 = new javax.swing.JLabel();
        lblCode250 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta1.png"))); // NOI18N
        btnVoltar2.setToolTipText(null);
        btnVoltar2.setBorder(null);
        btnVoltar2.setBorderPainted(false);
        btnVoltar2.setContentAreaFilled(false);
        btnVoltar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar2.setFocusPainted(false);
        btnVoltar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta2.png"))); // NOI18N
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 35, 50, 40));

        lblCodePoints.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblCodePoints.setForeground(new java.awt.Color(255, 204, 51));
        lblCodePoints.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodePoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/moedaCP.png"))); // NOI18N
        lblCodePoints.setText("CodePoints");
        lblCodePoints.setToolTipText(null);
        lblCodePoints.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCodePoints.setAlignmentY(0.0F);
        lblCodePoints.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblCodePoints.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblCodePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 35, 130, -1));

        lblCode25.setToolTipText(null);
        lblCode25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCode25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCode25MouseClicked(evt);
            }
        });
        getContentPane().add(lblCode25, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 100, 148, 300));

        lblCode60.setToolTipText(null);
        lblCode60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCode60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCode60MouseClicked(evt);
            }
        });
        getContentPane().add(lblCode60, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 100, 148, 300));
        lblCode60.getAccessibleContext().setAccessibleName("lblcode60");

        lblCode100.setToolTipText(null);
        lblCode100.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCode100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCode100MouseClicked(evt);
            }
        });
        getContentPane().add(lblCode100, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 100, 148, 300));

        lblCode250.setToolTipText(null);
        lblCode250.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCode250.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCode250MouseClicked(evt);
            }
        });
        getContentPane().add(lblCode250, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 100, 148, 300));

        lblFundo.setForeground(new java.awt.Color(255, 51, 51));
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela_pra_comprar_code_points.png"))); // NOI18N
        lblFundo.setToolTipText(null);
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCode25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCode25MouseClicked
        UsuarioDao dao=new UsuarioDao();
        boolean status=dao.conectar();
       
        if(!status)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com a Loja.");
        else 
        {
            valor=1000;
            Object[] options = { "Comprar", "Cancelar" };
            int opcao = JOptionPane.showOptionDialog(null, "Confirmar a compra de " + valor + " CPs?", "Comprar CP", JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, new ImageIcon("src//Imagens//bender.png"), options, options[0]); 
            
            if(opcao==0)
            {
                status = dao.comprarPontos(valor,email,senha);
                dao.desconectar();
                
                    if(status)
                    {
                        JOptionPane.showMessageDialog(null,"Sucesso ao obter " + valor + " CPs!", "Compra efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        lblCodePoints.setText(String.valueOf(Integer.parseInt(lblCodePoints.getText())+valor));
                    }  
                    else
                      JOptionPane.showMessageDialog(null,"Erro ao concluir compra.");
            }
            else if(opcao==1)
            {
             JOptionPane.showMessageDialog(null, "  Compra Cancelada", "Comprar CP", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));               
            }
        }   
    }//GEN-LAST:event_lblCode25MouseClicked

    private void lblCode60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCode60MouseClicked
        UsuarioDao dao=new UsuarioDao();
        boolean status=dao.conectar();
       
        if(!status)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com a Loja.");
        else 
        {
            valor=2500;
            Object[] options = { "Comprar", "Cancelar" };
            int opcao = JOptionPane.showOptionDialog(null, "Confirmar a compra de " + valor + " CPs?", "Comprar CP", JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, new ImageIcon("src//Imagens//bender.png"), options, options[0]); 
            
            if(opcao==0)
            {
                status = dao.comprarPontos(valor,email,senha);
                dao.desconectar();
                
                    if(status)
                    {
                        JOptionPane.showMessageDialog(null,"Sucesso ao obter " + valor + " CPs!", "Compra efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        lblCodePoints.setText(String.valueOf(Integer.parseInt(lblCodePoints.getText())+valor));
                    }  
                    else
                      JOptionPane.showMessageDialog(null,"Erro ao concluir compra.");
            }
            else if(opcao==1)
            {
             JOptionPane.showMessageDialog(null, "  Compra Cancelada", "Comprar CP", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));               
            }
        }  
    }//GEN-LAST:event_lblCode60MouseClicked

    private void lblCode100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCode100MouseClicked
        UsuarioDao dao=new UsuarioDao();
        boolean status=dao.conectar();
       
        if(!status)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com a Loja.");
        else 
        {
            valor=5000;
            Object[] options = { "Comprar", "Cancelar" };
            int opcao = JOptionPane.showOptionDialog(null, "Confirmar a compra de " + valor + " CPs?", "Comprar CP", JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, new ImageIcon("src//Imagens//bender.png"), options, options[0]); 
            
            if(opcao==0)
            {
                status = dao.comprarPontos(valor,email,senha);
                dao.desconectar();
                
                    if(status)
                    {
                        JOptionPane.showMessageDialog(null,"Sucesso ao obter " + valor + " CPs!", "Compra efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        lblCodePoints.setText(String.valueOf(Integer.parseInt(lblCodePoints.getText())+valor));
                    }  
                    else
                      JOptionPane.showMessageDialog(null,"Erro ao concluir compra.");
            }
            else if(opcao==1)
            {
             JOptionPane.showMessageDialog(null, "  Compra Cancelada", "Comprar CP", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));               
            }
        }  
    }//GEN-LAST:event_lblCode100MouseClicked

    private void lblCode250MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCode250MouseClicked
        UsuarioDao dao=new UsuarioDao();
        boolean status=dao.conectar();
       
        if(!status)
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com a Loja.");
        else 
        {
            valor=13000;
            Object[] options = { "Comprar", "Cancelar" };
            int opcao = JOptionPane.showOptionDialog(null, "Confirmar a compra de " + valor + " CPs?", "Comprar CP", JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, new ImageIcon("src//Imagens//bender.png"), options, options[0]); 
            
            if(opcao==0)
            {
                status = dao.comprarPontos(valor,email,senha);
                dao.desconectar();
                
                    if(status)
                    {
                        JOptionPane.showMessageDialog(null,"Sucesso ao obter " + valor + " CPs!", "Compra efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        lblCodePoints.setText(String.valueOf(Integer.parseInt(lblCodePoints.getText())+valor));
                    }  
                    else
                      JOptionPane.showMessageDialog(null,"Erro ao concluir compra.");
            }
            else if(opcao==1)
            {
             JOptionPane.showMessageDialog(null, "  Compra Cancelada", "Comprar CP", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));               
            }
        }  
    }//GEN-LAST:event_lblCode250MouseClicked

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        if(entrada.equals("Inicio"))
        {
            TelaLogado telaOn = new TelaLogado(email,senha);
            telaOn.setVisible(true);
            dispose();
        }
        else if(entrada.equals("ComprarCP"))
        {
            TelaBiblioteca telaBiblioteca = new TelaBiblioteca(apelido,email,senha);
            telaBiblioteca.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JLabel lblCode100;
    private javax.swing.JLabel lblCode25;
    private javax.swing.JLabel lblCode250;
    private javax.swing.JLabel lblCode60;
    private javax.swing.JLabel lblCodePoints;
    private javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables
}
