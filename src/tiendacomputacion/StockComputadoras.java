
package tiendacomputacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockComputadoras implements Serializable{
    
    private List<Desktop> stockDesktop;
    private List<Laptop> stockLaptop;
    private static StockComputadoras instance;

    private StockComputadoras() {
        this.stockDesktop = new LinkedList<>();
        this.stockLaptop = new LinkedList<>();
        
             
        try {
           ObjectInputStream entradaDesktop = new ObjectInputStream(new FileInputStream("Desktop.obj"));
            stockDesktop = (List<Desktop>)entradaDesktop.readObject();
        } catch (FileNotFoundException | EOFException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        try {
           ObjectInputStream entradaLaptop = new ObjectInputStream(new FileInputStream("Laptop.obj"));
            stockLaptop = (List<Laptop>)entradaLaptop.readObject();
        } catch (FileNotFoundException | EOFException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComputadoras.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
    public static StockComputadoras getInstance()
    {
        if(instance == null)
        {
            return new StockComputadoras();
        }
        else
        {
            return instance;
        }
    }

    public List<Desktop> getStockDesktop() {
        return stockDesktop;
    }

    public void setStockDesktop(List<Desktop> stockDesktop) {
        this.stockDesktop = stockDesktop;
    }
    
    public void agregaDesktop(Desktop desktop)
    {
        stockDesktop.add(desktop);
    }

    public List<Laptop> getStockLaptop() {
        return stockLaptop;
    }

    public void setStockLaptop(List<Laptop> stockLaptop) {
        this.stockLaptop = stockLaptop;
    }
    
    public void agregaLaptop(Laptop laptop)
    {
        stockLaptop.add(laptop);
    }
    
}
