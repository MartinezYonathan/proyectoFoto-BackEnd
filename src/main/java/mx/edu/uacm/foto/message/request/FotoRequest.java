package mx.edu.uacm.foto.message.request;

public class FotoRequest {
	private Long id;
	private String nombre;
	private String descripcion;
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "FotoRequest [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", foto=" + foto.substring(0, 15) + "]";
	}
	
	

}
