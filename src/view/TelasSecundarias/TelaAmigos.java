package view.TelasSecundarias;

import data.Icone;
import view.TelasPrincipais.TelaLogado;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaAmigos extends javax.swing.JFrame {

    private String email,senha;
    
    public TelaAmigos(String email, String senha) {
        initComponents();
        this.email = email;
        this.senha = senha;
        Icone icon = new Icone();
        icon.inserirIcone(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amigos - OTC");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta1.png"))); // NOI18N
        btnVoltar.setToolTipText(null);
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta2.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AmigosOTC.png"))); // NOI18N
        jLabel1.setToolTipText(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogado telaLog = new TelaLogado(email,senha);
        telaLog.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
