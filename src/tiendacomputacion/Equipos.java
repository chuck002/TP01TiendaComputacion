
package tiendacomputacion;

import java.io.Serializable;

public abstract class Equipos implements Serializable{
    
    private String descripcion;
    private String precioUnitario;
    private String fechaDeCarga;
    private int cantidadDeUnidades;

    public Equipos(String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.fechaDeCarga = fechaDeCarga;
        this.cantidadDeUnidades = cantidadDeUnidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public String getFechaDeCarga() {
        return fechaDeCarga;
    }

    public int getCantidadDeUnidades() {
        return cantidadDeUnidades;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setFechaDeCarga(String fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public void setCantidadDeUnidades(int cantidadDeUnidades) {
        this.cantidadDeUnidades = cantidadDeUnidades;
    }

    
    
    public abstract String muestraInformacion();


}
