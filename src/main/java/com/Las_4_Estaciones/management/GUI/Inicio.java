
package com.Las_4_Estaciones.management.GUI;

import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import java.awt.Color;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        consultaBarra = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        modificarBarra = new javax.swing.JLabel();
        borrarBarra = new javax.swing.JLabel();
        salirBarra = new javax.swing.JLabel();
        reservaBarra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        consulta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Modificar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        borrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        consultaBarra.setBackground(new java.awt.Color(100, 100, 100));
        consultaBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consultaBarra.setForeground(new java.awt.Color(100, 100, 100));
        consultaBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultaBarra.setText("Consulta");
        consultaBarra.setToolTipText("");
        consultaBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        consultaBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaBarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaBarraMouseExited(evt);
            }
        });

        inicio.setBackground(new java.awt.Color(100, 100, 100));
        inicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inicio.setForeground(new java.awt.Color(100, 100, 100));
        inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio.setText("Inicio");
        inicio.setToolTipText("");
        inicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inicioMouseExited(evt);
            }
        });

        modificarBarra.setBackground(new java.awt.Color(100, 100, 100));
        modificarBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modificarBarra.setForeground(new java.awt.Color(100, 100, 100));
        modificarBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarBarra.setText("Modificar");
        modificarBarra.setToolTipText("");
        modificarBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        modificarBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarBarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarBarraMouseExited(evt);
            }
        });

        borrarBarra.setBackground(new java.awt.Color(100, 100, 100));
        borrarBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borrarBarra.setForeground(new java.awt.Color(100, 100, 100));
        borrarBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarBarra.setText("Borrar");
        borrarBarra.setToolTipText("");
        borrarBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        borrarBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarBarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarBarraMouseExited(evt);
            }
        });

        salirBarra.setBackground(new java.awt.Color(100, 100, 100));
        salirBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirBarra.setForeground(new java.awt.Color(100, 100, 100));
        salirBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirBarra.setText("Salir");
        salirBarra.setToolTipText("");
        salirBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        salirBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirBarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirBarraMouseExited(evt);
            }
        });

        reservaBarra.setBackground(new java.awt.Color(100, 100, 100));
        reservaBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reservaBarra.setForeground(new java.awt.Color(100, 100, 100));
        reservaBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservaBarra.setText("Reserva");
        reservaBarra.setToolTipText("");
        reservaBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        reservaBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservaBarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservaBarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservaBarraMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Script", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>LAS CUATRO<br>ESTACIONES</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reservaBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultaBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(borrarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservaBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultaBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrarBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(salirBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        reserva.setBackground(new java.awt.Color(70, 70, 70));
        reserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        reserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservaMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVAR");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Invierno.png"))); // NOI18N

        javax.swing.GroupLayout reservaLayout = new javax.swing.GroupLayout(reserva);
        reserva.setLayout(reservaLayout);
        reservaLayout.setHorizontalGroup(
            reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        reservaLayout.setVerticalGroup(
            reservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        consulta.setBackground(new java.awt.Color(70, 70, 70));
        consulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONSULTAR");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Verano.png"))); // NOI18N

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MODIFICAR");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Otoño.png"))); // NOI18N

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        borrar.setBackground(new java.awt.Color(70, 70, 70));
        borrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrarMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BORRAR");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Primavera.png"))); // NOI18N

        javax.swing.GroupLayout borrarLayout = new javax.swing.GroupLayout(borrar);
        borrar.setLayout(borrarLayout);
        borrarLayout.setHorizontalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrarLayout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        borrarLayout.setVerticalGroup(
            borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseEntered
        inicio.setForeground(Color.white);
    }//GEN-LAST:event_inicioMouseEntered

    private void inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseExited
        inicio.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_inicioMouseExited

    private void reservaBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaBarraMouseEntered
        reservaBarra.setForeground(Color.white);
    }//GEN-LAST:event_reservaBarraMouseEntered

    private void reservaBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaBarraMouseExited
        reservaBarra.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_reservaBarraMouseExited

    private void consultaBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBarraMouseEntered
        consultaBarra.setForeground(Color.white);
    }//GEN-LAST:event_consultaBarraMouseEntered

    private void consultaBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBarraMouseExited
        consultaBarra.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_consultaBarraMouseExited

    private void modificarBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBarraMouseEntered
        modificarBarra.setForeground(Color.white);
    }//GEN-LAST:event_modificarBarraMouseEntered

    private void modificarBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBarraMouseExited
        modificarBarra.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_modificarBarraMouseExited

    private void borrarBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBarraMouseEntered
        borrarBarra.setForeground(Color.WHITE);
    }//GEN-LAST:event_borrarBarraMouseEntered

    private void borrarBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBarraMouseExited
        borrarBarra.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_borrarBarraMouseExited

    private void salirBarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBarraMouseEntered
        salirBarra.setForeground(Color.white);
    }//GEN-LAST:event_salirBarraMouseEntered

    private void salirBarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBarraMouseExited
        salirBarra.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_salirBarraMouseExited

    private void ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseEntered
        Modificar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_ModificarMouseEntered

    private void ModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseExited
        Modificar.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_ModificarMouseExited

    private void salirBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBarraMouseClicked
        ConectarBD.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_salirBarraMouseClicked

    private void borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseEntered
        borrar.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_borrarMouseEntered

    private void borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseExited
        borrar.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_borrarMouseExited

    private void reservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaMouseEntered
        reserva.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_reservaMouseEntered

    private void reservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaMouseExited
        reserva.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_reservaMouseExited

    private void consultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMouseEntered
        consulta.setBackground(new Color(100,100,100));
    }//GEN-LAST:event_consultaMouseEntered

    private void consultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMouseExited
        consulta.setBackground(new Color(70,70,70));
    }//GEN-LAST:event_consultaMouseExited

    private void reservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaMouseClicked
        this.dispose();
        Reservar reservaPantalla = new Reservar();
        reservaPantalla.setVisible(true);
        reservaPantalla.setLocationRelativeTo(null);

    }//GEN-LAST:event_reservaMouseClicked

    private void reservaBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaBarraMouseClicked
        this.dispose();
        Reservar reservaPantalla = new Reservar();
        reservaPantalla.setVisible(true);
        reservaPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_reservaBarraMouseClicked

    private void consultaBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBarraMouseClicked
        this.dispose();
        Consulta consultaPantalla = new Consulta();
        consultaPantalla.setVisible(true);
        consultaPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultaBarraMouseClicked

    private void consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaMouseClicked
        this.dispose();
        Consulta consultaPantalla = new Consulta();
        consultaPantalla.setVisible(true);
        consultaPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultaMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        this.dispose();
        BuscarModificar BuscarModificarPantalla = new BuscarModificar();
        BuscarModificarPantalla.setVisible(true);
        BuscarModificarPantalla.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_ModificarMouseClicked

    private void modificarBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBarraMouseClicked
        this.dispose();
        BuscarModificar BuscarModificarPantalla = new BuscarModificar();
        BuscarModificarPantalla.setVisible(true);
        BuscarModificarPantalla.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_modificarBarraMouseClicked

    private void borrarBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBarraMouseClicked
        this.dispose();
        Borrar BorrarPantalla = new Borrar();
        BorrarPantalla.setVisible(true);
        BorrarPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_borrarBarraMouseClicked

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        this.dispose();
        Borrar BorrarPantalla = new Borrar();
        BorrarPantalla.setVisible(true);
        BorrarPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_borrarMouseClicked

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked

    }//GEN-LAST:event_inicioMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel borrar;
    private javax.swing.JLabel borrarBarra;
    private javax.swing.JPanel consulta;
    private javax.swing.JLabel consultaBarra;
    private javax.swing.JLabel inicio;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel modificarBarra;
    private javax.swing.JPanel reserva;
    private javax.swing.JLabel reservaBarra;
    private javax.swing.JLabel salirBarra;
    // End of variables declaration//GEN-END:variables
}
