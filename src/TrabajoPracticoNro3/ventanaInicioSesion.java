package TrabajoPracticoN3;

import javax.swing.JOptionPane;

public class ventanaInicioSesion extends javax.swing.JFrame {
String jt1, jt2;
    public ventanaInicioSesion() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMain = new javax.swing.JPanel();
        jpExterior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpInterno = new javax.swing.JPanel();
        jtUsuario = new javax.swing.JLabel();
        jtCorreo = new javax.swing.JTextField();
        jtContrasena = new javax.swing.JLabel();
        jbVerificar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jlMostrarPass = new javax.swing.JLabel();
        jpPass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setForeground(new java.awt.Color(51, 0, 153));

        jpMain.setBackground(new java.awt.Color(0, 51, 153));

        jpExterior.setBackground(new java.awt.Color(204, 204, 204));
        jpExterior.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingrese las credenciales");

        jpInterno.setBorder(new javax.swing.border.MatteBorder(null));

        jtUsuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtUsuario.setText("Usuario:");

        jtCorreo.setText("ejemplo@ejemplo.com");
        jtCorreo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtCorreoComponentAdded(evt);
            }
        });
        jtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCorreoFocusLost(evt);
            }
        });
        jtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCorreoMouseClicked(evt);
            }
        });
        jtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCorreoActionPerformed(evt);
            }
        });
        jtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCorreoKeyTyped(evt);
            }
        });

        jtContrasena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtContrasena.setText("Contraseña:");

        jbVerificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbVerificar.setForeground(new java.awt.Color(0, 0, 255));
        jbVerificar.setText("Verificar");
        jbVerificar.setToolTipText("");
        jbVerificar.setVerifyInputWhenFocusTarget(false);
        jbVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        jLayeredPane2.setLayout(new javax.swing.OverlayLayout(jLayeredPane2));
        jLayeredPane1.add(jLayeredPane2);

        jlMostrarPass.setMaximumSize(new java.awt.Dimension(100, 16));
        jLayeredPane1.add(jlMostrarPass);

        jpPass.setText("**********");
        jpPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPassFocusLost(evt);
            }
        });
        jpPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpPassActionPerformed(evt);
            }
        });
        jpPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpPassKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpInternoLayout = new javax.swing.GroupLayout(jpInterno);
        jpInterno.setLayout(jpInternoLayout);
        jpInternoLayout.setHorizontalGroup(
            jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInternoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtUsuario)
                    .addComponent(jtContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpInternoLayout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addGap(144, 144, 144))
                    .addComponent(jtCorreo)
                    .addComponent(jpPass))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInternoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jpInternoLayout.setVerticalGroup(
            jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInternoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUsuario)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jpInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtContrasena)
                    .addComponent(jpPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jbVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jpExteriorLayout = new javax.swing.GroupLayout(jpExterior);
        jpExterior.setLayout(jpExteriorLayout);
        jpExteriorLayout.setHorizontalGroup(
            jpExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExteriorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExteriorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpExteriorLayout.setVerticalGroup(
            jpExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpExteriorLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("inicio de Sesion");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpMainLayout = new javax.swing.GroupLayout(jpMain);
        jpMain.setLayout(jpMainLayout);
        jpMainLayout.setHorizontalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpMainLayout.setVerticalGroup(
            jpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPassActionPerformed

    private void jpPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusLost
        // TODO add your handling code here:
        if(jpPass.getText().equals("")){
            jpPass.setText("**********");
        }
    }//GEN-LAST:event_jpPassFocusLost

    private void jpPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPassFocusGained
        // TODO add your handling code here:
        if(jpPass.getText().equals("**********")){
            jpPass.setText("");
        }
    }//GEN-LAST:event_jpPassFocusGained

    private void jbVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarActionPerformed
        // TODO add your handling code here:
            jt1 = jtCorreo.getText();
            jt2 = jpPass.getText();
            ControlMail control1 = new ControlMail();
            if(jt1.equals("")|| jt1.equals("ejemplo@ejemplo.com")||jt2.equals("")||jt2.equals("**********")){
                JOptionPane.showMessageDialog(this, "*** Error: 'Usuario y/o Contraseña' vacios ***");
                jtCorreo.setText("");
                jpPass.setText("");
            }else{
                 if(control1.verificaMail(jt1)){
                 JOptionPane.showMessageDialog(this, "El correo ingresado es Correcto!!!");
                 }else{
                      JOptionPane.showMessageDialog(this, "*** Error: 'Correo incorrecto ***");
                 }
            }        
        
    }//GEN-LAST:event_jbVerificarActionPerformed

    private void jtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCorreoKeyTyped
        // TODO add your handling code here:
        if(!Character.isLetterOrDigit(evt.getKeyChar())  && !(evt.getKeyChar() == '@') && !(evt.getKeyChar() == '.') && !(evt.getKeyChar() == '-') && !(evt.getKeyChar() == '_')){
            evt.consume();
        }
    }//GEN-LAST:event_jtCorreoKeyTyped

    private void jtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoActionPerformed

    private void jtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCorreoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoMouseClicked

    private void jtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCorreoFocusLost
        // TODO add your handling code here:
        jt1 = jtCorreo.getText();
        if(jt1.equals("")){
            jtCorreo.setText("ejemplo@ejemplo.com");
        }
    }//GEN-LAST:event_jtCorreoFocusLost

    private void jtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCorreoFocusGained
        // TODO add your handling code here:
        if(jtCorreo.getText().equals("ejemplo@ejemplo.com")){
            jtCorreo.setText("");
        }
    }//GEN-LAST:event_jtCorreoFocusGained

    private void jtCorreoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtCorreoComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoComponentAdded

    private void jpPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpPassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jpPassKeyTyped

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
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicioSesion().setVisible(true);
            }
        });
        
    }
public void enviarMensajeDeError(){
    if(jt1.equals("")|| jt1.equals("ejemplo@ejemplo.com")||jt2.equals("")||jt2.equals("**********")){
        JOptionPane.showMessageDialog(this, "*** Error: 'Usuario y/o Contraseña' vacios ***");
        jtCorreo.setText("");
        jpPass.setText("");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbVerificar;
    private javax.swing.JLabel jlMostrarPass;
    private javax.swing.JPanel jpExterior;
    private javax.swing.JPanel jpInterno;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPasswordField jpPass;
    private javax.swing.JLabel jtContrasena;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JLabel jtUsuario;
    // End of variables declaration//GEN-END:variables
}
