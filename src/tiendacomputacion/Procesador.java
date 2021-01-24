package tiendacomputacion;

import java.io.Serializable;

class Procesador extends Componentes implements Serializable{

    private String fabricante;
    private String modelo;
    private int frecuenciaMaxima;

    public Procesador(String fabricante, String modelo, int frecuenciaMaxima, EsUsable usable, VendibleSuelto vendible, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

   

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getFrecuenciaMaxima() {
        return frecuenciaMaxima;
        
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFrecuenciaMaxima(int frecuenciaMaxima) {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    @Override
    public String muestraInformacion() {
        return "(Procesador)\nFabricante: " + fabricante + "\nModelo: " + modelo + "\nFrecuencia Maxima: " + frecuenciaMaxima
                + "\nDescripcion: " + super.getDescripcion() + "\nPrecio Unitario: " + super.getPrecioUnitario() + "\nFecha de Carga: " + super.getFechaDeCarga() + "\n";
    }

    @Override
    public String toString() {
        return "Procesador";
    }

}
