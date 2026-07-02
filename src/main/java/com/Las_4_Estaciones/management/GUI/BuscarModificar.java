package com.Las_4_Estaciones.management.GUI;

import com.Las_4_Estaciones.management.persistencia.Consultas.Consultas;
import com.Las_4_Estaciones.management.validacion.validacion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class BuscarModificar extends javax.swing.JFrame {
    

    public BuscarModificar() {
        initComponents();
        if(!PorCliente.isSelected() && !PorFecha.isSelected()){
            BuscarFecha.setEnabled(false);
            BuscarFecha.setDate(null);
            BuscarDNI.setText("");
            BuscarDNI.setEditable(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarModificar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PorCliente = new javax.swing.JRadioButton();
        PorFecha = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BuscarFecha = new com.toedter.calendar.JDateChooser();
        BuscarDNI = new javax.swing.JTextField();
        Cancelar = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Departamento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 200));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        PorCliente.setBackground(new java.awt.Color(250, 250, 250));
        BuscarModificar.add(PorCliente);
        PorCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PorCliente.setForeground(new java.awt.Color(70, 70, 70));
        PorCliente.setText("Por Cliente");
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

        PorFecha.setBackground(new java.awt.Color(250, 250, 250));
        BuscarModificar.add(PorFecha);
        PorFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PorFecha.setForeground(new java.awt.Color(70, 70, 70));
        PorFecha.setText("Por Fecha");
        PorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorFechaActionPerformed(evt);
            }
        });
        PorFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PorFechaPropertyChange(evt);
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

        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(70, 70, 70));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buscar.setText("Buscar");
        Buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veranoOscuro.png"))); // NOI18N

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
                        .addComponent(PorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PorCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
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
                .addComponent(PorFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Buscar)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDNIActionPerformed

    }//GEN-LAST:event_BuscarDNIActionPerformed

    private void CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseClicked
        this.dispose();
        Inicio InicioPantalla = new Inicio();
        InicioPantalla.setVisible(true);
        InicioPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_CancelarMouseClicked

    private void CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseEntered
        Cancelar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_CancelarMouseEntered

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        Buscar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        Buscar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_BuscarMouseExited

    private void CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarMouseExited
        Cancelar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_CancelarMouseExited

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        com.Las_4_Estaciones.management.persistencia.Datos.Reserva reserva = null;
        String depto = (String) Departamento.getSelectedItem();
        if(validacion.isEmpty(Departamento)){
            JOptionPane.showMessageDialog(null, "Seleccione un departamento");
            return;
        }
        if(PorCliente.isSelected()){ 
            String dni = BuscarDNI.getText();
            try {
                reserva = Consultas.getReserva(dni, depto);
            } catch (SQLException ex) {
                System.getLogger(BuscarModificar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            if(reserva!=null){      
                this.dispose();
                Modificar ModificarPantalla = new Modificar(reserva);
                ModificarPantalla.setVisible(true);
                ModificarPantalla.setLocationRelativeTo(null);
            }else{
                JOptionPane.showMessageDialog(null, "Reserva inexistente");
            }
        }
        else if (PorFecha.isSelected()){
            Date utilDate = BuscarFecha.getDate(); 
            if (utilDate != null) {
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            try {
                reserva = Consultas.getReserva(sqlDate, depto);
                } 
            catch (SQLException ex) {
                System.getLogger(BuscarModificar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
            if(reserva!=null){      
                this.dispose();
                Modificar ModificarPantalla = new Modificar(reserva);
                ModificarPantalla.setVisible(true);
                ModificarPantalla.setLocationRelativeTo(null);
            }else{
                JOptionPane.showMessageDialog(null, "Reserva inexistente");
            }
        }
    }//GEN-LAST:event_BuscarMouseClicked

    private void PorClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PorClientePropertyChange

    }//GEN-LAST:event_PorClientePropertyChange

    private void PorFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PorFechaPropertyChange
        
    }//GEN-LAST:event_PorFechaPropertyChange

    private void PorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorFechaActionPerformed
        BuscarFecha.setEnabled(true);
        BuscarDNI.setText("");
        BuscarDNI.setEditable(false);
    }//GEN-LAST:event_PorFechaActionPerformed

    private void PorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorClienteActionPerformed
        BuscarFecha.setDate(null);
        BuscarFecha.setEnabled(false);
        BuscarDNI.setEditable(true);
    }//GEN-LAST:event_PorClienteActionPerformed

    private void DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentoActionPerformed

    }//GEN-LAST:event_DepartamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JTextField BuscarDNI;
    private com.toedter.calendar.JDateChooser BuscarFecha;
    private javax.swing.ButtonGroup BuscarModificar;
    private javax.swing.JLabel Cancelar;
    private javax.swing.JComboBox<String> Departamento;
    private javax.swing.JRadioButton PorCliente;
    private javax.swing.JRadioButton PorFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
