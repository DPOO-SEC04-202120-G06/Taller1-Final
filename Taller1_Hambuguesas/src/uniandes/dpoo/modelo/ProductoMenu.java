package uniandes.dpoo.modelo;

public class ProductoMenu {
	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String nombreP, int precioP)
	{
		this.nombre = nombreP;
		this.precioBase = precioP;
	}
	
	/**
	 * Permite convertir un objeto ProductoMenu a un String 
	 */
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getPrecio()
	{
		return precioBase;
	}
	public String toString()
	{
		return this.nombre + "-" + this.precioBase;
	}
}
