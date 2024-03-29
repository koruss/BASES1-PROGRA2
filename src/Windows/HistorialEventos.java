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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kcorr
 */
public class HistorialEventos extends javax.swing.JFrame {

    /**
     * Creates new form HistorialEventos
     */
    public HistorialEventos(Person person) throws SQLException, ClassNotFoundException {
        initComponents();
        setPerson(person);
        cargarComboEventos();
                if(person.getTypeUser()!=1){  //significa que  no es administrador
            this.btnNuevoEvento.setVisible(false);
            this.btnEstadisticas.setVisible(false);
        }
        
    }

    private HistorialEventos() {
        throw new UnsupportedOperationException("Constructor vacio."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    private Person person;
    
    
    public ResultSet result;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboEventos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReview = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        lblStars = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JLabel();
        btnNuevoEvento = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JLabel();
        btnCalificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Historial de Eventos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        comboEventos.setBackground(new java.awt.Color(40, 40, 40));
        comboEventos.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        comboEventos.setForeground(new java.awt.Color(255, 255, 255));
        comboEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Me Interesa", "Asistiré", "Talvez Asista", "No Asistiré" }));
        comboEventos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(comboEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 430, 40));

        jButton1.setText("Visualizar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtReview.setEditable(false);
        txtReview.setBackground(new java.awt.Color(40, 40, 40));
        txtReview.setColumns(20);
        txtReview.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtReview.setForeground(new java.awt.Color(255, 255, 255));
        txtReview.setLineWrap(true);
        txtReview.setRows(5);
        txtReview.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtReview);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 600, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 40, -1));

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("jLabel4");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 60));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescription.setEditable(false);
        txtDescription.setBackground(new java.awt.Color(40, 40, 40));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDescription);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 600, 90));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Creador:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("jLabel8");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lblStars.setForeground(new java.awt.Color(255, 255, 255));
        lblStars.setText("1");
        jPanel1.add(lblStars, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 30, 60));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estrellas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, 60));

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
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNuevoEventoMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        this.dispose();
        EventViewer ventana;
        try {
            ventana = new EventViewer(getPerson());
            ventana.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalificarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            String nombre=comboEventos.getSelectedItem().toString();
            result.beforeFirst();
            while(result.next()){
                if (result.getString("EVENT_NAME").equals(nombre)){
                    txtName.setText(result.getString("NAME"));
                    txtDescription.setText(result.getString("DESCRIPTION"));
                    lblStars.setText(result.getString("REVIEW")); 
                    txtReview.setText(result.getString("COMMENT_DESCRIPTION"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    
    
    private void cargarComboEventos() throws SQLException, ClassNotFoundException{
    
     Funcion functions = new Funcion();
     result=Funcion.User_Consults_c_ListEvents(getPerson().getCedula());
     comboEventos.removeAllItems();
     while(result.next()){
         comboEventos.addItem(result.getString("EVENT_NAME"));  
     }
}
    
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
            java.util.logging.Logger.getLogger(HistorialEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialEventos().setVisible(true);
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
    private javax.swing.JComboBox<String> comboEventos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblStars;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JLabel txtName;
    private javax.swing.JTextArea txtReview;
    // End of variables declaration//GEN-END:variables
}
