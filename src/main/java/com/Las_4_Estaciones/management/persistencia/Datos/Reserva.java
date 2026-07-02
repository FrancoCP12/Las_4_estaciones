package com.Las_4_Estaciones.management.persistencia.Datos;
import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Date checkIn;
    private Date checkOut;
    private Departamento departamento;
    private Vehiculo transporte;
    private int ctdAdultos;
    private int ctdMenores;
    private MetodoPago metodoPago;
    
    public Reserva(Cliente cliente, Date checkIn, Date checkOut,
                   Departamento departamento, Vehiculo transporte,
                   MetodoPago metodoPago, int ctdAdultos, int ctdMenores){
        this.cliente = cliente;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.departamento = departamento;
        this.transporte = transporte;
        this.ctdAdultos = ctdAdultos;
        this.ctdMenores = ctdMenores;
        this.metodoPago = metodoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Vehiculo getVehiculo() {
        return transporte;
    }

    public void setVehiculo(Vehiculo transporte) {
        this.transporte = transporte;
    }
    
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setVehiculo(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getCtdAdultos() {
        return ctdAdultos;
    }

    public void setCtdAdultos(int ctdAdultos) {
        this.ctdAdultos = ctdAdultos;
    }

    public int getCtdMenores() {
        return ctdMenores;
    }

    public void setCtdMenores(int ctdMenores) {
        this.ctdMenores = ctdMenores;
    }
   
}
