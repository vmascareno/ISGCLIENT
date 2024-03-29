/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Graduate;
import utils.InputUtil;

/**
 *
 * @author vmascareno
 */
public class DeleteGraduateForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateGraduateForm
     */
    public DeleteGraduateForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnGrpSex = new javax.swing.ButtonGroup();
        bttnGrpIsWorking = new javax.swing.ButtonGroup();
        bttnGrpTypeWork = new javax.swing.ButtonGroup();
        lblControlNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCareer = new javax.swing.JLabel();
        lblEgresedAt = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblIsWorking = new javax.swing.JLabel();
        lblWorkType = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtControlNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rdBttnIsWorkingYes = new javax.swing.JRadioButton();
        rdBttnIsWorkingNo = new javax.swing.JRadioButton();
        rdBttnWorkTypePrivate = new javax.swing.JRadioButton();
        rdBttnWorkTypeGovernment = new javax.swing.JRadioButton();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        bttnDelete = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();
        rdBttnSexMale = new javax.swing.JRadioButton();
        rdBttnSexFemale = new javax.swing.JRadioButton();
        txtCareer = new javax.swing.JTextField();
        txtEgresedAt = new javax.swing.JTextField();
        bttnDeleteInformation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar egresado");

        lblControlNumber.setText("Matricula:");

        lblName.setText("Nombre:");

        lblCareer.setText("Carrera:");

        lblEgresedAt.setText("Año de egreso:");

        lblSexo.setText("Sexo:");

        lblIsWorking.setText("¿Trabaja?:");

        lblWorkType.setText("Tipo de empresa:");

        lblPhoneNumber.setText("Teléfono:");

        lblEmail.setText("Correo electrónico:");
        lblEmail.setToolTipText("");

        lblAddress.setText("Domicilio:");

        txtControlNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtControlNumberKeyPressed(evt);
            }
        });

        txtName.setEnabled(false);

        bttnGrpIsWorking.add(rdBttnIsWorkingYes);
        rdBttnIsWorkingYes.setText("Si");
        rdBttnIsWorkingYes.setEnabled(false);

        bttnGrpIsWorking.add(rdBttnIsWorkingNo);
        rdBttnIsWorkingNo.setText("No");
        rdBttnIsWorkingNo.setEnabled(false);

        bttnGrpTypeWork.add(rdBttnWorkTypePrivate);
        rdBttnWorkTypePrivate.setText("Privada");
        rdBttnWorkTypePrivate.setEnabled(false);

        bttnGrpTypeWork.add(rdBttnWorkTypeGovernment);
        rdBttnWorkTypeGovernment.setText("Gobierno");
        rdBttnWorkTypeGovernment.setEnabled(false);

        txtPhoneNumber.setEnabled(false);

        txtEmail.setEnabled(false);

        txtAddress.setEnabled(false);

        bttnDelete.setText("Eliminar");
        bttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteActionPerformed(evt);
            }
        });

        bttnCancel.setText("Cancelar");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        bttnGrpSex.add(rdBttnSexMale);
        rdBttnSexMale.setText("Masculino");
        rdBttnSexMale.setEnabled(false);

        bttnGrpSex.add(rdBttnSexFemale);
        rdBttnSexFemale.setText("Femenino");
        rdBttnSexFemale.setEnabled(false);

        txtCareer.setEnabled(false);

        txtEgresedAt.setEnabled(false);

        bttnDeleteInformation.setText("Borrar");
        bttnDeleteInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnDeleteInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblControlNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCareer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEgresedAt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWorkType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIsWorking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtControlNumber)
                            .addComponent(txtName)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtEmail)
                            .addComponent(txtAddress)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdBttnSexMale)
                                    .addComponent(rdBttnIsWorkingYes)
                                    .addComponent(rdBttnWorkTypePrivate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdBttnWorkTypeGovernment)
                                    .addComponent(rdBttnIsWorkingNo)
                                    .addComponent(rdBttnSexFemale)))
                            .addComponent(txtCareer)
                            .addComponent(txtEgresedAt, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblControlNumber)
                    .addComponent(txtControlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCareer)
                    .addComponent(txtCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEgresedAt)
                    .addComponent(txtEgresedAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rdBttnSexMale)
                    .addComponent(rdBttnSexFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsWorking)
                    .addComponent(rdBttnIsWorkingYes)
                    .addComponent(rdBttnIsWorkingNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWorkType)
                    .addComponent(rdBttnWorkTypePrivate)
                    .addComponent(rdBttnWorkTypeGovernment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnDelete)
                    .addComponent(bttnCancel)
                    .addComponent(bttnDeleteInformation))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnDeleteInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteInformationActionPerformed

        txtControlNumber.setText(null);
        txtName.setText(null);
        txtAddress.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        txtCareer.setText(null);
        txtEgresedAt.setText(null);
        bttnGrpSex.clearSelection();
        bttnGrpIsWorking.clearSelection();
        bttnGrpTypeWork.clearSelection();

        lblWorkType.setVisible(false);
        rdBttnWorkTypePrivate.setVisible(false);
        rdBttnWorkTypeGovernment.setVisible(false);

    }//GEN-LAST:event_bttnDeleteInformationActionPerformed

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenuForm().setVisible(true);
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void bttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteActionPerformed
        if (txtControlNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar la matricula del egresado");
        } else {
            try {
                Graduate graduate = new Graduate();
                graduate.setControlNumber(Integer.parseInt(this.txtControlNumber.getText()));
                boolean graduateDeleted = graduate.delete();

                if (graduateDeleted) {
                    this.clearFields();
                    JOptionPane.showMessageDialog(
                            this,
                            "Información del egresado eliminada exitosamente",
                            "Eliminar egresado",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                    this.setVisible(false);
                    new MainMenuForm().setVisible(true);
                } else {
                    this.clearFields();
                    JOptionPane.showMessageDialog(
                            this,
                            "Se produjo un error al intentar eliminar la información del egresado",
                            "Eliminar egresado",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (IOException ex) {
                Logger.getLogger(DeleteGraduateForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bttnDeleteActionPerformed

    private void txtControlNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlNumberKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (this.txtControlNumber.getText().isEmpty()) {
                    this.clearFields();
                    JOptionPane.showMessageDialog(
                            this,
                            "Favor de capturar la matricula del egresado",
                            "Eliminar egresado",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    Graduate graduate = new Graduate();
                    graduate.setControlNumber(Integer.parseInt(this.txtControlNumber.getText()));
                    graduate.get();

                    if (graduate.getControlNumber() == -1) {
                        this.clearFields();
                        JOptionPane.showMessageDialog(
                                this,
                                "La matricula del egresado aun no se encuentra registrada",
                                "Eliminar egresado",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        this.txtName.setText(graduate.getName());
                        this.txtCareer.setText(graduate.getCareer());
                        this.txtEgresedAt.setText(graduate.getEgresedAt());

                        if (graduate.getSex().equalsIgnoreCase("MASCULINO")) {
                            this.rdBttnSexMale.setSelected(true);
                        } else {
                            this.rdBttnSexFemale.setSelected(true);
                        }

                        if (graduate.isIsWorking()) {
                            this.rdBttnIsWorkingYes.setSelected(true);
                        } else {
                            this.rdBttnIsWorkingNo.setSelected(true);
                        }

                        if (graduate.getWorkType().equalsIgnoreCase("PRIVADA")) {
                            this.rdBttnWorkTypePrivate.setSelected(true);
                        } else {
                            this.rdBttnWorkTypeGovernment.setSelected(true);
                        }

                        this.txtPhoneNumber.setText(graduate.getPhoneNumber());
                        this.txtEmail.setText(graduate.getEmail());
                        this.txtAddress.setText(graduate.getAddress());
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(DeleteGraduateForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DeleteGraduateForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtControlNumberKeyPressed

    private void clearFields() {
        txtControlNumber.setText(null);
        txtName.setText(null);
        txtAddress.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        txtCareer.setText(null);
        txtEgresedAt.setText(null);
        bttnGrpSex.clearSelection();
        bttnGrpIsWorking.clearSelection();
        bttnGrpTypeWork.clearSelection();

        lblWorkType.setVisible(false);
        rdBttnWorkTypePrivate.setVisible(false);
        rdBttnWorkTypeGovernment.setVisible(false);
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
            java.util.logging.Logger.getLogger(DeleteGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteGraduateForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnDelete;
    private javax.swing.JButton bttnDeleteInformation;
    private javax.swing.ButtonGroup bttnGrpIsWorking;
    private javax.swing.ButtonGroup bttnGrpSex;
    private javax.swing.ButtonGroup bttnGrpTypeWork;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCareer;
    private javax.swing.JLabel lblControlNumber;
    private javax.swing.JLabel lblEgresedAt;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIsWorking;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblWorkType;
    private javax.swing.JRadioButton rdBttnIsWorkingNo;
    private javax.swing.JRadioButton rdBttnIsWorkingYes;
    private javax.swing.JRadioButton rdBttnSexFemale;
    private javax.swing.JRadioButton rdBttnSexMale;
    private javax.swing.JRadioButton rdBttnWorkTypeGovernment;
    private javax.swing.JRadioButton rdBttnWorkTypePrivate;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCareer;
    private javax.swing.JTextField txtControlNumber;
    private javax.swing.JTextField txtEgresedAt;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
