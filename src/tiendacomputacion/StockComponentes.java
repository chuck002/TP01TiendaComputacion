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

public class StockComponentes implements Serializable {

    private List<Ram> stockRam;
    private List<Disco> stockDisco;
    private List<Procesador> stockProcesador;
    private List<PlacaDeVideo> stockPlaca;

    private static StockComponentes instance;

    private StockComponentes() {

        this.stockDisco = new LinkedList<>();
        this.stockRam = new LinkedList<>();
        this.stockProcesador = new LinkedList<>();
        this.stockPlaca = new LinkedList<>();

        try {
            ObjectInputStream entradaDisco = new ObjectInputStream(new FileInputStream("disco.obj"));
            stockDisco = (List<Disco>) entradaDisco.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ObjectInputStream entradaRam = new ObjectInputStream(new FileInputStream("ram.obj"));
            stockRam = (List<Ram>) entradaRam.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ObjectInputStream entradaVideo = new ObjectInputStream(new FileInputStream("video.obj"));
            stockPlaca = (List<PlacaDeVideo>) entradaVideo.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ObjectInputStream entradaProcesador = new ObjectInputStream(new FileInputStream("procesador.obj"));
            stockProcesador = (List<Procesador>) entradaProcesador.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StockComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static StockComponentes getInstance() {
        if (instance == null) {
            return new StockComponentes();
        } else {
            return instance;
        }
    }

    public List<Ram> getStockRam() {
        return stockRam;
    }

    public void setStockRam(List<Ram> stockRam) {
        this.stockRam = stockRam;
    }

    public void agregaRam(Ram ram) {
        stockRam.add(ram);
    }

    public List<Disco> getStockDisco() {
        return stockDisco;
    }

    public void setStockDisco(List<Disco> stockDisco) {
        this.stockDisco = stockDisco;
    }

    public void agregaDisco(Disco disco) {
        stockDisco.add(disco);
    }

    public List<Procesador> getStockProcesador() {
        return stockProcesador;
    }

    public void setStockProcesador(List<Procesador> stockProcesador) {
        this.stockProcesador = stockProcesador;
    }

    public void agregaProcesador(Procesador procesador) {
        stockProcesador.add(procesador);
    }

    public List<PlacaDeVideo> getStockPlaca() {
        return stockPlaca;
    }

    public void setStockPlaca(List<PlacaDeVideo> stockPlaca) {
        this.stockPlaca = stockPlaca;
    }

    public void agregaPlaca(PlacaDeVideo placa) {
        stockPlaca.add(placa);
    }

}
