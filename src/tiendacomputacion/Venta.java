
package tiendacomputacion;

import java.io.Serializable;

public class Venta implements Serializable {
    
    private StockComputadoras compu;

    public Venta(StockComputadoras compu) {
        this.compu = compu;
    }

    public StockComputadoras getCompu() {
        return compu;
    }

    public void setCompu(StockComputadoras compu) {
        this.compu = compu;
    }
    
}
