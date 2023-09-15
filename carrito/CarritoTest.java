package carrito;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarritoTest {

	private Carrito carrito;
	
	@BeforeEach
	public void crearCarrito() {
		carrito = new Carrito();
	}
	
	@Test
	public void verificarCant0CarritoVacio() {
		assertEquals(0, carrito.getCantidadProducto());
	}
	
	@Test
	public void verificarCant1EnCarrVacio() {
		assertEquals(1, carrito.getCantidadProducto());
	}
	
	@Test
	public void verificarPrecioTotalDelCarrito() {
		carrito.agregarProductos(new Producto("Yerba", 1000.0, Categoria.ALIMENTO));
		carrito.agregarProductos(new Producto("Fideos", 600.0, Categoria.ALIMENTO));
		carrito.agregarProductos(new Producto("Coca-Cola", 1000.0, Categoria.ALIMENTO));
		assertEquals(2600.0, carrito.getPrecioTotal());
		
	}
	
	
	@Test
	public void verificarPrecioTotalProductosTecnologicos() {
		carrito.agregarProductos(new Producto("Tv", 20000.0, Categoria.TECNOLOGIA));
		carrito.agregarProductos(new Producto("Celular", 20000.0, Categoria.TECNOLOGIA));
		carrito.agregarProductos(new Producto("Auricular", 5000.0, Categoria.TECNOLOGIA));
		carrito.agregarProductos(new Producto("Pepitos", 1000.0, Categoria.ALIMENTO));
		carrito.agregarProductos(new Producto("Pizza", 3000.0, Categoria.ALIMENTO));
		assertEquals(45000.0, carrito.getPrecioTotal(Categoria.TECNOLOGIA));
	}

}
