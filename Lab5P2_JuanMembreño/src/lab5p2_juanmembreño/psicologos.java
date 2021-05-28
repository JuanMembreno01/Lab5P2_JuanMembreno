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
public class psicologos {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String titulouniversitario;
    private int id;
    private String especialidad;
    private int cantinformes = 0;
    private int cantjugaten = 0;

    public psicologos() {
    }

    public psicologos(String nombre, String apellido, String nacionalidad, int edad, String titulouniversitario, int id, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.titulouniversitario = titulouniversitario;
        this.id = id;
        this.especialidad = especialidad;
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

    public String getTitulouniversitario() {
        return titulouniversitario;
    }

    public void setTitulouniversitario(String titulouniversitario) {
        this.titulouniversitario = titulouniversitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantinformes() {
        return cantinformes;
    }

    public void setCantinformes(int cantinformes) {
        this.cantinformes = cantinformes;
    }

    public int getCantjugaten() {
        return cantjugaten;
    }

    public void setCantjugaten(int cantjugaten) {
        this.cantjugaten = cantjugaten;
    }

    @Override
    public String toString() {
        return "psicologos{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", titulouniversitario=" + titulouniversitario + ", id=" + id + ", especialidad=" + especialidad + ", cantinformes=" + cantinformes + ", cantjugaten=" + cantjugaten + '}';
    }
    
}
