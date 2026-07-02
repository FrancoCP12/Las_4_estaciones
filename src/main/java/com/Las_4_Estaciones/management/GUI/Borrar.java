package com.Las_4_Estaciones.management.GUI;

import com.Las_4_Estaciones.management.persistencia.Consultas.Consultas;
import com.Las_4_Estaciones.management.validacion.validacion;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Borrar extends javax.swing.JFrame {
    

    public Borrar() {
        initComponents();
        Departamento.setEnabled(false);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarModificar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PorCliente = new javax.swing.JRadioButton();
        PorReserva = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BuscarFecha = new com.toedter.calendar.JDateChooser();
        BuscarDNI = new javax.swing.JTextField();
        Cancelar = new javax.swing.JLabel();
        Borrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Departamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        PorCliente.setBackground(new java.awt.Color(250, 250, 250));
        BuscarModificar.add(PorCliente);
        PorCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PorCliente.setForeground(new java.awt.Color(70, 70, 70));
        PorCliente.setText("Cliente");
        PorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorClienteActionPerformed(evt);
            }
        });
        PorCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PorClientePropertyChange(evt);
            }
        });

        PorReserva.setBackground(new java.awt.Color(250, 250, 250));
        BuscarModificar.add(PorReserva);
        PorReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PorReserva.setForeground(new java.awt.Color(70, 70, 70));
        PorReserva.setText("Reserva");
        PorReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorReservaActionPerformed(evt);
            }
        });
        PorReserva.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PorReservaPropertyChange(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(70, 70, 70));
        jLabel1.setText("Fecha de Reserva");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));

        jLabel2.setForeground(new java.awt.Color(70, 70, 70));
        jLabel2.setText("D.N.I/Pasaporte");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));

        BuscarFecha.setDateFormatString("yyyy-MM-dd");

        BuscarDNI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 1, true));
        BuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDNIActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(70, 70, 70));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelarMouseExited(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Borrar.setForeground(new java.awt.Color(70, 70, 70));
        Borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Borrar.setText("Borrar");
        Borrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrarMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inviernoOscuro.png"))); // NOI18N

        Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "INVIERNO", "VERANO", "OTOÑO", "PRIMAVERA" }));
        Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(70, 70, 70));
        jLabel4.setText("Departamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PorReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PorCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PorCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(BuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(PorReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Borrar)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.dispose();
        Inicio InicioPantalla = new Inicio();
        InicioPantalla.setVisible(true);
        InicioPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_CancelarMouseClicked

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Cancelar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_CancelarMouseEntered

    private void BorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseEntered
        Borrar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_BorrarMouseEntered

    private void BorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseExited
        Borrar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_BorrarMouseExited

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Cancelar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_CancelarMouseExited

    private void BorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrarMouseClicked
        if(PorCliente.isSelected()){ 
            if(!validacion.isEmpty(BuscarDNI)){ 
                try {
                    if(validacion.validacionDni(BuscarDNI.getText())){
                        Consultas.deleteCliente(BuscarDNI.getText());
                        JOptionPane.showMessageDialog(null, "Se borro correctamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encuentra el cliente");
                        }
                }catch (SQLException ex) {
                    System.getLogger(Borrar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el DNI o Pasaporte");
            }
        }else if(PorReserva.isSelected()){
            if(!validacion.isEmpty(Departamento)){ 
                try {
                    if(!validacion.validacionCheckIn(BuscarFecha.getDate(),Departamento.getSelectedItem().toString())){
                        Consultas.deleteReserva(BuscarFecha.getDate(), Departamento.getSelectedItem().toString());
                        JOptionPane.showMessageDialog(null, "Se borro correctamente");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encuentra la reserva");
                        }
                } catch (SQLException ex) {
                    System.getLogger(Borrar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un departamento");
            }
        }          
    
    }//GEN-LAST:event_BorrarMouseClicked

    private void DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentoActionPerformed

    }//GEN-LAST:event_DepartamentoActionPerformed

    private void PorReservaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PorReservaPropertyChange

    }//GEN-LAST:event_PorReservaPropertyChange

    private void PorReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorReservaActionPerformed
        BuscarFecha.setEnabled(true);
        BuscarDNI.setText("");
        BuscarDNI.setEditable(false);
        Departamento.setEnabled(true);
    }//GEN-LAST:event_PorReservaActionPerformed

    private void BuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarDNIActionPerformed

    private void PorClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PorClientePropertyChange

    }//GEN-LAST:event_PorClientePropertyChange

    private void PorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorClienteActionPerformed
        BuscarFecha.setDate(null);
        BuscarFecha.setEnabled(false);
        BuscarDNI.setEditable(true);
        Departamento.setEnabled(false);
    }//GEN-LAST:event_PorClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borrar;
    private javax.swing.JTextField BuscarDNI;
    private com.toedter.calendar.JDateChooser BuscarFecha;
    private javax.swing.ButtonGroup BuscarModificar;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JComboBox<String> Departamento;
    private javax.swing.JRadioButton PorCliente;
    private javax.swing.JRadioButton PorReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
