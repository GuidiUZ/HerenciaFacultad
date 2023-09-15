package carrito;

import java.util.ArrayList;

public class Carrito {

	private ArrayList<Producto> productos;

	public Carrito() {
		productos = new ArrayList<Producto>();
	}

	public int getCantidadProducto() {
		return productos.size();
	}

	public void agregarProductos(Producto producto) {

		productos.add(producto);

	}

	public Double getPrecioTotal() {
		double acumPrecio = 0.0;

		for (Producto producto : productos) {
			acumPrecio += producto.getPrecio();
		}

		return acumPrecio;
	}

	public Double getPrecioTotal(Categoria tecnologia) {

		double acumPrecio = 0.0;

		for (Producto producto : productos) {

			if (producto.getCategoria().equals(tecnologia)) {
				acumPrecio += producto.getPrecio();
			}

		}

		return acumPrecio;

	}

}
