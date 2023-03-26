package vehiculos;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

	protected String placa;
	protected int puertas;
	protected long velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int CantidadVehiculos;
	//protected static Vehiculo[] vehiculos;
	private static List<Pais> paises = new ArrayList<>();
	private static List<Fabricante> fabricantes = new ArrayList<>();
	
	protected static int cantidadAutomoviles = 0;
	protected static int cantidadCamionetas = 0;
	protected static int cantidadCamiones = 0;
	
	public Vehiculo(String placa, int puertas, long velocidadMaxima, 
			String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos++;
		paises.add(fabricante.getPais());
		fabricantes.add(fabricante);
	}
	
	
	//sets and gets
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    
    public long getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(long velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    public String getTraccion() {
        return traccion;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }


    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }
	
    
    public static String vehiculosPorTipo() {
        return "Automoviles: " + cantidadAutomoviles + "\n" +
               "Camionetas: " + cantidadCamionetas + "\n" +
               "Camiones: " + cantidadCamiones;
	}

	
    public static Pais paisMasVendedor() {
    	
        Pais masRepetido = paises.get(0);
        int mayorFrecuencia = 0;
        for (Pais obj : paises) {
            int frecuencia = Collections.frequency(paises, obj);
            if (frecuencia > mayorFrecuencia) {
            	mayorFrecuencia = frecuencia;
                masRepetido = obj;
            }
        }
        
        return masRepetido;
    }

    
    public static Fabricante fabricaMayorVentas() {
    	Fabricante masRepetido = fabricantes.get(0);
        int mayorFrecuencia = 0;
        for (Fabricante obj : fabricantes) {
            int frecuencia = Collections.frequency(fabricantes, obj);
            if (frecuencia > mayorFrecuencia) {
            	mayorFrecuencia = frecuencia;
                masRepetido = obj;
            }
        }
        
        return masRepetido;
    }
	
}
