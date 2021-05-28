/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5p2_juanmembreño;

/**
 *
 * @author usuario
 */
public class entrenadores {
   private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private int añosc;
    private int cantcopas;

    public entrenadores() {
    }

    public entrenadores(String nombre, String apellido, String nacionalidad, int edad, int añosc, int cantcopas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.añosc = añosc;
        this.cantcopas = cantcopas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosc() {
        return añosc;
    }

    public void setAñosc(int añosc) {
        this.añosc = añosc;
    }

    public int getCantcopas() {
        return cantcopas;
    }

    public void setCantcopas(int cantcopas) {
        this.cantcopas = cantcopas;
    }

    @Override
    public String toString() {
        return "entrenadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", a\u00f1osc=" + añosc + ", cantcopas=" + cantcopas + '}';
    }
    
}
