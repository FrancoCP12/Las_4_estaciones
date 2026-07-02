package com.Las_4_Estaciones.management.persistencia.Datos;

public class VehiculoPropio extends Vehiculo{
    private String patente;
    private String marcaModelo;

    
    public VehiculoPropio(String horaPartida, String horaLlegada, String origen, String patente, String marcaModelo, TipoVehiculo tipo){
        super(horaPartida, horaLlegada, origen, tipo);
        this.patente = patente;
        this.marcaModelo = marcaModelo;

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }


    
}
