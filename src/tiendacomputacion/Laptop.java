package tiendacomputacion;

import java.io.Serializable;

public class Laptop extends Computadora implements Serializable {

    private final String marca;
    private final String modelo;
    private final String tamDePantalla;

    public Laptop(String marca, String modelo, String tamDePantalla, Procesador procesador, Disco disco, Ram ram, PlacaDeVideo placaDeVideo, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(procesador, disco, ram, placaDeVideo, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.marca = marca;
        this.modelo = modelo;
        this.tamDePantalla = tamDePantalla;
    }



    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTamDePantalla() {
        return tamDePantalla;
    }



}
