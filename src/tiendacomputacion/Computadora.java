package tiendacomputacion;

import java.io.Serializable;

public abstract class Computadora extends Equipos implements Serializable{

    private final Procesador procesador;
    private final Disco disco;
    private final Ram ram;
    private final PlacaDeVideo placaDeVideo;

    public Computadora(Procesador procesador, Disco disco, Ram ram, PlacaDeVideo placaDeVideo, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.procesador = procesador;
        this.disco = disco;
        this.ram = ram;
        this.placaDeVideo = placaDeVideo;
    }

   
    public Procesador getProcesador() {
        return procesador;
    }

    public Disco getDisco() {
        return disco;
    }

    public Ram getRam() {
        return ram;
    }

    public PlacaDeVideo getPlacaDeVideo() {
        return placaDeVideo;
    }

    @Override
    public String muestraInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

