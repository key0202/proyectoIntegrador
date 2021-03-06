package vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikeyla
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Registrarse() {
        initComponents();

        //fijar tamanio fijo
        setSize(400, 630);
        setResizable(false);

        //titulo
        setTitle("Registro Profesor");
        setLocationRelativeTo(null);

        //fondo imagen
        ImageIcon fondo = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg"); // src/paquete/nombreImagen
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabel_bgfondo.getWidth(),
                jLabel_bgfondo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_bgfondo.setIcon(icono);
        this.repaint();
    }

    //metodo override llamado para cambiar icono de interfaz
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo2.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel_bgfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TeachTools");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE PROFESOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 320, -1));
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 320, -1));

        btnRegistrarse.setBackground(new java.awt.Color(102, 204, 255));
        btnRegistrarse.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 140, 40));

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 140, 40));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 320, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("© 2020 TecnoFast Enterprise");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 400, -1));

        jLabel7.setText("Apellidos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, -1));

        jLabel8.setText("Username:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 320, -1));
        getContentPane().add(jLabel_bgfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String username = txtUsername.getText().trim();
        String password = txtPassword.getText().trim();
        String dni = txtDNI.getText().trim();

        //comprobar si todos los campos estan vacios        
        if (nombre.isEmpty() || apellidos.isEmpty() || username.isEmpty()
                || password.isEmpty() || dni.isEmpty() || dni.matches("[a-zA-Z_]+")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos correctamente");
        } else {
            //registrar profesor en bd
            JOptionPane.showMessageDialog(null, "Registrado exitosamente");
            limpiar();
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        Login volver = new Login();
        volver.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    public void limpiar(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtDNI.setText("");
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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_bgfondo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
