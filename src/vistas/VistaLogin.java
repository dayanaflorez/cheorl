package vistas;

import Env.DatosConstantes;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaLogin extends javax.swing.JFrame {

    public VistaLogin() {
        nimbus();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Login");
        setImages();
        setRoles();
    }

    public void nimbus() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void setImages() {
        //agrega las imagenes buscnado en la carpeta resources
        iconEmail.setIcon(new ImageIcon(getClass().getResource("/resources/envelope-solid.png")));
        iconPass.setIcon(new ImageIcon(getClass().getResource("/resources/lock-solid.png")));
        iconRol.setIcon(new ImageIcon(getClass().getResource("/resources/roles.png")));
    }

    public void setRoles() {
        getRol.removeAllItems();
        getRol.addItem("Seleccione Rol");
        for (String role : DatosConstantes.ROLES) {
            getRol.addItem(role);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconFesc = new javax.swing.JLabel();
        backgroundVista = new javax.swing.JPanel();
        panelIngreso = new javax.swing.JPanel();
        iconEmail = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        getEmail = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        getPassword = new javax.swing.JPasswordField();
        textRegister = new java.awt.Label();
        getRol = new javax.swing.JComboBox<>();
        iconRol = new javax.swing.JLabel();
        panelBienvenida = new javax.swing.JPanel();
        labelPlataforma = new javax.swing.JLabel();
        labelBienvenido = new javax.swing.JLabel();

        iconFesc.setMaximumSize(new java.awt.Dimension(120, 120));
        iconFesc.setMinimumSize(new java.awt.Dimension(120, 120));
        iconFesc.setPreferredSize(new java.awt.Dimension(120, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        backgroundVista.setBackground(new java.awt.Color(255, 255, 255));
        backgroundVista.setPreferredSize(new java.awt.Dimension(400, 400));
        backgroundVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngreso.setBackground(new java.awt.Color(255, 255, 255));

        getEmail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        getEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(null);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEntrar.setDefaultCapable(false);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.setRequestFocusEnabled(false);
        btnEntrar.setRolloverEnabled(false);
        btnEntrar.setVerifyInputWhenFocusTarget(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        getPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        textRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textRegister.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        textRegister.setText("Click aquí para crear una cuenta");
        textRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegisterMouseClicked(evt);
            }
        });

        getRol.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        getRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getRol.setBorder(null);

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconPass, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(iconEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(24, 24, 24))
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getEmail)
                            .addComponent(getPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(textRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getEmail))
                .addGap(18, 18, 18)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPassword))
                .addGap(16, 16, 16)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btnEntrar.getAccessibleContext().setAccessibleParent(btnEntrar);

        backgroundVista.add(panelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 350, 250));

        panelBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        labelPlataforma.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        labelPlataforma.setText("CHEORL");
        labelPlataforma.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        labelBienvenido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelBienvenido.setText("INICIA SESION");

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(labelPlataforma)
                .addGap(108, 108, 108))
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(labelBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPlataforma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundVista.add(panelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        controladores.ControladorInit.inicioSesion();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void textRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterMouseClicked
        controladores.ControladorInit.btnRegister();
    }//GEN-LAST:event_textRegisterMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    public JTextField getGetEmail() {
        return getEmail;
    }

    public JPasswordField getGetPassword() {
        return getPassword;
    }

    public JComboBox<String> getGetRol() {
        return getRol;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundVista;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField getEmail;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JComboBox<String> getRol;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconFesc;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel iconRol;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelPlataforma;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelIngreso;
    private java.awt.Label textRegister;
    // End of variables declaration//GEN-END:variables
}
