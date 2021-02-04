package view.TelasSecundarias;

import data.Icone;
import data.Metodos;
import data.TextosJogos;
import data.TrocaImagem;
import data.Usuario;
import data.UsuarioDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.TelasPrincipais.TelaLogado;

/*
 GRUPO UNINOVE - ON THE CODE
 */
public class TelaBiblioteca extends javax.swing.JFrame {

    private Thread t1;
    private TrocaImagem imgTroca;
    private final String email;
    private final String senha;
    private final String apelido;
    private boolean stt;
    
    public TelaBiblioteca(String apelido, String email, String senha) {
        initComponents();
        TelaComprarJogo.setEmailSenha(apelido, email, senha);
        imgTroca = new TrocaImagem(lblImgEsq,lblImgMeio,lblImgDir,pnlImagensPrincipais);
        t1 = new Thread(imgTroca);
        imgTroca.setFinish(false);
        t1.start();
        this.email=email;
        this.senha=senha;
        this.apelido=apelido;
        lblApelido.setText(apelido);
        
        Usuario user =new Usuario();
        UsuarioDao dao = new UsuarioDao();

        user.setEmail(email);
        user.setSenha(senha);
        
        stt=dao.conectar();
        
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
        btnVoltar.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlLista = new javax.swing.JPanel();
        pnlBusca =  new RoundedPanel(15,new Color(217,217,217));
        txtBusca = new javax.swing.JTextField();
        sprInicio1 = new javax.swing.JSeparator();
        lblLupa = new javax.swing.JLabel();
        pnlJogo1 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo1 = new javax.swing.JLabel();
        pnlJogo2 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo2 = new javax.swing.JLabel();
        pnlJogo3 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo3 = new javax.swing.JLabel();
        pnlJogo4 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo4 = new javax.swing.JLabel();
        pnlJogo5 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo5 = new javax.swing.JLabel();
        pnlJogo6 = new RoundedPanel(15,new Color(50,76,87));
        lblJogo6 = new javax.swing.JLabel();
        pnlConteudo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        lblInicio = new javax.swing.JLabel();
        sprInicio = new javax.swing.JSeparator();
        lblComprarCP = new javax.swing.JLabel();
        sprComprarCP = new javax.swing.JSeparator();
        lblAmigos = new javax.swing.JLabel();
        sprAmigos = new javax.swing.JSeparator();
        lblApelido = new javax.swing.JLabel();
        lblCodePoints = new javax.swing.JLabel();
        pnlMoldura1 = new javax.swing.JPanel();
        pnlImagensPrincipais = new javax.swing.JPanel();
        lblImgEsq = new javax.swing.JLabel();
        lblImgMeio = new javax.swing.JLabel();
        lblImgDir = new javax.swing.JLabel();
        pnlMoldura2 = new javax.swing.JPanel();
        pnlImagenSecundaria = new javax.swing.JPanel();
        lblImagemMedia = new javax.swing.JLabel();
        pnlMoldura3 = new javax.swing.JPanel();
        pnlImagemTerciaria = new javax.swing.JPanel();
        lblImagemMedia1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca - OTC");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLista.setBackground(new java.awt.Color(80, 116, 130));
        pnlLista.setToolTipText(null);
        pnlLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBusca.setBackground(new java.awt.Color(80, 116, 130));
        pnlBusca.setToolTipText(null);
        pnlBusca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusca.setBackground(new java.awt.Color(217, 217, 217));
        txtBusca.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        txtBusca.setForeground(new java.awt.Color(80, 116, 130));
        txtBusca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBusca.setText("Buscar jogos...");
        txtBusca.setToolTipText(null);
        txtBusca.setBorder(null);
        txtBusca.setCaretColor(new java.awt.Color(123, 34, 159));
        txtBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBusca.setSelectionColor(new java.awt.Color(126, 126, 203));
        txtBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscaFocusLost(evt);
            }
        });
        pnlBusca.add(txtBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 13, 178, -1));

        sprInicio1.setBackground(new java.awt.Color(80, 116, 130));
        sprInicio1.setForeground(new java.awt.Color(80, 116, 130));
        sprInicio1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sprInicio1.setToolTipText(null);
        sprInicio1.setOpaque(true);
        pnlBusca.add(sprInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 36, 186, 2));

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.jpg"))); // NOI18N
        lblLupa.setToolTipText(null);
        pnlBusca.add(lblLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, -1, -1));

        pnlLista.add(pnlBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 20, 250, 45));

        pnlJogo1.setToolTipText(null);
        pnlJogo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo1.setOpaque(false);
        pnlJogo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo1MouseClicked(evt);
            }
        });
        pnlJogo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo1.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo1.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo1.setText("A Maldição de Higanbana");
        lblJogo1.setToolTipText(null);
        lblJogo1.setAlignmentY(0.0F);
        lblJogo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo1.add(lblJogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 90, 220, 37));

        pnlJogo2.setToolTipText(null);
        pnlJogo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo2.setOpaque(false);
        pnlJogo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo2MouseClicked(evt);
            }
        });
        pnlJogo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo2.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo2.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo2.setText("Batalha dos 100 Homens");
        lblJogo2.setToolTipText(null);
        lblJogo2.setAlignmentY(0.0F);
        lblJogo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo2.add(lblJogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, 220, 37));

        pnlJogo3.setToolTipText(null);
        pnlJogo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo3.setOpaque(false);
        pnlJogo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo3MouseClicked(evt);
            }
        });
        pnlJogo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo3.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo3.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo3.setText("Defenda o Sistema");
        lblJogo3.setToolTipText(null);
        lblJogo3.setAlignmentY(0.0F);
        lblJogo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo3.add(lblJogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 178, 220, 37));

        pnlJogo4.setToolTipText(null);
        pnlJogo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo4.setOpaque(false);
        pnlJogo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo4MouseClicked(evt);
            }
        });
        pnlJogo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo4.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo4.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo4.setText("Formula Zero Um");
        lblJogo4.setToolTipText(null);
        lblJogo4.setAlignmentY(0.0F);
        lblJogo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo4.add(lblJogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 221, 220, 37));

        pnlJogo5.setToolTipText(null);
        pnlJogo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo5.setOpaque(false);
        pnlJogo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo5MouseClicked(evt);
            }
        });
        pnlJogo5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo5.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo5.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo5.setText("Torneio de Magos");
        lblJogo5.setToolTipText(null);
        lblJogo5.setAlignmentY(0.0F);
        lblJogo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo5.add(lblJogo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 266, 220, 37));

        pnlJogo6.setToolTipText(null);
        pnlJogo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJogo6.setOpaque(false);
        pnlJogo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJogo6MouseClicked(evt);
            }
        });
        pnlJogo6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJogo6.setFont(new java.awt.Font("Adumu", 0, 14)); // NOI18N
        lblJogo6.setForeground(new java.awt.Color(255, 255, 255));
        lblJogo6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJogo6.setText("Vale Invernal");
        lblJogo6.setToolTipText(null);
        lblJogo6.setAlignmentY(0.0F);
        lblJogo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlJogo6.add(lblJogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 190, 37));

        pnlLista.add(pnlJogo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 310, 220, 37));

        getContentPane().add(pnlLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 282, 459));

        pnlConteudo.setBackground(new java.awt.Color(20, 20, 20));
        pnlConteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlConteudo.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 5, 40, 30));

        lblInicio.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setText("Inicio");
        lblInicio.setToolTipText(null);
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
        });
        pnlConteudo.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 67, -1));

        sprInicio.setBackground(new java.awt.Color(80, 116, 130));
        sprInicio.setForeground(new java.awt.Color(80, 116, 130));
        sprInicio.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sprInicio.setToolTipText(null);
        sprInicio.setOpaque(true);
        pnlConteudo.add(sprInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 38, 65, 2));

        lblComprarCP.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblComprarCP.setForeground(new java.awt.Color(255, 255, 255));
        lblComprarCP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprarCP.setText("Comprar CP");
        lblComprarCP.setToolTipText(null);
        lblComprarCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComprarCP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblComprarCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprarCPMouseClicked(evt);
            }
        });
        pnlConteudo.add(lblComprarCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 20, 120, -1));

        sprComprarCP.setBackground(new java.awt.Color(80, 116, 130));
        sprComprarCP.setForeground(new java.awt.Color(80, 116, 130));
        sprComprarCP.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sprComprarCP.setToolTipText(null);
        sprComprarCP.setOpaque(true);
        pnlConteudo.add(sprComprarCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, 120, 2));

        lblAmigos.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblAmigos.setForeground(new java.awt.Color(255, 255, 255));
        lblAmigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmigos.setText("Amigos");
        lblAmigos.setToolTipText(null);
        lblAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmigosMouseClicked(evt);
            }
        });
        pnlConteudo.add(lblAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 20, 71, -1));

        sprAmigos.setBackground(new java.awt.Color(80, 116, 130));
        sprAmigos.setForeground(new java.awt.Color(80, 116, 130));
        sprAmigos.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sprAmigos.setToolTipText(null);
        sprAmigos.setOpaque(true);
        pnlConteudo.add(sprAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 38, 65, 2));

        lblApelido.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblApelido.setForeground(new java.awt.Color(123, 34, 159));
        lblApelido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApelido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bolinhaOn.png"))); // NOI18N
        lblApelido.setText("ONTHECODEONTHE");
        lblApelido.setToolTipText(null);
        lblApelido.setAlignmentY(0.0F);
        lblApelido.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblApelido.setIconTextGap(3);
        lblApelido.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlConteudo.add(lblApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 13, 170, -1));

        lblCodePoints.setFont(new java.awt.Font("Adumu", 0, 16)); // NOI18N
        lblCodePoints.setForeground(new java.awt.Color(255, 204, 51));
        lblCodePoints.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodePoints.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/moedaCP.png"))); // NOI18N
        lblCodePoints.setText("CodePoints");
        lblCodePoints.setToolTipText(null);
        lblCodePoints.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblCodePoints.setAlignmentY(0.0F);
        lblCodePoints.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblCodePoints.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        pnlConteudo.add(lblCodePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 34, 150, -1));

        pnlMoldura1.setBackground(new java.awt.Color(50, 76, 87));
        pnlMoldura1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImagensPrincipais.setToolTipText(null);
        pnlImagensPrincipais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlImagensPrincipais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImgEsq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogohiganbana.jpg"))); // NOI18N
        lblImgEsq.setToolTipText(null);
        lblImgEsq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgEsqMouseClicked(evt);
            }
        });
        pnlImagensPrincipais.add(lblImgEsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(-492, 0, 492, 200));

        lblImgMeio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogodefendaosistema.png"))); // NOI18N
        lblImgMeio.setToolTipText(null);
        lblImgMeio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgMeioMouseClicked(evt);
            }
        });
        pnlImagensPrincipais.add(lblImgMeio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 492, 200));

        lblImgDir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/jogotorneiomagos.jpg"))); // NOI18N
        lblImgDir.setToolTipText(null);
        lblImgDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgDirMouseClicked(evt);
            }
        });
        pnlImagensPrincipais.add(lblImgDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 0, 492, 200));

        pnlMoldura1.add(pnlImagensPrincipais, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 492, 193));

        pnlConteudo.add(pnlMoldura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 57, 508, 209));

        pnlMoldura2.setBackground(new java.awt.Color(50, 76, 87));
        pnlMoldura2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImagenSecundaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlImagenSecundaria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagemMedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/promocoes.jpg"))); // NOI18N
        lblImagemMedia.setToolTipText(null);
        pnlImagenSecundaria.add(lblImagemMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -5, -1, -1));

        pnlMoldura2.add(pnlImagenSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 284, 121));

        pnlConteudo.add(pnlMoldura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 287, 300, 137));

        pnlMoldura3.setBackground(new java.awt.Color(50, 76, 87));
        pnlMoldura3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImagemTerciaria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlImagemTerciaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlImagemTerciariaMouseClicked(evt);
            }
        });
        pnlImagemTerciaria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagemMedia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FotosJogos/imagemjogopequeno.png"))); // NOI18N
        lblImagemMedia1.setToolTipText(null);
        pnlImagemTerciaria.add(lblImagemMedia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 125));

        pnlMoldura3.add(pnlImagemTerciaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 170, 121));

        pnlConteudo.add(pnlMoldura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 287, 186, 137));

        getContentPane().add(pnlConteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 0, 538, 459));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        imgTroca.setFinish(true);
        TelaLogado telaLog = new TelaLogado(email,senha);
        telaLog.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblComprarCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarCPMouseClicked
        imgTroca.setFinish(true);
        TelaComprarCP telaCP = new TelaComprarCP(apelido,email,senha,"ComprarCP");
        telaCP.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblComprarCPMouseClicked

    private void lblAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmigosMouseClicked
        imgTroca.setFinish(true);
        TelaAmigos telaAmigos = new TelaAmigos(email,senha);
        telaAmigos.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAmigosMouseClicked

    private void lblImgEsqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgEsqMouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("A Maldição de Higanbana", TextosJogos.getDescHiganbana(),5000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblImgEsqMouseClicked

    private void lblImgMeioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgMeioMouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Defenda o Sistema", TextosJogos.getDescDefSistema(),9500);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblImgMeioMouseClicked

    private void lblImgDirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgDirMouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Torneio de Magos", TextosJogos.getDescMagos(),6000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblImgDirMouseClicked

    private void txtBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusGained
        Metodos.placeholderOff(txtBusca, "Buscar jogos...");
    }//GEN-LAST:event_txtBuscaFocusGained

    private void txtBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscaFocusLost
        if (txtBusca.getText().equals(""))
            Metodos.placeholderOn(txtBusca, "Buscar jogos...");
    }//GEN-LAST:event_txtBuscaFocusLost

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogado telaOn = new TelaLogado(email,senha);
        telaOn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void pnlImagemTerciariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlImagemTerciariaMouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Formula Zero Um", TextosJogos.getDescFormula1(),7000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlImagemTerciariaMouseClicked

    private void pnlJogo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo1MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("A Maldição de Higanbana", TextosJogos.getDescHiganbana(),5000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo1MouseClicked

    private void pnlJogo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo2MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Batalha dos 100 Homens", TextosJogos.getDescBatalha100H(),3500);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo2MouseClicked

    private void pnlJogo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo3MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Defenda o Sistema", TextosJogos.getDescDefSistema(),9500);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo3MouseClicked

    private void pnlJogo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo4MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Formula Zero Um", TextosJogos.getDescFormula1(),7000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo4MouseClicked

    private void pnlJogo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo5MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Torneio de Magos", TextosJogos.getDescMagos(),6000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo5MouseClicked

    private void pnlJogo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJogo6MouseClicked
        TelaComprarJogo telaCJ = new TelaComprarJogo("Vale Invernal", TextosJogos.getDescValeInvernal(),4000);
        telaCJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_pnlJogo6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAmigos;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblCodePoints;
    private javax.swing.JLabel lblComprarCP;
    private javax.swing.JLabel lblImagemMedia;
    private javax.swing.JLabel lblImagemMedia1;
    private javax.swing.JLabel lblImgDir;
    private javax.swing.JLabel lblImgEsq;
    private javax.swing.JLabel lblImgMeio;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblJogo1;
    private javax.swing.JLabel lblJogo2;
    private javax.swing.JLabel lblJogo3;
    private javax.swing.JLabel lblJogo4;
    private javax.swing.JLabel lblJogo5;
    private javax.swing.JLabel lblJogo6;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JPanel pnlConteudo;
    private javax.swing.JPanel pnlImagemTerciaria;
    private javax.swing.JPanel pnlImagenSecundaria;
    private javax.swing.JPanel pnlImagensPrincipais;
    private javax.swing.JPanel pnlJogo1;
    private javax.swing.JPanel pnlJogo2;
    private javax.swing.JPanel pnlJogo3;
    private javax.swing.JPanel pnlJogo4;
    private javax.swing.JPanel pnlJogo5;
    private javax.swing.JPanel pnlJogo6;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlMoldura1;
    private javax.swing.JPanel pnlMoldura2;
    private javax.swing.JPanel pnlMoldura3;
    private javax.swing.JSeparator sprAmigos;
    private javax.swing.JSeparator sprComprarCP;
    private javax.swing.JSeparator sprInicio;
    private javax.swing.JSeparator sprInicio1;
    private javax.swing.JTextField txtBusca;
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
    //            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
    //             
        }
    }
}
