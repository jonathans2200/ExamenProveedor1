package ExamenProveedor1.Modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Proveedor implements Serializable {
 
	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	
	
}
