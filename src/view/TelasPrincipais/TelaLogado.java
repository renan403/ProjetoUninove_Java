package view.TelasPrincipais;

import Jogo1.ContainerJogo1;
import Jogo2.ContainerJogo2;
import data.Cores;
import data.Icone;
import data.Metodos;
import data.Usuario;
import data.UsuarioDao;
import java.awt.Color;
import javax.swing.JOptionPane;
import view.TelasSecundarias.TelaAmigos;
import view.TelasSecundarias.TelaBiblioteca;
import view.TelasSecundarias.TelaComprarCP;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaLogado extends javax.swing.JFrame {

    private String email,apelido,senha;
    private int score1,score2;
    private char avatar;
    private static ContainerJogo1 jogo1;
    private static ContainerJogo2 jogo2;

    public TelaLogado(String apelido, String email, String senha, int score1, int score2, char avatar) {
        initComponents();
        lblApelido.setText(apelido);
        lblScore1.setText("Score: " + score1);
        lblScore2.setText("Score: " + score2);
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
        this.score1 = score1;
        this.score2 = score2;
        this.avatar = avatar;
        Icone icon = new Icone();
        icon.inserirIcone(this);
        
        switch (avatar) {
            case '-':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa3.png")));
                break;
            case 'M':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa1.png")));
                break;
            case 'F':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa2.png")));
                break;
        }
    }
        
    public TelaLogado(String email, String senha) {
        initComponents();
        this.email = email;
        this.senha = senha;
        
        Icone icon = new Icone();
        icon.inserirIcone(this);
      
        Usuario usuario = new Usuario();
        UsuarioDao dao = new UsuarioDao();
        
        usuario.setEmail(email);
        
        boolean status = dao.conectar();
            if(status)
            {
                usuario = dao.Info(email,senha);
                if(usuario==null)
                        {
                            JOptionPane.showMessageDialog(null, "ERRO AO OBTER USUARIO.");
                        }
                else
                {
                    apelido = usuario.getApelido();
                    score1 = usuario.getScore1();
                    score2 = usuario.getScore2();
                    avatar = usuario.getAvatar();
                }
            }
        
        lblApelido.setText(apelido);
        lblScore1.setText("Score: " + score1);
        lblScore2.setText("Score: " + score2);
        
        switch (avatar) {
            case '-':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa3.png")));
                break;
            case 'M':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa1.png")));
                break;
            case 'F':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa2.png")));
                break;
        }
    }
    
    public static void encerrarJogo1(){
        jogo1.dispose();
    }
    
    public static void encerrarJogo2(){
        jogo2.dispose();
    }
    
    public static void abrirJogo1(String email, String senha){
        jogo1 = new ContainerJogo1(email,1,senha);
        jogo1.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        spr1 = new javax.swing.JSeparator();
        spr2 = new javax.swing.JSeparator();
        spr3 = new javax.swing.JSeparator();
        pnlParte1 = new javax.swing.JPanel();
        lblNomeEmpresa = new javax.swing.JLabel();
        sprLogoEmpresa = new javax.swing.JSeparator();
        lblConta = new javax.swing.JLabel();
        lblComprarCP = new javax.swing.JLabel();
        lblBiblioteca = new javax.swing.JLabel();
        lblAmigos = new javax.swing.JLabel();
        lblGame1 = new javax.swing.JLabel();
        lblGame2 = new javax.swing.JLabel();
        lblGame3 = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        pnlParte2 = new javax.swing.JPanel();
        lblScore1 = new javax.swing.JLabel();
        btnGame1 = new javax.swing.JButton();
        lblScore2 = new javax.swing.JLabel();
        btnGame2 = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaosair1.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaosair2.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 12, -1, -1));

        spr1.setBackground(new java.awt.Color(253, 253, 253));
        spr1.setForeground(new java.awt.Color(253, 253, 253));
        spr1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        spr1.setToolTipText(null);
        spr1.setOpaque(true);
        getContentPane().add(spr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 10, 2, 439));

        spr2.setBackground(new java.awt.Color(30, 109, 182));
        spr2.setForeground(new java.awt.Color(30, 109, 182));
        spr2.setToolTipText(null);
        spr2.setOpaque(true);
        getContentPane().add(spr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 10, 7, 439));

        spr3.setBackground(new java.awt.Color(253, 253, 253));
        spr3.setForeground(new java.awt.Color(253, 253, 253));
        spr3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        spr3.setToolTipText(null);
        spr3.setOpaque(true);
        getContentPane().add(spr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 2, 439));

        pnlParte1.setBackground(new java.awt.Color(21, 10, 48));
        pnlParte1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlParte1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeEmpresa.setFont(new java.awt.Font("Adumu", 0, 24)); // NOI18N
        lblNomeEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo1.png"))); // NOI18N
        lblNomeEmpresa.setText("<OnTheCode/>");
        lblNomeEmpresa.setToolTipText(null);
        pnlParte1.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 270, 90));

        sprLogoEmpresa.setBackground(new java.awt.Color(253, 253, 253));
        sprLogoEmpresa.setForeground(new java.awt.Color(253, 253, 253));
        sprLogoEmpresa.setToolTipText(null);
        sprLogoEmpresa.setOpaque(true);
        pnlParte1.add(sprLogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 44, 182, 3));

        lblConta.setBackground(new java.awt.Color(21, 10, 48));
        lblConta.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblConta.setForeground(new java.awt.Color(137, 77, 255));
        lblConta.setText("Conta");
        lblConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblContaMouseExited(evt);
            }
        });
        pnlParte1.add(lblConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 78, -1, -1));

        lblComprarCP.setBackground(new java.awt.Color(21, 10, 48));
        lblComprarCP.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblComprarCP.setForeground(new java.awt.Color(128, 37, 199));
        lblComprarCP.setText("Compre CodePoints");
        lblComprarCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprarCPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComprarCPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComprarCPMouseExited(evt);
            }
        });
        pnlParte1.add(lblComprarCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 115, -1, -1));

        lblBiblioteca.setBackground(new java.awt.Color(21, 10, 48));
        lblBiblioteca.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblBiblioteca.setForeground(new java.awt.Color(255, 182, 0));
        lblBiblioteca.setText("Biblioteca");
        lblBiblioteca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBibliotecaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBibliotecaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBibliotecaMouseExited(evt);
            }
        });
        pnlParte1.add(lblBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 189, -1, -1));

        lblAmigos.setBackground(new java.awt.Color(21, 10, 48));
        lblAmigos.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblAmigos.setForeground(new java.awt.Color(219, 156, 0));
        lblAmigos.setText("Amigos");
        lblAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmigosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAmigosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAmigosMouseExited(evt);
            }
        });
        pnlParte1.add(lblAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 152, -1, -1));

        lblGame1.setBackground(new java.awt.Color(21, 10, 48));
        lblGame1.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblGame1.setForeground(new java.awt.Color(253, 253, 253));
        lblGame1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGame1.setText("- BIRD");
        lblGame1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGame1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblGame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGame1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGame1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGame1MouseExited(evt);
            }
        });
        pnlParte1.add(lblGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 215, -1, 20));

        lblGame2.setBackground(new java.awt.Color(21, 10, 48));
        lblGame2.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblGame2.setForeground(new java.awt.Color(253, 253, 253));
        lblGame2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGame2.setText("- BREAKOUT BALL");
        lblGame2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGame2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblGame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGame2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGame2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGame2MouseExited(evt);
            }
        });
        pnlParte1.add(lblGame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 241, -1, 20));

        lblGame3.setBackground(new java.awt.Color(21, 10, 48));
        lblGame3.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblGame3.setForeground(new java.awt.Color(253, 253, 253));
        lblGame3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGame3.setText("- Em breve...");
        lblGame3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGame3.setEnabled(false);
        lblGame3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlParte1.add(lblGame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 267, -1, 20));

        lblAvatar.setBackground(new java.awt.Color(21, 10, 48));
        lblAvatar.setFont(new java.awt.Font("Adumu", 0, 22)); // NOI18N
        lblAvatar.setForeground(new java.awt.Color(5, 84, 157));
        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa1.png"))); // NOI18N
        lblAvatar.setToolTipText(null);
        lblAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvatarMouseClicked(evt);
            }
        });
        pnlParte1.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 369, -1, -1));

        lblApelido.setBackground(new java.awt.Color(21, 10, 48));
        lblApelido.setFont(new java.awt.Font("Adumu", 0, 22)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(30, 109, 182));
        lblApelido.setText("Apelido");
        lblApelido.setToolTipText(null);
        lblApelido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlParte1.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 383, -1, -1));

        lblSair.setBackground(new java.awt.Color(21, 10, 48));
        lblSair.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(146, 8, 8));
        lblSair.setText("LogOut");
        lblSair.setToolTipText(null);
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });
        pnlParte1.add(lblSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 425, -1, -1));

        getContentPane().add(pnlParte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 271, 459));

        pnlParte2.setBackground(new java.awt.Color(30, 30, 28));
        pnlParte2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblScore1.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblScore1.setForeground(new java.awt.Color(255, 255, 255));
        lblScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore1.setText("Score: 0");
        lblScore1.setToolTipText(null);
        lblScore1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlParte2.add(lblScore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 242, -1));

        btnGame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo1_v1.png"))); // NOI18N
        btnGame1.setBorder(null);
        btnGame1.setBorderPainted(false);
        btnGame1.setContentAreaFilled(false);
        btnGame1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGame1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo1_v2.png"))); // NOI18N
        btnGame1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo1_v2.png"))); // NOI18N
        btnGame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGame1ActionPerformed(evt);
            }
        });
        pnlParte2.add(btnGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblScore2.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblScore2.setForeground(new java.awt.Color(255, 255, 255));
        lblScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore2.setText("Score: 0");
        lblScore2.setToolTipText(null);
        lblScore2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlParte2.add(lblScore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 242, -1));

        btnGame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo2_v1.png"))); // NOI18N
        btnGame2.setBorder(null);
        btnGame2.setBorderPainted(false);
        btnGame2.setContentAreaFilled(false);
        btnGame2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGame2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo2_v2.png"))); // NOI18N
        btnGame2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/jogo2_v2.png"))); // NOI18N
        btnGame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGame2ActionPerformed(evt);
            }
        });
        pnlParte2.add(btnGame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        lblTexto.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("<html><p>Somos uma empresa do ramo de jogos, localizada em Osasco, São Paulo. Viemos com o objetivo de oferecer  entretenimento para todo o público, com foco em quem possui computadores fracos.<br><br>Confira abaixo nossos jogos gratuitos e não deixe de conferir nossa biblioteca para adquirir jogos.</p></html>");
        lblTexto.setToolTipText(null);
        lblTexto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pnlParte2.add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 35, 460, 160));

        getContentPane().add(pnlParte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 0, 549, 459));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        boolean status;
        UsuarioDao dao = new UsuarioDao();
        Usuario usuario = new Usuario();
        
        status = dao.conectar();
        if (status==true)
        {   
            usuario.setAvatar(avatar);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            dao.trocarAvatar(usuario);
            dao.desconectar();
        }
        else
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR AVATAR.");  
        
        TelaInicial telaInit = new TelaInicial();
        telaInit.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnGame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGame1ActionPerformed
        jogo1 = new ContainerJogo1(email,0,senha);
        jogo1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGame1ActionPerformed

    private void lblContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContaMouseClicked
        TelaConta telaConta = new TelaConta(apelido,email,senha,score1,score2,avatar);
        telaConta.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblContaMouseClicked

    private void lblAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMouseClicked
        switch (avatar) 
        {
            case '-':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa1.png")));
                avatar='M';
                break;
            case 'M':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa2.png")));
                avatar='F';
                break;
            case 'F':
                lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePessoa3.png")));
                avatar='-';
                break;         
        } 
    }//GEN-LAST:event_lblAvatarMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        Metodos.mouseOn(lblSair,Cores.red);
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        Metodos.mouseOff(lblSair,Cores.darkRed);
    }//GEN-LAST:event_lblSairMouseExited

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        boolean status;
        UsuarioDao dao = new UsuarioDao();
        Usuario usuario = new Usuario();
        
        status = dao.conectar();
        if (status==true)
        {     
            usuario.setAvatar(avatar);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            dao.trocarAvatar(usuario);
            dao.desconectar();
        }
        else
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR AVATAR.");  
        
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void lblGame1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame1MouseClicked
        jogo1 = new ContainerJogo1(email,0,senha);
        jogo1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblGame1MouseClicked

    private void lblAmigosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmigosMouseExited
        Metodos.mouseOff(lblAmigos,new Color(219,156,0));
    }//GEN-LAST:event_lblAmigosMouseExited

    private void lblAmigosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmigosMouseEntered
        Metodos.mouseOn(lblAmigos,new Color(219,156,0));
    }//GEN-LAST:event_lblAmigosMouseEntered

    private void lblBibliotecaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBibliotecaMouseExited
        Metodos.mouseOff(lblBiblioteca,Cores.yellow);
    }//GEN-LAST:event_lblBibliotecaMouseExited

    private void lblBibliotecaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBibliotecaMouseEntered
        Metodos.mouseOn(lblBiblioteca,Cores.yellow);
    }//GEN-LAST:event_lblBibliotecaMouseEntered

    private void lblComprarCPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarCPMouseExited
        Metodos.mouseOff(lblComprarCP,new Color(128,37,199));
    }//GEN-LAST:event_lblComprarCPMouseExited

    private void lblComprarCPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarCPMouseEntered
        Metodos.mouseOn(lblComprarCP,new Color(152,76,211));
    }//GEN-LAST:event_lblComprarCPMouseEntered

    private void lblContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContaMouseExited
        Metodos.mouseOff(lblConta,new Color(137,77,255));
    }//GEN-LAST:event_lblContaMouseExited

    private void lblContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContaMouseEntered
        Metodos.mouseOn(lblConta,new Color(148,97,249));
    }//GEN-LAST:event_lblContaMouseEntered

    private void btnGame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGame2ActionPerformed
        jogo2 = new ContainerJogo2(email,senha);
        jogo2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGame2ActionPerformed

    private void lblGame2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame2MouseClicked
        jogo2 = new ContainerJogo2(email,senha);
        jogo2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblGame2MouseClicked

    private void lblGame1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame1MouseEntered
        lblGame1.setFont(new java.awt.Font("Adumu", 0, 15));
    }//GEN-LAST:event_lblGame1MouseEntered

    private void lblGame1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame1MouseExited
        lblGame1.setFont(new java.awt.Font("Adumu", 0, 14));
    }//GEN-LAST:event_lblGame1MouseExited

    private void lblGame2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame2MouseEntered
        lblGame2.setFont(new java.awt.Font("Adumu", 0, 15));
    }//GEN-LAST:event_lblGame2MouseEntered

    private void lblGame2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGame2MouseExited
        lblGame2.setFont(new java.awt.Font("Adumu", 0, 14));
    }//GEN-LAST:event_lblGame2MouseExited

    private void lblBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBibliotecaMouseClicked
        TelaBiblioteca telaBiblioteca = new TelaBiblioteca(apelido,email,senha);
        telaBiblioteca.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBibliotecaMouseClicked

    private void lblAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmigosMouseClicked
        TelaAmigos telaAmigos = new TelaAmigos(email,senha);
        telaAmigos.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAmigosMouseClicked

    private void lblComprarCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarCPMouseClicked
        TelaComprarCP telaCP = new TelaComprarCP(email,senha,"Inicio");
        telaCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblComprarCPMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGame1;
    private javax.swing.JButton btnGame2;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblComprarCP;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblGame1;
    private javax.swing.JLabel lblGame2;
    private javax.swing.JLabel lblGame3;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JPanel pnlParte1;
    private javax.swing.JPanel pnlParte2;
    private javax.swing.JSeparator spr1;
    private javax.swing.JSeparator spr2;
    private javax.swing.JSeparator spr3;
    private javax.swing.JSeparator sprLogoEmpresa;
    // End of variables declaration//GEN-END:variables
}
