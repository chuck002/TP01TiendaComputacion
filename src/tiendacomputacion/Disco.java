package tiendacomputacion;

import java.io.Serializable;

class Disco extends Componentes implements Serializable{

    private String marca;
    private String tipoDisco;
    private String capacidad;

    public Disco(String marca, String tipoDisco, String capacidad, EsUsable usable, VendibleSuelto vendible, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.marca = marca;
        this.tipoDisco = tipoDisco;
        this.capacidad = capacidad;
    }

   
    public String getMarca() {
        return marca;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
    

    @Override
    public String toString() {
        return "Disco";
    }
    
    

    @Override
    public String muestraInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
