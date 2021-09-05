package uniandes.dpoo.modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import uniandes.dpoo.procesamiento.LoaderInformacionArchivos;

public class Combo {
	private String nombreCombo;
	private double descuento;
	private ArrayList<String>itemsCombo;    // SIMPLIFICACION: Lista de nombres de los productos del menu que componen el combo. Revisar el diagrama de clases
	
	/**
	 * Constructor de la clase
	 */
	public Combo(String nombreP, double descuentoP)
	{
		this.nombreCombo = nombreP;
		this.descuento = descuentoP;
		this.itemsCombo = new ArrayList<String>();    
	}

	/**
	 * Agrega el nombre de un productoMenu a un combo. Metodo simplificado.
	 * @param nombreProducto
	 */
	public void agregarProducto(String nombreProducto)
	{
		this.itemsCombo.add(nombreProducto);
	}
	
	/**
	 * Permite convertir un objeto Combo a un String 
	 */
	public String getNombre()
	{
		return nombreCombo;
	}
	
	public double getDescuento()
	{
		return descuento;
	}
	
	public double getPrecio(String pRuta) throws FileNotFoundException, IOException
	{
		ArrayList<ProductoMenu> productos = LoaderInformacionArchivos.leerInfoArchivoProductosMenu(pRuta);
		double precioFinal= 0;
		for (String i : itemsCombo)
		{
		if (productos.get(1).getNombre().equals(i))
		{
			int precios = (productos.get(1)).getPrecio();
			precioFinal += precios;
		}
		precioFinal = precioFinal - (precioFinal*descuento);
		}
		return precioFinal;
	}
	
	@Override
	public String toString()
	{
		return this.nombreCombo + "-" + this.descuento + "-" + this.itemsCombo;
	}
}
