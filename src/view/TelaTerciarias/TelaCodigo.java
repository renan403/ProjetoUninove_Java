package view.TelaTerciarias;

import data.Cores;
import data.Icone;
import data.Metodos;
import data.Usuario;
import data.UsuarioDao;
import java.awt.event.KeyEvent;
import view.TelasPrincipais.TelaInicial;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaCodigo extends javax.swing.JFrame {

    private String email, apelido;
    private boolean vrfCodigo=false;
    
    public TelaCodigo() {
        initComponents();
    }

    public TelaCodigo(String apelido, String email){
        initComponents();
        this.email = email;
        this.apelido = apelido;
        lblApelido.setText("Apelido: "+ apelido);
        lblAvisoCodigo.setForeground(Cores.green);
        lblAvisoCodigo.setText("Código enviado, cheque seu e-mail.");
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar1 = new javax.swing.JButton();
        btnConfCodigo = new javax.swing.JButton();
        lblAvisoCodigo = new javax.swing.JLabel();
        lblRobo = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblFrase1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperação de Senha - OTC");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, 30, 30));

        btnConfCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_de_play.png"))); // NOI18N
        btnConfCodigo.setToolTipText(null);
        btnConfCodigo.setBorder(null);
        btnConfCodigo.setBorderPainted(false);
        btnConfCodigo.setContentAreaFilled(false);
        btnConfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 259, 50, 50));

        lblAvisoCodigo.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoCodigo.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoCodigo.setText("MENSAGEM CÓDIGO.");
        lblAvisoCodigo.setToolTipText(null);
        getContentPane().add(lblAvisoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 310, -1));

        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo.png"))); // NOI18N
        lblRobo.setToolTipText(null);
        getContentPane().add(lblRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 73, -1, -1));

        lblApelido.setFont(new java.awt.Font("Adumu", 0, 12)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApelido.setText("Apelido: (APELIDO DO CARA)");
        lblApelido.setToolTipText(null);
        getContentPane().add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, -1));

        lblFrase1.setFont(new java.awt.Font("Adumu", 0, 20)); // NOI18N
        lblFrase1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase1.setText("Insira o código:");
        lblFrase1.setToolTipText(null);
        lblFrase1.setAutoscrolls(true);
        getContentPane().add(lblFrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 310, -1));

        txtCodigo.setBackground(new java.awt.Color(255, 182, 0));
        txtCodigo.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(153, 0, 153));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setText("Informe o código recebido.");
        txtCodigo.setToolTipText(null);
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(153, 0, 153));
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCodigo.setOpaque(false);
        txtCodigo.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 204, 225, -1));

        lblCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        lblCodigo.setToolTipText(null);
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, -1, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_base4.png"))); // NOI18N
        lblFundo.setToolTipText(null);
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        if (txtCodigo.getText().equals("Informe o código recebido."))
        {
            Metodos.placeholderOff(txtCodigo, "Informe o código recebido.");
            vrfCodigo=false;
        }
        else
            vrfCodigo=true;
    }//GEN-LAST:event_txtCodigoFocusGained

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if (txtCodigo.getText().equals(""))
        {
            Metodos.placeholderOn(txtCodigo, "Informe o código recebido.");
            lblAvisoCodigo.setVisible(false);
            vrfCodigo=false;
        }
        else
            vrfCodigo=true;
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnConfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfCodigoActionPerformed
        if(vrfCodigo==true)
        {
            UsuarioDao dao = new UsuarioDao();
            boolean status;
            
            status = dao.conectar();
            
                if(status==true)
                {
                    Usuario usuario = dao.verificarCodigo(email);
                    
                        if(txtCodigo.getText().equals(usuario.getCodigo()))
                        {
                            TelaTrocarSenha telaTrocarSenha = new TelaTrocarSenha(apelido,email,usuario.getCodigo());
                            telaTrocarSenha.setVisible(true);
                            dispose();
                        }
                        else
                        {
                            lblAvisoCodigo.setVisible(true);
                            lblAvisoCodigo.setForeground(Cores.lightRed);
                            lblAvisoCodigo.setText("Código inválido."); 
                        }    
                    dao.desconectar();
                }
        }
    }//GEN-LAST:event_btnConfCodigoActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaInicial telaInit = new TelaInicial();
        telaInit.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnConfCodigo.doClick();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfCodigo;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblAvisoCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRobo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
