package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ferreteria")
public class Ferreteria 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_ferreteria")
	private int id_ferreteria;
	
	@Column(name = "nombre_ferreteria")
	private String nombre_ferreteria;

	public int getId_ferreteria() {
		return id_ferreteria;
	}

	public void setId_ferreteria(int id_ferreteria) {
		this.id_ferreteria = id_ferreteria;
	}

	public String getNombre_ferreteria() {
		return nombre_ferreteria;
	}

	public void setNombre_ferreteria(String nombre_ferreteria) {
		this.nombre_ferreteria = nombre_ferreteria;
	}

	@Override
	public String toString() {
		return "Ferreteria [id_ferreteria=" + id_ferreteria + ", nombre_ferreteria=" + nombre_ferreteria + "]";
	}
	
}
