package com.Las_4_Estaciones.management.GUI;
import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import com.Las_4_Estaciones.management.persistencia.Consultas.Consultas;
import static com.Las_4_Estaciones.management.persistencia.Datos.Departamento.INVIERNO;
import static com.Las_4_Estaciones.management.persistencia.Datos.Departamento.VERANO;
import static com.Las_4_Estaciones.management.persistencia.Datos.Departamento.OTOÑO;
import static com.Las_4_Estaciones.management.persistencia.Datos.Departamento.PRIMAVERA;
import com.Las_4_Estaciones.management.persistencia.Datos.Reserva;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoPropio;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoContratado;
import com.Las_4_Estaciones.management.persistencia.Datos.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Consulta extends javax.swing.JFrame {
    private Reserva reservaInvierno;
    private Reserva reservaVerano;
    private Reserva reservaOtoño;
    private Reserva reservaPrimavera;
    
    public Consulta() {
        this.reservaInvierno = null;
        this.reservaOtoño = null;
        this.reservaPrimavera = null;
        this.reservaVerano = null;
        initComponents();
        FechaBuscar.setDate(null);
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DisponibilidadInv = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HastaInv = new javax.swing.JLabel();
        infoInvierno = new javax.swing.JLabel();
        FechaBuscar = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DisponibilidadOto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        HastaOto = new javax.swing.JLabel();
        infoOtoño = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        DisponibilidadVer = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        HastaVer = new javax.swing.JLabel();
        infoVerano = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        DisponibilidadPrim = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        HastaPrim = new javax.swing.JLabel();
        infoPrimavera = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setForeground(new java.awt.Color(250, 250, 250));

        jPanel2.setBackground(new java.awt.Color(50, 50, 50));

        consultaBarra.setBackground(new java.awt.Color(100, 100, 100));
        consultaBarra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        consultaBarra.setForeground(new java.awt.Color(100, 100, 100));
        consultaBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consultaBarra.setText("Consulta");
        consultaBarra.setToolTipText("");
        consultaBarra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 60, 60), 3, true));
        consultaBarra.addMouseListener(new java.awt.event.MouseAdapter() {
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
                    .addComponent(modificarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(borrarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(salirBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel3.setBackground(new java.awt.Color(70, 70, 70));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 180));

        jLabel7.setBackground(new java.awt.Color(70, 70, 70));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(250, 250, 250));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Invierno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 200, 200));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Disponibilidad");

        DisponibilidadInv.setBackground(new java.awt.Color(60, 60, 60));
        DisponibilidadInv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponibilidadInv.setForeground(new java.awt.Color(200, 200, 200));
        DisponibilidadInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisponibilidadInv.setText("...");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hasta");

        HastaInv.setBackground(new java.awt.Color(60, 60, 60));
        HastaInv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HastaInv.setForeground(new java.awt.Color(200, 200, 200));
        HastaInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HastaInv.setText("...");

        infoInvierno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoInvierno.setForeground(new java.awt.Color(50, 50, 50));
        infoInvierno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoInvierno.setText("+Info");
        infoInvierno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        infoInvierno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoInviernoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoInviernoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoInviernoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(infoInvierno, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisponibilidadInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisponibilidadInv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HastaInv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoInvierno)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        FechaBuscar.setDateFormatString("yyyy-MM-dd");

        Buscar.setBackground(new java.awt.Color(70, 70, 70));
        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jLabel1.setBackground(new java.awt.Color(70, 70, 70));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Fecha de Consulta");

        jLabel8.setBackground(new java.awt.Color(70, 70, 70));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Consulta");

        jPanel4.setBackground(new java.awt.Color(70, 70, 70));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(160, 180));

        jLabel12.setBackground(new java.awt.Color(70, 70, 70));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Otoño");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(200, 200, 200));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Disponibilidad");

        DisponibilidadOto.setBackground(new java.awt.Color(60, 60, 60));
        DisponibilidadOto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponibilidadOto.setForeground(new java.awt.Color(200, 200, 200));
        DisponibilidadOto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisponibilidadOto.setText("...");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(200, 200, 200));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hasta");

        HastaOto.setBackground(new java.awt.Color(60, 60, 60));
        HastaOto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HastaOto.setForeground(new java.awt.Color(200, 200, 200));
        HastaOto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HastaOto.setText("...");

        infoOtoño.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoOtoño.setForeground(new java.awt.Color(50, 50, 50));
        infoOtoño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoOtoño.setText("+Info");
        infoOtoño.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        infoOtoño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoOtoñoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoOtoñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoOtoñoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaOto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisponibilidadOto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(infoOtoño, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisponibilidadOto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HastaOto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoOtoño)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(70, 70, 70));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        jPanel10.setPreferredSize(new java.awt.Dimension(160, 180));

        jLabel27.setBackground(new java.awt.Color(70, 70, 70));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(250, 250, 250));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Verano");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(200, 200, 200));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Disponibilidad");

        DisponibilidadVer.setBackground(new java.awt.Color(60, 60, 60));
        DisponibilidadVer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponibilidadVer.setForeground(new java.awt.Color(200, 200, 200));
        DisponibilidadVer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisponibilidadVer.setText("...");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(200, 200, 200));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Hasta");

        HastaVer.setBackground(new java.awt.Color(60, 60, 60));
        HastaVer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HastaVer.setForeground(new java.awt.Color(200, 200, 200));
        HastaVer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HastaVer.setText("...");

        infoVerano.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoVerano.setForeground(new java.awt.Color(50, 50, 50));
        infoVerano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoVerano.setText("+Info");
        infoVerano.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        infoVerano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoVeranoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoVeranoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoVeranoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(infoVerano, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisponibilidadVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisponibilidadVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HastaVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoVerano)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(70, 70, 70));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        jPanel12.setPreferredSize(new java.awt.Dimension(160, 180));

        jLabel37.setBackground(new java.awt.Color(70, 70, 70));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(250, 250, 250));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Primavera");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(200, 200, 200));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Disponibilidad");

        DisponibilidadPrim.setBackground(new java.awt.Color(60, 60, 60));
        DisponibilidadPrim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DisponibilidadPrim.setForeground(new java.awt.Color(200, 200, 200));
        DisponibilidadPrim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisponibilidadPrim.setText("...");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(200, 200, 200));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hasta");

        HastaPrim.setBackground(new java.awt.Color(60, 60, 60));
        HastaPrim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HastaPrim.setForeground(new java.awt.Color(200, 200, 200));
        HastaPrim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HastaPrim.setText("...");

        infoPrimavera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        infoPrimavera.setForeground(new java.awt.Color(50, 50, 50));
        infoPrimavera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoPrimavera.setText("+Info");
        infoPrimavera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 3, true));
        infoPrimavera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoPrimaveraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoPrimaveraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoPrimaveraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(infoPrimavera, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastaPrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DisponibilidadPrim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisponibilidadPrim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HastaPrim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPrimavera)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/primaveraOscuro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(FechaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(242, 242, 242))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FechaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(8, Short.MAX_VALUE))
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

    private void salirBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirBarraMouseClicked
        ConectarBD.cerrarConexion();
        System.exit(0);
    }//GEN-LAST:event_salirBarraMouseClicked

    private void reservaBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservaBarraMouseClicked
        this.dispose();
        Reservar reservaPantalla = new Reservar();
        reservaPantalla.setVisible(true);
        reservaPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_reservaBarraMouseClicked

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        this.dispose();
        Inicio InicioPantalla = new Inicio();
        InicioPantalla.setVisible(true);
        InicioPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_inicioMouseClicked

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        Buscar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        Buscar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_BuscarMouseExited

    private void infoInviernoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoInviernoMouseEntered
        infoInvierno.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_infoInviernoMouseEntered

    private void infoInviernoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoInviernoMouseExited
        infoInvierno.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_infoInviernoMouseExited

    private void infoOtoñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoOtoñoMouseEntered
        infoOtoño.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_infoOtoñoMouseEntered

    private void infoOtoñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoOtoñoMouseExited
        infoOtoño.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_infoOtoñoMouseExited

    private void infoVeranoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoVeranoMouseEntered
        infoVerano.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_infoVeranoMouseEntered

    private void infoVeranoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoVeranoMouseExited
        infoVerano.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_infoVeranoMouseExited

    private void infoPrimaveraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPrimaveraMouseEntered
        infoPrimavera.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_infoPrimaveraMouseEntered

    private void infoPrimaveraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPrimaveraMouseExited
       infoPrimavera.setForeground(new Color(50,50,50));
    }//GEN-LAST:event_infoPrimaveraMouseExited

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
public static java.sql.Date normalizarFecha(java.util.Date fecha) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(fecha);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    return new java.sql.Date(cal.getTimeInMillis());
}

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        if(FechaBuscar.getDate() != null){
            Date utilDate = FechaBuscar.getDate(); 
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            Date sqlNormalizado = normalizarFecha(sqlDate);
            try {
                this.reservaInvierno = Consultas.getReservaPorFechaOProxima(sqlDate, INVIERNO);
                this.reservaVerano = Consultas.getReservaPorFechaOProxima(sqlDate, VERANO);
                this.reservaOtoño = Consultas.getReservaPorFechaOProxima(sqlDate, OTOÑO);
                this.reservaPrimavera = Consultas.getReservaPorFechaOProxima(sqlDate, PRIMAVERA);
                } 
            catch (SQLException ex) {
                System.getLogger(Consulta.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            
            if(this.reservaInvierno!=null){
                Date checkInNormalizado = normalizarFecha(this.reservaInvierno.getCheckIn());
                if(checkInNormalizado.before(sqlNormalizado) || checkInNormalizado.equals(sqlNormalizado)){      
                    DisponibilidadInv.setText("OCUPADO");
                    HastaInv.setText(String.valueOf(this.reservaInvierno.getCheckOut()));
                }
                else{
                    DisponibilidadInv.setText("DESOCUPADO");
                    HastaInv.setText(String.valueOf(this.reservaInvierno.getCheckIn()));
                }
            }
            else{
                DisponibilidadInv.setText("DESOCUPADO");
                HastaInv.setText("...");
            }
            if(this.reservaVerano != null){
                Date checkInNormalizado = normalizarFecha(this.reservaVerano.getCheckIn());

                if(checkInNormalizado.before(sqlNormalizado) || checkInNormalizado.equals(sqlNormalizado) ){      
                    DisponibilidadVer.setText("OCUPADO");
                    HastaVer.setText(String.valueOf(this.reservaVerano.getCheckOut()));
                }
                else{
                    DisponibilidadVer.setText("DESOCUPADO");
                    HastaVer.setText(String.valueOf(this.reservaVerano.getCheckIn()));
                }
            }
            else{
                DisponibilidadVer.setText("DESOCUPADO");
                HastaVer.setText("...");
            }
            if(this.reservaPrimavera != null){
                Date checkInNormalizado = normalizarFecha(this.reservaPrimavera.getCheckIn());
                if(checkInNormalizado.before(sqlNormalizado) || checkInNormalizado.equals(sqlNormalizado)){      
                    DisponibilidadPrim.setText("OCUPADO");
                    HastaPrim.setText(String.valueOf(this.reservaPrimavera.getCheckOut()));
                }
                else{
                    DisponibilidadPrim.setText("DESOCUPADO");
                    HastaPrim.setText(String.valueOf(this.reservaPrimavera.getCheckIn()));
                }
                
            }
            else{
                DisponibilidadPrim.setText("DESOCUPADO");
                HastaPrim.setText("...");
            }
            
            if(this.reservaOtoño != null){
                Date checkInNormalizado = normalizarFecha(this.reservaOtoño.getCheckIn());
                if(checkInNormalizado.before(sqlNormalizado) || checkInNormalizado.equals(sqlNormalizado)){      
                    DisponibilidadOto.setText("OCUPADO");
                    HastaOto.setText(String.valueOf(this.reservaOtoño.getCheckOut()));
                }
                else{
                    DisponibilidadOto.setText("DESOCUPADO");
                    HastaOto.setText(String.valueOf(this.reservaOtoño.getCheckIn()));
                }

            }
            else{
                DisponibilidadOto.setText("DESOCUPADO");
                HastaOto.setText("...");
                
            }
        }
    }//GEN-LAST:event_BuscarMouseClicked
    private void mensaje(Reserva reserva){
            Cliente cliente = reserva.getCliente();
            
            
            if(reserva.getVehiculo() instanceof VehiculoPropio){
                VehiculoPropio vehiculo = (VehiculoPropio) reserva.getVehiculo();
                String Mensaje =  "Reserva:\nNombre: "  + cliente.getNombre() + " " + cliente.getApellido() + "\n" +
                            "DNI/Pasaporte: " + cliente.getDniPasaporte() + "\n" +
                            "Dirección: " + cliente.getDireccion() + "\n" +
                            "Email: " + cliente.getEmail() + "\n" +
                            "Teléfono: " + cliente.getTelefono() + "\n" +
                            "Departamento reservado: " + reserva.getDepartamento() + "\n" +
                            "Check-in: " + reserva.getCheckIn() + "\n" +
                            "Check-out: " + reserva.getCheckOut() + "\n" +
                            "Metodo de Pago: " + reserva.getMetodoPago()+ "\n" +
                            "Cantidad de adultos: " + reserva.getCtdAdultos() + "\n" +
                            "Cantidad de menores: " + reserva.getCtdMenores() + "\n" +
                            "Origen: " + vehiculo.getOrigen() + "\n" +
                            "Hora de llegada: " + vehiculo.getHoraLlegada() + "\n" +
                            "Hora de partida: " + vehiculo.getHoraPartida() + "\n" +
                            "Tipo de vehículo: " + vehiculo.getTipoVehiculo() + "\n" +
                            "Modelo/Marca: " + vehiculo.getMarcaModelo() + "\n"+
                            "Patente: " + vehiculo.getPatente();
                JOptionPane.showMessageDialog(null, Mensaje);                
            }else if (reserva.getVehiculo() instanceof VehiculoContratado){
                VehiculoContratado vehiculo = (VehiculoContratado) reserva.getVehiculo();
                String Mensaje =  "Reserva:\nNombre: " + cliente.getNombre() + " " + cliente.getApellido() + "\n" +
                            "DNI/Pasaporte: " + cliente.getDniPasaporte() + "\n" +
                            "Dirección: " + cliente.getDireccion() + "\n" +
                            "Email: " + cliente.getEmail() + "\n" +
                            "Teléfono: " + cliente.getTelefono() + "\n" +
                            "Departamento reservado: " + reserva.getDepartamento() + "\n" +
                            "Check-in: " + reserva.getCheckIn() + "\n" +
                            "Check-out: " + reserva.getCheckOut() + "\n" +
                            "Metodo de Pago: " + reserva.getMetodoPago()+ "\n" +
                            "Cantidad de adultos: " + reserva.getCtdAdultos() + "\n" +
                            "Cantidad de menores: " + reserva.getCtdMenores() + "\n" +
                            "Origen: " + vehiculo.getOrigen() + "\n" +
                            "Hora de llegada: " + vehiculo.getHoraLlegada() + "\n" +
                            "Hora de partida: " + vehiculo.getHoraPartida() + "\n" +
                            "Tipo de vehículo: " + vehiculo.getTipoVehiculo() + "\n" +
                            "Empresa: " + vehiculo.getEmpresa();
                JOptionPane.showMessageDialog(null, Mensaje); 
                    }
                     
}
    private void infoInviernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoInviernoMouseClicked
        if(this.reservaInvierno != null){
            this.mensaje(this.reservaInvierno);  
        }
      
    }//GEN-LAST:event_infoInviernoMouseClicked

    private void infoVeranoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoVeranoMouseClicked
        if(this.reservaVerano != null){
            this.mensaje(this.reservaVerano);  
        }
    }//GEN-LAST:event_infoVeranoMouseClicked

    private void infoOtoñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoOtoñoMouseClicked
        if(this.reservaOtoño != null){
            this.mensaje(this.reservaOtoño);  
        }
    }//GEN-LAST:event_infoOtoñoMouseClicked

    private void infoPrimaveraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPrimaveraMouseClicked
        if(this.reservaPrimavera != null){
            this.mensaje(this.reservaPrimavera);  
                }
    }//GEN-LAST:event_infoPrimaveraMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Buscar;
    private javax.swing.JLabel DisponibilidadInv;
    private javax.swing.JLabel DisponibilidadOto;
    private javax.swing.JLabel DisponibilidadPrim;
    private javax.swing.JLabel DisponibilidadVer;
    private com.toedter.calendar.JDateChooser FechaBuscar;
    private javax.swing.JLabel HastaInv;
    private javax.swing.JLabel HastaOto;
    private javax.swing.JLabel HastaPrim;
    private javax.swing.JLabel HastaVer;
    private javax.swing.JLabel borrarBarra;
    private javax.swing.JLabel consultaBarra;
    private javax.swing.JLabel infoInvierno;
    private javax.swing.JLabel infoOtoño;
    private javax.swing.JLabel infoPrimavera;
    private javax.swing.JLabel infoVerano;
    private javax.swing.JLabel inicio;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel modificarBarra;
    private javax.swing.JLabel reservaBarra;
    private javax.swing.JLabel salirBarra;
    // End of variables declaration//GEN-END:variables

}