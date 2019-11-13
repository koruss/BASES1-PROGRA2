/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Business.Funcion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kenneth
 */
public class Registro extends javax.swing.JFrame {
    public SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form Registro
     */
    public Registro() throws ClassNotFoundException, SQLException {
        initComponents();
         cargarComboBox();

        ((JTextField)this.txtFechaNacimiento.getDateEditor()).setEditable(false);
        txtTelefono.addKeyListener(new KeyAdapter()
        {
        public void keyTyped(KeyEvent e)
            {
            char caracter = e.getKeyChar();

            // Verificar si la tecla pulsada no es un digito
            if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != '\b' /*corresponde a BACK_SPACE*/))
            {
            e.consume();  // ignorar el evento de teclado
            }
            }
        });
        
        
        
        
        
    }
    
        public void cargarComboBox() throws SQLException, ClassNotFoundException{
        comboTipoUsuario.removeAllItems();
        Funcion functions=new Funcion();
        ResultSet rs=functions.kindperson_getKindPerson(-1);
        while(rs.next()){
            comboTipoUsuario.addItem(rs.getString("DESCRIPTION"));
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboTipoUsuario = new javax.swing.JComboBox<>();

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(40, 40, 40));
        txtName.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, 40));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        txtApellido.setBackground(new java.awt.Color(40, 40, 40));
        txtApellido.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txt2Apellido.setBackground(new java.awt.Color(40, 40, 40));
        txt2Apellido.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txt2Apellido.setForeground(new java.awt.Color(255, 255, 255));
        txt2Apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt2Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt2Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, 40));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segundo Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(40, 40, 40));
        txtCorreo.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 180, 40));

        txtUser.setBackground(new java.awt.Color(40, 40, 40));
        txtUser.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 180, 40));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        txtTelefono.setBackground(new java.awt.Color(40, 40, 40));
        txtTelefono.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 180, 40));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de usuario");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 20));

        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 180, 40));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        txtPassw.setBackground(new java.awt.Color(40, 40, 40));
        txtPassw.setForeground(new java.awt.Color(255, 255, 255));
        txtPassw.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPassw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 180, 40));

        jButton1.setBackground(new java.awt.Color(40, 40, 40));
        jButton1.setText("Registrar");
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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 110, 40));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Registro");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 50));

        txtCedula.setBackground(new java.awt.Color(40, 40, 40));
        txtCedula.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 180, 40));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cédula");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Teléfono");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, 20));

        comboTipoUsuario.setBackground(new java.awt.Color(40, 40, 40));
        comboTipoUsuario.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        comboTipoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        comboTipoUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(comboTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 180, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ApellidoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyPressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JOptionPane ventana= new JOptionPane();
        Funcion functions=new Funcion();
        if(!txtName.getText().isEmpty() && !txtApellido.getText().isEmpty()  && !txt2Apellido.getText().isEmpty() && !txtTelefono.getText().isEmpty()
               && !txtCorreo.getText().isEmpty() && !txtUser.getText().isEmpty() && !txtPassw.getPassword().toString().isEmpty() && 
                !txtCedula.getText().isEmpty() && txtFechaNacimiento.getDate()!=null && comboTipoUsuario.getSelectedItem()!=null && functions.passwordVerificator(txtPassw.getText())==true){
           
            try {
                String fecha=dateFormat.format(txtFechaNacimiento.getDate());
                //Funcion functions=new Funcion();
                functions.person_insertPerson(txtCedula.getText(),txtName.getText(),txtApellido.getText(),txt2Apellido.getText(),
                        txtCorreo.getText(),txtTelefono.getText(),fecha,txtUser.getText(),txtPassw.getText(),comboTipoUsuario.getSelectedIndex()+1);
                
                ventana.showMessageDialog(null,"Registrado con éxito");
                ventana.setVisible(true);
                SignIn ventanita= new SignIn();
                ventanita.setVisible(true);
            } catch (SQLException ex) {
                ventana.showMessageDialog(null,"No se ha podido regisrar este nuevo usuario, la cédula y/o nombre de usuario ya se encuentra registrada en el sistema");
                ventana.setVisible(true);
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            if(!functions.passwordVerificator(txtPassw.getText())) {
                ventana.showMessageDialog(null,"La contraseña debe ser de 8 carácteres mínimo, y tener una combinación entre números, letras minúsculas,mayúsculas y carácteres especiales");
                ventana.setVisible(true);
            }
            else {
            ventana.showMessageDialog(null,"Todos los campos son requeridos");
            ventana.setVisible(true);

            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtPasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt2Apellido;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private com.toedter.calendar.JDateChooser txtFechaNacimiento;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassw;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
