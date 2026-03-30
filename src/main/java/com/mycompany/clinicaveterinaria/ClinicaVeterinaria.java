/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria;

import java.util.ArrayList;
import java.util.List;
import modelos.Consulta;
import modelos.Propietario;
import modelos.Animal;
import modelos.Veterinario;
import modelos.Mascota;
import modelos.Medicamento;
import modelos.Persona;

/**
 *
 * @author USER
 */
public class ClinicaVeterinaria {

    public static void main(String[] args) {
      //consulta-medicamento
       Consulta consulta = new Consulta("29/03/2026");
        consulta.agregarMedicamento("Antibiotico", "2 veces al dia");
        consulta.agregarMedicamento("Vitaminas", "1 vez al dia");
        consulta.mostrarMedicamento();
        consulta.mostrarConsulta();
        //propietario-mascota
        List<Mascota> Listamascota = new ArrayList<>();
       Propietario propietario = new Propietario(123456, "calle 30", "David", 28, Listamascota);
       Mascota mascota = new Mascota("firulais","poodle",3,"perro");
        propietario.mostrarDatosPropietario();
        propietario.agregarMascota(mascota);
        propietario.mostrarMascota();
        //veterinario- consulta
        
        
    }
    }
