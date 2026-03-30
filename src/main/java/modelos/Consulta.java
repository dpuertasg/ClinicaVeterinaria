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
public class Consulta {
    private List<Medicamento> medicamentos;
    private String fecha;

    public Consulta() {
    }

    public Consulta(List<Medicamento> medicamentos, String fecha) {
        this.medicamentos = medicamentos;
        this.fecha = fecha;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
