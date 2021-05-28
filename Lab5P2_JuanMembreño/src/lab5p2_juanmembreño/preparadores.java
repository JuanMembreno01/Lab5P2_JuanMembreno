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
public class preparadores {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private int id;
    private int añosc;
    private String especialidad;
    private String nombretitulo;

    public preparadores() {
    }

    public preparadores(String nombre, String apellido, String nacionalidad, int edad, int id, int añosc, String especialidad, String nombretitulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.id = id;
        this.añosc = añosc;
        this.especialidad = especialidad;
        this.nombretitulo = nombretitulo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAñosc() {
        return añosc;
    }

    public void setAñosc(int añosc) {
        this.añosc = añosc;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombretitulo() {
        return nombretitulo;
    }

    public void setNombretitulo(String nombretitulo) {
        this.nombretitulo = nombretitulo;
    }

    @Override
    public String toString() {
        return "preparadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", id=" + id + ", a\u00f1osc=" + añosc + ", especialidad=" + especialidad + ", nombretitulo=" + nombretitulo + '}';
    }

}
