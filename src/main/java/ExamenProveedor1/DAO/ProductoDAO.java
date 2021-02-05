package ExamenProveedor1.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ExamenProveedor1.Modelo.Producto;

@Stateless
public class ProductoDAO {
 
	@PersistenceContext
	private EntityManager em;
/**
 * metodo que me permite ver cual es el stock del productos
 * @param codigo
 * @return
 */
	public int cantidadStock(int codigo) {
		String jpl="select p.stock from Producto p where p.codigo=:codigo";
		Query q = em.createQuery(jpl,Producto.class);
		q.setParameter("codigo", codigo);
		return (int) q.getSingleResult();

	}	
	/**
	 * metodo que permite saber si hay o no existencia del producto
	 * @param codigo
	 * @param cantidad
	 * @return
	 */
public Producto buscar(int codigo,int cantidad) {
	String jpl="select p from Producto p where p.nombre=:codigo and p.stock=:cantidad ";
	Query q = em.createQuery(jpl,Producto.class);
	q.setParameter("codigo", codigo);
	q.setParameter("cantidad", cantidad);

	return (Producto)q.getSingleResult();

}

/**
 * metodo para actualizar el stock
 * @param pro
 */
public void update (Producto pro) {
	em.merge(pro);
}

}
