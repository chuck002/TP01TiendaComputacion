/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacomputacion;

import java.io.Serializable;

/**
 *
 * @author javy
 */
public class EsVendibleSuelto implements VendibleSuelto, Serializable{

    @Override
    public boolean puedeVenderseSuelto() {
      return true;
    }
    
}
