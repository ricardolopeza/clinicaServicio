package com.mx.Clinicas.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteModel {
	private String Curp;
	private String Nombre;
	private String Apellido;
	private LocalDate fechaNacimiento;
	private double Peso;
	private double Altura;
	private String EstadoCivil;
	private int numeroMedico;
	private long numeroClinica;
}
