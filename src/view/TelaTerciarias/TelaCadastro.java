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
public class TelaCadastro extends javax.swing.JFrame {

    private String senha1="Invalido1",senha2="Invalido2";
    private boolean vrfApelido=false,vrfEmail=false,vrfSenha=false,vrfConfSenha=false,vrfTelefone=false;
            
    public TelaCadastro() {
        initComponents();
        lblAvisoConfSenha.setVisible(false);
        lblAvisoSenha.setVisible(false);
        lblAvisoApelido.setVisible(false);
        lblAvisoEmail.setVisible(false);
        lblAvisoTelefone.setVisible(false);
        lblAvisoCampos.setVisible(false);
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAvisoApelido = new javax.swing.JLabel();
        lblAvisoEmail = new javax.swing.JLabel();
        lblAvisoSenha = new javax.swing.JLabel();
        lblAvisoConfSenha = new javax.swing.JLabel();
        lblAvisoTelefone = new javax.swing.JLabel();
        lblAvisoCampos = new javax.swing.JLabel();
        pnlCampos = new javax.swing.JPanel();
        txtApelido = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtConfSenha = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        pblRegistrar = new javax.swing.JPanel();
        lblApelido = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfSenha = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        pnlCabecalho = new javax.swing.JPanel();
        lblRegistre = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvisoApelido.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoApelido.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoApelido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoApelido.setText("MENSAGEM APELIDO.");
        getContentPane().add(lblAvisoApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 310, -1));

