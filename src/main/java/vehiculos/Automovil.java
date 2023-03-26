package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int puertas = 4;
	private static long velocidadMaxima = 100;
	private static String traccion = "FWD";
	
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
	}
	
	
    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
