/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author USER
 */
public class Veterinario extends Persona{
    private String especialidad;
    private String telefono;

    public Veterinario() {
    }

    public Veterinario(String especialidad, String telefono) {
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public Veterinario(String especialidad, String telefono, String nombre, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
