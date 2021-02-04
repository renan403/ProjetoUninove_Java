package view.TelaTerciarias;

import data.Codigo;
import data.Cores;
import data.Email;
import data.Icone;
import data.Metodos;
import data.Usuario;
import data.UsuarioDao;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import static javax.swing.SwingConstants.CENTER;
import view.TelasPrincipais.TelaInicial;
import java.util.HashMap;
import java.util.Map;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaRecuperarSenha extends javax.swing.JFrame {
    
    private boolean vrfEmail=false, vrfTelefone=false, stt=false;
    
    public TelaRecuperarSenha() {
        initComponents();
        lblAvisoEmail.setVisible(false);
        lblAvisoTelefone.setVisible(false);
        lblAvisosGerais.setVisible(false);
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAvisoEmail = new javax.swing.JLabel();
        lblAvisoTelefone = new javax.swing.JLabel();
        btnRecSenha = new javax.swing.JButton();
        pnlCabecalho1 = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        lblRobo = new javax.swing.JLabel();
        lblFrase1 = new javax.swing.JLabel();
        lblFrase2 = new javax.swing.JLabel();
        lblFrase3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblAvisosGerais = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperação de Senha - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvisoEmail.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoEmail.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoEmail.setText("MENSAGEM EMAIL.");
        lblAvisoEmail.setToolTipText(null);
        getContentPane().add(lblAvisoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 310, -1));

        lblAvisoTelefone.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoTelefone.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoTelefone.setText("MENSAGEM TELEFONE.");
        lblAvisoTelefone.setToolTipText(null);
        getContentPane().add(lblAvisoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 310, -1));

        btnRecSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_de_play.png"))); // NOI18N
        btnRecSenha.setBorder(null);
        btnRecSenha.setBorderPainted(false);
        btnRecSenha.setContentAreaFilled(false);
        btnRecSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 328, 50, 50));

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
        pnlCabecalho1.add(lblRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 53, -1, -1));

        lblFrase1.setFont(new java.awt.Font("Adumu", 0, 20)); // NOI18N
        lblFrase1.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase1.setText("Esqueceu sua senha?");
        pnlCabecalho1.add(lblFrase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, -1));

        lblFrase2.setFont(new java.awt.Font("Adumu", 0, 20)); // NOI18N
        lblFrase2.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase2.setText("Informe seu e-mail");
        pnlCabecalho1.add(lblFrase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, -1));

        lblFrase3.setFont(new java.awt.Font("Adumu", 0, 20)); // NOI18N
        lblFrase3.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase3.setText("para redefini-la:");
        lblFrase3.setToolTipText("");
        pnlCabecalho1.add(lblFrase3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, -1));

        getContentPane().add(pnlCabecalho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 220));

        txtEmail.setBackground(new java.awt.Color(255, 182, 0));
        txtEmail.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 0, 153));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Insira seu e-mail.");
        txtEmail.setToolTipText(null);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(153, 0, 153));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setNextFocusableComponent(txtTelefone);
        txtEmail.setOpaque(false);
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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 213, 225, -1));

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(255, 182, 0));
        txtTelefone.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(109, 109, 109));
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefone.setText("Informe seu celular.");
        txtTelefone.setToolTipText(null);
        txtTelefone.setBorder(null);
        txtTelefone.setCaretColor(new java.awt.Color(153, 0, 153));
        txtTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefone.setNextFocusableComponent(btnRecSenha);
        txtTelefone.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 277, 225, -1));

        lblTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 263, -1, -1));

        lblAvisosGerais.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisosGerais.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisosGerais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisosGerais.setText("MENSAGEM ERRO.");
        lblAvisosGerais.setToolTipText(null);
        getContentPane().add(lblAvisosGerais, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 375, 310, -1));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_base.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        Metodos.placeholderOff(txtEmail, "Insira seu e-mail.");
        lblAvisosGerais.setVisible(false);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals(""))
            Metodos.placeholderOn(txtEmail, "Insira seu e-mail.");
    }//GEN-LAST:event_txtEmailFocusLost

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaInicial telaInit = new TelaInicial();
        telaInit.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnRecSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecSenhaActionPerformed
        if(vrfEmail==true && vrfTelefone==true)
        {
            final String email = txtEmail.getText();
            long telefone = Long.parseLong(txtTelefone.getText());
            boolean status;
            String apelido;
            int delay=100,intervalo=1;
            
            UsuarioDao dao = new UsuarioDao();
            
            lblAvisosGerais.setForeground(Cores.white);
            lblAvisosGerais.setText("Procurando e-mail...");
            lblAvisosGerais.setVisible(true);
            btnRecSenha.setEnabled(false);
            
            status = dao.conectar();
                            
                if(status==true)
                {
                    Usuario usuario = dao.recuperarSenha(email, telefone);
                        if(usuario==null)
                        {
                            lblAvisosGerais.setForeground(Cores.lightBlue);
                            lblAvisosGerais.setText("E-mail e/ou número de telefone incorreto(os).");
                            lblAvisosGerais.setVisible(true);
                        }
                        else
                        {              
                            Codigo cod = new Codigo();
                            String codigo = cod.gerarCod();

                            usuario.setCodigo(codigo);
                            apelido = usuario.getApelido();

                            stt = dao.enviarCodigo(usuario);
                                
                            if(stt==true)
                            {       
                                lblAvisosGerais.setForeground(Cores.white);
                                lblAvisosGerais.setText("Enviando e-mail, por favor aguarde!.");
                                lblAvisosGerais.setVisible(true);
                                btnRecSenha.setEnabled(false);
                                
                                Timer timer = new Timer();
                                timer.scheduleAtFixedRate(new TimerTask(){           
                                    public void run()
                                    {
                                        Email.setEmail(email);
                                        StringBuffer body
                                        = new StringBuffer();
                                        
                                        body.append("<html lang=pt-br><img src=\"cid:logo\" style=\"margin:0,auto,0,auto;width:100%;height:20%;\"/><br>");
                                        body.append("<h2 style=\"text-align:center;\">Olá, você solicitou por um codigo<br>");
                                        body.append("de recuperação de senha e aqui está:</h2><br>");
                                        body.append("<h3 style=\"text-align:center;\">"+ codigo +"</h3><br>");
                                        body.append("<h4 style=\"text-align:center;\">Entre novamente em nosso programa e coloque<br>");
                                        body.append("o codigo acima para finalizar o procedimento!.</h4>");
                                        body.append("</html>");

                                        // inline images
                                        Map<String, String> inlineImages = new HashMap<String, String>();
                                        inlineImages.put("logo", "src/Imagens/onthecode_1.png");

                                        try 
                                        {
                                            Email.enviar(body.toString(), inlineImages);
                                            timer.cancel();
                                        
                                            dao.desconectar();
                                            TelaCodigo telaCod = new TelaCodigo(apelido,email);
                                            telaCod.setVisible(true);
                                            dispose();
                                        } 
                                        catch (Exception ex) 
                                        {
                                            lblAvisosGerais.setForeground(Cores.lightRed);
                                            lblAvisosGerais.setText("Erro ao enviar e-mail, antivirus ativo.");
                                            btnRecSenha.setEnabled(true);
                                            ex.printStackTrace();
                                        }
                                    }
                                },delay,intervalo);
                            }
                            else
                            {
                                lblAvisosGerais.setForeground(Cores.lightRed);
                                lblAvisosGerais.setText("ERRO AO ENVIAR CÓDIGO AO BANCO DE DADOS.");
                                btnRecSenha.setEnabled(true);
                            } 
                        }
                    dao.desconectar();
                }
                else
                {
                    lblAvisosGerais.setForeground(Cores.lightRed);
                    lblAvisosGerais.setText("ERRO NA CONEXÃO.");
                    btnRecSenha.setEnabled(true);
                } 
            lblAvisosGerais.setVisible(true);
        }
        else
        {
            lblAvisosGerais.setForeground(Cores.lightRed);
            lblAvisosGerais.setText("PREENCHA TODOS OS CAMPOS CORRETAMENTE!.");
            btnRecSenha.setEnabled(true);
        }
    }//GEN-LAST:event_btnRecSenhaActionPerformed

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        if (txtTelefone.getText().equals("Informe seu celular.") && vrfEmail==true)
            Metodos.placeholderOff(txtTelefone, "Informe seu celular.");
            
        lblAvisosGerais.setVisible(false);
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if (txtTelefone.getText().equals(""))
            Metodos.placeholderOn(txtTelefone, "Informe seu celular.");
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        if(Metodos.validarTelefone(txtTelefone))
        {
            lblAvisoTelefone.setForeground(Cores.green);
            lblAvisoTelefone.setText("Formato de celular válido.");
            vrfTelefone = true;
        }
        else
        {
            lblAvisoTelefone.setForeground(Cores.lightRed);
            lblAvisoTelefone.setText("DDD+TELEFONE (Ex:11900000001)"); 
            vrfTelefone = false;
        }
            if(stt==false)
                btnRecSenha.setEnabled(true);
            
        lblAvisoTelefone.setVisible(true);
    }//GEN-LAST:event_txtTelefoneKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if(Metodos.validarEmail(txtEmail))
        {
            lblAvisoEmail.setForeground(Cores.green);
            lblAvisoEmail.setText("Formato de e-mail válido.");
            vrfEmail = true;
            lblAvisoEmail.setVisible(true); 
            txtTelefone.setEditable(true);
            txtTelefone.setForeground(Cores.purple);
        }
        else
        {
            lblAvisoEmail.setForeground(Cores.lightRed);
            lblAvisoEmail.setText("Formato de e-mail inválido.");
            vrfEmail = false;
            lblAvisoEmail.setVisible(true);
            txtTelefone.setEditable(false);
            lblAvisoTelefone.setVisible(false);
            txtTelefone.setForeground(Cores.darkGray);
            txtTelefone.setHorizontalAlignment(CENTER);
            txtTelefone.setText("Informe seu celular.");
        }  
        
        if(!(txtEmail.getText().equals("")) && !(txtTelefone.getText().equals("Informe seu celular.")))
        {
            txtTelefone.setForeground(Cores.black);
        }
        
        if(stt==false)
            btnRecSenha.setEnabled(true);
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnRecSenha.doClick();
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnRecSenha.doClick();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecSenha;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel lblAvisoEmail;
    private javax.swing.JLabel lblAvisoTelefone;
    private javax.swing.JLabel lblAvisosGerais;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFrase1;
    private javax.swing.JLabel lblFrase2;
    private javax.swing.JLabel lblFrase3;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRobo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlCabecalho1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
