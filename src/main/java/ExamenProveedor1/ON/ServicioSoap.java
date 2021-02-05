package ExamenProveedor1.ON;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ExamenProveedor1.Modelo.Producto;
import ExamenProveedor1.UTILS.Respuesta;

@WebService
public class ServicioSoap {

	@Inject
	private GestionProductoLocal on;
	Respuesta r = new Respuesta();

	@WebMethod
	public Respuesta buscarProducto(int codigo, int cantidad) {
		try {
			on.buscarProducto(codigo, cantidad);
			r.setCodigo(10);
			r.setMensaje("busqueda correcta");

		} catch (Exception e) {
			r.setCodigo(100);
			r.setMensaje("NO SE ENCUENTRA EN STOCK");

			// TODO: handle exception
		}
		return r;
	}

	@WebMethod
	public Respuesta actualizarStock(Producto p) {
		try {
			on.actualizarProducto(p);
			r.setCodigo(10);
			r.setMensaje("Se a descontado Correctamente");
			return r;

		} catch (Exception e) {
			r.setCodigo(10);
			r.setMensaje("ERROR");

		}
		return r;
	}
}
