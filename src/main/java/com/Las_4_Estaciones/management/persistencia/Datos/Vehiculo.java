package com.Las_4_Estaciones.management.persistencia.Datos;

public class Vehiculo {
    private String horaPartida;
    private String horaLlegada;
    private String origen;
    private TipoVehiculo tipoVehiculo;
    
    
    public Vehiculo(String horaPartida, String horaLlegada, String origen, TipoVehiculo tipoVehiculo ){
        this.horaPartida = horaPartida;
        this.horaLlegada = horaLlegada;
        this.origen = origen;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    
}
