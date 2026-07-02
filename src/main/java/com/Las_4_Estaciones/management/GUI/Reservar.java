package com.Las_4_Estaciones.management.GUI;
import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import com.Las_4_Estaciones.management.persistencia.Consultas.Consultas;
import com.Las_4_Estaciones.management.persistencia.Datos.Cliente;
import com.Las_4_Estaciones.management.persistencia.Datos.MetodoPago;
import com.Las_4_Estaciones.management.persistencia.Datos.Departamento;
import com.Las_4_Estaciones.management.persistencia.Datos.Reserva;
import com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.AUTOMOVIL;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.AVION;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.CAMIONETA;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.COLECTIVO;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.MOTOCICLETA;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoContratado;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoPropio;
import com.Las_4_Estaciones.management.validacion.validacion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;


public class Reservar extends javax.swing.JFrame {

    public Reservar() {
        initComponents();
        
        FechaIngreso.setDate(null);
        FechaEgreso.setDate(null);
        Date hoy = new Date();
        FechaIngreso.setMinSelectableDate(hoy);
        HoraLlegada.setEditable(false);
        HoraPartida.setEditable(false);
        Origen.setEditable(false);
        Empresa.setEditable(false);
        Modelo.setEditable(false);
        Patente.setEditable(false);  
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Transporte = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        consultaBarra = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        modificarBarra = new javax.swing.JLabel();
        borrarBarra = new javax.swing.JLabel();
        salirBarra = new javax.swing.JLabel();
        reservaBarra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Automovil = new javax.swing.JRadioButton();
        Camioneta = new javax.swing.JRadioButton();
        Colectivo = new javax.swing.JRadioButton();
        Avion = new javax.swing.JRadioButton();
        Motocicleta = new javax.swing.JRadioButton();
        DniPasaporte = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Patente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FechaEgreso = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CtdAdultos = new javax.swing.JComboBox<>();
        CtdMenores = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HoraPartida = new javax.swing.JTextField();
        Modelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Empresa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        HoraLlegada = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Departamentos = new javax.swing.JComboBox<>();
        MetodosPago = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Origen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

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
                    .addComponent(modificarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(borrarBarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(salirBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        FechaIngreso.setDateFormatString("yyyy-MM-dd");
        FechaIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaIngresoPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nueva Reserva");

        jLabel2.setText("Nombre ");

        jLabel4.setText("Medio de transporte");

        Automovil.setBackground(new java.awt.Color(250, 250, 250));
        Transporte.add(Automovil);
        Automovil.setText("Automovil");
        Automovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutomovilActionPerformed(evt);
            }
        });

        Camioneta.setBackground(new java.awt.Color(250, 250, 250));
        Transporte.add(Camioneta);
        Camioneta.setText("Camioneta");
        Camioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamionetaActionPerformed(evt);
            }
        });

        Colectivo.setBackground(new java.awt.Color(250, 250, 250));
        Transporte.add(Colectivo);
        Colectivo.setText("Colectivo");
        Colectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColectivoActionPerformed(evt);
            }
        });

        Avion.setBackground(new java.awt.Color(250, 250, 250));
        Transporte.add(Avion);
        Avion.setText("Avion");
        Avion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvionActionPerformed(evt);
            }
        });

        Motocicleta.setBackground(new java.awt.Color(250, 250, 250));
        Transporte.add(Motocicleta);
        Motocicleta.setText("Motocicleta");
        Motocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotocicletaActionPerformed(evt);
            }
        });

        DniPasaporte.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        DniPasaporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DniPasaporteMouseClicked(evt);
            }
        });
        DniPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DniPasaporteActionPerformed(evt);
            }
        });

        Nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreMouseClicked(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Patente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Patente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatenteMouseClicked(evt);
            }
        });
        Patente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatenteActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha de Ingreso");

        jLabel7.setText("Fecha de Egreso");

        FechaEgreso.setDateFormatString("yyyy-MM-dd");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Propio");

        jLabel9.setText("Cant. Adultos");

        jLabel10.setText("Cant. Menores");

        CtdAdultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        CtdAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtdAdultosActionPerformed(evt);
            }
        });

        CtdMenores.setBackground(new java.awt.Color(250, 250, 250));
        CtdMenores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        CtdMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtdMenoresActionPerformed(evt);
            }
        });

        jLabel11.setText("Patente");

        jLabel12.setText("Horario de Partida");

        HoraPartida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        HoraPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoraPartidaMouseClicked(evt);
            }
        });
        HoraPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraPartidaActionPerformed(evt);
            }
        });

        Modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModeloMouseClicked(evt);
            }
        });
        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });

        jLabel13.setText("Marca/Modelo");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Contratado");

        jLabel15.setText("Empresa");

        Empresa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpresaMouseClicked(evt);
            }
        });
        Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaActionPerformed(evt);
            }
        });

        jLabel16.setText("Horario de Llegueda");

        HoraLlegada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        HoraLlegada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoraLlegadaMouseClicked(evt);
            }
        });
        HoraLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraLlegadaActionPerformed(evt);
            }
        });

        Telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelefonoMouseClicked(evt);
            }
        });
        Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoActionPerformed(evt);
            }
        });

        jLabel18.setText("Nro. Telefono");

        jLabel20.setText("Departamento");

        jLabel19.setText("D.N.I/Pasaporte");

        jLabel21.setText("Direccion");

        jLabel22.setText("Email");

        Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailMouseClicked(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel23.setText("Metodo de Pago");

        Departamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "VERANO", "INVIERNO", "PRIMAVERA", "OTOÑO" }));

        MetodosPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "EFECTIVO", "TRANSFERENCIA" }));
        MetodosPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetodosPagoActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(70, 70, 70));
        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Guardar.setText("Guardar");
        Guardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarMouseExited(evt);
            }
        });

        Apellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApellidoMouseClicked(evt);
            }
        });
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        Direccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DireccionMouseClicked(evt);
            }
        });
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel17.setText("Lugar de Partida");

        Origen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 70, 70), 3, true));
        Origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrigenMouseClicked(evt);
            }
        });
        Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CtdAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CtdMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(FechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20)
                            .addComponent(Departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(DniPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(MetodosPago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jLabel23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Motocicleta)
                                .addGap(18, 18, 18)
                                .addComponent(Automovil)
                                .addGap(18, 18, 18)
                                .addComponent(Camioneta)
                                .addGap(18, 18, 18)
                                .addComponent(Colectivo)
                                .addGap(18, 18, 18)
                                .addComponent(Avion)))
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HoraPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DniPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MetodosPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(Departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CtdAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CtdMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FechaEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Automovil)
                    .addComponent(Camioneta)
                    .addComponent(Colectivo)
                    .addComponent(Motocicleta)
                    .addComponent(Avion))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(8, 8, 8)
                                .addComponent(HoraPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(8, 8, 8)
                                .addComponent(Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(8, 8, 8)
                                .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Patente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGap(8, 8, 8)
                                .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8)
                        .addComponent(HoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
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

    }//GEN-LAST:event_reservaBarraMouseClicked

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        this.dispose();
        Inicio InicioPantalla = new Inicio();
        InicioPantalla.setVisible(true);
        InicioPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_inicioMouseClicked

    private void AutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutomovilActionPerformed
            
            HoraLlegada.setEditable(true);
            HoraPartida.setEditable(true);
            Origen.setEditable(true);
            Empresa.setEditable(false);
            Empresa.setText("");
            Modelo.setEditable(true);
            Patente.setEditable(true);  
        
    }//GEN-LAST:event_AutomovilActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed

    }//GEN-LAST:event_NombreActionPerformed

    private void PatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatenteActionPerformed

    }//GEN-LAST:event_PatenteActionPerformed

    private void CtdAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtdAdultosActionPerformed

    }//GEN-LAST:event_CtdAdultosActionPerformed

    private void CtdMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtdMenoresActionPerformed

    }//GEN-LAST:event_CtdMenoresActionPerformed

    private void HoraPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraPartidaActionPerformed

    }//GEN-LAST:event_HoraPartidaActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed

    }//GEN-LAST:event_ModeloActionPerformed

    private void EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaActionPerformed

    }//GEN-LAST:event_EmpresaActionPerformed

    private void HoraLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraLlegadaActionPerformed

    }//GEN-LAST:event_HoraLlegadaActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void MotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotocicletaActionPerformed
            HoraLlegada.setEditable(true);
            HoraPartida.setEditable(true);
            Origen.setEditable(true);
            Empresa.setEditable(false);
            Empresa.setText("");        
            Modelo.setEditable(true);
            Patente.setEditable(true);  
        
    }//GEN-LAST:event_MotocicletaActionPerformed

    private void CamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamionetaActionPerformed
            
            HoraLlegada.setEditable(true);
            HoraPartida.setEditable(true);
            Origen.setEditable(true);
            Empresa.setEditable(false);
            Empresa.setText("");
            Modelo.setEditable(true);
            Patente.setEditable(true);  
        
        
    }//GEN-LAST:event_CamionetaActionPerformed

    private void ColectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColectivoActionPerformed
            
            HoraLlegada.setEditable(true);
            HoraPartida.setEditable(true);
            Origen.setEditable(true);
            Empresa.setEditable(true);
            Modelo.setEditable(false);
            Modelo.setText("");
            Patente.setEditable(false);
            Patente.setText("");
        
    }//GEN-LAST:event_ColectivoActionPerformed

    private void AvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvionActionPerformed
            
            HoraLlegada.setEditable(true);
            HoraPartida.setEditable(true);
            Origen.setEditable(true);
            Empresa.setEditable(true);
            Modelo.setEditable(false);
            Modelo.setText("");
            Patente.setEditable(false);
            Patente.setText("");
        
    }//GEN-LAST:event_AvionActionPerformed

    private void FechaIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaIngresoPropertyChange
        Date fechaSeleccionada = FechaIngreso.getDate();
        FechaEgreso.setDate(null);
        FechaEgreso.setMinSelectableDate(fechaSeleccionada);
    }//GEN-LAST:event_FechaIngresoPropertyChange

    private void MetodosPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetodosPagoActionPerformed

    }//GEN-LAST:event_MetodosPagoActionPerformed

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered
        Guardar.setForeground(new Color(100,100,100));
    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited
        Guardar.setForeground(new Color(70,70,70));
    }//GEN-LAST:event_GuardarMouseExited

    private void consultaBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBarraMouseClicked
        this.dispose();
        Consulta consultaPantalla = new Consulta();
        consultaPantalla.setVisible(true);
        consultaPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_consultaBarraMouseClicked

    private void borrarBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBarraMouseClicked
        this.dispose();
        Borrar BorrarPantalla = new Borrar();
        BorrarPantalla.setVisible(true);
        BorrarPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_borrarBarraMouseClicked

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed

    }//GEN-LAST:event_ApellidoActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed

    }//GEN-LAST:event_DireccionActionPerformed

    private void DniPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DniPasaporteActionPerformed

    }//GEN-LAST:event_DniPasaporteActionPerformed

    private void TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoActionPerformed
 
    }//GEN-LAST:event_TelefonoActionPerformed

    private void OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigenActionPerformed

    }//GEN-LAST:event_OrigenActionPerformed

    private void modificarBarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarBarraMouseClicked
        this.dispose();
        BuscarModificar BuscarModificarPantalla = new BuscarModificar();
        BuscarModificarPantalla.setVisible(true);
        BuscarModificarPantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_modificarBarraMouseClicked

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked

        boolean verificarNombre = validacion.isEmpty(Nombre);
        boolean verificarApellido = validacion.isEmpty(Apellido);
        boolean verificarDireccion = validacion.isEmpty(Direccion);
        boolean verificarDniPasaporte = validacion.isEmpty(DniPasaporte);
        boolean verificarEmail = validacion.isEmpty(Email);
        boolean verificarTelefono = validacion.isEmpty(Telefono);
        boolean verificarDepartamento = validacion.isEmpty(Departamentos);
        boolean verificarMetodoPago = validacion.isEmpty(MetodosPago);
        boolean verificarTransporte = validacion.isEmpty(Transporte);
        boolean verificarHoraLlegada = validacion.isEmpty(HoraLlegada);
        boolean verificarHoraPartida = validacion.isEmpty(HoraPartida);
        boolean verificarOrigen = validacion.isEmpty(Origen);
        boolean verificarEmpresa = validacion.isEmpty(Empresa);
        boolean verificarPatente = validacion.isEmpty(Patente);
        boolean verificarModelo = validacion.isEmpty(Modelo);
        if(!verificarNombre && !verificarApellido && !verificarDireccion && !verificarDniPasaporte &&
           !verificarEmail && !verificarTelefono && !verificarDepartamento && !verificarMetodoPago &&
           !verificarTransporte && !verificarHoraLlegada && !verificarHoraPartida && !verificarOrigen &&
           ((!verificarEmpresa)||(!verificarPatente && !verificarModelo))){
            boolean errorFormato = false;                  
            if (!validacion.letras(Nombre.getText())) {
                Nombre.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.letras(Apellido.getText())) {
                Apellido.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.letrasYNumeros(Direccion.getText())) {
                Direccion.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.letrasYNumeros(DniPasaporte.getText())) {
                DniPasaporte.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.numeros(Telefono.getText())) {
                Telefono.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.hora(HoraPartida.getText())) {
                HoraPartida.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.hora(HoraLlegada.getText())) {
                HoraLlegada.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.email(Email.getText())) {
                Email.setText("Formato Erroneo");
                errorFormato = true;
                }
            if (!validacion.letras(Origen.getText())){
                Origen.setText("Formato Erroneo");
                errorFormato = true;
                }
            if(!verificarEmpresa){
                if(!validacion.letras(Empresa.getText())){
                    Empresa.setText("Formato Erroneo");
                    errorFormato = true;
                    }
                }
            else{
                if(!validacion.letrasYNumeros(Modelo.getText())){
                    Modelo.setText("Formato Erroneo");
                    errorFormato = true;
                    }
                if(!validacion.letrasYNumeros(Patente.getText())){
                    Patente.setText("Formato Errorneo");
                    errorFormato = true;
                    }
                }
            if(errorFormato){
                return;
                }
               
        
            System.out.println("ESTOY AQUI");
            Cliente cliente;
            cliente = new Cliente(Nombre.getText(),Apellido.getText(), DniPasaporte.getText(), Integer.parseInt(Telefono.getText()),Direccion.getText(), Email.getText());
            Reserva reserva = null;
            if(!verificarEmpresa){
                System.out.println("ESTOY AQUI3");
                TipoVehiculo tipoVehiculo = Colectivo.isSelected() ? COLECTIVO: AVION;
                VehiculoContratado vehiculo = new VehiculoContratado(HoraPartida.getText(), HoraLlegada.getText(), Origen.getText(),Empresa.getText(),tipoVehiculo);
                reserva = new Reserva(cliente,FechaIngreso.getDate(), FechaEgreso.getDate(),Departamento.valueOf((String) Departamentos.getSelectedItem()), vehiculo, MetodoPago.valueOf((String) MetodosPago.getSelectedItem()), Integer.parseInt((String) CtdAdultos.getSelectedItem()), Integer.parseInt((String) CtdMenores.getSelectedItem()));
            }else{
                System.out.println("ESTOY AQUI2");
                TipoVehiculo tipoVehiculo = Automovil.isSelected() ? AUTOMOVIL: Motocicleta.isSelected() ? MOTOCICLETA : CAMIONETA;
                VehiculoPropio vehiculo = new VehiculoPropio(HoraPartida.getText(), HoraLlegada.getText(), Origen.getText(),Patente.getText(),Modelo.getText(), tipoVehiculo);
                reserva = new Reserva(cliente,FechaIngreso.getDate(), FechaEgreso.getDate(),Departamento.valueOf((String) Departamentos.getSelectedItem()), vehiculo, MetodoPago.valueOf((String) MetodosPago.getSelectedItem()), Integer.parseInt((String) CtdAdultos.getSelectedItem()), Integer.parseInt((String) CtdMenores.getSelectedItem()));
                }
            try {
                if(validacion.validacionReserva(reserva)){
                    int idCliente = validacion.validacionCliente(reserva);
                    
                    if(idCliente == -1){
                            Consultas.setReserva(reserva);
                            JOptionPane.showMessageDialog(null, "Consulta guardada");
                    }else if(idCliente == -2){
                            JOptionPane.showMessageDialog(null, "DNI/PASAPORTE existente, no coincide con nombre y apellido");
                    }else{
                            Consultas.setReserva(reserva, idCliente);
                            JOptionPane.showMessageDialog(null, "Consulta guardada");
                    }
                                
                                
                                
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Reserva existente, revise CONSULTA");
                    }
            } catch (SQLException ex) {
                System.getLogger(Reservar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            
    }
    else{
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        }
    }//GEN-LAST:event_GuardarMouseClicked

    private void NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseClicked
        Nombre.setText("");
    }//GEN-LAST:event_NombreMouseClicked

    private void ApellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoMouseClicked
        Apellido.setText("");
    }//GEN-LAST:event_ApellidoMouseClicked

    private void TelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseClicked
        Telefono.setText("");
    }//GEN-LAST:event_TelefonoMouseClicked

    private void DniPasaporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DniPasaporteMouseClicked
        DniPasaporte.setText("");
    }//GEN-LAST:event_DniPasaporteMouseClicked

    private void EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseClicked
        Email.setText("");
    }//GEN-LAST:event_EmailMouseClicked

    private void DireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionMouseClicked
        Direccion.setText("");
    }//GEN-LAST:event_DireccionMouseClicked

    private void HoraPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoraPartidaMouseClicked
        HoraPartida.setText("");
    }//GEN-LAST:event_HoraPartidaMouseClicked

    private void HoraLlegadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoraLlegadaMouseClicked
        HoraLlegada.setText("");
    }//GEN-LAST:event_HoraLlegadaMouseClicked

    private void OrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrigenMouseClicked
        Origen.setText("");
    }//GEN-LAST:event_OrigenMouseClicked

    private void ModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModeloMouseClicked
        Modelo.setText("");
    }//GEN-LAST:event_ModeloMouseClicked

    private void PatenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatenteMouseClicked
        Patente.setText("");
    }//GEN-LAST:event_PatenteMouseClicked

    private void EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpresaMouseClicked
        Empresa.setText("");
    }//GEN-LAST:event_EmpresaMouseClicked





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JRadioButton Automovil;
    private javax.swing.JRadioButton Avion;
    private javax.swing.JRadioButton Camioneta;
    private javax.swing.JRadioButton Colectivo;
    private javax.swing.JComboBox<String> CtdAdultos;
    private javax.swing.JComboBox<String> CtdMenores;
    private javax.swing.JComboBox<String> Departamentos;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField DniPasaporte;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Empresa;
    private com.toedter.calendar.JDateChooser FechaEgreso;
    private com.toedter.calendar.JDateChooser FechaIngreso;
    private javax.swing.JLabel Guardar;
    private javax.swing.JTextField HoraLlegada;
    private javax.swing.JTextField HoraPartida;
    private javax.swing.JComboBox<String> MetodosPago;
    private javax.swing.JTextField Modelo;
    private javax.swing.JRadioButton Motocicleta;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Origen;
    private javax.swing.JTextField Patente;
    private javax.swing.JTextField Telefono;
    private javax.swing.ButtonGroup Transporte;
    private javax.swing.JLabel borrarBarra;
    private javax.swing.JLabel consultaBarra;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel reservaBarra;
    private javax.swing.JLabel salirBarra;
    // End of variables declaration//GEN-END:variables

}