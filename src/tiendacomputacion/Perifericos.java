package tiendacomputacion;

import java.io.Serializable;

public class Perifericos extends Equipos implements Serializable {

    private String tipo;
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Perifericos(String tipo, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.tipo = tipo;
    }

    @Override
    public String muestraInformacion()
    {
        return "(Perifericos)\nTipo: " + tipo + "\nDescripcion: " + super.getDescripcion()  + "\nFecha de Carga: " + super.getFechaDeCarga()+"\n";
    }
}
