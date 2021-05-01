/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author nixon
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor(String nom, String ape, double sueldBasic, String ced) {
        nombre = nom;
        apellido = ape;
        sueldoBasico = sueldBasic;
        cedula = ced;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerSueldoBasico(double sueldBasic) {
        sueldoBasico = sueldBasic;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20) / 100);
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerCalcularSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadenaFinal;
        cadenaFinal = String.format("Las caracteristicas del profesor %s son:\n"
                + "Nombre: %s\nApellido: %s\nSueldo básico: %.2f$\n"
                + "Sueldo total: %.2f$\nCédula: %s\n",
                obtenerNombre(), obtenerNombre(), obtenerApellido(),
                obtenerSueldoBasico(), obtenerCalcularSueldoTotal(),
                obtenerCedula());
        return cadenaFinal;
    }

}
