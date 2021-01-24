package tiendacomputacion;

import java.io.Serializable;

class Ram extends Componentes implements Serializable{

    private String marca;
    private String tecnologia;
    private String frecuenciaMaxima;
    private String capacidad;

    public Ram(String marca, String tecnologia, String frecuenciaMaxima, String capacidad, EsUsable usable, VendibleSuelto vendible, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.frecuenciaMaxima = frecuenciaMaxima;
        this.capacidad = capacidad;
    }

   

    public String getMarca() {
        return marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public String getFrecuenciaMaxima() {
        return frecuenciaMaxima;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setFrecuenciaMaxima(String frecuenciaMaxima) {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    

    @Override
    public String muestraInformacion() {
        return "(Memoria RAM)\nMarca: " + marca + "\nTecnologia: " + tecnologia + "\nFrecuencia Maxima: " + frecuenciaMaxima
                + "\nCapacidad: " + capacidad + "\nDescripcion: " + super.getDescripcion() + "\nPrecio Unitario: " + super.getPrecioUnitario() + "\nFecha de Carga: " + super.getFechaDeCarga() + "\n";
    }

    @Override
    public String toString() {
        return "Ram";
    }

}
