/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Business.EventData;
import Business.Funcion;
import Business.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kcorr
 */
public class SpecificEvent extends javax.swing.JFrame {

    /**
     * Creates new form SpecificEvent
     */
    public SpecificEvent(Person person,EventData event) throws SQLException, ClassNotFoundException {
        setPerson(person);
        setEvent(event);
        initComponents();
        this.lblEventName.setText(event.getTitle());
        this.txtInfo.setText(event.getDescription());
        cargarComentarios();
            if(person.getTypeUser()!=1){  //significa que  no es administrador
            this.btnNuevoEvento.setVisible(false);
            this.btnEstadisticas.setVisible(false);
        }
    }

    public EventData getEvent() {
        return eventData;
    }

    public void setEvent(EventData event) {
        this.eventData = event;
    }
    
    private EventData eventData;
    
    private Person person;

    private SpecificEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public void cargarComentarios() throws SQLException, ClassNotFoundException{
        int contador=0;
        Funcion functions=new Funcion();
        ResultSet rs=functions.Normal_Consults_CommentsXEvent(getEvent().getIdEvent());
        while(rs.next()){
            String nombre=rs.getString("NAME")+" "+rs.getString("FIRST_LAST_NAME")+" "+rs.getString("SECOND_LAST_NAME");
            Comentario comentario= new Comentario(nombre,rs.getString("DESCRIPTION"));
            panelComentarios.add(comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, contador, -1, -1));
            pack();
            contador+=160;
        }  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        lblEventName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        scrollPanel = new javax.swing.JScrollPane();
        panelComentarios = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JLabel();
        btnNuevoEvento = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JLabel();
        btnCalificar = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox3.setBackground(new java.awt.Color(40, 40, 40));
        jComboBox3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Me Interesa", "Asistiré", "Talvez Asista", "No Asistiré" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 180, 40));

        lblEventName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lblEventName.setForeground(new java.awt.Color(255, 255, 255));
        lblEventName.setText("Nombre del Evento");
        jPanel1.add(lblEventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 360, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Comentarios");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Información");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Evento: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 590, 90));

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        panelComentarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelComentarios.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 5, -1, -1));

        scrollPanel.setViewportView(panelComentarios);

        jPanel1.add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 580, 250));

        jButton1.setText("Comentar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jButton2.setText("Ver Dirección del Evento");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 670, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/combo_chart_64px.png"))); // NOI18N
        btnEstadisticas.setToolTipText("Estadisticas");
        btnEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstadisticasMouseClicked(evt);
            }
        });
        jPanel3.add(btnEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new_64px.png"))); // NOI18N
        btnNuevoEvento.setToolTipText("Nuevo");
        btnNuevoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoEventoMouseClicked(evt);
            }
        });
        jPanel3.add(btnNuevoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings_3_64px.png"))); // NOI18N
        btnConfig.setToolTipText("Configuración");
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        jPanel3.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_64px.png"))); // NOI18N
        btnHome.setToolTipText("Inicio");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        jPanel3.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question_shield_64px.png"))); // NOI18N
        btnConsultas.setToolTipText("Consultas");
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultasMouseClicked(evt);
            }
        });
        jPanel3.add(btnConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rating_64px.png"))); // NOI18N
        btnCalificar.setToolTipText("Calificar Eventos");
        btnCalificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalificarMouseClicked(evt);
            }
        });
        jPanel3.add(btnCalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseClicked
        this.dispose();
        Statistics ventana = new Statistics(getPerson());
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasMouseClicked

    private void btnNuevoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEventoMouseClicked
        try {
            this.dispose();
            NuevoEvento ventana = new NuevoEvento(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoEventoMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        try {
            this.dispose();
            EventViewer ventana = new EventViewer(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseClicked
        this.dispose();
        Consultas ventana = new Consultas(getPerson());
        ventana.setVisible(true);
    }//GEN-LAST:event_btnConsultasMouseClicked

    private void btnCalificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalificarMouseClicked
        try {
            this.dispose();
            CountingStars ventana = new CountingStars(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SpecificEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalificarMouseClicked

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
            java.util.logging.Logger.getLogger(SpecificEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpecificEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpecificEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpecificEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpecificEvent().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEventName;
    private javax.swing.JPanel panelComentarios;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
