package ExamenProveedor1.Modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Producto implements Serializable{

	@ID
	@GeneratedValue
	private int codigo;
	private String nombre;
	private int stock;
}
