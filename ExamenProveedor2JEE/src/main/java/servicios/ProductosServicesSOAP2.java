package servicios;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import negocio.GestionProductos;


@WebService
public class ProductosServicesSOAP2 
{
	@Inject
	private  GestionProductos gp;
	
	@WebMethod
	public Respuesta IngresarProductos(String nombreproducto, int stockproducto,String idproveedor) {
		Respuesta respuesta = new Respuesta();
		try {
			gp.guardar(nombreproducto, stockproducto, idproveedor);
			
				respuesta.setCodigo(1);
				respuesta.setMensaje("Ok");	
			
		} catch (Exception e) {
			respuesta.setCodigo(99);
			respuesta.setMensaje("ERROR");
		}
		return respuesta;
	}
	

}
