package com.jp.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author JuanPe
 * 
 */
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codigo;
	private String nombre;
	private String subtitulo;
	private String descripcion;
	private Integer precio;
	private Categoria categoria;
	private List<String> imagenes;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Articulo))
			return false;
		return this.getCodigo().equals(((Articulo) other).getCodigo());
	}

	@Override
	public int hashCode() {
		return this.getCodigo().hashCode();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("Articulo[").append(this.getCodigo()).append("]")
				.toString();
	}

}
