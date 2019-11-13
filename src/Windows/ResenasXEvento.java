/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Business.Funcion;
import Business.Person;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kcorr
 */
public class ResenasXEvento extends javax.swing.JFrame {

    /**
     * Creates new form ResenasXEvento
     */
    public ResenasXEvento(Person person) throws SQLException, ClassNotFoundException {
        initComponents();
            if(person.getTypeUser()!=1){  //significa que  no es administrador
            this.btnNuevoEvento.setVisible(false);
            this.btnEstadisticas.setVisible(false);
        }
       cargarComboEventos();
    }
    
    public void cargarComboEventos() throws SQLException, ClassNotFoundException{
     Funcion functions = new Funcion();
     result=functions.adminConsultCReviewXEvent();
     comboEventos.removeAllItems();
     result.beforeFirst();
     ArrayList<String> arreglo= new ArrayList<String>();
     while(result.next()){
         
         String name=result.getString("EVENT_NAME");
         if(!arreglo.contains(name)){
             arreglo.add(name);
             comboEventos.addItem(result.getString("EVENT_NAME"));
         }
     }  
}
    private Person person;

    private ResenasXEvento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }
    
    private ResultSet result;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JLabel();
        btnNuevoEvento = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        btnHome = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JLabel();
        btnCalificar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboEventos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelReviews = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reseñas del Evento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        comboEventos.setBackground(new java.awt.Color(40, 40, 40));
        comboEventos.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        comboEventos.setForeground(new java.awt.Color(255, 255, 255));
        comboEventos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Me Interesa", "Asistiré", "Talvez Asista", "No Asistiré" }));
        comboEventos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(comboEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 430, 40));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        panelReviews.setBackground(new java.awt.Color(255, 255, 255));
        panelReviews.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(panelReviews);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 670, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 670, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadisticasMouseClicked
        this.dispose();
        Statistics ventana = new Statistics(getPerson());
        ventana.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasMouseClicked

    private void btnNuevoEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoEventoMouseClicked
        this.dispose();
        NuevoEvento ventana = new NuevoEvento(getPerson());
        ventana.setVisible(true);
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
        this.dispose();
        CountingStars ventana = new CountingStars(getPerson());
        ventana.setVisible(true);
    }//GEN-LAST:event_btnCalificarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            String nombre=comboEventos.getSelectedItem().toString();
            result.beforeFirst();
            int pos=0;
            while(result.next()){
                System.out.println("-----");
                System.out.println(nombre);
                System.out.println(result.getString("EVENT_NAME"));
                if (result.getString("EVENT_NAME").equals(nombre)){
                    System.out.println("-dasdasda----");
                    String name=result.getString("NAME")+" "+result.getString("FIRST_LAST_NAME")+" "+result.getString("SECOND_LAST_NAME");
                    
                    Reviews review = new Reviews(name,result.getString("REVIEW"),result.getString("DESCRIPTION"));
                   panelReviews.add(review, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, pos, -1, -1));
                    pos+=200;
                    pack();
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistorialEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ResenasXEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResenasXEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResenasXEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResenasXEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResenasXEvento().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelReviews;
    // End of variables declaration//GEN-END:variables
}
