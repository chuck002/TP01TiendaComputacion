package tiendacomputacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pantalla implements Serializable {

    private static void venderComponentes(StockComponentes compo) {
        String opcion = "";
        boolean noNumero = false;
        do {
            noNumero = false;
            opcion = Entrada("<<<< ---- Vender Componentes ---- >>>>\n"
                    + "1. Memorias Ram.\n"
                    + "2. Discos Rigidos.\n"
                    + "3. Procesadores.\n"
                    + "4. Placas de Video.\n"
                    + "5. Salir.");
            if (!esNumero(opcion)) {
                Informacion("Debe elegir una opcion numerica.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        String listaRam = "";
                        String borrar = "";
                        int i = 1;
                        try {
                            for (Ram r : compo.getStockRam()) {
                                listaRam += i + "- (RAM) Cantidad: " + r.getCantidadDeUnidades() + " Marca: " + r.getMarca() + " Tecnologia: " + r.getTecnologia() + " Capacidad: " + r.getCapacidad() + " Precio: " + r.getPrecioUnitario() + "\n";
                                i++;
                            }
                        } catch (NullPointerException e) {
                        }
                        do {
                            borrar = Entrada(listaRam + i + " - Salir.");

                            if (!esNumero(opcion)) {
                                Informacion("Debe elegir una opcion numerica.");
                                noNumero = true;
                            } else {
                                compo.getStockRam().remove(Integer.parseInt(borrar) - 1);

                                try {
                                    ObjectOutputStream salidaRam = new ObjectOutputStream(new FileOutputStream("ram.obj"));
                                    salidaRam.writeObject(compo.getStockRam());
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                Informacion("Producto Vendido");
                            }
                        } while (compo.getStockRam().size() + 1 < Integer.parseInt(borrar) || Integer.parseInt(borrar) < 1);

                        break;

                    case 2:
                        String listaDisco = "";
                        String borrarDisco = "";
                        int j = 1;
                        try {
                            for (Disco d : compo.getStockDisco()) {
                                listaDisco += j + "- (DISCO) Cantidad: " + d.getCantidadDeUnidades() + " Marca: " + d.getMarca() + " Descripcion: " + d.getDescripcion() + " Capacidad: " + d.getCapacidad() + " Precio: " + d.getPrecioUnitario() + "\n";
                                j++;
                            }
                        } catch (NullPointerException e) {
                        }
                        do {
                            borrarDisco = Entrada(listaDisco + j + " - Salir.");

                            if (!esNumero(opcion)) {
                                Informacion("Debe elegir una opcion numerica.");
                                noNumero = true;
                            } else {
                                compo.getStockRam().remove(Integer.parseInt(borrarDisco) - 1);

                                try {
                                    ObjectOutputStream salidaDisco = new ObjectOutputStream(new FileOutputStream("disco.obj"));
                                    salidaDisco.writeObject(compo.getStockDisco());
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                Informacion("Producto Vendido");
                            }
                        } while (compo.getStockDisco().size() + 1 < Integer.parseInt(borrarDisco) || Integer.parseInt(borrarDisco) < 1);
                        break;

                    case 3:
                        String listaProc = "";
                        String borrarProc = "";
                        int k = 1;
                        try {
                            for (Procesador p : compo.getStockProcesador()) {
                                listaProc += k + "- (PROCESADOR) Cantidad: " + p.getCantidadDeUnidades() + " Fabricante: " + p.getFabricante() + " Descripcion: " + p.getDescripcion() + " Frecuencia Maxima: " + p.getFrecuenciaMaxima() + " Precio: " + p.getPrecioUnitario() + "\n";
                                k++;
                            }
                        } catch (NullPointerException e) {
                        }
                        do {
                            borrarProc = Entrada(listaProc + k + " - Salir.");

                            if (!esNumero(opcion)) {
                                Informacion("Debe elegir una opcion numerica.");
                                noNumero = true;
                            } else {
                                compo.getStockRam().remove(Integer.parseInt(borrarProc) - 1);

                                try {
                                    ObjectOutputStream salidaProc = new ObjectOutputStream(new FileOutputStream("procesador.obj"));
                                    salidaProc.writeObject(compo.getStockProcesador());
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                Informacion("Producto Vendido");
                            }
                        } while (compo.getStockProcesador().size() + 1 < Integer.parseInt(borrarProc) || Integer.parseInt(borrarProc) < 1);

                        break;

                    case 4:
                        String listaPlaca = "";
                        String borrarPlaca = "";
                        int l = 1;
                        try {
                            for (PlacaDeVideo pl : compo.getStockPlaca()) {
                                listaPlaca += l + "- (PLACA DE VIDEO) Cantidad: " + pl.getCantidadDeUnidades() + " Fabricante: " + pl.getFabricante() + " Descripcion: " + pl.getDescripcion() + " Capacidad: " + pl.getCapacidad() + " Precio: " + pl.getPrecioUnitario() + "\n";
                                l++;
                            }
                        } catch (NullPointerException e) {
                        }
                        do {
                            borrarPlaca = Entrada(listaPlaca + l + " - Salir.");

                            if (!esNumero(opcion)) {
                                Informacion("Debe elegir una opcion numerica.");
                                noNumero = true;
                            } else {
                                compo.getStockPlaca().remove(Integer.parseInt(borrarPlaca) - 1);

                                try {
                                    ObjectOutputStream salidaVideo = new ObjectOutputStream(new FileOutputStream("video.obj"));
                                    salidaVideo.writeObject(compo.getStockPlaca());
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                Informacion("Producto Vendido");
                            }
                        } while (compo.getStockPlaca().size() + 1 < Integer.parseInt(borrarPlaca) || Integer.parseInt(borrarPlaca) < 1);
                        break;

                    case 5:
                        break;
                }
            }

        } while (opcion.equals("5") || noNumero == true);
    }

    private static void venderComputadoras(StockComputadoras compu) {
        String opcion = "";
        boolean noNumero = false;
        do {
            noNumero = false;
            opcion = Entrada("<<<< ---- Vender Computadoras ---- >>>>\n"
                    + "1. Computadoras Desktop.\n"
                    + "2. Computadoras Laptop.\n"
                    + "3. Salir.");

            if (!esNumero(opcion)) {
                Informacion("Debe elegir una opcion numerica.");
                noNumero = true;
            } else {
                if (Integer.parseInt(opcion) == 1) {

                    String listaDesktop = "";
                    String borrarDesktop = "";

                    int i = 1;
                    try {
                        for (Desktop d : compu.getStockDesktop()) {
                            listaDesktop += i + "- (DESKTOP)" + " Descripcion: " + d.getDescripcion() + " Precio: " + d.getPrecioUnitario() + "Fecha de Carga: " + d.getFechaDeCarga() + "\n";
                            i++;
                        }
                    } catch (NullPointerException e) {
                    }
                    do {
                        noNumero = false;
                        borrarDesktop = Entrada(listaDesktop + i + " - Salir.");

                        if (!esNumero(borrarDesktop)) {
                            Informacion("Debe elegir una opcion numerica.");
                            noNumero = true;
                        } else {
                            compu.getStockDesktop().remove(Integer.parseInt(borrarDesktop) - 1);

                            try {
                                ObjectOutputStream salidaDesktop = new ObjectOutputStream(new FileOutputStream("Desktop.obj"));
                                salidaDesktop.writeObject(compu.getStockDesktop());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Informacion("Producto Vendido");
                        }
                    } while (compu.getStockDesktop().size() + 1 < Integer.parseInt(borrarDesktop) || Integer.parseInt(borrarDesktop) < 1);

                } else {
String listaLaptop = "";
                    String borrarLaptop = "";

                    int j = 1;
                    try {
                        for (Laptop l : compu.getStockLaptop()) {
                            listaLaptop += j + "- (DESKTOP)" + "Marca: "+ l.getMarca()+" Modelo: "+ l.getModelo()+" Tamaño de Pantalla: "+ l.getTamDePantalla() +"Descripcion: " + l.getDescripcion() + " Precio: " + l.getPrecioUnitario() + "Fecha de Carga: " + l.getFechaDeCarga() + "\n";
                            j++;
                        }
                    } catch (NullPointerException e) {
                    }
                    do {
                        noNumero = false;
                        borrarLaptop = Entrada(listaLaptop + j + " - Salir.");

                        if (!esNumero(borrarLaptop)) {
                            Informacion("Debe elegir una opcion numerica.");
                            noNumero = true;
                        } else {
                            compu.getStockLaptop().remove(Integer.parseInt(borrarLaptop) - 1);

                            try {
                                ObjectOutputStream salidaLaptop = new ObjectOutputStream(new FileOutputStream("Laptop.obj"));
                                salidaLaptop.writeObject(compu.getStockLaptop());
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Informacion("Producto Vendido");
                        }
                    } while (compu.getStockLaptop().size() + 1 < Integer.parseInt(borrarLaptop) || Integer.parseInt(borrarLaptop) < 1);
                }

            }

        } while (opcion.equals("3") || noNumero == true);
    }

    private static void venderPerifericos(StockPerifericos peri) {
        String listaPerifericos = "";
        String borrarPerifericos = "";
        boolean noNumero = false;
        int i = 1;
        try {
            for (Perifericos p : peri.getStockPerifericos()) {
                listaPerifericos += i + "- (" + p.getTipo() + ")" + "Cantidad: " + p.getCantidadDeUnidades() + " Descripcion: " + p.getDescripcion() + " Precio: " + p.getPrecioUnitario() + "\n";
                i++;
            }
        } catch (NullPointerException e) {
        }
        do {
            noNumero = false;
            borrarPerifericos = Entrada(listaPerifericos + i + " - Salir.");

            if (!esNumero(borrarPerifericos)) {
                Informacion("Debe elegir una opcion numerica.");
                noNumero = true;
            } else {
                peri.getStockPerifericos().remove(Integer.parseInt(borrarPerifericos) - 1);

                try {
                    ObjectOutputStream salidaPerifericos = new ObjectOutputStream(new FileOutputStream("perifericos.obj"));
                    salidaPerifericos.writeObject(peri.getStockPerifericos());
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Pantalla.class.getName()).log(Level.SEVERE, null, ex);
                }
                Informacion("Producto Vendido");
            }
        } while (peri.getStockPerifericos().size() + 1 < Integer.parseInt(borrarPerifericos) || Integer.parseInt(borrarPerifericos) < 1);
    }

    Calendar calendar = Calendar.getInstance();

    public static String Entrada(String msj) {
        return JOptionPane.showInputDialog(null, msj);
    }

    public static void Informacion(String msj) {
        JOptionPane.showInternalMessageDialog(null, msj);
    }

    public static String MenuEntrada() {
        return Entrada("<<<<---- Menu ---->>>>\n"
                + "\n1. Cargar Insumos."
                + "\n2. Ver Insumos."
                + "\n3. Vender Equipos."
                + "\n4. Salir.");

    }

    public static void MenuCargaComponentes(StockComponentes compo, StockPerifericos peri, StockComputadoras compu) throws ParseException {
        String opcion = "0";
        do {
            opcion = Entrada("<<<<---- Cargar Componentes ---->>>>\n"
                    + "\n1. Cargar Memoria RAM."
                    + "\n2. Cargar Disco Rigido."
                    + "\n3. Cargar Placa De Video."
                    + "\n4. Cargar Procesador."
                    + "\n5. Cargar Periferico."
                    + "\n6. Cargar Computadora."
                    + "\n7. Volver Atras.");
            if (!esNumero(opcion)) {
                opcion = "7";
            } else {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        CargarMemoriaRamEnStock(compo);
                        break;
                    case 2:
                        CargarDiscoEnStock(compo);
                        break;
                    case 3:
                        CargarPlacaDeVideoEnStock(compo);
                        break;
                    case 4:
                        CargarProcesadorEnStock(compo);
                        break;
                    case 5:
                        CargarPerifericoEnStock(peri);
                        break;
                    case 6:
                        CargarComputadoraEnStock(compu, compo);
                        break;
                }
            }

        } while (!opcion.equals("7"));
    }

    static void MenuMuestraEquipos(StockComponentes compo, StockComputadoras compu, StockPerifericos peri) {
        String opcion, cant;
        boolean noNumero = false;

        do {
            noNumero = false;
            opcion = Entrada("<<<<---- Menu de Equipos ---- >>>>\n"
                    + "\n1. Mostrar Componentes."
                    + "\n2. Mostrar Perifericos."
                    + "\n3. Mostrar PCs."
                    + "\n4. Volver al Menu.");
            if (!esNumero(opcion)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        mostrarComponentes(compo);
                        break;
                    case 2:
                        mostrarPerifericos(peri);
                        break;
                    case 3:
                        mostrarComputadoras(compu);
                        break;
                    case 4:
                        break;

                }
            }

        } while (Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 4 || noNumero == true);

    }

    static void MenuVentas(StockComponentes compo, StockComputadoras compu, StockPerifericos peri) {
        String opcion;
        boolean noNumero = false;
        do {
            noNumero = false;
            opcion = Entrada("<<<<---- Menu Ventas ---->>>>\n"
                    + "1. Vender Componentes.\n"
                    + "2. Vender Computadoras.\n"
                    + "3. Vender Perifericos.\n"
                    + "4. Volver.");
            if (!esNumero(opcion)) {
                Informacion("Debe elegir una opcion numerica.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(opcion)) {
                    case 1:
                        venderComponentes(compo);
                        break;
                    case 2:
                        venderComputadoras(compu);
                        break;
                    case 3:
                        venderPerifericos(peri);
                        break;
                    case 4:
                        opcion = "4";
                        break;
                }
            }
        } while (opcion.equals("4") || noNumero == true);
    }

    public static int Confirmacion(String msj) {
        return JOptionPane.showConfirmDialog(null, msj, "", JOptionPane.YES_NO_OPTION);
    }

    public static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void CargarMemoriaRamEnStock(StockComponentes compo) {
        String marca, tecnologia, frecuenciaMaxima, capacidad, descripcion, precioUnitario, fechaDeCarga;
        EsUsable usable = null;
        VendibleSuelto vendible = null;
        boolean noNumero = false;
        boolean esFecha = false;
        String usab, vend, cant;
        int cantidadDeUnidades = 0;

        marca = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Marca del Componente:");
        tecnologia = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Tecnologia del Componente:");
        frecuenciaMaxima = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Frecuencia Maxima del Componente:");
        capacidad = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Capacidad del Componente:");
        descripcion = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Descripcion del Componente:");

        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        precioUnitario = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                + "Precio del Componente:");

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        do {
            noNumero = false;
            cant = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                    + "Cantidad de Componentes:");
            if (!esNumero(cant)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                cantidadDeUnidades = Integer.parseInt(cant);
            }

        } while (Integer.parseInt(cant) < 1 || noNumero == true);

        do {
            noNumero = false;
            usab = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                    + "Componente Usado por:\n"
                    + "1. Desktop.\n"
                    + "2. Laptop.\n"
                    + "3. Ambos.\n");
            if (!esNumero(usab)) {
                Informacion("El valor debe ser un numero del 1 al 3.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(usab)) {
                    case 1:
                        usable = new EsUsableDesktop();
                        break;
                    case 2:
                        usable = new EsUsableLaptop();
                        break;
                    case 3:
                        usable = new EsUsableAmbos();
                        break;
                }

            }

        } while (Integer.parseInt(usab) < 1 && Integer.parseInt(usab) > 3 || noNumero == true);

        do {
            noNumero = false;
            vend = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                    + "Componente Vendible Suelto:\n"
                    + "1. Si.\n"
                    + "2. No.");
            if (!esNumero(vend)) {
                Informacion("El valor debe ser un numero.");
                noNumero = true;
            } else {
                if (Integer.parseInt(vend) == 1) {
                    vendible = new EsVendibleSuelto();
                } else {
                    vendible = new EsInvendibleSuelto();
                }
            }

        } while (Integer.parseInt(vend) < 1 && Integer.parseInt(vend) > 2 || noNumero == true);

        compo.agregaRam(new Ram(marca,
                tecnologia, frecuenciaMaxima,
                capacidad, usable,
                vendible, descripcion,
                precioUnitario, fechaDeCarga,
                cantidadDeUnidades
        ));

        try {
            ObjectOutputStream salidaRam = new ObjectOutputStream(new FileOutputStream("ram.obj"));
            salidaRam.writeObject(compo.getStockRam());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CargarDiscoEnStock(StockComponentes compo) {
        String marca, tipoDisco, capacidad, descripcion, precioUnitario, fechaDeCarga;
        int cantidadDeUnidades = 0;
        boolean noNumero = false;
        boolean esFecha = false;
        EsUsable usable = null;
        VendibleSuelto vendible = null;
        String usab, vend, cant;

        marca = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                + "Marca del Componente:");
        tipoDisco = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                + "Tipo de Disco:");
        capacidad = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                + "Capacidad del Componente:");
        descripcion = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                + "Descripcion del Componente:");
        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        precioUnitario = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                + "Precio del Componente:");

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        do {
            noNumero = false;
            usab = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                    + "Componente Usado por:\n"
                    + "1. Desktop.\n"
                    + "2. Laptop.\n"
                    + "3. Ambos.\n");
            if (!esNumero(usab)) {
                Informacion("El valor debe ser un numero del 1 al 3.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(usab)) {
                    case 1:
                        usable = new EsUsableDesktop();
                        break;
                    case 2:
                        usable = new EsUsableLaptop();
                        break;
                    case 3:
                        usable = new EsUsableAmbos();
                        break;
                }

            }

        } while (Integer.parseInt(usab) < 1 && Integer.parseInt(usab) > 3 || noNumero == true);

        do {
            noNumero = false;
            vend = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                    + "Componente Vendible Suelto:\n"
                    + "1. Si.\n"
                    + "2. No.");
            if (!esNumero(vend)) {
                Informacion("El valor debe ser un numero.");
                noNumero = true;
            } else {
                if (Integer.parseInt(vend) == 1) {
                    vendible = new EsVendibleSuelto();
                } else {
                    vendible = new EsInvendibleSuelto();
                }
            }

            do {
                noNumero = false;
                cant = Entrada("<<<< ---- Carga Disco Rigido ---- >>>>\n"
                        + "Cantidad de Componentes:");
                if (!esNumero(cant)) {
                    Informacion("La cantidad debe ser un valor numerico.");
                    noNumero = true;
                } else {
                    cantidadDeUnidades = Integer.parseInt(cant);
                }

            } while (Integer.parseInt(cant) < 1 || noNumero == true);

        } while (Integer.parseInt(vend) < 1 && Integer.parseInt(vend) > 2 || noNumero == true);

        compo.agregaDisco(new Disco(marca, tipoDisco, capacidad, usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));

        try {
            ObjectOutputStream salidaDisco = new ObjectOutputStream(new FileOutputStream("disco.obj"));
            salidaDisco.writeObject(compo.getStockDisco());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CargarPlacaDeVideoEnStock(StockComponentes compo) {
        String fabricante, modelo, capacidad, descripcion, precioUnitario, fechaDeCarga;
        int cantidadDeUnidades = 0;
        boolean noNumero = false;
        boolean esFecha = false;
        EsUsable usable = null;
        VendibleSuelto vendible = null;
        String vend, usab, cant;

        fabricante = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                + "Fabricante del Componente:");
        modelo = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                + "Modelo de Disco:");
        capacidad = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                + "Capacidad del Componente:");
        descripcion = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                + "Descripcion del Componente:");
        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        precioUnitario = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                + "Precio del Componente:");

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        do {
            noNumero = false;
            usab = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                    + "Componente Usado por:\n"
                    + "1. Desktop.\n"
                    + "2. Laptop.\n"
                    + "3. Ambos.\n");
            if (!esNumero(usab)) {
                Informacion("El valor debe ser un numero del 1 al 3.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(usab)) {
                    case 1:
                        usable = new EsUsableDesktop();
                        break;
                    case 2:
                        usable = new EsUsableLaptop();
                        break;
                    case 3:
                        usable = new EsUsableAmbos();
                        break;
                }

            }

        } while (Integer.parseInt(usab) < 1 && Integer.parseInt(usab) > 3 || noNumero == true);

        do {
            noNumero = false;
            vend = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                    + "Componente Vendible Suelto:\n"
                    + "1. Si.\n"
                    + "2. No.");
            if (!esNumero(vend)) {
                Informacion("El valor debe ser un numero.");
                noNumero = true;
            } else {
                if (Integer.parseInt(vend) == 1) {
                    vendible = new EsVendibleSuelto();
                } else {
                    vendible = new EsInvendibleSuelto();
                }
            }

            do {
                noNumero = false;
                cant = Entrada("<<<< ---- Carga Placa de Video ---- >>>>\n"
                        + "Cantidad de Componentes:");
                if (!esNumero(cant)) {
                    Informacion("La cantidad debe ser un valor numerico.");
                    noNumero = true;
                } else {
                    cantidadDeUnidades = Integer.parseInt(cant);
                }

            } while (Integer.parseInt(cant) < 1 || noNumero == true);

        } while (Integer.parseInt(vend) < 1 && Integer.parseInt(vend) > 2 || noNumero == true);

        compo.agregaPlaca(new PlacaDeVideo(fabricante, modelo, capacidad, usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));

        try {
            ObjectOutputStream salidaVideo = new ObjectOutputStream(new FileOutputStream("video.obj"));
            salidaVideo.writeObject(compo.getStockPlaca());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CargarProcesadorEnStock(StockComponentes compo) {

        String fabricante, modelo, descripcion, precioUnitario, fechaDeCarga;
        int cantidadDeUnidades = 0;
        boolean noNumero = false;
        boolean esFecha = false;
        VendibleSuelto vendible = null;
        EsUsable usable = null;
        String usab, vend, cant;

        fabricante = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                + "Fabricante del Componente:");
        modelo = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                + "Modelo:");
        descripcion = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                + "Descripcion del Componente:");
        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        precioUnitario = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                + "Precio del Componente:");

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        do {
            noNumero = false;
            usab = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                    + "Componente Usado por:\n"
                    + "1. Desktop.\n"
                    + "2. Laptop.\n"
                    + "3. Ambos.\n");
            if (!esNumero(usab)) {
                Informacion("El valor debe ser un numero del 1 al 3.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(usab)) {
                    case 1:
                        usable = new EsUsableDesktop();
                        break;
                    case 2:
                        usable = new EsUsableLaptop();
                        break;
                    case 3:
                        usable = new EsUsableAmbos();
                        break;
                }

            }

        } while (Integer.parseInt(usab) < 1 && Integer.parseInt(usab) > 3 || noNumero == true);

        do {
            noNumero = false;
            vend = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                    + "Componente Vendible Suelto:\n"
                    + "1. Si.\n"
                    + "2. No.");
            if (!esNumero(vend)) {
                Informacion("El valor debe ser un numero.");
                noNumero = true;
            } else {
                if (Integer.parseInt(vend) == 1) {
                    vendible = new EsVendibleSuelto();
                } else {
                    vendible = new EsInvendibleSuelto();
                }
            }

            do {
                noNumero = false;
                cant = Entrada("<<<< ---- Carga Procesador ---- >>>>\n"
                        + "Cantidad de Componentes:");
                if (!esNumero(cant)) {
                    Informacion("La cantidad debe ser un valor numerico.");
                    noNumero = true;
                } else {
                    cantidadDeUnidades = Integer.parseInt(cant);
                }

            } while (Integer.parseInt(cant) < 1 || noNumero == true);

        } while (Integer.parseInt(vend) < 1 && Integer.parseInt(vend) > 2 || noNumero == true);

        compo.agregaProcesador(new Procesador(fabricante, modelo, cantidadDeUnidades, usable, vendible, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));

        try {
            ObjectOutputStream salidaProcesador = new ObjectOutputStream(new FileOutputStream("procesador.obj"));
            salidaProcesador.writeObject(compo.getStockProcesador());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CargarPerifericoEnStock(StockPerifericos peri) {

        String tipo = "";
        String descripcion, precioUnitario, fechaDeCarga, perif, cant;
        boolean noNumero = false;
        boolean esFecha = false;
        int cantidadDeUnidades = 0;

        do {
            noNumero = false;
            perif = Entrada("<<<< ---- Carga Periferico ---- >>>>\n"
                    + "Tipo de Periferico:\n"
                    + "1. Teclado.\n"
                    + "2. Mouse.\n"
                    + "3. Monitor.\n"
                    + "4. Webcam.\n");
            if (!esNumero(perif)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                switch (Integer.parseInt(perif)) {
                    case 1:
                        tipo = "Teclado";
                        break;
                    case 2:
                        tipo = "Mouse";
                        break;
                    case 3:
                        tipo = "Monitor";
                        break;
                    case 4:
                        tipo = "Webcam";
                        break;
                }
            }
        } while (Integer.parseInt(perif) < 1 && Integer.parseInt(perif) > 4 || noNumero == true);

        descripcion = Entrada("<<<< ---- Carga Periferico ---- >>>>\n"
                + "Descripcion del Componente:");
        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Periferico ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        precioUnitario = Entrada("<<<< ---- Carga Periferico ---- >>>>\n"
                + "Precio del Componente:");

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        do {
            noNumero = false;
            cant = Entrada("<<<< ---- Carga Periferico ---- >>>>\n"
                    + "Cantidad de Componentes:");
            if (!esNumero(cant)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                cantidadDeUnidades = Integer.parseInt(cant);
            }

        } while (Integer.parseInt(cant) < 1 || noNumero == true);

        peri.agrega(new Perifericos(tipo, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("perifericos.obj"));
            salida.writeObject(peri.getStockPerifericos());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CargarComputadoraEnStock(StockComputadoras compu, StockComponentes compo) {

        String computadora;
        boolean noNumero = false;

        do {
            noNumero = false;
            computadora = Entrada("<<<< ---- Carga Computadora ---- >>>>\n"
                    + "1 Desktop.\n"
                    + "2. Laptop.\n");
            if (!esNumero(computadora)) {
                Informacion("Debe colocar un valor numerico.");
                noNumero = true;
            } else {
                if (Integer.parseInt(computadora) == 1) {
                    CrearComputadoraDesktop(compu, compo);
                } else {
                    CrearComputadoraLaptop(compu, compo);
                }
            }

        } while (Integer.parseInt(computadora) < 1 && Integer.parseInt(computadora) > 2 || noNumero == true);

    }

    private static void CrearComputadoraDesktop(StockComputadoras compu, StockComponentes compo) {

        Procesador procesador = null;
        Disco disco = null;
        Ram ram = null;
        PlacaDeVideo placaDeVideo = null;
        boolean esFecha = false;
        String descripcion, precioUnitario, fechaDeCarga, cant, opProc, opRam, opDis, opPla;
        int cantidadDeUnidades = 0;
        boolean noNumero = false;

        descripcion = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                + "Descripcion del Componente:");

        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        do {
            String listaProc = "";
            int id = 1;
            for (Procesador d : compo.getStockProcesador()) {

                listaProc += id + ". Cant: " + d.getCantidadDeUnidades() + " Fabricante: " + d.getFabricante() + " Modelo: " + d.getModelo() + "\n";
                id++;
            }
            listaProc += id + ". Salir.";
            noNumero = false;
            opProc = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Lista de Procesadores:\n"
                    + listaProc);
            if (!esNumero(opProc)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Desktop")
                        || compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Ambos")) {
                    procesador = compo.getStockProcesador().get(Integer.parseInt(opProc) - 1);
                    compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).setCantidadDeUnidades(compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getCantidadDeUnidades() - 1);

                } else {
                    Informacion("No es un procesador Utilizable para Desktop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opProc) < 1 && Integer.parseInt(opProc) > compo.getStockProcesador().size() || noNumero == true);

        do {
            String listaDisc = "";
            int id = 1;
            for (Disco d : compo.getStockDisco()) {

                listaDisc += id + ". Cant: " + d.getCantidadDeUnidades() + " Tipo: " + d.getTipoDisco() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaDisc += id + ". Salir.";
            noNumero = false;
            opDis = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Lista de Discos:\n"
                    + listaDisc);
            if (!esNumero(opDis)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockDisco().get(Integer.parseInt(opDis) - 1).getUsable().esUsablePara().equals("Desktop")
                        || compo.getStockDisco().get(Integer.parseInt(opDis) - 1).getUsable().esUsablePara().equals("Ambos")) {
                    disco = compo.getStockDisco().get(Integer.parseInt(opDis) - 1);
                    compo.getStockDisco().get(Integer.parseInt(opDis) - 1).setCantidadDeUnidades(compo.getStockDisco().get(Integer.parseInt(opDis) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Desktop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opDis) < 1 && Integer.parseInt(opDis) > compo.getStockDisco().size() || noNumero == true);

        do {
            String listaRam = "";
            int id = 1;
            for (Ram d : compo.getStockRam()) {

                listaRam += id + ". Cant: " + d.getCantidadDeUnidades() + " Tecnologia: " + d.getTecnologia() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaRam += id + ". Salir.";
            noNumero = false;
            opRam = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Lista de Memoria Ram:\n"
                    + listaRam);
            if (!esNumero(opRam)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockRam().get(Integer.parseInt(opRam) - 1).getUsable().esUsablePara().equals("Desktop")
                        || compo.getStockRam().get(Integer.parseInt(opRam) - 1).getUsable().esUsablePara().equals("Ambos")) {
                    ram = compo.getStockRam().get(Integer.parseInt(opRam) - 1);
                    compo.getStockRam().get(Integer.parseInt(opRam) - 1).setCantidadDeUnidades(compo.getStockRam().get(Integer.parseInt(opRam) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Desktop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opRam) < 1 && Integer.parseInt(opRam) > compo.getStockRam().size() || noNumero == true);

        do {
            String listaPlacas = "";
            int id = 1;
            for (PlacaDeVideo d : compo.getStockPlaca()) {

                listaPlacas += id + ". Cant: " + d.getCantidadDeUnidades() + " Fabricante: " + d.getFabricante() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaPlacas += id + ". Salir.";
            noNumero = false;
            opPla = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Lista de Computadoras:\n"
                    + listaPlacas);
            if (!esNumero(opPla)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).getUsable().esUsablePara().equals("Desktop")
                        || compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).getUsable().esUsablePara().equals("Ambos")) {
                    placaDeVideo = compo.getStockPlaca().get(Integer.parseInt(opPla) - 1);
                    compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).setCantidadDeUnidades(compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Desktop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opPla) < 1 && Integer.parseInt(opPla) > compo.getStockPlaca().size() || noNumero == true);

        do {
            noNumero = false;
            cant = Entrada("<<<< ---- Carga Computadora Desktop ---- >>>>\n"
                    + "Cantidad de Computadoras:");
            if (!esNumero(cant)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                cantidadDeUnidades = Integer.parseInt(cant);
            }

        } while (Integer.parseInt(cant) < 1 || noNumero == true);

        precioUnitario = "" + (Integer.parseInt(procesador.getPrecioUnitario()) + Integer.parseInt(disco.getPrecioUnitario()) + Integer.parseInt(ram.getPrecioUnitario()) + Integer.parseInt(placaDeVideo.getPrecioUnitario()));
        precioUnitario = "" + (Double.parseDouble(precioUnitario) - Double.parseDouble(precioUnitario) * 0.2);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        compu.agregaDesktop(new Desktop(procesador, disco, ram, placaDeVideo, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));

        try {
            ObjectOutputStream salidaDesktop = new ObjectOutputStream(new FileOutputStream("Desktop.obj"));
            salidaDesktop.writeObject(compu.getStockDesktop());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void CrearComputadoraLaptop(StockComputadoras compu, StockComponentes compo) {

        Procesador procesador = null;
        Disco disco = null;
        Ram ram = null;
        PlacaDeVideo placaDeVideo = null;
        String descripcion, precioUnitario, fechaDeCarga, marca, modelo, tamDePantalla, cant, opProc, opRam, opPla, opDis;
        int cantidadDeUnidades = 0;
        boolean noNumero = false;
        boolean esFecha = false;

        marca = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                + "Marca:");
        modelo = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                + "Modelo:");
        tamDePantalla = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                + "Tamaño de la Pantalla:");
        descripcion = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                + "Descripcion de la Laptop:");
        do {
            fechaDeCarga = Entrada("<<<< ---- Carga Memoria RAM ---- >>>>\n"
                    + "Fecha de Ingreso: (dd/mm/aaaa)");
            esFecha = validarFecha(fechaDeCarga);
        } while (esFecha == false);

        do {
            String listaProc = "";
            int id = 1;
            for (Procesador d : compo.getStockProcesador()) {

                listaProc += id + ". Cant: " + d.getCantidadDeUnidades() + " Fabricante: " + d.getFabricante() + " Modelo: " + d.getModelo() + "\n";
                id++;
            }
            listaProc += id + ". Salir.";
            noNumero = false;
            opProc = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                    + "Lista de Procesadores:\n"
                    + listaProc);
            if (!esNumero(opProc)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Laptop")) {
                    procesador = compo.getStockProcesador().get(Integer.parseInt(opProc) - 1);
                    compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).setCantidadDeUnidades(compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Laptop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opProc) < 1 && Integer.parseInt(opProc) > compo.getStockProcesador().size() || noNumero == true);

        do {
            String listaDisc = "";
            int id = 1;
            for (Disco d : compo.getStockDisco()) {

                listaDisc += id + ". Cant: " + d.getCantidadDeUnidades() + " Tipo: " + d.getTipoDisco() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaDisc += id + ". Salir.";
            noNumero = false;
            opDis = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                    + "Lista de Discos:\n"
                    + listaDisc);
            if (!esNumero(opDis)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Laptop")) {
                    disco = compo.getStockDisco().get(Integer.parseInt(opDis) - 1);
                    compo.getStockDisco().get(Integer.parseInt(opDis) - 1).setCantidadDeUnidades(compo.getStockDisco().get(Integer.parseInt(opDis) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Laptop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opDis) < 1 && Integer.parseInt(opDis) > compo.getStockDisco().size() || noNumero == true);

        do {
            String listaRam = "";
            int id = 1;
            for (Ram d : compo.getStockRam()) {

                listaRam += id + ". Cant: " + d.getCantidadDeUnidades() + " Tecnologia: " + d.getTecnologia() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaRam += id + ". Salir.";
            noNumero = false;
            opRam = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                    + "Lista de Memoria Ram:\n"
                    + listaRam);
            if (!esNumero(opRam)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Laptop")) {
                    ram = compo.getStockRam().get(Integer.parseInt(opRam) - 1);
                    compo.getStockRam().get(Integer.parseInt(opRam) - 1).setCantidadDeUnidades(compo.getStockRam().get(Integer.parseInt(opRam) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Laptop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opRam) < 1 && Integer.parseInt(opRam) > compo.getStockRam().size() || noNumero == true);

        do {
            String listaPlacas = "";
            int id = 1;
            for (PlacaDeVideo d : compo.getStockPlaca()) {

                listaPlacas += id + ". Cant: " + d.getCantidadDeUnidades() + " Fabricante: " + d.getFabricante() + " Capacidad: " + d.getCapacidad() + "\n";
                id++;
            }
            listaPlacas += id + ". Salir.";
            noNumero = false;
            opPla = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                    + "Lista de Placa de Video:\n"
                    + listaPlacas);
            if (!esNumero(opPla)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                if (compo.getStockProcesador().get(Integer.parseInt(opProc) - 1).getUsable().esUsablePara().equals("Laptop")) {
                    placaDeVideo = compo.getStockPlaca().get(Integer.parseInt(opPla) - 1);
                    compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).setCantidadDeUnidades(compo.getStockPlaca().get(Integer.parseInt(opPla) - 1).getCantidadDeUnidades() - 1);
                } else {
                    Informacion("No es un procesador Utilizable para Laptop. Seleccione otro.");
                    noNumero = true;
                }
            }

        } while (Integer.parseInt(opPla) < 1 && Integer.parseInt(opPla) > compo.getStockPlaca().size() || noNumero == true);

        do {
            noNumero = false;
            cant = Entrada("<<<< ---- Carga Computadora Laptop ---- >>>>\n"
                    + "Cantidad de Componentes:");
            if (!esNumero(cant)) {
                Informacion("La cantidad debe ser un valor numerico.");
                noNumero = true;
            } else {
                cantidadDeUnidades = Integer.parseInt(cant);
            }

        } while (Integer.parseInt(cant) < 1 || noNumero == true);

        precioUnitario = "" + (Integer.parseInt(procesador.getPrecioUnitario()) + Integer.parseInt(disco.getPrecioUnitario()) + Integer.parseInt(ram.getPrecioUnitario()) + Integer.parseInt(placaDeVideo.getPrecioUnitario()));

        Calendar c = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaDeCarga);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        Date hoy = null;
        try {
            hoy = formato.parse(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/" + Calendar.YEAR);
        } catch (ParseException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        if (diferenciaEntreFechas(hoy, fecha) > 365) {
            precioUnitario = "" + (Double.parseDouble(precioUnitario) - (Double.parseDouble(precioUnitario) * 0.15));
        }

        compu.agregaLaptop(new Laptop(marca, modelo, tamDePantalla, procesador, disco, ram, placaDeVideo, descripcion, precioUnitario, fechaDeCarga, cantidadDeUnidades));

        try {
            ObjectOutputStream salidaLaptop = new ObjectOutputStream(new FileOutputStream("Laptop.obj"));
            salidaLaptop.writeObject(compu.getStockLaptop());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void mostrarComponentes(StockComponentes compo) {
        String listaComponentes = "";
        try {
            for (Ram r : compo.getStockRam()) {
                listaComponentes += "(RAM) Cantidad: " + r.getCantidadDeUnidades() + " Marca: " + r.getMarca() + " Tecnologia: " + r.getTecnologia() + " Capacidad: " + r.getCapacidad() + " Precio: " + r.getPrecioUnitario() + "\n";
            }
        } catch (NullPointerException e) {
        }
        try {
            for (Procesador p : compo.getStockProcesador()) {
                listaComponentes += "(PROCESADOR) Cantidad: " + p.getCantidadDeUnidades() + " Fabricante: " + p.getFabricante() + " Modelo: " + p.getModelo() + " Frecuencia: " + p.getFrecuenciaMaxima() + " Precio: " + p.getPrecioUnitario() + "\n";
            }
        } catch (Exception e) {
        }
        try {
            for (Disco d : compo.getStockDisco()) {
                listaComponentes += "(DISCO) Cantidad: " + d.getCantidadDeUnidades() + " Marca: " + d.getMarca() + " Tipo de Disco: " + d.getTipoDisco() + " Capacidad: " + d.getCapacidad() + " Precio: " + d.getPrecioUnitario() + "\n";
            }
        } catch (Exception e) {
        }
        try {
            for (PlacaDeVideo v : compo.getStockPlaca()) {
                listaComponentes += "(VIDEO) Cantidad: " + v.getCantidadDeUnidades() + " Fabricante: " + v.getFabricante() + " Modelo: " + v.getModelo() + " Capacidad: " + v.getCapacidad() + " Precio: " + v.getPrecioUnitario() + "\n";
            }
        } catch (Exception e) {
        }

        System.out.println(listaComponentes);
        Informacion(listaComponentes);
    }

    private static void mostrarPerifericos(StockPerifericos peri) {
        String listaPerifericos = "";
        for (Perifericos p : peri.getStockPerifericos()) {
            listaPerifericos += "(" + p.getTipo() + ")" + " Cantidad: " + p.getCantidadDeUnidades() + " Descripcion: " + p.getDescripcion() + " Precio:" + p.getPrecioUnitario() + "\n";
        }
        Informacion(listaPerifericos);
    }

    private static void mostrarComputadoras(StockComputadoras compu) {
        String listaComputadoras = "";
        for (Desktop d : compu.getStockDesktop()) {
            listaComputadoras += "(DESKTOP) Cantidad: " + d.getCantidadDeUnidades() + "Descripcion: " + d.getDescripcion() + " Precio: " + d.getPrecioUnitario() + "\n";
        }
        for (Laptop l : compu.getStockLaptop()) {
            listaComputadoras += "(LAPTOP) Cantidad: " + l.getCantidadDeUnidades() + " Marca: " + l.getMarca() + " Modelo: " + l.getModelo() + " Pantalla: " + l.getTamDePantalla() + "Descripcion: " + l.getDescripcion() + " Precio: " + l.getPrecioUnitario() + "\n";
        }

        Informacion(listaComputadoras);
    }

    public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static int diferenciaEntreFechas(Date fechaMayor, Date fechaMenor) {
        long diferenciaMs = (long) fechaMayor.getTime() - (long) fechaMenor.getTime();
        long dias = diferenciaMs / (1000 * 60 * 60 * 24);
        return (int) dias;
    }
}
