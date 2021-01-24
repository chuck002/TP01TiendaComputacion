package tiendacomputacion;

import java.io.Serializable;

class PlacaDeVideo extends Componentes implements Serializable {

    private String fabricante;
    private String modelo;
    private String capacidad;

    public PlacaDeVideo(String fabricante, String modelo, String capacidad, EsUsable usable, VendibleSuelto vendible, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

   
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    

    @Override
    public String muestraInformacion() {
        return "(Placa De Video)\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nCapacidad: " + capacidad
                + "\nDescripcion: " + super.getDescripcion() + "\nPrecio Unitario: " + super.getPrecioUnitario() + "\nFecha de Carga: " + super.getFechaDeCarga() + "\n";
    }

    @Override
    public String toString() {
        return "PlacaDeVideo";
    }

}
