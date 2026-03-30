/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class Veterinario extends Persona{
    private String especialidad;
    private String telefono;
    private List<Consulta> consultas;

    public Veterinario() {
    }

    public Veterinario(String especialidad, String telefono, List<Consulta> consultas) {
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.consultas = consultas;
    }

    public Veterinario(String especialidad, String telefono, List<Consulta> consultas, String nombre, int edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.consultas = consultas;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public void agregarConsulta(Consulta c){
        consultas.add(c);
    }
    public void mostrarConsultas(){
    System.out.println("Consultas del veterinario: " + getNombre() + " : ");
    for(int i = 0; i < consultas.size(); i++){
        System.out.println(consultas.get(i));
    }
    }
     public void recetar(Consulta consulta) {
        System.out.println("El veterinario " + getNombre() + " receta los siguientes medicamentos:");
      List<Medicamento> meds = consulta.getMedicamentos();
      for (int i = 0; i < meds.size(); i++) {
          System.out.println("- " + meds.get(i).getNombre());
}
    }
}
