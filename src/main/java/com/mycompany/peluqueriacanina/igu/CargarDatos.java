
package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class CargarDatos extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public CargarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNumeroCliente = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelRazaCliente = new javax.swing.JLabel();
        jLabelColorCliente = new javax.swing.JLabel();
        jLabelAlergicoCliente = new javax.swing.JLabel();
        jLabelAtencionEspecialCliente = new javax.swing.JLabel();
        jLabelNombreDuenio = new javax.swing.JLabel();
        jLabelTelefonoDuenio = new javax.swing.JLabel();
        jLabelObservacionesDuenio = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtRazaCliente = new javax.swing.JTextField();
        txtColorCliente = new javax.swing.JTextField();
        cbxAlergicoCliente = new javax.swing.JComboBox<>();
        cbxAtencionEspecialCliente = new javax.swing.JComboBox<>();
        txtNombreDuenio = new javax.swing.JTextField();
        txtTelefonoDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservacionesDuenio = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 153, 255));
        jLabelTitulo.setText("Peluqueria Canina");

        jLabelNumeroCliente.setText("Cliente N°:");

        jLabelNombreCliente.setText("Nombre:");

        jLabelRazaCliente.setText("Raza:");

        jLabelColorCliente.setText("Color:");

        jLabelAlergicoCliente.setText("Alérgico:");

        jLabelAtencionEspecialCliente.setText("Atención Especial:");

        jLabelNombreDuenio.setText("Nombre Dueño:");

        jLabelTelefonoDuenio.setText("Cel. Dueño:");

        jLabelObservacionesDuenio.setText("Observaciones:");

        cbxAlergicoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cbxAtencionEspecialCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        txtAreaObservacionesDuenio.setColumns(20);
        txtAreaObservacionesDuenio.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservacionesDuenio);

        btnLimpiar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\img\\clear.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\img\\save.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        foto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\perros.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAtencionEspecialCliente)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAtencionEspecialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumeroCliente)
                            .addComponent(jLabelNombreCliente)
                            .addComponent(jLabelRazaCliente)
                            .addComponent(jLabelColorCliente)
                            .addComponent(jLabelAlergicoCliente))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAlergicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumeroCliente)
                                .addComponent(txtNombreCliente)
                                .addComponent(txtRazaCliente)
                                .addComponent(txtColorCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreDuenio)
                            .addComponent(jLabelTelefonoDuenio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreDuenio)
                            .addComponent(txtTelefonoDuenio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelObservacionesDuenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumeroCliente)
                            .addComponent(txtNumeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreCliente)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaCliente)
                            .addComponent(txtRazaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelColorCliente)
                            .addComponent(txtColorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxAlergicoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAlergicoCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAtencionEspecialCliente)
                            .addComponent(cbxAtencionEspecialCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreDuenio)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefonoDuenio)
                            .addComponent(txtTelefonoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelObservacionesDuenio)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumeroCliente.setText("");
        txtNombreCliente.setText("");
        txtRazaCliente.setText("");
        txtColorCliente.setText("");
        cbxAlergicoCliente.setSelectedIndex(0);
        cbxAtencionEspecialCliente.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtTelefonoDuenio.setText("");
        txtAreaObservacionesDuenio.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombreCliente = txtNombreCliente.getText();
        String razaCliente = txtRazaCliente.getText();
        String colorCliente = txtColorCliente.getText();
        String alegicoCliente = cbxAlergicoCliente.getSelectedItem().toString();
        String atencionEspecial = cbxAtencionEspecialCliente.getSelectedItem().toString();
        String areaObservacion = txtAreaObservacionesDuenio.getText();
         
        String nombreDuenio = txtNombreDuenio.getText();
        String telefonoDuenio = txtTelefonoDuenio.getText();
       
        control.guardarCliente(nombreCliente,razaCliente,colorCliente,alegicoCliente,atencionEspecial,areaObservacion,
                nombreDuenio,telefonoDuenio);
        
        JOptionPane optionPane = new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        


    }//GEN-LAST:event_btnGuardarActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxAlergicoCliente;
    private javax.swing.JComboBox<String> cbxAtencionEspecialCliente;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabelAlergicoCliente;
    private javax.swing.JLabel jLabelAtencionEspecialCliente;
    private javax.swing.JLabel jLabelColorCliente;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreDuenio;
    private javax.swing.JLabel jLabelNumeroCliente;
    private javax.swing.JLabel jLabelObservacionesDuenio;
    private javax.swing.JLabel jLabelRazaCliente;
    private javax.swing.JLabel jLabelTelefonoDuenio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaObservacionesDuenio;
    private javax.swing.JTextField txtColorCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRazaCliente;
    private javax.swing.JTextField txtTelefonoDuenio;
    // End of variables declaration//GEN-END:variables
}