        lblAvisoEmail.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoEmail.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoEmail.setText("MENSAGEM EMAIL.");
        getContentPane().add(lblAvisoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 126, 310, -1));

        lblAvisoSenha.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoSenha.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoSenha.setText("MENSAGEM SENHA.");
        getContentPane().add(lblAvisoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 310, -1));

        lblAvisoConfSenha.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoConfSenha.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoConfSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoConfSenha.setText("MENSAGEM CONFIRMAÇÃO SENHA.");
        getContentPane().add(lblAvisoConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 310, -1));

        lblAvisoTelefone.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoTelefone.setForeground(new java.awt.Color(255, 255, 0));
        lblAvisoTelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoTelefone.setText("MENSAGEM TELEFONE.");
        getContentPane().add(lblAvisoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 274, 310, -1));

        lblAvisoCampos.setFont(new java.awt.Font("Adumu", 0, 11)); // NOI18N
        lblAvisoCampos.setForeground(new java.awt.Color(221, 0, 0));
        lblAvisoCampos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoCampos.setText("PREENCHA TODOS OS CAMPOS CORRETAMENTE!.");
        getContentPane().add(lblAvisoCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 274, 310, -1));

        pnlCampos.setOpaque(false);
        pnlCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApelido.setBackground(new java.awt.Color(255, 182, 0));
        txtApelido.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtApelido.setForeground(new java.awt.Color(153, 0, 153));
        txtApelido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApelido.setText("Insira seu apelido.");
        txtApelido.setToolTipText(null);
        txtApelido.setBorder(null);
        txtApelido.setCaretColor(new java.awt.Color(153, 0, 153));
        txtApelido.setNextFocusableComponent(txtEmail);
        txtApelido.setOpaque(false);
        txtApelido.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtApelido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApelidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApelidoFocusLost(evt);
            }
        });
        txtApelido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApelidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApelidoKeyReleased(evt);
            }
        });
        pnlCampos.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 20, 225, -1));

        txtEmail.setBackground(new java.awt.Color(255, 182, 0));
        txtEmail.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 0, 153));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("Informe seu e-mail.");
        txtEmail.setToolTipText(null);
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(153, 0, 153));
        txtEmail.setNextFocusableComponent(txtSenha);
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
        pnlCampos.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 20, 225, -1));

        txtSenha.setBackground(new java.awt.Color(255, 182, 0));
        txtSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("Digite sua senha.");
        txtSenha.setToolTipText(null);
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtSenha.setNextFocusableComponent(txtConfSenha);
        txtSenha.setOpaque(false);
        txtSenha.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtSenha.setSelectionEnd(19);
        txtSenha.setSelectionStart(19);
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
        pnlCampos.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 94, 225, -1));

        txtConfSenha.setBackground(new java.awt.Color(255, 182, 0));
        txtConfSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtConfSenha.setForeground(new java.awt.Color(153, 0, 153));
        txtConfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfSenha.setText("Confirme sua senha.");
        txtConfSenha.setToolTipText(null);
        txtConfSenha.setBorder(null);
        txtConfSenha.setCaretColor(new java.awt.Color(153, 0, 153));
        txtConfSenha.setNextFocusableComponent(txtTelefone);
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
        pnlCampos.add(txtConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 94, 225, -1));

        txtTelefone.setBackground(new java.awt.Color(255, 182, 0));
        txtTelefone.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(153, 0, 153));
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefone.setText("Informe seu celular.");
        txtTelefone.setToolTipText(null);
        txtTelefone.setBorder(null);
        txtTelefone.setCaretColor(new java.awt.Color(153, 0, 153));
        txtTelefone.setNextFocusableComponent(btnCadastrar);
        txtTelefone.setOpaque(false);
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
        pnlCampos.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 168, 225, -1));

        btnCadastrar.setFont(new java.awt.Font("Adumu", 0, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 123, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar1.png"))); // NOI18N
        btnCadastrar.setToolTipText(null);
        btnCadastrar.setAlignmentY(0.0F);
        btnCadastrar.setBorder(null);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlCampos.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 154, 197, 45));

        getContentPane().add(pnlCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 570, 200));

        pblRegistrar.setOpaque(false);
        pblRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApelido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        lblApelido.setLabelFor(txtApelido);
        pblRegistrar.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 6, -1, -1));

        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        pblRegistrar.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 6, -1, -1));

        lblSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        pblRegistrar.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 80, -1, -1));

        lblConfSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        pblRegistrar.add(lblConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 80, -1, -1));

        lblTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/campo2.png"))); // NOI18N
        pblRegistrar.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 154, -1, -1));

        getContentPane().add(pblRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 570, 210));

        pnlCabecalho.setOpaque(false);
        pnlCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistre.setFont(new java.awt.Font("Adumu", 0, 30)); // NOI18N
        lblRegistre.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistre.setText("Registre-se:");
        pnlCabecalho.add(lblRegistre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 25, 200, 30));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaovoltar1.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.setNextFocusableComponent(txtApelido);
        btnVoltar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botaovoltar2.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlCabecalho.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, 30, 30));

        getContentPane().add(pnlCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 60));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_base2.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnCadastrarVerde(){
        if(vrfApelido==true && vrfEmail==true && vrfSenha==true && vrfConfSenha==true && vrfTelefone==true)
        {
            btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar3.png")));
            lblAvisoCampos.setVisible(false);
        } 
    }
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telaInit = new TelaInicial();
        telaInit.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtApelidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApelidoFocusGained
        Metodos.placeholderOff(txtApelido, "Insira seu apelido.");
    }//GEN-LAST:event_txtApelidoFocusGained

    private void txtApelidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApelidoFocusLost
        if (txtApelido.getText().equals(""))
        {
            Metodos.placeholderOn(txtApelido, "Insira seu apelido.");
            lblAvisoApelido.setVisible(false);
        }
    }//GEN-LAST:event_txtApelidoFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        Metodos.placeholderOff(txtEmail, "Informe seu e-mail.");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals(""))
        {
            Metodos.placeholderOn(txtEmail, "Informe seu e-mail.");
            lblAvisoEmail.setVisible(false);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        Metodos.placeholderOff(txtSenha, "Digite sua senha.");
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtSenha, "Digite sua senha.");
            senha1="Invalido1"; //valor para ficar diferente da senha2
            lblAvisoSenha.setVisible(false);
        } 
        else
            senha1 = txtSenha.getText();
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtConfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfSenhaFocusGained
        if (txtConfSenha.getText().equals("Confirme sua senha."))
        {
            Metodos.placeholderOff(txtConfSenha, "Confirme sua senha.");
            lblAvisoConfSenha.setVisible(false);
        }
    }//GEN-LAST:event_txtConfSenhaFocusGained

    private void txtConfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfSenhaFocusLost
        if (txtConfSenha.getText().equals(""))
        {
            Metodos.placeholderOn(txtConfSenha, "Confirme sua senha.");
            senha2="Invalido2"; //valor para ficar diferente da senha1
            lblAvisoConfSenha.setVisible(false);
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
        btnCadastrarVerde();
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
        btnCadastrarVerde();
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if(Metodos.validarEmail(txtEmail))
        {
            lblAvisoEmail.setForeground(Cores.green);
            lblAvisoEmail.setText("Formato de e-mail válido.");
            vrfEmail = true; 
        }  
        else
        {
            lblAvisoEmail.setForeground(Cores.lightRed);
            lblAvisoEmail.setText("Formato de e-mail inválido.");
            vrfEmail = false;
        }
        
        lblAvisoEmail.setVisible(true);
        btnCadastrarVerde();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtApelidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApelidoKeyReleased
            if(Metodos.validarApelido(txtApelido))
            {
                lblAvisoApelido.setForeground(Cores.green);
                lblAvisoApelido.setText("Apelido válido.");
                vrfApelido = true;
            }
            else
            {
                lblAvisoApelido.setForeground(Cores.lightRed);
                lblAvisoApelido.setText("Apelido inválido (5-10 caracteres).");
                vrfApelido = false;
            }     
            lblAvisoApelido.setVisible(true);
        btnCadastrarVerde();
    }//GEN-LAST:event_txtApelidoKeyReleased

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario usuario = new Usuario();
        UsuarioDao dao = new UsuarioDao();
        boolean status;
        int resp;
        
            if(vrfApelido==true && vrfEmail==true && vrfSenha==true && vrfConfSenha==true && vrfTelefone==true)
            {
                btnCadastrarVerde();
                // SE TODOS CAMPOS ESTIVEREM CORRETOS E O EMAIL E APELIDO NAO ESTIVEREM CADASTRADOS
                // LOGO PRECISA INSERIR NO BANCO DE DADOS
                usuario.setApelido(txtApelido.getText());
                usuario.setEmail(txtEmail.getText());
                usuario.setSenha(txtSenha.getText());
                usuario.setTelefone(Long.parseLong(txtTelefone.getText()));
                
                status = dao.conectar();
                    if(status==true)
                    {
                        resp = dao.salvar(usuario);
                            if(resp==1)
                            {
                                TelaInicial telaInit = new TelaInicial();
                                telaInit.setVisible(true);
                                dispose();
                                JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!", "OTC - Cadastro", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                            }
                            else if(resp==1062)
                            {
                                lblAvisoEmail.setForeground(Cores.lightRed);
                                lblAvisoEmail.setText("E-mail já cadastrado.");
                                btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar2.png")));
                                lblAvisoCampos.setVisible(true);
                            }
                            else
                                JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR.");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR COM BANCO DE DADOS.");
                dao.desconectar();
            }
            else
            {
                btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastrar2.png")));
                lblAvisoCampos.setVisible(true);
            }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        Metodos.placeholderOff(txtTelefone, "Informe seu celular.");
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if (txtTelefone.getText().equals(""))
        {
            Metodos.placeholderOn(txtTelefone, "Informe seu celular.");
            lblAvisoTelefone.setVisible(false);
        } 
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        if(Metodos.validarTelefone(txtTelefone))
        {
            lblAvisoTelefone.setForeground(Cores.green);
            lblAvisoTelefone.setText("Celular válido.");
            vrfTelefone = true;
        }
        else
        {
            lblAvisoTelefone.setForeground(Cores.lightRed);
            lblAvisoTelefone.setText("DDD+TELEFONE (Ex:11900000001)"); 
            vrfTelefone = false;
        }     
        
        lblAvisoTelefone.setVisible(true);
        btnCadastrarVerde();
    }//GEN-LAST:event_txtTelefoneKeyReleased

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtConfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfSenhaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
        }
    }//GEN-LAST:event_txtConfSenhaKeyPressed

    private void txtApelidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApelidoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
        }
    }//GEN-LAST:event_txtApelidoKeyPressed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblAvisoApelido;
    private javax.swing.JLabel lblAvisoCampos;
    private javax.swing.JLabel lblAvisoConfSenha;
    private javax.swing.JLabel lblAvisoEmail;
    private javax.swing.JLabel lblAvisoSenha;
    private javax.swing.JLabel lblAvisoTelefone;
    private javax.swing.JLabel lblConfSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRegistre;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pblRegistrar;
    private javax.swing.JPanel pnlCabecalho;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
