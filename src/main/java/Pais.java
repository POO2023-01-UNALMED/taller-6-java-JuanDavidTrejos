package vehiculos;

import java.util.Collections;

public class Pais {

	private String nombre;

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	
	//sets and gets
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public static Pais paisMasVendedor() {
    	
        Pais masRepetido = Vehiculo.paises.get(0);
        int mayorFrecuencia = 0;
        for (Pais obj : Vehiculo.paises) {
            int frecuencia = Collections.frequency(Vehiculo.paises, obj);
            if (frecuencia > mayorFrecuencia) {
            	mayorFrecuencia = frecuencia;
                masRepetido = obj;
            }
        }
        
        return masRepetido;
    }
	
}
