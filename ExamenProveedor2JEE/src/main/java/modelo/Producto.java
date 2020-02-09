package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int id_producto;
	
	@Column(name = "nombre_producto")
	private String nombre_producto;
	
	@Column(name = "stock_producto")
	private int stock_producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_proveedor", nullable=false)
	private Proveedor id_proveedor;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(int stock_producto) {
		this.stock_producto = stock_producto;
	}

	public Proveedor getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Proveedor id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", stock_producto="
				+ stock_producto + ", id_proveedor=" + id_proveedor + "]";
	}
	
	
	
	

}
