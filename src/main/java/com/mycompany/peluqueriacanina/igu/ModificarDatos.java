package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Mascota masco = null;
    int id = 0;

    public ModificarDatos(int id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelRazaCliente = new javax.swing.JLabel();
        jLabelColorCliente = new javax.swing.JLabel();
        jLabelAlergicoCliente = new javax.swing.JLabel();
        jLabelAtencionEspecialCliente = new javax.swing.JLabel();
        jLabelNombreDuenio = new javax.swing.JLabel();
        jLabelTelefonoDuenio = new javax.swing.JLabel();
        jLabelObservacionesDuenio = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        cbxAlergico = new javax.swing.JComboBox<>();
        cbxAtencionEspecial = new javax.swing.JComboBox<>();
        txtNombreDuenio = new javax.swing.JTextField();
        txtTelefonoDuenio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservacionesDuenio = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(102, 153, 255));
        jLabelTitulo.setText("Modificacion de  Datos");

        jLabelNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombreCliente.setText("Nombre:");

        jLabelRazaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRazaCliente.setText("Raza:");

        jLabelColorCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelColorCliente.setText("Color:");

        jLabelAlergicoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAlergicoCliente.setText("Alérgico:");

        jLabelAtencionEspecialCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAtencionEspecialCliente.setText("Atención Especial:");

        jLabelNombreDuenio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelNombreDuenio.setText("Nombre Dueño:");

        jLabelTelefonoDuenio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTelefonoDuenio.setText("Cel. Dueño:");

        jLabelObservacionesDuenio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelObservacionesDuenio.setText("Observaciones:");

        cbxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        cbxAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

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
        btnGuardar.setText("Guardar Cambios");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombreCliente)
                                    .addComponent(jLabelRazaCliente)
                                    .addComponent(jLabelColorCliente)
                                    .addComponent(jLabelAlergicoCliente))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre)
                                        .addComponent(txtRaza)
                                        .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAtencionEspecialCliente)
                                .addGap(18, 18, 18)
                                .addComponent(cbxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)
                                    .addComponent(btnGuardar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNombreDuenio)
                                        .addComponent(jLabelTelefonoDuenio)
                                        .addComponent(jLabelObservacionesDuenio))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefonoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(88, 88, 88)
                        .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(957, 957, 957))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelTitulo)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaCliente)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelColorCliente)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlergicoCliente)
                            .addComponent(cbxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAtencionEspecialCliente)
                            .addComponent(cbxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreDuenio)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefonoDuenio)
                            .addComponent(txtTelefonoDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObservacionesDuenio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cbxAlergico.setSelectedIndex(0);
        cbxAtencionEspecial.setSelectedIndex(0);
        txtNombreDuenio.setText("");
        txtTelefonoDuenio.setText("");
        txtAreaObservacionesDuenio.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico = cbxAlergico.getSelectedItem().toString();
        String atencionEspecial = cbxAtencionEspecial.getSelectedItem().toString();
        String areaObservacion = txtAreaObservacionesDuenio.getText();

        String nombreDuenio = txtNombreDuenio.getText();
        String telefonoDuenio = txtTelefonoDuenio.getText();

        control.editarCliente(masco, nombre, raza, color, alergico, atencionEspecial, areaObservacion,
                nombreDuenio, telefonoDuenio);
        JOptionPane.showMessageDialog(null, "Edicion realizada correctamente");
        
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        dispose();
               
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarDatos(id);
    }//GEN-LAST:event_formWindowOpened

    private void cargarDatos(int id) {

        masco = control.buscarMascota(id);
        txtNombre.setText(masco.getNombre());
        txtColor.setText(masco.getColor());
        txtRaza.setText(masco.getRaza());
        cbxAlergico.setSelectedItem(masco.getAlergico());
        cbxAtencionEspecial.setSelectedItem(masco.getAtencion_especial());
        txtAreaObservacionesDuenio.setText(masco.getObservaciones());
        txtNombreDuenio.setText(masco.getDuenio().getNombre());
        txtTelefonoDuenio.setText(masco.getDuenio().getCelular());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxAlergico;
    private javax.swing.JComboBox<String> cbxAtencionEspecial;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabelAlergicoCliente;
    private javax.swing.JLabel jLabelAtencionEspecialCliente;
    private javax.swing.JLabel jLabelColorCliente;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreDuenio;
    private javax.swing.JLabel jLabelObservacionesDuenio;
    private javax.swing.JLabel jLabelRazaCliente;
    private javax.swing.JLabel jLabelTelefonoDuenio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaObservacionesDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefonoDuenio;
    // End of variables declaration//GEN-END:variables
}
