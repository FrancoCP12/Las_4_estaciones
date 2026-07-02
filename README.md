# Las 4 Estaciones

Sistema de gestion de reservas para el complejo de departamentos
"Las Cuatro Estaciones". Desarrollado en Java con interfaz Swing
y base de datos MySQL.

## Requisitos

- Java 24 o superior
- Apache Maven 3.x
- MySQL 8.x

## Configuracion de la base de datos

1. Crear la base de datos en MySQL:

```sql
CREATE DATABASE bd_las4estaciones;
```

2. Copiar el archivo de configuracion de entorno:

```bash
cp .env.example .env
```

3. Editar `.env` con las credenciales de conexion:

```
DB_URL=jdbc:mysql://localhost:3306/bd_las4estaciones
DB_USUARIO=root
DB_CONTRASENA=
```

## Instalacion y ejecucion

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la aplicacion
mvn exec:java
```

## Estructura del proyecto

```
src/main/java/com/Las_4_Estaciones/management/
├── main/
│   └── Las_4_estaciones.java          # Punto de entrada
├── GUI/
│   ├── Inicio.java                    # Pantalla principal
│   ├── Reservar.java                  # Formulario de reserva
│   ├── Consulta.java                  # Consulta de disponibilidad
│   ├── BuscarModificar.java           # Busqueda para modificar
│   ├── Modificar.java                 # Formulario de modificacion
│   └── Borrar.java                    # Eliminacion de registros
├── persistencia/
│   ├── Conexion/ConectarBD.java       # Conexion a MySQL
│   ├── Consultas/Consultas.java       # Operaciones CRUD
│   └── Datos/                         # Modelos de datos
│       ├── Cliente.java
│       ├── Reserva.java
│       ├── Departamento.java
│       ├── Vehiculo.java
│       ├── VehiculoPropio.java
│       ├── VehiculoContratado.java
│       ├── TipoVehiculo.java
│       └── MetodoPago.java
└── validacion/
    └── validacion.java                # Validacion de campos
```

## Funcionalidades

- **Reserva**: Registro de reservas con datos del cliente, fechas,
  departamento, cantidad de huespedes, metodo de pago y transporte.
- **Consulta**: Visualizacion de disponibilidad por fecha para cada
  departamento (Verano, Invierno, Otono, Primavera).
- **Modificacion**: Busqueda y actualizacion de reservas existentes
  por DNI del cliente o por fecha.
- **Eliminacion**: Borrado de reservas o de clientes completos.
- **Validacion**: Control de formatos en campos de texto y
  validacion de reglas de negocio (disponibilidad, fechas, etc.).

## Tecnologias

- Java 24 con Swing para la interfaz grafica
- MySQL con JDBC para la persistencia
- JCalendar para seleccion de fechas
- Maven para la gestion de dependencias
- dotenv-java para configuracion por entorno
