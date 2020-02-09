package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.FerreteriaDAO;
import modelo.Producto;
import modelo.Proveedor;

@Stateless
public class GestionFerreteria 
{
	@Inject
	private FerreteriaDAO ferreteriaDAO;
	
	public List<Producto> getProductos() {
		return ferreteriaDAO.getProductos();
	}
	
	public void actualizarStock(int producto,String stock)
	{
	Producto pro = ferreteriaDAO.obtenerProducto(producto);
	pro.setStock_producto(pro.getStock_producto()-Integer.parseInt(stock));
	ferreteriaDAO.update(pro);	
		
	}

	
}
