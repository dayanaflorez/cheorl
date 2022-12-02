package vistas;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaRegistro extends javax.swing.JFrame {

    public VistaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro");
        setImages();
    }

    public void setImages() {
        iconUser.setIcon(new ImageIcon(getClass().getResource("/resources/user-solid.png")));
        iconEmail.setIcon(new ImageIcon(getClass().getResource("/resources/envelope-solid.png")));
        iconPassword.setIcon(new ImageIcon(getClass().getResource("/resources/lock-solid.png")));
        btn_back.setIcon(new ImageIcon(getClass().getResource("/resources/arrow-left-solid.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundVistaIngreso = new javax.swing.JPanel();
        panelBienvenida = new javax.swing.JPanel();
        labelPlataforma = new javax.swing.JLabel();
        labelBienvenido = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        getNombre = new javax.swing.JTextField();
        getCorreo = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        getPasswordOne = new javax.swing.JPasswordField();
        iconUser = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        iconEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundVistaIngreso.setBackground(new java.awt.Color(255, 255, 255));
        backgroundVistaIngreso.setPreferredSize(new java.awt.Dimension(400, 400));
        backgroundVistaIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        labelPlataforma.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        labelPlataforma.setText("CHEORL");
        labelPlataforma.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        labelBienvenido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelBienvenido.setText("REGISTRATE");

        btn_back.setBorder(null);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(47, 47, 47)
                        .addComponent(labelPlataforma)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                        .addComponent(labelBienvenido)
                        .addGap(144, 144, 144))))
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back)
                    .addComponent(labelPlataforma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundVistaIngreso.add(panelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        getNombre.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        getNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        getCorreo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        getCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        getCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCorreoActionPerformed(evt);
            }
        });

        btn_register.setBackground(new java.awt.Color(0, 0, 0));
        btn_register.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("REGISTRAR");
        btn_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_register.setDefaultCapable(false);
        btn_register.setFocusPainted(false);
        btn_register.setFocusable(false);
        btn_register.setRequestFocusEnabled(false);
        btn_register.setRolloverEnabled(false);
        btn_register.setVerifyInputWhenFocusTarget(false);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        getPasswordOne.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        getPasswordOne.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(iconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(getNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(getCorreo)
                    .addComponent(getPasswordOne))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btn_register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getPasswordOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backgroundVistaIngreso.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 380, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVistaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVistaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        controladores.ControladorRegister.btnBack();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        controladores.ControladorRegister.btnRegister();
    }//GEN-LAST:event_btn_registerActionPerformed

    private void getCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCorreoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }

    public JTextField getGetCorreo() {
        return getCorreo;
    }

    public JTextField getGetNombre() {
        return getNombre;
    }

    public JPasswordField getGetPasswordOne() {
        return getPasswordOne;
    }

    public void setGetCorreo(JTextField getCorreo) {
        this.getCorreo = getCorreo;
    }

    public void setGetNombre(JTextField getNombre) {
        this.getNombre = getNombre;
    }

    public void setGetPasswordOne(JPasswordField getPasswordOne) {
        this.getPasswordOne = getPasswordOne;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundVistaIngreso;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_register;
    private javax.swing.JTextField getCorreo;
    private javax.swing.JTextField getNombre;
    private javax.swing.JPasswordField getPasswordOne;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelPlataforma;
    private javax.swing.JPanel panelBienvenida;
    // End of variables declaration//GEN-END:variables
}
