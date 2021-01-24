package tiendacomputacion;

import java.io.Serializable;

abstract class Componentes extends Equipos implements Serializable{

    private EsUsable usable;
    private VendibleSuelto vendible;

    public Componentes(EsUsable usable, VendibleSuelto vendible, String descripcion, String precioUnitario, String fechaDeCarga, int cantidadDeUnidades) {
        super(descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades);
        this.usable = usable;
        this.vendible = vendible;
    }    

    public EsUsable getUsable() {
        return usable;
    }

    public void setUsable(EsUsable usable) {
        this.usable = usable;
    }

    public VendibleSuelto getVendible() {
        return vendible;
    }

    public void setVendible(EsInvendibleSuelto vendible) {
        this.vendible = vendible;
    }

}
