package ExamenProveedor1.ON;

import javax.ejb.Local;

import ExamenProveedor1.Modelo.Producto;

@Local
public interface GestionProductoLocal {
	public Producto buscarProducto(int codigo,int cantidad);
	public void actualizarProducto(Producto pro);
}
