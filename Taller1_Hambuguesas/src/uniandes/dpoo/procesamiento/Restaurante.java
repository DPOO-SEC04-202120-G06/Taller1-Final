package uniandes.dpoo.procesamiento;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import uniandes.dpoo.modelo.Ingrediente;
import uniandes.dpoo.modelo.Pedido;
import uniandes.dpoo.modelo.Producto;
import uniandes.dpoo.modelo.ProductoMenu;
import uniandes.dpoo.procesamiento.LoaderInformacionArchivos;


public class Restaurante {
	public static void IniciarPedido(String nombreCliente, String direccionCliente)
	{
	Pedido pedido = new Pedido(nombreCliente, direccionCliente);
	System.out.println(pedido);
	}
	
	
	
	public ArrayList<ProductoMenu> getMenuBase(String pRuta)  throws FileNotFoundException, IOException
	{
		ArrayList<ProductoMenu> productos = LoaderInformacionArchivos.leerInfoArchivoProductosMenu(pRuta);
		return productos;
	}
	
	public ArrayList<Ingrediente> getIngredientes(String pRuta)  throws FileNotFoundException, IOException
	{
		ArrayList<Ingrediente> ingredientes = LoaderInformacionArchivos.leerInfoArchivoIngredientes(pRuta);
		return ingredientes;
	}

}
