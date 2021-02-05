package ExamenProveedor1.Modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Producto implements Serializable{

	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private int stock;

}
