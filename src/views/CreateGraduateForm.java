/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Graduate;
import utils.InputUtil;

/**
 *
 * @author vmascareno
 */
public class CreateGraduateForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateGraduateForm
     */
    public CreateGraduateForm() {
        initComponents();
        lblWorkType.setVisible(false);
        rdBttnWorkTypePrivate.setVisible(false);
        rdBttnWorkTypeGovernment.setVisible(false);
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
        cmbBxCareer = new javax.swing.JComboBox();
        cmbBxEgresedAt = new javax.swing.JComboBox();
        rdBttnIsWorkingYes = new javax.swing.JRadioButton();
        rdBttnIsWorkingNo = new javax.swing.JRadioButton();
        rdBttnWorkTypePrivate = new javax.swing.JRadioButton();
        rdBttnWorkTypeGovernment = new javax.swing.JRadioButton();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        bttnAccept = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();
        rdBttnSexMale = new javax.swing.JRadioButton();
        rdBttnSexFemale = new javax.swing.JRadioButton();
        bttnDeleteInformation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear nuevo egresado");

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtControlNumberKeyTyped(evt);
            }
        });

        cmbBxCareer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Ingeniero en Computacion", "Ingeniero en Mecatrónica", "Ingeniero Mecanico", "Ingeniero en Electrica", "Ingeniero en Electronica", "Ingeniero Civil", "Ingeniero Industrial", "Ingeniero en Energias Renovables", "Bioingeniero" }));

        cmbBxEgresedAt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        bttnGrpIsWorking.add(rdBttnIsWorkingYes);
        rdBttnIsWorkingYes.setText("Si");
        rdBttnIsWorkingYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBttnIsWorkingYesActionPerformed(evt);
            }
        });

        bttnGrpIsWorking.add(rdBttnIsWorkingNo);
        rdBttnIsWorkingNo.setText("No");
        rdBttnIsWorkingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBttnIsWorkingNoActionPerformed(evt);
            }
        });

        bttnGrpTypeWork.add(rdBttnWorkTypePrivate);
        rdBttnWorkTypePrivate.setText("Privada");

        bttnGrpTypeWork.add(rdBttnWorkTypeGovernment);
        rdBttnWorkTypeGovernment.setText("Gobierno");

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        bttnAccept.setText("Aceptar");
        bttnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAcceptActionPerformed(evt);
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

        bttnGrpSex.add(rdBttnSexFemale);
        rdBttnSexFemale.setText("Femenino");

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
                        .addComponent(bttnAccept))
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
                            .addComponent(cmbBxCareer, 0, 300, Short.MAX_VALUE)
                            .addComponent(cmbBxEgresedAt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(rdBttnSexFemale))))))
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
                    .addComponent(cmbBxCareer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEgresedAt)
                    .addComponent(cmbBxEgresedAt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(bttnAccept)
                    .addComponent(bttnCancel)
                    .addComponent(bttnDeleteInformation))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        this.setVisible(false);
        new MainMenuForm().setVisible(true);
    }//GEN-LAST:event_bttnCancelActionPerformed

    private void bttnDeleteInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteInformationActionPerformed

        txtControlNumber.setText(null);
        txtName.setText(null);
        txtAddress.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        cmbBxCareer.setSelectedIndex(0);
        cmbBxEgresedAt.setSelectedIndex(0);
        bttnGrpSex.clearSelection();
        bttnGrpIsWorking.clearSelection();
        bttnGrpTypeWork.clearSelection();

        lblWorkType.setVisible(false);
        rdBttnWorkTypePrivate.setVisible(false);
        rdBttnWorkTypeGovernment.setVisible(false);

    }//GEN-LAST:event_bttnDeleteInformationActionPerformed

    private void rdBttnIsWorkingYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBttnIsWorkingYesActionPerformed
        lblWorkType.setVisible(true);
        rdBttnWorkTypePrivate.setVisible(true);
        rdBttnWorkTypeGovernment.setVisible(true);
    }//GEN-LAST:event_rdBttnIsWorkingYesActionPerformed

    private void rdBttnIsWorkingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBttnIsWorkingNoActionPerformed
        lblWorkType.setVisible(false);
        rdBttnWorkTypePrivate.setVisible(false);
        rdBttnWorkTypeGovernment.setVisible(false);
    }//GEN-LAST:event_rdBttnIsWorkingNoActionPerformed

    private void txtControlNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtControlNumberKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa solo números");
        }
    }//GEN-LAST:event_txtControlNumberKeyTyped

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        // TODO add your handling code here:
        int numberOfCharacters = 10;

        if (txtPhoneNumber.getText().length() >= numberOfCharacters) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa solo 10 números");
        }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void bttnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAcceptActionPerformed

        // TODO: Validar que los campos no esten vacios.
        if (txtControlNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar la matricula del egresado");
        } else if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar el nombre del egresado");
        } else if (txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar la dirección del egresado");
        } else if (txtPhoneNumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar el número de telefono del egresado");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de capturar el correo electronico del egresado");
        } else if (cmbBxCareer.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar la carrera del egresado");
        } else if (cmbBxEgresedAt.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar el año de egreso");
        } else if (!rdBttnSexMale.isSelected() && !rdBttnSexFemale.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar el sexo del egresado");
        } else if (!rdBttnIsWorkingYes.isSelected() && !rdBttnIsWorkingNo.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar el estado laboral del egresado");
        } else if (rdBttnIsWorkingYes.isSelected() && !rdBttnWorkTypePrivate.isSelected() && !rdBttnWorkTypeGovernment.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Favor de seleccionar el tipo de trabajo del egresado");
        } else if (!InputUtil.isPhoneValid(txtPhoneNumber.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El numero de telefono es invalido");
        } else if (!InputUtil.isEmailValid(txtEmail.getText())) {
            JOptionPane.showMessageDialog(rootPane, "El correo electronico es invalido");
        } else {
            try {
                String workType = "";

                if (rdBttnIsWorkingYes.isSelected()) {
                    workType = rdBttnWorkTypePrivate.isSelected() ? "Privada" : "Gobierno";
                }

                Graduate graduate = new Graduate(
                        Integer.parseInt(txtControlNumber.getText()),
                        txtName.getText(),
                        cmbBxCareer.getSelectedItem().toString(),
                        cmbBxEgresedAt.getSelectedItem().toString(),
                        rdBttnSexMale.isSelected() == true ? "Masculino" : "Femenino",
                        rdBttnIsWorkingYes.isSelected(),
                        workType,
                        txtPhoneNumber.getText(),
                        txtEmail.getText(),
                        txtAddress.getText()
                );

                boolean graduateSaved = graduate.save();

                if (graduateSaved) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Información del egresado almacenada correctamente",
                            "Registro de egresados",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    this.setVisible(false);
                    new MainMenuForm().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "No se pudo registrar la información del egresado",
                            "Registro de egresados",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (IOException ex) {
                Logger.getLogger(CreateGraduateForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bttnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(CreateGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateGraduateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateGraduateForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAccept;
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnDeleteInformation;
    private javax.swing.ButtonGroup bttnGrpIsWorking;
    private javax.swing.ButtonGroup bttnGrpSex;
    private javax.swing.ButtonGroup bttnGrpTypeWork;
    private javax.swing.JComboBox cmbBxCareer;
    private javax.swing.JComboBox cmbBxEgresedAt;
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
    private javax.swing.JTextField txtControlNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
