package datos;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


import modelo.Proveedor;

@Stateless
public class ProveedorDAO 
{
	@Inject
	private EntityManager em;
	
	public void insert(Proveedor proveedor) {
		em.persist(proveedor);
	}

}
