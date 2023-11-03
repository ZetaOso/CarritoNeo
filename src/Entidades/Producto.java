 package Entidades;
 

public class Producto {
	//atributos de la clase
		public String nombre;
		public String codigo;
		public float precio;
		//crear el costructor
		public Producto( String nombre, String codigo, float precio) {
			this.nombre = nombre;
			this.codigo = codigo;
			this.precio = precio;
		}
		
		//getters y setter
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nuevoNombre) {
			this.nombre = nuevoNombre;		
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}
		
		public float costoFinal() {
			return this.precio;
		}

}
