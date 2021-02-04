package view.TelasPrincipais;

import data.Cores;
import data.Icone;
import data.Metodos;
import view.TelaTerciarias.TelaRecuperarSenha;
import view.TelaTerciarias.TelaCadastro;
import data.Usuario;
import data.UsuarioDao;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        txtSenha.setEchoChar((char)0);
        btnEsconderSenha.setVisible(false);
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMsgInicio = new javax.swing.JLabel();
        lblMsgLegenda = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnEsqueceuSenha = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblRegistrar = new javax.swing.JLabel();
        pnlCampos = new javax.swing.JPanel();
        sptEmail = new javax.swing.JSeparator();
        sptSenha = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnMostrarSenha = new javax.swing.JButton();
        btnEsconderSenha = new javax.swing.JButton();
        pnlEntrar = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        lblFundoParte2 = new javax.swing.JLabel();
        pnlParte1 = new javax.swing.JPanel();
        pnlEmpresa = new javax.swing.JPanel();
        lblNomeEmpresa = new javax.swing.JLabel();
        sptEmpresa = new javax.swing.JSeparator();
        lblFundoParte1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial - OTC");
        setMinimumSize(new java.awt.Dimension(820, 459));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMsgInicio.setBackground(new java.awt.Color(255, 255, 255));
        lblMsgInicio.setFont(new java.awt.Font("Adumu", 0, 36));
        lblMsgInicio.setForeground(new java.awt.Color(255, 182, 0));
        lblMsgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bem-vindo_degrade.png"))); // NOI18N
        getContentPane().add(lblMsgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 310, 90));

        lblMsgLegenda.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblMsgLegenda.setForeground(new java.awt.Color(255, 255, 255));
        lblMsgLegenda.setText("Faça LOGIN para continuar :D");
        lblMsgLegenda.setToolTipText(null);
        getContentPane().add(lblMsgLegenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 135, -1, -1));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaosair1.png"))); // NOI18N
        btnSair.setToolTipText(null);
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusPainted(false);
        btnSair.setNextFocusableComponent(txtEmail);
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaosair2.png"))); // NOI18N
        btnSair.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaosair2.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 12, -1, -1));

        btnEsqueceuSenha.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        btnEsqueceuSenha.setForeground(new java.awt.Color(255, 182, 0));
        btnEsqueceuSenha.setText("Esqueceu a senha?");
        btnEsqueceuSenha.setBorderPainted(false);
        btnEsqueceuSenha.setContentAreaFilled(false);
        btnEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsqueceuSenha.setFocusPainted(false);
        btnEsqueceuSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEsqueceuSenha.setNextFocusableComponent(btnRegistrar);
        btnEsqueceuSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEsqueceuSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEsqueceuSenhaMouseExited(evt);
            }
        });
        btnEsqueceuSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsqueceuSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 197, -1));

        btnRegistrar.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 182, 0));
        btnRegistrar.setText("aqui!.");
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 387, 45, 20));

        lblRegistrar.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(126, 126, 203));
        lblRegistrar.setLabelFor(btnRegistrar);
        lblRegistrar.setText("Não possui cadastro? Registre-se ");
        getContentPane().add(lblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 390, -1, -1));

        pnlCampos.setOpaque(false);
        pnlCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlCampos.add(sptEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 45, 227, 10));
        pnlCampos.add(sptSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 100, 227, 10));

        txtEmail.setBackground(new java.awt.Color(28, 9, 75));
        txtEmail.setFont(new java.awt.Font("Adumu", 0, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(228, 228, 228));
        txtEmail.setText("Digite seu e-mail.");
        txtEmail.setToolTipText(null);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(250, 181, 28));
        txtEmail.setNextFocusableComponent(txtSenha);
        txtEmail.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        pnlCampos.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, 236, 20));

        txtSenha.setBackground(new java.awt.Color(28, 9, 75));
        txtSenha.setFont(new java.awt.Font("Adumu", 0, 13)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(228, 228, 228));
        txtSenha.setText("Digite sua senha.");
        txtSenha.setToolTipText(null);
        txtSenha.setActionCommand("<Not Set>");
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(250, 181, 28));
        txtSenha.setEchoChar((char)0);
        txtSenha.setMargin(new java.awt.Insets(2, 2, 6, 2));
        txtSenha.setNextFocusableComponent(btnEntrar);
        txtSenha.setOpaque(false);
        txtSenha.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        pnlCampos.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 77, 207, 20));

        btnMostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeolho.png"))); // NOI18N
        btnMostrarSenha.setToolTipText("Mostrar senha");
        btnMostrarSenha.setBorder(null);
        btnMostrarSenha.setBorderPainted(false);
        btnMostrarSenha.setContentAreaFilled(false);
        btnMostrarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarSenha.setFocusPainted(false);
        btnMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarSenhaActionPerformed(evt);
            }
        });
        pnlCampos.add(btnMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 70, -1, 31));

        btnEsconderSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeolhobloqueio.png"))); // NOI18N
        btnEsconderSenha.setToolTipText("Esconder Senha");
        btnEsconderSenha.setBorder(null);
        btnEsconderSenha.setBorderPainted(false);
        btnEsconderSenha.setContentAreaFilled(false);
        btnEsconderSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEsconderSenha.setFocusPainted(false);
        btnEsconderSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsconderSenhaActionPerformed(evt);
            }
        });
        pnlCampos.add(btnEsconderSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 71, -1, 31));

        getContentPane().add(pnlCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 280, 120));

        pnlEntrar.setOpaque(false);
        pnlEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo.png"))); // NOI18N
        lblEmail.setLabelFor(txtEmail);
        lblEmail.setRequestFocusEnabled(false);
        pnlEntrar.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        lblSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo.png"))); // NOI18N
        pnlEntrar.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, -1, -1));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao.png"))); // NOI18N
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.setNextFocusableComponent(btnEsqueceuSenha);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlEntrar.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 125, 60, 60));

        getContentPane().add(pnlEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 280, 190));

        lblFundoParte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/parte2.png"))); // NOI18N
        getContentPane().add(lblFundoParte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 410, -1));

        pnlParte1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        pnlEmpresa.setOpaque(false);
        pnlEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeEmpresa.setFont(new java.awt.Font("Adumu", 0, 24)); // NOI18N
        lblNomeEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo1.png"))); // NOI18N
        lblNomeEmpresa.setText("<OnTheCode/>");
        pnlEmpresa.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 65, 270, 130));

        sptEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        sptEmpresa.setOpaque(true);
        sptEmpresa.setRequestFocusEnabled(false);
        pnlEmpresa.add(sptEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 140, 191, 4));

        pnlParte1.add(pnlEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 310, 160));

        lblFundoParte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/parte1.png"))); // NOI18N
        pnlParte1.add(lblFundoParte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlParte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEsqueceuSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaActionPerformed
        TelaRecuperarSenha telaRecSenha = new TelaRecuperarSenha();
        telaRecSenha.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEsqueceuSenhaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        TelaCadastro telaCadast = new TelaCadastro();
        telaCadast.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("Digite seu e-mail."))
        {
            txtEmail.setText("");
            txtEmail.setForeground(Cores.white);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals(""))
        {
            txtEmail.setText("Digite seu e-mail.");
            txtEmail.setForeground(Cores.gray);
        } 
    }//GEN-LAST:event_txtEmailFocusLost

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        UsuarioDao dao = new UsuarioDao();
        String email = txtEmail.getText();
        String senha = txtSenha.getText();
        boolean status;
        
        status = dao.conectar();
        
            if(status==true)
            {
                Usuario usuario = dao.entrar(email, senha);
                    if(usuario==null)
                        JOptionPane.showMessageDialog(null, "  E-mail ou senha inválidos!", "OTC - Ínicio", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));
                    else
                    {
                        TelaLogado telaOn = new TelaLogado(usuario.getApelido(),usuario.getEmail(),usuario.getSenha(),usuario.getScore1(),usuario.getScore2(),usuario.getAvatar());
                        telaOn.setVisible(true);
                        dispose();
                    }
                dao.desconectar();
            }
            else
                JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarSenhaActionPerformed
        if(txtSenha.getText().equals("Digite sua senha."))
            txtSenha.setText("");
        btnMostrarSenha.setVisible(false);
        txtSenha.setFont(new java.awt.Font("Adumu", 0, 13));
        txtSenha.setEchoChar((char)0);
        btnEsconderSenha.setVisible(true);
    }//GEN-LAST:event_btnMostrarSenhaActionPerformed

    private void btnEsconderSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsconderSenhaActionPerformed
        btnEsconderSenha.setVisible(false);
        txtSenha.setFont(new java.awt.Font("Adumu", 0, 20));
        txtSenha.setEchoChar((char)42);
        btnMostrarSenha.setVisible(true);
    }//GEN-LAST:event_btnEsconderSenhaActionPerformed

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        if(txtSenha.getText().equals("Digite sua senha."))
        {
            txtSenha.setText("");
            txtSenha.setFont(new java.awt.Font("Adumu", 0, 20));
            txtSenha.setForeground(Cores.white);
            txtSenha.setEchoChar((char)42);
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().equals(""))
        {
            txtSenha.setText("Digite sua senha.");
            txtSenha.setFont(new java.awt.Font("Adumu", 0, 13));
            txtSenha.setEchoChar((char)0);
            txtSenha.setForeground(Cores.gray);
            btnMostrarSenha.setVisible(true);
            btnEsconderSenha.setVisible(false);
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        Metodos.mouseOn(btnRegistrar,Cores.white);
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        Metodos.mouseOff(btnRegistrar,Cores.yellow);
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void btnEsqueceuSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaMouseEntered
        Metodos.mouseOn(btnEsqueceuSenha,Cores.white);
    }//GEN-LAST:event_btnEsqueceuSenhaMouseEntered

    private void btnEsqueceuSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsqueceuSenhaMouseExited
        Metodos.mouseOff(btnEsqueceuSenha,Cores.yellow);
    }//GEN-LAST:event_btnEsqueceuSenhaMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsconderSenha;
    private javax.swing.JButton btnEsqueceuSenha;
    private javax.swing.JButton btnMostrarSenha;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundoParte1;
    private javax.swing.JLabel lblFundoParte2;
    private javax.swing.JLabel lblMsgInicio;
    private javax.swing.JLabel lblMsgLegenda;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlEmpresa;
    private javax.swing.JPanel pnlEntrar;
    private javax.swing.JPanel pnlParte1;
    private javax.swing.JSeparator sptEmail;
    private javax.swing.JSeparator sptEmpresa;
    private javax.swing.JSeparator sptSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
