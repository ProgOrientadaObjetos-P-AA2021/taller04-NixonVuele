/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author nixon
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String ced, String marc, int an, double valVehi) {
        cedula = ced;
        marca = marc;
        anio = an;
        valorVehiculo = valVehi;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public void establecerAnio(int an) {
        anio = an;
    }

    public void establecerValorVehiculo(double valVehi) {
        valorVehiculo = valVehi;
    }

    public void calcularValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002) / 100) * (2021 - anio);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerCalcularValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadenaFinal;
        cadenaFinal = String.format("Las caracteristicas del automotor son:\n"
                + "Cedula del dueño: %s\nMarca del Vehiculo: %s\n"
                + "Año de fabricación: %d\nValor del Vehiculo: %.2f$\n"
                + "Valor de la matrícula: %.2f$\n",
                obtenerCedula(), obtenerMarca(), obtenerAnio(),
                obtenerValorVehiculo(), obtenerCalcularValorMatricula());
        return cadenaFinal;
    }
}
