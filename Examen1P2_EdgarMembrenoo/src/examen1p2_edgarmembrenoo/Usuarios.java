/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_edgarmembrenoo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author edgarmembreno
 */
public class Usuarios {
    public String nombreUsuario;
    public int contraseña;
    private Date fecha;
    public int numero;
    public String correo;
    public String nombre;
    public String geneFvorito;
    public ArrayList libros;
    public ArrayList amigos;

    public Usuarios() {
    }

    public Usuarios(String nombreUsuario, int contraseña, Date fecha, int numero, String correo, String nombre, String geneFvorito, ArrayList libros, ArrayList amigos) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.numero = numero;
        this.correo = correo;
        this.nombre = nombre;
        this.geneFvorito = geneFvorito;
        this.libros = libros;
        this.amigos = amigos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneFvorito() {
        return geneFvorito;
    }

    public void setGeneFvorito(String geneFvorito) {
        this.geneFvorito = geneFvorito;
    }

    public ArrayList getLibros() {
        return libros;
    }

    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fecha=" + fecha + ", numero=" + numero + ", correo=" + correo + ", nombre=" + nombre + ", geneFvorito=" + geneFvorito + ", libros=" + libros + ", amigos=" + amigos + '}';
    }

   
    
    
}
