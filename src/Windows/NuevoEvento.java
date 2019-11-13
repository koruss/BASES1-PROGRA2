/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Business.Funcion;
import Business.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kcorr
 */
public class NuevoEvento extends javax.swing.JFrame {
    public SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form NuevoEvento
     */
    public NuevoEvento(Person person) throws SQLException, ClassNotFoundException {
        initComponents();
       // llenarComboPais();
        //llenarComboCategorias();
        //setPerson(person);
                if(person.getTypeUser()!=1){  //significa que  no es administrador
            this.btnNuevoEvento.setVisible(false);
            this.btnEstadisticas.setVisible(false);
        }
    }
    
 
    public void llenarComboCategorias() throws SQLException, ClassNotFoundException{
        jComboCategoria.removeAllItems();
        Funcion functions=new Funcion();
        ResultSet rs=functions.classification_getClassification(-1);
        while(rs.next()){
            jComboCategoria.addItem(rs.getString("CLASSIFICATION_NAME"));
        }
    }
    public void llenarComboPais() throws SQLException, ClassNotFoundException{
        jComboPais.removeAllItems();
        Funcion functions=new Funcion();
        ResultSet rs=functions.country_getCountry(-1);
        while(rs.next()){
            jComboPais.addItem(rs.getString("COUNTRY_NAME"));
        }
    }
    public void llenarComboProvincia(String pCountry) throws SQLException, ClassNotFoundException{
        Funcion functions=new Funcion();
        int pIdCountry=functions.country_getCountryId(pCountry);
        ResultSet rs=functions.province_getProvince(pIdCountry);
        while(rs.next()){
            jComboProvincia.addItem(rs.getString("PROVINCE_NAME"));
        }
    }
    public void llenarComboCanton(String pProvince) throws SQLException, ClassNotFoundException{
        Funcion functions=new Funcion();
        int pIdProvince=functions.province_getProvinceId(pProvince);
        ResultSet rs=functions.canton_getCanton(pIdProvince);
        while(rs.next()){
            jComboCanton.addItem(rs.getString("CANTON_NAME"));
        }

        
        
    }
    
        public void llenarComboComunidad(String pCanton) throws SQLException, ClassNotFoundException{
        Funcion functions=new Funcion();
        int pIdCanton=functions.canton_getCantonId(pCanton);
        ResultSet rs=functions.community_getCommunity(pIdCanton);
        while(rs.next()){
            jComboComunidad.addItem(rs.getString("COMMUNITY_NAME"));
        }
    }
    
    private Person person;

