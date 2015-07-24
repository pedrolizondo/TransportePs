package prueba;

// Generated 23-jul-2015 20:36:17 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Marca generated by hbm2java
 */
@Entity
@Table(name = "marca")
public class Marca implements java.io.Serializable {

	private int idMarca;
	private String nombre;
	private Set<Movil> movils = new HashSet<Movil>(0);

	public Marca() {
	}

	public Marca(int idMarca, String nombre) {
		this.idMarca = idMarca;
		this.nombre = nombre;
	}

	public Marca(int idMarca, String nombre, Set<Movil> movils) {
		this.idMarca = idMarca;
		this.nombre = nombre;
		this.movils = movils;
	}

	@Id
	@Column(name = "idMarca", unique = true, nullable = false)
	public int getIdMarca() {
		return this.idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marca")
	public Set<Movil> getMovils() {
		return this.movils;
	}

	public void setMovils(Set<Movil> movils) {
		this.movils = movils;
	}

}
