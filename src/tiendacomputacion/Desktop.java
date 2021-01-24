
package tiendacomputacion;

import java.io.Serializable;

public class Desktop extends Computadora implements Serializable{

    public Desktop(Procesador procesador, Disco disco, Ram ram, PlacaDeVideo placaDeVideo, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(procesador, disco, ram, placaDeVideo, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
    }
  
}
