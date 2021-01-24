package tiendacomputacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockPerifericos implements Serializable{

    private List<Perifericos> stockPerifericos;
    private static StockPerifericos instance;

    private StockPerifericos() {
        this.stockPerifericos = new LinkedList();
        
        try {
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("perifericos.obj"));
            stockPerifericos = (List<Perifericos>)entrada.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockPerifericos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockPerifericos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockPerifericos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static StockPerifericos getInstance() {
        if (instance == null) {
            return new StockPerifericos();
        } else {
            return instance;
        }
    }

    public void agrega(Perifericos e) {
        stockPerifericos.add(e);
    }
    
    public List<Perifericos> getStockPerifericos() {
        return stockPerifericos;
    }

        public void setStockPerifericos(List<Perifericos> stockPerifericos) {
        this.stockPerifericos = stockPerifericos;
    }

    public int getTamStockPerifericos() {
        return stockPerifericos.size();
    }

    public Equipos getPerifericos(int index) {
        return stockPerifericos.get(index);
    }

    public void EliminarPerifericos(int index) {
        stockPerifericos.remove(index);
    }
}
