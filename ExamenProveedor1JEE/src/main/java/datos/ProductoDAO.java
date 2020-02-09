package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


import modelo.Producto;
import modelo.Proveedor;

@Stateless
public class ProductoDAO 
{
	@Inject
	private EntityManager em;
	
	public void insert(Producto producto) {
		em.persist(producto);
	}
	
	public Proveedor getProveedor (String numeroProveedor) 
	{
		try {
			String jpql = "SELECT c FROM Proveedor c WHERE id_proveedor  = ?1";
			Query q = em.createQuery(jpql, Proveedor.class);
			q.setParameter(1, Integer.parseInt(numeroProveedor));
			Proveedor proveedor = (Proveedor) q.getSingleResult();
			return proveedor;
		} catch (Exception e) {
			return null;
		}
	}
	
}
