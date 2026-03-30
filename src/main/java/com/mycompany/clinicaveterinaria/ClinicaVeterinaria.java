/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria;

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
       Consulta consulta = new Consulta("29/03/2026");
        consulta.agregarMedicamento("Antibiótico", "2 veces al día");
        consulta.agregarMedicamento("Vitaminas", "1 vez al día");

        consulta.mostrarConsulta();
    }
    }
