/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Propietario extends Persona {
    private int telefono;
    private String direccion;
    private ArrayList<Mascota> Mascota;
    
    public Propietario() {
    }

    public Propietario(int telefono, String direccion, ArrayList<Mascota> Mascota) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.Mascota = Mascota;
    }

    public Propietario(int telefono, String direccion, ArrayList<Mascota> Mascota, String nombre, int edad) {
        super(nombre, edad);
        this.telefono = telefono;
        this.direccion = direccion;
        this.Mascota = Mascota;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Mascota> getMascota() {
        return Mascota;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascota(ArrayList<Mascota> Mascota) {
        this.Mascota = Mascota;
    }

}
