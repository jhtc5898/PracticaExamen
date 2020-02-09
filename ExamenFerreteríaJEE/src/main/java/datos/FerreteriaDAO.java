package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Producto;
import modelo.Proveedor;;



@Stateless
public class FerreteriaDAO 
{
	@Inject
	private EntityManager em;
	
	public List<Producto> getProductos(){
		String jpql = "SELECT c FROM Producto c";
		Query q = em.createQuery(jpql);
		List<Producto> ferreteria =q.getResultList();
		System.out.println(ferreteria.toString());
		return ferreteria;
	}
	
	public Producto obtenerProducto(int codigo) {

			String jpql = "SELECT u FROM Producto u WHERE id_producto = ?1";
			Query q = em.createQuery(jpql, Producto.class);
			q.setParameter(1, codigo);
			Producto u = (Producto) q.getSingleResult();
			return u;
	}

	
	public void update(Producto producto) {
		em.merge(producto);
	}
}
