package view.TelaTerciarias;

import data.Cores;
import data.Icone;
import data.Metodos;
import data.Usuario;
import data.UsuarioDao;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.TelasPrincipais.TelaInicial;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaTrocarSenha extends javax.swing.JFrame {
    
    private String senha1="Invalido1",senha2="Invalido2",email,codigoBD;
    private boolean vrfSenha=false,vrfConfSenha=false;
    
    public TelaTrocarSenha() { 
    }

    TelaTrocarSenha(String apelido, String email, String codigoBD) {
       initComponents();
       lblAvisoSenha.setVisible(false);
       lblAvisoConfSenha.setVisible(false);
       lblApelido.setText("Apelido: "+ apelido);
       this.email = email;
       this.codigoBD = codigoBD;
       Icone icon = new Icone();
       icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAvisoSenha = new javax.swing.JLabel();
        lblAvisoConfSenha = new javax.swing.JLabel();
        btnTrocarSenha = new javax.swing.JButton();
        pnlCabecalho1 = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        lblRobo = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblFrase1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtConfSenha = new javax.swing.JTextField();
        lblConfSenha = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperação de Senha - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvisoSenha.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoSenha.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoSenha.setText("MENSAGEM SENHA.");
        lblAvisoSenha.setToolTipText(null);
        getContentPane().add(lblAvisoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 310, -1));

        lblAvisoConfSenha.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoConfSenha.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoConfSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoConfSenha.setText("MENSAGEM CONFIRMAÇÃO SENHA.");
        lblAvisoConfSenha.setToolTipText(null);
        getContentPane().add(lblAvisoConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 310, -1));

        btnTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_de_play.png"))); // NOI18N
        btnTrocarSenha.setBorder(null);
        btnTrocarSenha.setBorderPainted(false);
        btnTrocarSenha.setContentAreaFilled(false);
        btnTrocarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrocarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 328, 50, 50));

        pnlCabecalho1.setOpaque(false);
        pnlCabecalho1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaovoltar1.png"))); // NOI18N
        btnVoltar1.setBorder(null);
        btnVoltar1.setBorderPainted(false);
        btnVoltar1.setContentAreaFilled(false);
        btnVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar1.setFocusPainted(false);
        btnVoltar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaovoltar2.png"))); // NOI18N
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        pnlCabecalho1.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, 30, 30));

        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo.png"))); // NOI18N
        pnlCabecalho1.add(lblRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 73, -1, -1));

        lblApelido.setFont(new java.awt.Font("Adumu", 0, 12)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApelido.setText("Apelido: (APELIDO DO CARA)");
        pnlCabecalho1.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, -1));

        lblFrase1.setFont(new java.awt.Font("Adumu", 0, 20)); // NOI18N
        lblFrase1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase1.setText("Informe sua nova senha:");
        pnlCabecalho1.add(lblFrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 165, 310, -1));

        getContentPane().add(pnlCabecalho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

        txtSenha.setBackground(new java.awt.Color(255, 182, 0));
        txtSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("Insira a nova senha.");
        txtSenha.setToolTipText(null);
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSenha.setNextFocusableComponent(txtConfSenha);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 213, 225, -1));

        lblSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtConfSenha.setBackground(new java.awt.Color(255, 182, 0));
        txtConfSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtConfSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtConfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfSenha.setText("Repita a nova senha.");
        txtConfSenha.setToolTipText(null);
        txtConfSenha.setBorder(null);
        txtConfSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtConfSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConfSenha.setNextFocusableComponent(btnTrocarSenha);
        txtConfSenha.setOpaque(false);
        txtConfSenha.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtConfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfSenhaFocusLost(evt);
            }
        });
        txtConfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfSenhaKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 276, 225, -1));

        lblConfSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        getContentPane().add(lblConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_base.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        Metodos.placeholderOff(txtSenha, "Insira a nova senha.");
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtSenha, "Insira a nova senha.");
            senha1="Invalido1"; //valor para ficar diferente da senha2
            lblAvisoSenha.setVisible(false);
        } 
        else
            senha1 = txtSenha.getText();
    }//GEN-LAST:event_txtSenhaFocusLost

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaInicial telaInit = new TelaInicial();
        telaInit.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarSenhaActionPerformed
        if(vrfSenha==true && vrfConfSenha==true){
            UsuarioDao dao = new UsuarioDao();
        // ONDE VERIFICA SE AS SENHAS BATEM PARA DAR UPDATE NA CONTA DO APELIDO MENCIONADO (TAMBEM DO EMAIL ANTERIOR)
            boolean status;
            Usuario usuario = new Usuario();
            status = dao.conectar();
            
                if(status==true)
                {
                    usuario.setSenha(txtSenha.getText());
                    usuario.setEmail(email);
                    usuario.setCodigo(codigoBD);
                    status = dao.trocarSenhaCod(usuario);
                        if(status==true)
                        {
                            email="";
                            codigoBD="";
                            TelaInicial telaInit = new TelaInicial();
                            telaInit.setVisible(true);
                            dispose();
                            JOptionPane.showMessageDialog(null,"Senha alterada com Sucesso!", "OTC - Troca de Senha", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Erro ao trocar senha.");
                    dao.desconectar();
                }
                else
                    JOptionPane.showMessageDialog(null,"ERRO AO SE CONECTAR COM BANCO DE DADOS.");
        }
    }//GEN-LAST:event_btnTrocarSenhaActionPerformed

    private void txtConfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfSenhaFocusGained
        if (txtConfSenha.getText().equals("Repita a nova senha."))
        {
            Metodos.placeholderOff(txtConfSenha, "Repita a nova senha.");
            lblAvisoConfSenha.setVisible(false);
        }
    }//GEN-LAST:event_txtConfSenhaFocusGained

    private void txtConfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfSenhaFocusLost
        if (txtConfSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtConfSenha, "Repita a nova senha.");
            senha2="Invalido2"; //valor para ficar diferente da senha1
        }
        else
            senha2=txtConfSenha.getText();
    }//GEN-LAST:event_txtConfSenhaFocusLost

    private void txtConfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfSenhaKeyReleased
        if(!(txtConfSenha.getText().equals(senha1)))
        {
            lblAvisoConfSenha.setForeground(Cores.lightRed);
            lblAvisoConfSenha.setText("As senhas não conferem."); 
            vrfConfSenha = false;
        }    
        else if(txtConfSenha.getText().equals(senha1))
        {
            lblAvisoConfSenha.setForeground(Cores.green);
            lblAvisoConfSenha.setText("As senhas conferem."); 
            vrfConfSenha = true;
        }  
        lblAvisoConfSenha.setVisible(true);
    }//GEN-LAST:event_txtConfSenhaKeyReleased

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        if(Metodos.validarSenha(txtSenha))
        {
            lblAvisoSenha.setForeground(Cores.green);
            lblAvisoSenha.setText("Senha válida.");
            vrfSenha = true;
        }
        else
        {
            lblAvisoSenha.setForeground(Cores.lightRed);
            lblAvisoSenha.setText("Senha inválida (6-20 caracteres)."); 
            vrfSenha = false;
        }     
        lblAvisoSenha.setVisible(true);
            
            if(!(txtSenha.getText().equals(senha2)))
            {
                lblAvisoConfSenha.setForeground(Cores.lightRed);
                lblAvisoConfSenha.setText("As senhas não conferem.");
                vrfConfSenha = false;
            }    
            else if((txtSenha.getText().equals(senha2)))
            {
                lblAvisoConfSenha.setForeground(Cores.green);
                lblAvisoConfSenha.setText("As senhas conferem."); 
                vrfConfSenha = true;
            }
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnTrocarSenha.doClick();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtConfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnTrocarSenha.doClick();
        }
    }//GEN-LAST:event_txtConfSenhaKeyPressed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRecuperarSenha().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrocarSenha;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblAvisoConfSenha;
    private javax.swing.JLabel lblAvisoSenha;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRobo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlCabecalho1;
    private javax.swing.JTextField txtConfSenha;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
