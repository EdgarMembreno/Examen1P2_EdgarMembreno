/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_edgarmembrenoo;

/**
 *
 * @author edgarmembreno
 */
public class Libros {

    public String titulo;
    public String descripcion;
    public int puntaje;
    public int copiasDisponibles;
    public String genero;
    public int valor;
    public int edicion;
    public String autor;
    public int año;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, int puntaje, int copiasDisponibles, String genero, int valor, int edicion, String autor, int año) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copiasDisponibles = copiasDisponibles;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        if (puntaje >= 1 && puntaje <= 5) {
            this.puntaje = puntaje;
        }

    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", puntaje=" + puntaje + ", copiasDisponibles=" + copiasDisponibles + ", genero=" + genero + ", valor=" + valor + ", edicion=" + edicion + ", autor=" + autor + ", a\u00f1o=" + año + '}';
    }

}
