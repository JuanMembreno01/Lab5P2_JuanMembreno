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
public class jugadores {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private int numjug;
    private int cantpar=0;
    private int cantidadcopas=0;
    private int rojas=0;
    private int amarillas=0;
    private int  añosc ;

    public jugadores() {
    }

    public jugadores(String nombre, String apellido, String nacionalidad, int edad, int numjug, int añosc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.numjug = numjug;
        this.añosc = añosc;
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

    public int getNumjug() {
        return numjug;
    }

    public void setNumjug(int numjug) {
        this.numjug = numjug;
    }

    public int getCantpar() {
        return cantpar;
    }

    public void setCantpar(int cantpar) {
        this.cantpar = cantpar;
    }

    public int getCantidadcopas() {
        return cantidadcopas;
    }

    public void setCantidadcopas(int cantidadcopas) {
        this.cantidadcopas = cantidadcopas;
    }

    public int getRojas() {
        return rojas;
    }

    public void setRojas(int rojas) {
        this.rojas = rojas;
    }

    public int getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(int amarillas) {
        this.amarillas = amarillas;
    }

    public int getAñosc() {
        return añosc;
    }

    public void setAñosc(int añosc) {
        this.añosc = añosc;
    }

    @Override
    public String toString() {
        return "jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", numjug=" + numjug + ", cantpar=" + cantpar + ", cantidadcopas=" + cantidadcopas + ", rojas=" + rojas + ", amarillas=" + amarillas + ", a\u00f1osc=" + añosc + '}';
    }
    
}
