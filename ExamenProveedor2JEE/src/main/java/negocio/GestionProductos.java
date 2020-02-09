package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.ProductoDAO;
import modelo.Producto;
import modelo.Proveedor;

@Stateless
public class GestionProductos
{
	@Inject
	private ProductoDAO ProductoDAO;
	
	public void guardar(String nombreproducto, int stockproducto,String idproveedor) {
		
		Producto producto = new Producto ();
		Proveedor proveedor = ProductoDAO.getProveedor(idproveedor);
		
		producto.setNombre_producto(nombreproducto);
		producto.setStock_producto(stockproducto);
		producto.setId_proveedor(proveedor);
		
		ProductoDAO.insert(producto);
		
		
	}
}
