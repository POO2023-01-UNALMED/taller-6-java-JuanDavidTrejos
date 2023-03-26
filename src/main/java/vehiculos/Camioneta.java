package vehiculos;

public class Camioneta extends Vehiculo{

	private boolean volco;
	private static long velocidadMaxima = 90;
	private static String traccion = "4X4";
	
	public Camioneta (String placa, int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	
    public boolean isVolco() {
        return volco;
    }
    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
