package com.Las_4_Estaciones.management.persistencia.Datos;

public class VehiculoContratado extends Vehiculo{
    private String empresa;

    
    public VehiculoContratado(String horaPartida, String horaLlegada, String origen, String empresa, TipoVehiculo tipoVehiculo){
        super(horaPartida, horaLlegada, origen, tipoVehiculo);
        this.empresa = empresa;

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
