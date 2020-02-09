package Vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import negocio.GestionFerreteria;
import modelo.Producto;
import modelo.Proveedor;

@ManagedBean
@SessionScoped
public class GestionFerreteriaBean 
{
	@Inject
	private GestionFerreteria gf;
	
	private List<Producto> proveedores;
	
	private String numped;
	
	@PostConstruct
	public void init() 
	{	
		proveedores = gf.getProductos();
		numped="";
	}
	
	public void Pedidos(int producto, Proveedor proveedor) 
	{
		System.out.println("Ingreso : "+numped);
		System.out.println("Codigo Producto : "+producto);
		
		gf.actualizarStock(producto,numped);
		
		init();
	}

	public List<Producto> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Producto> proveedores) {
		this.proveedores = proveedores;
	}

	public String getNumped() {
		return numped;
	}

	public void setNumped(String numped) {
		this.numped = numped;
	}

	


	



}