    private NuevoEvento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JLabel();
        btnNuevoEvento = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JLabel();
        btnCalificar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPlace = new javax.swing.JTextArea();
        txtEventName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboComunidad = new javax.swing.JComboBox<>();
        jComboPais = new javax.swing.JComboBox<>();
        jComboProvincia = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtFecha = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jComboCanton = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxtDescription1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/combo_chart_64px.png"))); // NOI18N
        btnEstadisticas.setToolTipText("Estadisticas");
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseClicked(evt);
            }
        });
        jPanel2.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_64px.png"))); // NOI18N
        btnNuevoEvento.setToolTipText("Nuevo");
        btnNuevoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoEventoMouseClicked(evt);
            }
        });
        jPanel2.add(btnNuevoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_3_64px.png"))); // NOI18N
        btnConfig.setToolTipText("Configuración");
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        jPanel2.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_64px.png"))); // NOI18N
        btnHome.setToolTipText("Inicio");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question_shield_64px.png"))); // NOI18N
        btnConsultas.setToolTipText("Consultas");
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultasMouseClicked(evt);
            }
        });
        jPanel2.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rating_64px.png"))); // NOI18N
        btnCalificar.setToolTipText("Calificar Eventos");
        btnCalificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalificarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        jScrollPane1.setBackground(new java.awt.Color(40, 40, 40));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dirección");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Evento");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jComboCategoria.setBackground(new java.awt.Color(40, 40, 40));
        jComboCategoria.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(jComboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, 40));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoría");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jtxtHora.setBackground(new java.awt.Color(40, 40, 40));
        jtxtHora.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jtxtHora.setForeground(new java.awt.Color(255, 255, 255));
        jtxtHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(jtxtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 60, 40));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descripción");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtPlace.setColumns(20);
        txtPlace.setLineWrap(true);
        txtPlace.setRows(5);
        txtPlace.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtPlace);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 450, 70));

        txtEventName.setBackground(new java.awt.Color(40, 40, 40));
        txtEventName.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtEventName.setForeground(new java.awt.Color(255, 255, 255));
        txtEventName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtEventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 440, 40));

        jButton1.setText("Agregar Imagen");
        jButton1.setActionCommand("");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 110, 30));

        jButton2.setText("Crear Evento");
        jButton2.setActionCommand("");
        jButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jButton2ItemStateChanged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 840, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Comunidad");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jComboComunidad.setBackground(new java.awt.Color(40, 40, 40));
        jComboComunidad.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboComunidad.setForeground(new java.awt.Color(255, 255, 255));
        jComboComunidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(jComboComunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 180, 40));

        jComboPais.setBackground(new java.awt.Color(40, 40, 40));
        jComboPais.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboPais.setForeground(new java.awt.Color(255, 255, 255));
        jComboPais.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jComboPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboPaisItemStateChanged(evt);
            }
        });
        jPanel4.add(jComboPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 180, 40));

        jComboProvincia.setBackground(new java.awt.Color(40, 40, 40));
        jComboProvincia.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboProvincia.setForeground(new java.awt.Color(255, 255, 255));
        jComboProvincia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jComboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboProvinciaItemStateChanged(evt);
            }
        });
        jPanel4.add(jComboProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 180, 40));

        jComboBox7.setBackground(new java.awt.Color(40, 40, 40));
        jComboBox7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel4.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 760, 290, 40));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pais");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Provincia");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cantón");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));
        jPanel4.add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jCheckBox1.setText("¿Es un evento Público?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 180, -1));

        jButton3.setText("Enviar Invitación");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, 130, -1));

        jComboCanton.setBackground(new java.awt.Color(40, 40, 40));
        jComboCanton.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboCanton.setForeground(new java.awt.Color(255, 255, 255));
        jComboCanton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jComboCanton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCantonItemStateChanged(evt);
            }
        });
        jPanel4.add(jComboCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 40));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jtxtDescription1.setColumns(20);
        jtxtDescription1.setLineWrap(true);
        jtxtDescription1.setRows(5);
        jtxtDescription1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jtxtDescription1);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 450, 70));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lugar");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jScrollPane1.setViewportView(jPanel4);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 670, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        try {
            this.dispose();
            EventViewer ventana = new EventViewer(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHomeMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnCalificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalificarMouseClicked
        try {
            this.dispose();
            CountingStars ventana = new CountingStars(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCalificarMouseClicked

    private void btnConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseClicked
        this.dispose();
        Consultas ventana = new Consultas(getPerson());
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnConsultasMouseClicked

    private void btnNuevoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEventoMouseClicked
        try {
            this.dispose();
            NuevoEvento ventana = new NuevoEvento(getPerson());    
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoEventoMouseClicked

    private void btnEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseClicked
        this.dispose();
        Statistics ventana = new Statistics(getPerson());
        ventana.setVisible(true);
       
    }//GEN-LAST:event_btnEstadisticasMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigMouseClicked

    private void txtEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jButton2ItemStateChanged
        JOptionPane ventana= new JOptionPane();

        Funcion functions=new Funcion();
        String fecha=dateFormat.format(jtxtFecha.getDate());
        int publico;
        if(jCheckBox1.isSelected()) publico=0;
        else publico=1;
        if (!txtEventName.getText().isEmpty() && !jtxtDescription1.getText().isEmpty() && jtxtFecha.getDate()!=null && txtPlace.getText()!=null){
            try {
                int pIdCommunity=functions.community_getCommunityId(jComboComunidad.getSelectedItem().toString());
                functions.event_insertEvent(person.getCedula(),txtEventName.getText(),jtxtDescription1.getText(),(jComboCategoria.getSelectedIndex())+1,pIdCommunity,txtPlace.getText(),fecha,jtxtHora.getText(),publico);
                ventana.showMessageDialog(null,"Registrado con éxito");
                ventana.setVisible(true);
                SignIn ventanita= new SignIn();
                ventanita.setVisible(true);                
            } catch (SQLException ex) {
                Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
                ventana.showMessageDialog(null,"No se ha podido ingresar el evento, todos los campos son requeridos");
                ventana.setVisible(true);
        }
        

    }//GEN-LAST:event_jButton2ItemStateChanged

    private void jComboPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboPaisItemStateChanged
        try {
            jComboProvincia.removeAllItems();
            jComboCanton.removeAllItems();
            jComboComunidad.removeAllItems();
            llenarComboProvincia(jComboPais.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboPaisItemStateChanged

    private void jComboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboProvinciaItemStateChanged
        try {
            jComboProvincia.removeAllItems();
            jComboCanton.removeAllItems();
            jComboComunidad.removeAllItems();
            llenarComboProvincia(jComboPais.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboProvinciaItemStateChanged

    private void jComboCantonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCantonItemStateChanged
        if (jComboCanton.getSelectedIndex()!=-1) 
        {
           try {
            jComboComunidad.removeAllItems();
            llenarComboComunidad(jComboCanton.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NuevoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jComboCantonItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCalificar;
    private javax.swing.JLabel btnConfig;
    private javax.swing.JLabel btnConsultas;
    private javax.swing.JLabel btnEstadisticas;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnNuevoEvento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboCanton;
    private javax.swing.JComboBox<String> jComboCategoria;
    private javax.swing.JComboBox<String> jComboComunidad;
    private javax.swing.JComboBox<String> jComboPais;
    private javax.swing.JComboBox<String> jComboProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jtxtDescription1;
    private com.toedter.calendar.JDateChooser jtxtFecha;
    private javax.swing.JTextField jtxtHora;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextArea txtPlace;
    // End of variables declaration//GEN-END:variables
}
