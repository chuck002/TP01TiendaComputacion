
package tiendacomputacion;

import java.io.Serializable;
import java.text.ParseException;

public class TiendaComputacion implements Serializable {

   public static void main(String[] args) throws ParseException {
        Sistema sistema = new Sistema();
        sistema.arrancar();
    }
}
