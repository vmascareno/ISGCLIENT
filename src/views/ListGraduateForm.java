/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author vmascareno
 */
public class ListGraduateForm extends javax.swing.JFrame {

    /**
     * Creates new form ListGraduateForm
     */
    public ListGraduateForm() {
        initComponents();
        this.lblSelectByField.setVisible(false);
        this.txtSelectByControNumber.setVisible(false);
        this.cmbBxSelectByCareer.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSelectBy = new javax.swing.JLabel();
        cmbBxSelectBy = new javax.swing.JComboBox();
        lblSelectByField = new javax.swing.JLabel();
        txtSelectByControNumber = new javax.swing.JTextField();
        cmbBxSelectByCareer = new javax.swing.JComboBox();
        bttnSelect = new javax.swing.JButton();
        scrllPnEgresates = new javax.swing.JScrollPane();
        TblEgresates = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de egresados");

        lblSelectBy.setText("Consultar por:");

        cmbBxSelectBy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción", "Matricula", "Carrera" }));
        cmbBxSelectBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBxSelectByActionPerformed(evt);
            }
        });

        cmbBxSelectByCareer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una opción", "Ingeniero en Computacion", "Ingeniero en Mecatrónica", "Ingeniero Mecanico", "Ingeniero en Electrica", "Ingeniero en Electronica", "Ingeniero Civil", "Ingeniero Industrial", "Ingeniero en Energias Renovables", "Bioingeniero" }));

        bttnSelect.setText("Consultar");

        TblEgresates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nombre", "Carrera", "Año de egreso", "Sexo", "¿Trabaja?", "Tipo de trabajo", "Teléfono", "Correo electrónico", "Domicilio", "Fecha de registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrllPnEgresates.setViewportView(TblEgresates);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllPnEgresates)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBxSelectBy, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSelectByField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBxSelectByCareer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectByControNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnSelect)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectBy)
                    .addComponent(cmbBxSelectBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelectByControNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectByField)
                    .addComponent(bttnSelect)
                    .addComponent(cmbBxSelectByCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrllPnEgresates, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBxSelectByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBxSelectByActionPerformed
        // TODO add your handling code here:
        int selectedItem = this.cmbBxSelectBy.getSelectedIndex();

        switch (selectedItem) {
            case 0:
                this.lblSelectByField.setVisible(false);
                this.txtSelectByControNumber.setVisible(false);
                this.cmbBxSelectByCareer.setVisible(false);
                break;
            case 1:
                if (this.cmbBxSelectByCareer.isVisible()) {
                    this.cmbBxSelectByCareer.setVisible(false);
                }

                this.lblSelectByField.setText("Matricula:");
                this.lblSelectByField.setVisible(true);
                this.txtSelectByControNumber.setVisible(true);
                break;
            case 2:
                if (this.txtSelectByControNumber.isVisible()) {
                    this.txtSelectByControNumber.setVisible(false);
                }

                this.lblSelectByField.setText("Carrera:");
                this.lblSelectByField.setVisible(true);
                this.cmbBxSelectByCareer.setVisible(true);
                break;

        }
    }//GEN-LAST:event_cmbBxSelectByActionPerformed

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
            java.util.logging.Logger.getLogger(ListGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListGraduateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblEgresates;
    private javax.swing.JButton bttnSelect;
    private javax.swing.JComboBox cmbBxSelectBy;
    private javax.swing.JComboBox cmbBxSelectByCareer;
    private javax.swing.JLabel lblSelectBy;
    private javax.swing.JLabel lblSelectByField;
    private javax.swing.JScrollPane scrllPnEgresates;
    private javax.swing.JTextField txtSelectByControNumber;
    // End of variables declaration//GEN-END:variables
}
