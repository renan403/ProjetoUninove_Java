package view.TelasPrincipais;

import data.Icone;
import data.Metodos;
import data.Usuario;
import data.UsuarioDao;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaConta extends javax.swing.JFrame {

    private String senha1="",senha2="",senhaAtual="",email,apelido,senha;
    private int score1,score2;
    private char avatar;
    private boolean vrfSenhaAtual=false,vrfNovaSenha=false,vrfConfNovaSenha=false;
    
    public TelaConta() {
    }

    TelaConta(String apelido, String email, String senha, int score1, int score2, char avatar) {
        initComponents();
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblApelidoInfo.setText(apelido);
        lblEmailInfo.setText(email);
        lblPontuacaoInfo.setText(score1 + " e " + score2);
        this.apelido = apelido;
        this.email = email;
        this.score1 = score1;
        this.score2 = score2;
        this.avatar = avatar;
        this.senha = senha;
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInfos = new javax.swing.JPanel();
        lblApelidoInfo = new javax.swing.JLabel();
        lblEmailInfo = new javax.swing.JLabel();
        lblPontuacaoInfo = new javax.swing.JLabel();
        pnlCabecalho = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lblApelido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        lblSimbolo = new javax.swing.JLabel();
        sprtCabecalho = new javax.swing.JSeparator();
        lblMensagem = new javax.swing.JLabel();
        pnlAlterarSenha = new javax.swing.JPanel();
        txtSenhaAtual = new javax.swing.JTextField();
        txtNovaSenha = new javax.swing.JTextField();
        txtConfNovaSenha = new javax.swing.JTextField();
        btnAlterarSenha = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        lblSenhaAtual = new javax.swing.JLabel();
        lblNovaSenha = new javax.swing.JLabel();
        lblConfNovaSenha = new javax.swing.JLabel();
        pnlRobo = new javax.swing.JPanel();
        lblMensagemRobo = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        lblRobo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conta - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInfos.setOpaque(false);
        pnlInfos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApelidoInfo.setFont(new java.awt.Font("Adumu", 0, 12)); // NOI18N
        lblApelidoInfo.setForeground(new java.awt.Color(51, 255, 0));
        lblApelidoInfo.setText("Apelido do cara");
        pnlInfos.add(lblApelidoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 210, 20));

        lblEmailInfo.setFont(new java.awt.Font("Adumu", 0, 12)); // NOI18N
        lblEmailInfo.setForeground(new java.awt.Color(51, 255, 0));
        lblEmailInfo.setText("E-mail do cara.");
        pnlInfos.add(lblEmailInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 47, 250, 20));

        lblPontuacaoInfo.setFont(new java.awt.Font("Adumu", 0, 12)); // NOI18N
        lblPontuacaoInfo.setForeground(new java.awt.Color(51, 255, 0));
        lblPontuacaoInfo.setText("Scores do cara.");
        pnlInfos.add(lblPontuacaoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 160, 20));

        getContentPane().add(pnlInfos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 250, 110));

        pnlCabecalho.setOpaque(false);
        pnlCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta1.png"))); // NOI18N
        btnVoltar.setToolTipText(null);
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.setNextFocusableComponent(txtSenhaAtual);
        btnVoltar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta2.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlCabecalho.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 25, 50, 40));

        lblApelido.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setText("Apelido:");
        pnlCabecalho.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 35, 160, 20));

        lblEmail.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail:");
        pnlCabecalho.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 65, 160, 20));

        lblPontuacao.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setText("Scores:");
        pnlCabecalho.add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 95, 160, 20));

        lblSimbolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeProtecao.png"))); // NOI18N
        pnlCabecalho.add(lblSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 29, -1, -1));

        getContentPane().add(pnlCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 130));

        sprtCabecalho.setBackground(new java.awt.Color(30, 142, 247));
        sprtCabecalho.setForeground(new java.awt.Color(30, 142, 247));
        sprtCabecalho.setOpaque(true);
        getContentPane().add(sprtCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 133, 480, 6));

        lblMensagem.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setText("Deseja alterar sua senha?");
        lblMensagem.setToolTipText("");
        getContentPane().add(lblMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 160, -1, -1));

        pnlAlterarSenha.setOpaque(false);
        pnlAlterarSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenhaAtual.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtSenhaAtual.setForeground(new java.awt.Color(153, 0, 153));
        txtSenhaAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenhaAtual.setText("Informe a senha atual.");
        txtSenhaAtual.setToolTipText(null);
        txtSenhaAtual.setBorder(null);
        txtSenhaAtual.setCaretColor(new java.awt.Color(153, 0, 153));
        txtSenhaAtual.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSenhaAtual.setNextFocusableComponent(txtNovaSenha);
        txtSenhaAtual.setOpaque(false);
        txtSenhaAtual.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtSenhaAtual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaAtualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaAtualFocusLost(evt);
            }
        });
        txtSenhaAtual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaAtualKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaAtualKeyReleased(evt);
            }
        });
        pnlAlterarSenha.add(txtSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 49, 197, -1));

        txtNovaSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtNovaSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtNovaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNovaSenha.setText("Insira a nova senha.");
        txtNovaSenha.setToolTipText(null);
        txtNovaSenha.setBorder(null);
        txtNovaSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNovaSenha.setNextFocusableComponent(txtConfNovaSenha);
        txtNovaSenha.setOpaque(false);
        txtNovaSenha.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtNovaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNovaSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNovaSenhaFocusLost(evt);
            }
        });
        txtNovaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNovaSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNovaSenhaKeyReleased(evt);
            }
        });
        pnlAlterarSenha.add(txtNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 197, -1));

        txtConfNovaSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtConfNovaSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtConfNovaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfNovaSenha.setText("Repita a nova senha.");
        txtConfNovaSenha.setToolTipText(null);
        txtConfNovaSenha.setBorder(null);
        txtConfNovaSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtConfNovaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConfNovaSenha.setNextFocusableComponent(btnAlterarSenha);
        txtConfNovaSenha.setOpaque(false);
        txtConfNovaSenha.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtConfNovaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfNovaSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfNovaSenhaFocusLost(evt);
            }
        });
        txtConfNovaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfNovaSenhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfNovaSenhaKeyReleased(evt);
            }
        });
        pnlAlterarSenha.add(txtConfNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 151, 197, -1));

        btnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao2.png"))); // NOI18N
        btnAlterarSenha.setToolTipText(null);
        btnAlterarSenha.setBorder(null);
        btnAlterarSenha.setBorderPainted(false);
        btnAlterarSenha.setContentAreaFilled(false);
        btnAlterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarSenha.setFocusPainted(false);
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });
        pnlAlterarSenha.add(btnAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 187, -1, -1));

        getContentPane().add(pnlAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 340, 250));

        pnlCampos.setOpaque(false);
        pnlCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSenhaAtual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo3.png"))); // NOI18N
        pnlCampos.add(lblSenhaAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 29, -1, -1));

        lblNovaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo3.png"))); // NOI18N
        pnlCampos.add(lblNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 80, -1, -1));

        lblConfNovaSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo3.png"))); // NOI18N
        pnlCampos.add(lblConfNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 131, -1, -1));

        getContentPane().add(pnlCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 340, 180));

        pnlRobo.setOpaque(false);
        pnlRobo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensagemRobo.setBackground(new java.awt.Color(30, 142, 247));
        lblMensagemRobo.setFont(new java.awt.Font("Gill Sans MT", 1, 10)); // NOI18N
        lblMensagemRobo.setForeground(new java.awt.Color(30, 142, 247));
        lblMensagemRobo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagemRobo.setText("MENSAGEM ROBO");
        pnlRobo.add(lblMensagemRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 25, 140, 65));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/balao.png"))); // NOI18N
        pnlRobo.add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png"))); // NOI18N
        pnlRobo.add(lblRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 95, -1, -1));

        getContentPane().add(pnlRobo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 240, 230));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_base3_4.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogado telaOn = new TelaLogado(apelido,email,senha,score1,score2,avatar);
        telaOn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNovaSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovaSenhaFocusGained
        Metodos.placeholderOff(txtNovaSenha, "Insira a nova senha.");
        
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo2.png")));
    }//GEN-LAST:event_txtNovaSenhaFocusGained

    private void txtNovaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNovaSenhaFocusLost
        if (txtNovaSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtNovaSenha, "Insira a nova senha.");
            senha1="Invalido1"; //valor para ficar diferente da senha2
        }
        else
            senha1 = txtNovaSenha.getText();
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
    }//GEN-LAST:event_txtNovaSenhaFocusLost

    private void txtNovaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovaSenhaKeyReleased
        if(Metodos.validarSenha(txtNovaSenha))
        {
            if(txtNovaSenha.getText().equals(senhaAtual))
            {
                lblMensagemRobo.setText("<html><p>A nova senha não pode<br>ser equivalente a atual.</p></html>");
                vrfNovaSenha = false;
            }
            else
            {
                lblMensagemRobo.setText("<html><p>Senha válida.</p></html>");
                vrfNovaSenha = true;   
            } 
        }
        else
        {
            lblMensagemRobo.setText("<html><p>Senha inválida<br>(6-20 caracteres).</p></html>");
            vrfNovaSenha = false;
        }

        if(!(txtNovaSenha.getText().equals(senha2)))
        {
            vrfConfNovaSenha = false;
        }    
        else if(txtNovaSenha.getText().equals(senha2))
        {
            vrfConfNovaSenha = true;
        }  
        lblBalao.setVisible(true);
        lblMensagemRobo.setVisible(true);    
            
            
            
        lblBalao.setVisible(true);
        lblMensagemRobo.setVisible(true);
    }//GEN-LAST:event_txtNovaSenhaKeyReleased

    private void txtConfNovaSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfNovaSenhaFocusGained
        Metodos.placeholderOff(txtConfNovaSenha, "Repita a nova senha.");
        
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo3.png")));
    }//GEN-LAST:event_txtConfNovaSenhaFocusGained

    private void txtConfNovaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfNovaSenhaFocusLost
        if (txtConfNovaSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtConfNovaSenha, "Repita a nova senha.");
            senha2="Invalido2"; //valor para ficar diferente da senha1
        }
        else
            senha2=txtConfNovaSenha.getText();
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
    }//GEN-LAST:event_txtConfNovaSenhaFocusLost

    private void txtConfNovaSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfNovaSenhaKeyReleased
        if(!(txtConfNovaSenha.getText().equals(senha1)))
        {
            lblMensagemRobo.setText("<html><p>As senhas não conferem.</p></html>"); 
            vrfConfNovaSenha = false;
        }    
        else if(txtConfNovaSenha.getText().equals(senha1))
        {
            lblMensagemRobo.setText("<html><p>As senhas conferem.</p></html>"); 
            vrfConfNovaSenha = true;
        }  
        lblBalao.setVisible(true);
        lblMensagemRobo.setVisible(true);
    }//GEN-LAST:event_txtConfNovaSenhaKeyReleased

    private void txtSenhaAtualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaAtualFocusGained
        Metodos.placeholderOff(txtSenhaAtual, "Informe a senha atual.");
        
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robo1.png")));
    }//GEN-LAST:event_txtSenhaAtualFocusGained

    private void txtSenhaAtualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaAtualFocusLost
        if (txtSenhaAtual.getText().equals(""))
            Metodos.placeholderOn(txtSenhaAtual, "Informe a senha atual.");
        else
            senhaAtual = txtSenhaAtual.getText();
        
        lblBalao.setVisible(false);
        lblMensagemRobo.setVisible(false);
        lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
    }//GEN-LAST:event_txtSenhaAtualFocusLost

    private void txtSenhaAtualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaAtualKeyReleased
        if(Metodos.validarSenha(txtSenhaAtual))
        {
            lblMensagemRobo.setText("<html><p>Senha válida.</p></html>");
            vrfSenhaAtual = true;
        }
        else
        {
            lblMensagemRobo.setText("<html><p>Senha inválida<br>(6-20 caracteres).</p></html>");
            vrfSenhaAtual = false;
        }

            if(!(txtSenhaAtual.getText().equals(txtNovaSenha.getText())))
            {
                vrfNovaSenha = true;
            }    
            else if(txtSenhaAtual.getText().equals(txtNovaSenha.getText()))
            {
                vrfNovaSenha = false;
            }  
        
        lblBalao.setVisible(true);
        lblMensagemRobo.setVisible(true);
    }//GEN-LAST:event_txtSenhaAtualKeyReleased

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        boolean status;
        UsuarioDao dao = new UsuarioDao();
        
        if(vrfSenhaAtual==true && vrfNovaSenha==true && vrfConfNovaSenha==true)
        {
            status = dao.conectar();
            if(status==true)
            {
                Usuario usuario = dao.verificarSenha(email);
                    if(usuario==null)
                        JOptionPane.showMessageDialog(null, "Usuario não encontrado.");
                    else
                    {
                        if(txtSenhaAtual.getText().equals(usuario.getSenha()))
                        {
                            usuario.setSenha(txtNovaSenha.getText());
                            status = dao.trocarSenha(usuario);
                            if(status==true)
                            {
                                lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
                                JOptionPane.showMessageDialog(null,"Senha alterada com Sucesso!", "OTC - Troca de Senha", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                                senha = usuario.getSenha();
                                TelaLogado telaOn = new TelaLogado(apelido,email,senha,score1,score2,avatar);
                                telaOn.setVisible(true);
                                dispose();
                            }     
                            else
                            {
                                lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
                                lblMensagemRobo.setText("<html><p>Erro ao alterar senha.</p></html>");
                                lblBalao.setVisible(true);
                                lblMensagemRobo.setVisible(true);
                            }
                        }
                        else
                        {
                            lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
                            lblMensagemRobo.setText("<html><p>Senha atual inválida.</p></html>");
                            lblBalao.setVisible(true);
                            lblMensagemRobo.setVisible(true);
                        }
                    }
                dao.desconectar();
            }
            else
            {
                lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
                lblMensagemRobo.setText("<html><p>Erro ao se conectar<br>com banco de dados.</p></html>");
                lblBalao.setVisible(true);
                lblMensagemRobo.setVisible(true);
            }
        }
        else
        {
            lblRobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/robopadrao.png")));
            lblMensagemRobo.setText("<html><p>Preencha todos os<br>campos corretamente.</p></html>");
            lblBalao.setVisible(true);
            lblMensagemRobo.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void txtConfNovaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfNovaSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          btnAlterarSenha.doClick();
        }
    }//GEN-LAST:event_txtConfNovaSenhaKeyPressed

    private void txtSenhaAtualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaAtualKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnAlterarSenha.doClick();
        }
    }//GEN-LAST:event_txtSenhaAtualKeyPressed

    private void txtNovaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovaSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnAlterarSenha.doClick();
        }
    }//GEN-LAST:event_txtNovaSenhaKeyPressed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConta().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblApelidoInfo;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblConfNovaSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailInfo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblMensagemRobo;
    private javax.swing.JLabel lblNovaSenha;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblPontuacaoInfo;
    private javax.swing.JLabel lblRobo;
    private javax.swing.JLabel lblSenhaAtual;
    private javax.swing.JLabel lblSimbolo;
    private javax.swing.JPanel pnlAlterarSenha;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlInfos;
    private javax.swing.JPanel pnlRobo;
    private javax.swing.JSeparator sprtCabecalho;
    private javax.swing.JTextField txtConfNovaSenha;
    private javax.swing.JTextField txtNovaSenha;
    private javax.swing.JTextField txtSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
