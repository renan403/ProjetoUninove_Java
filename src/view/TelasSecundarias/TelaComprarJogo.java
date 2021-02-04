package view.TelasSecundarias;

import data.Icone;
import data.Usuario;
import data.UsuarioDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaComprarJogo extends javax.swing.JFrame {

    private int valor;
    private static String email,senha,apelido,nomeJogo;
    
    public TelaComprarJogo(String nomeJogo, String descricao, int valor) {
        initComponents();
        Icone icon = new Icone();
        icon.inserirIcone(this);
        
            if(nomeJogo.equalsIgnoreCase("A Maldição de Higanbana"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogohiganbana.jpg")));
            else if(nomeJogo.equalsIgnoreCase("Torneio de Magos"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogotorneiomagos.jpg")));
            else if(nomeJogo.equalsIgnoreCase("Batalha dos 100 Homens"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogobatalha100h.png")));
            else if(nomeJogo.equalsIgnoreCase("Vale Invernal"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogovaleinvernal.png")));
            else if(nomeJogo.equalsIgnoreCase("Formula Zero Um"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogoformulazeroum.png")));
            else if(nomeJogo.equalsIgnoreCase("Defenda o Sistema"))
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogodefendaosistema.png")));
                      
        lblTexto.setText(descricao);
        this.nomeJogo=nomeJogo;
        this.valor=valor;
        lblValor.setText("COMPRAR | " + valor + " CPs");
    }
    
    public static void setEmailSenha(String apelido, String email, String senha)
    {
        TelaComprarJogo.apelido=apelido;
        TelaComprarJogo.email=email;
        TelaComprarJogo.senha=senha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar1 = new javax.swing.JButton();
        lblTexto = new javax.swing.JLabel();
        pnlImagemJogo = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        pnlBotaoComprar =  new RoundedPanel(40,new Color(255,188,23));
        lblValor = new javax.swing.JLabel();
        pnlFundo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(20, 20, 20));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta1.png"))); // NOI18N
        btnVoltar1.setToolTipText(null);
        btnVoltar1.setBorder(null);
        btnVoltar1.setBorderPainted(false);
        btnVoltar1.setContentAreaFilled(false);
        btnVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar1.setFocusPainted(false);
        btnVoltar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/seta2.png"))); // NOI18N
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, 40, 30));

        lblTexto.setFont(new java.awt.Font("Adumu", 0, 15)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("DESCRIÇÃO JOGO");
        lblTexto.setToolTipText(null);
        lblTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTexto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTexto.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 250, 499, 270));

        pnlImagemJogo.setBackground(new java.awt.Color(219, 156, 0));
        pnlImagemJogo.setForeground(new java.awt.Color(20, 20, 20));
        pnlImagemJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagem.setToolTipText(null);
        lblImagem.setOpaque(true);
        pnlImagemJogo.add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 492, 200));

        getContentPane().add(pnlImagemJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 25, 508, 216));

        pnlBotaoComprar.setBackground(new java.awt.Color(20, 20, 20));
        pnlBotaoComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBotaoComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBotaoComprarMouseClicked(evt);
            }
        });
        pnlBotaoComprar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setBackground(new java.awt.Color(255, 188, 23));
        lblValor.setFont(new java.awt.Font("Adumu", 0, 18)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("COMPRAR | XXXXX CPs");
        lblValor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblValor.setOpaque(true);
        pnlBotaoComprar.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 15, 208, -1));

        getContentPane().add(pnlBotaoComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 528, 218, 46));

        pnlFundo.setBackground(new java.awt.Color(20, 20, 20));
        pnlFundo.setForeground(new java.awt.Color(20, 20, 20));
        pnlFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        TelaBiblioteca telaBiblioteca = new TelaBiblioteca(apelido,email,senha);
        telaBiblioteca.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void pnlBotaoComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotaoComprarMouseClicked
    Usuario user =new Usuario();
    UsuarioDao dao = new UsuarioDao();
    boolean stt;     
    
    user.setEmail(email);
    user.setSenha(senha);
    
    stt=dao.conectar();  
    
        if(!stt)
            JOptionPane.showMessageDialog(null,"não conectado ao banco");
        else 
        {
            Object[] options = { "Comprar", "Cancelar" };
            int opcao = JOptionPane.showOptionDialog(null, "Confirmar a compra?", "OTC - " + nomeJogo, JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, new ImageIcon("src//Imagens//bender.png"), options, options[0]); 
        
            if(opcao==0)
            {
                user=dao.consultPonto(email,senha);
                // lblCodePoints.setText(String.valueOf(user.getPonto()));
                if(user.getPonto()>= valor)
                {
                    stt=dao.comprarJg(valor,email,senha);
                    dao.desconectar();
                    
                    
                    if(stt)
                    {  
                        JOptionPane.showMessageDialog(null, "Compra feita com Sucesso", "Compra Efetuada", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robofeliz.png"));
                        TelaBiblioteca telaBiblioteca = new TelaBiblioteca(apelido,email,senha);
                        telaBiblioteca.setVisible(true);
                        dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Erro ao concluir compra.");
                }
                else
                     JOptionPane.showMessageDialog(null, "  Saldo insuficiente. ", "OTC - " + nomeJogo, JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));
            }
            else if(opcao==1)
            {
                JOptionPane.showMessageDialog(null, "  Compra Cancelada", "OTC - " + nomeJogo, JOptionPane.PLAIN_MESSAGE, new ImageIcon("src//Imagens//robotriste.png"));
            }
        }
    }//GEN-LAST:event_pnlBotaoComprarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBotaoComprar;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlImagemJogo;
    // End of variables declaration//GEN-END:variables
    
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());     
        }
    }
}
