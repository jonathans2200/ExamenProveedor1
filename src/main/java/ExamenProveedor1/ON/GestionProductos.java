package ExamenProveedor1.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ExamenProveedor1.DAO.ProductoDAO;

import ExamenProveedor1.Modelo.Producto;
import ExamenProveedor1.UTILS.Respuesta;


@Stateless
public class GestionProductos implements GestionProductoLocal {

@Inject
private ProductoDAO daoPro;


public Producto buscarProducto(int codigo,int cantidad)  {
Respuesta r= new Respuesta();
	try {
		int valor= daoPro.cantidadStock(codigo);
	if(cantidad >valor) {
   r.setCodigo(100);
   r.setMensaje("CANTIDAD DE STOCK MAYOR A LA EXISTENCIA");
	
	}else {
		return daoPro.buscar(codigo, cantidad);
		
	}
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("NO EXISTE PRODUCTO");
			// TODO: handle exception
		}
	return null;
}


public void actualizarProducto(Producto pro) {
	daoPro.update(pro);
}



}
