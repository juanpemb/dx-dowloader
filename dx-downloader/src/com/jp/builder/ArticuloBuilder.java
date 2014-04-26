package com.jp.builder;

import java.util.List;

import com.jp.api.Articulo;
import com.jp.api.Categoria;

public class ArticuloBuilder {

	private String codigo;
	private String nombre;
	private String subtitulo;
	private String descripcion;
	private Integer precio;
	private Categoria categoria;
	private List<String> imagenes;

	public ArticuloBuilder withCodigo(String codigo) {
		this.codigo = codigo;
		return this;
	}

	public ArticuloBuilder withNombre(String nombre) {
		this.nombre = nombre;
		return this;

	}

	public ArticuloBuilder withSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
		return this;
	}

	public ArticuloBuilder withDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	public ArticuloBuilder withPrecio(Integer precio) {
		this.precio = precio;
		return this;
	}

	public ArticuloBuilder withCategoria(Categoria categoria) {
		this.categoria = categoria;
		return this;
	}

	public ArticuloBuilder withImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
		return this;
	}

	public Articulo build() {
		Articulo a = new Articulo();
		a.setCodigo(codigo);
		a.setDescripcion(descripcion);
		a.setNombre(nombre);
		a.setPrecio(precio);
		a.setSubtitulo(subtitulo);
		a.setCategoria(categoria);
		a.setImagenes(imagenes);
		return a;
	}

}
