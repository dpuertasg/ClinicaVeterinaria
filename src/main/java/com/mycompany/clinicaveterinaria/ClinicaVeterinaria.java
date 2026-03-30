/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicaveterinaria;

import modelos.Consulta;

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
