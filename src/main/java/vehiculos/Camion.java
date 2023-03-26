package vehiculos;

public class Camion extends Vehiculo{

	private int ejes;
	private static int puertas = 2;
	private static long velocidadMaxima = 80;
	private static String traccion = "4X2";
	
	public Camion (String placa, String nombre, int precio, int peso, 
					Fabricante fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
