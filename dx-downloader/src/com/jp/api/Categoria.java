package com.jp.api;

import java.util.List;

/**
 * @author JuanPe
 * 
 */
public class Categoria {
	private String codigo;
	private String nombre;
	private String descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Categoria))
			return false;
		if (this.getCodigo().equals(((Categoria) other).getCodigo()))
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return this.getCodigo().hashCode() + this.getNombre().hashCode() + 32;
	}

}
