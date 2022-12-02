package vistas;

import Dao.DaoTarea;
import Dao.IDaoTarea;
import Modelos.tareaModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VerTareas extends javax.swing.JPanel {

    public VerTareas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(530, 470));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        Title.setText("TAREAS");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE TAREA", "TAREA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 280));

        jButton1.setText("ACTUALIZAR TAREAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      SetCarga();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public void SetCarga() {
        DefaultTableModel modelo = (DefaultTableModel) Table.getModel();
        IDaoTarea iDaoTarea = new DaoTarea();
        ArrayList<tareaModel> p = iDaoTarea.getTarea();

        Object[] cl = new Object[p.size()];

        for (int i = 0; i < p.size(); i++) {
            //System.out.println(p.get(i).getTarea());
            cl[0] = p.get(i).getName_tarea();
            cl[1] = p.get(i).getTarea();
            modelo.addRow(cl);
        }
        Table.setModel(modelo);
    }

    public JTable getTable() {
        return Table;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
