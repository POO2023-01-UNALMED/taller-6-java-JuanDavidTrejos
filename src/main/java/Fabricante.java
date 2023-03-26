package vehiculos;

import java.util.Collections;

public class Fabricante {

	private String nombre;
	public Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

	
	//gets and sets
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
	
    
    public static Fabricante fabricaMayorVentas() {
    	Fabricante masRepetido = Vehiculo.fabricantes.get(0);
        int mayorFrecuencia = 0;
        for (Fabricante obj : Vehiculo.fabricantes) {
            int frecuencia = Collections.frequency(Vehiculo.fabricantes, obj);
            if (frecuencia > mayorFrecuencia) {
            	mayorFrecuencia = frecuencia;
                masRepetido = obj;
            }
        }
        
        return masRepetido;
    }
}
