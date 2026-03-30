/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
import java.util.List;
import modelos.Mascota;
/**
 *
 * @author USER
 */
public class Propietario extends Persona {
    private int telefono;
    private String direccion;
    private List<Mascota> mascotas;
    
    public Propietario() {
    }

    public Propietario(int telefono, String direccion, List<Mascota> mascotas) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }

    public Propietario(int telefono, String direccion, String nombre, int edad, List<Mascota> mascotas) {
        super(nombre, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void mostrarDatosPropietario(){
        System.out.println("los datos del propietario son: ");
        System.out.println("nombre: " + getNombre() + " edad: " + getEdad() + " telefono: " + telefono + " direccion: " + direccion);
    }
    
    public void agregarMascota(Mascota m) {
       mascotas.add(m);
    }
    
    public void mostrarMascota(){
        System.out.println("las mascotas del propietario son: ");
        for(int i = 0; i < mascotas.size();i++){
        System.out.println("Mascota: "+ mascotas.get(i));
        }
    }

}
