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
public class EsUsableAmbos implements EsUsable, Serializable {

    @Override
    public String esUsablePara() {
       return "Ambos";
    }

    
}
