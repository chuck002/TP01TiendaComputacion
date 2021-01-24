package tiendacomputacion;

import java.io.Serializable;
import java.text.ParseException;

public class Sistema implements Serializable {

    public Sistema() {
    }
    StockComponentes stockCompo;
    StockComputadoras stockCompu;
    StockPerifericos stockPeri;
    Venta venta;

    public void arrancar() throws ParseException {
        stockCompo = StockComponentes.getInstance();
        stockCompu = StockComputadoras.getInstance();
        stockPeri = StockPerifericos.getInstance();
 
        String opcionMenu;
        do
        {
            opcionMenu = Pantalla.MenuEntrada();
               if(!Pantalla.esNumero(opcionMenu))
               {
                   Pantalla.Informacion("Error la eleccion debe ser numerica. Adios.");
                   System.exit(0);
               }
               else
               {
               switch(Integer.parseInt(opcionMenu))
               {
                   case 1: 
                       Pantalla.MenuCargaComponentes(stockCompo, stockPeri, stockCompu);
                       break;
                   case 2:
                       Pantalla.MenuMuestraEquipos(stockCompo, stockCompu, stockPeri);
                       break;
                   case 3:
                       Pantalla.MenuVentas(stockCompo, stockCompu, stockPeri);
                       break;
               }
                       }
        }while(!opcionMenu.equalsIgnoreCase("4"));
       System.exit(0);
    }
}
