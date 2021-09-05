package uniandes.dpoo.modelo;

import java.util.ArrayList;

public class Pedido {
	private int numeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<ProductoMenu> itemsPedido;

	public Pedido(String elNombreCliente, String eldireccionCliente)
	{
		this.nombreCliente = elNombreCliente;
		this.direccionCliente = eldireccionCliente;
	}
	public int getidPedido()
	{ 
		return idPedido;

	}	

	public void agregarProducto(ProductoMenu nuevoItem)
	{
		this.itemsPedido.add(nuevoItem);
	}

	public int getPrecioNetoPedido()
	{
		int PrecioNeto = 0;
		for (ProductoMenu item: itemsPedido)
		{
			int precio = item.getPrecio();
			PrecioNeto = PrecioNeto + precio ;
		}
		return PrecioNeto;

	}
	public double getPrecioIVAPedido()
	{
		int PrecioNeto = getPrecioNetoPedido();
		double PrecioIVA = PrecioNeto * 0.19;
		return PrecioIVA;
	}
	public double getPrecioTotalPedido()
	{
		int PrecioNeto = getPrecioNetoPedido();
		double PrecioIVA = getPrecioIVAPedido();
		double PrecioTotal = PrecioNeto + PrecioIVA;
		return PrecioTotal;
	}
}
